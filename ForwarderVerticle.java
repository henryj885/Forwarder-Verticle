package com.henry.forwarder;

import java.util.Arrays;
import java.util.List;

import com.github.arteam.simplejsonrpc.client.JsonRpcClient;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;

public class ForwarderVerticle extends AbstractVerticle {

	Logger logger = LoggerFactory.getLogger(ForwarderVerticle.class.getName());

	@Override
	public void start(Future<Void> fut) {
		// Create a router object
		Router router = Router.router(vertx);

		router.route().handler(BodyHandler.create());
		router.get("/api/version").handler(this::getVersion);
		router.get("/api/faces").handler(this::getFaces);
		router.get("/api/faces/:id").handler(this::getFace);
		router.get("/api/pit").handler(this::getPIT);
		router.get("/api/fibs").handler(this::getFibs);
		router.get("/api/fibs/:name").handler(this::getFib);
		router.get("/api/fibs/:name").handler(this::eraseFib);
		router.post("/api/fibs").handler(this::insertFib);
		router.post("/api/hello/:id").handler(this::sayHello);

		vertx.eventBus().consumer("fw.service.eb", (message) -> {
			JsonObject body = (JsonObject)message.body();
			String action = body.getString("action");
			
			
			if (action == "get_version") {
				Version version = this.getVersion_JsonRPC();
				System.out.println("Version = " + version.toString());
			}
		});

		vertx.createHttpServer().requestHandler(router).listen(8080, result -> {
			if (result.succeeded()) {
				logger.info("HTTP server listening on port 8080");
				fut.complete();
			} else {
				System.out.println(result.cause());
				fut.fail(result.cause());
			}
		});

	}
	
	private void sayHello(RoutingContext context) {
		String id = context.request().getParam("id");
		Integer idAsInteger = Integer.valueOf(id);
		JsonObject person = context.getBodyAsJson();
		HttpServerResponse response = context.response();
		JsonObject payload = new JsonObject().put("message", "Added new person with id=" + id).put("person", person);

		response.putHeader("content-type", "application/json").end(payload.encodePrettily());

	}

	//Version.Version
	private void getVersion(RoutingContext context) {
		HttpServerResponse response = context.response();
		Version  version = this.getVersion_JsonRPC();
		
		response.putHeader("content-type", "application/json")
				.end(new JsonObject().put("version", version.toJsonObject()).encodePrettily());
	}
	
	private Version getVersion_JsonRPC() {
		TP tp = new TP();
		JsonRpcClient client = new JsonRpcClient(tp);
		Version version = client.createRequest().id("599851553").method("Version.Version").param("_", 0)
				.returnAs(Version.class).execute();
		System.out.println(version.toString());
		
		return version;
	}
	
	//Face.List
	private void getFaces(RoutingContext context) {
		HttpServerResponse response = context.response();
		JsonArray array = this.getFaces_JsonRPC();
		
		response.putHeader("content-type", "application/json")
				.end(new JsonObject().put("faces", array).encodePrettily());
	}
	
	private JsonArray getFaces_JsonRPC(){
		TP tp = new TP();
		JsonRpcClient client = new JsonRpcClient(tp);
		List<Face> faces = client.createRequest().id("1").method("Face.List").param("_", 0).returnAsList(Face.class)
				.execute();
		JsonArray array = new JsonArray(faces);
		
		return array;
	}

	//Face.Get
	private void getFace(RoutingContext context) {
		HttpServerResponse response = context.response();
		int id = Integer.valueOf(context.request().getParam("id"));
		FaceData face = this.getFace_JsonRPC(id);

		response.putHeader("content-type", "application/json").end(face.toString());
	}
	
	private FaceData getFace_JsonRPC(int id) {
		TP tp = new TP();
		JsonRpcClient client = new JsonRpcClient(tp);
		FaceData face = client.createRequest().id("2").method("Face.Get").param("Id", id).returnAs(FaceData.class)
				.execute();
		
		return face;
	}

	//Fib.List
	private void getFibs(RoutingContext context) {
		HttpServerResponse response = context.response();
		JsonArray fibs = this.getFibs_JsonRPC();
		
		response.putHeader("content-type", "application/json")
				.end(new JsonObject().put("fibs", fibs).encodePrettily());
	}
	
	private JsonArray getFibs_JsonRPC() {
		TP tp = new TP();
		JsonRpcClient client = new JsonRpcClient(tp);

		List<String> fibs = client.createRequest().id("1").method("Fib.List").param("_", 0).returnAsList(String.class)
				.execute();

		System.out.println(fibs.toString());
		JsonArray array = new JsonArray(fibs);
		
		return array;
	}

	//Fib.Find
	private void getFib(RoutingContext context) {
		String name = "/" + context.request().getParam("name");
		HttpServerResponse response = context.response();
		fibFind fib = this.getFib_JsonRPC(name);
		
		response.putHeader("content-type", "application/json").end(fib.toString());
	}
	
	private fibFind getFib_JsonRPC(String name) {
		TP tp = new TP();
		JsonRpcClient client = new JsonRpcClient(tp);
		fibFind fib = client.createRequest().id("299851553").method("Fib.Find").param("Name", name)
				.returnAs(fibFind.class).execute();
		
		return fib;
	}

	//Fib.Insert
	private void insertFib(RoutingContext context) {
		JsonObject fib = context.getBodyAsJson();
		String name = fib.getString("name");
		Object[] nexthopsJson = fib.getJsonArray("nexthops").getList().toArray();
		Integer[] nexthops = Arrays.copyOf(nexthopsJson, nexthopsJson.length, Integer[].class);

		HttpServerResponse response = context.response();
		this.insertFib_JsonRPC(name, nexthops);
		JsonObject payload = new JsonObject().put("message", "Inserted new fib with name: " + name);

		response.putHeader("content-type", "application/json").end(payload.encodePrettily());
	}
	
	private fibInsert insertFib_JsonRPC(String name, Integer[] nexthops) {
		TP tp = new TP();
		JsonRpcClient client = new JsonRpcClient(tp);
		fibInsert ins = client.createRequest().id("599851553").method("Fib.Insert").param("Name", name)
				.param("Nexthops", nexthops).returnAs(fibInsert.class).execute();

		return ins;
	}
  
	
	//Fib.Erase
	private void eraseFib(RoutingContext context) {
		String name = context.request().getParam("name");
		HttpServerResponse response = context.response();
		this.eraseFib_JsonRPC(name);
		JsonObject payload = new JsonObject().put("message", "Erased fib with name: " + name);

		response.putHeader("content-type", "application/json").end(payload.encodePrettily());
	}
	
	private fibErase eraseFib_JsonRPC(String name) {
		TP tp = new TP();
		JsonRpcClient client = new JsonRpcClient(tp);
		fibErase er = client.createRequest().id("599851553").method("Fib.Erase").param("Name", name)
				.returnAs(fibErase.class).execute();
		
		return er;
	}

	//DpInfo.Global and DpInfo.Pit
	private void getPIT(RoutingContext context) {
		HttpServerResponse response = context.response();
		TP tp = new TP();
		JsonRpcClient client = new JsonRpcClient(tp);
		DpGlobal dg = client.createRequest().id("599851553").method("DpInfo.Global").param("_", 0)
				.returnAs(DpGlobal.class).execute();

		JsonArray array = new JsonArray();

		for (int i = 0; i < dg.getNFwds(); i++) {
			PitInfo p = client.createRequest().id("599851554").method("DpInfo.Pit").param("Index", i)
					.returnAs(PitInfo.class).execute();
			System.out.println(p.getNEntries());
			array.add(p.toJsonObject().put("Index", i));
		}

		response.putHeader("content-type", "application/json")
				.end(new JsonObject().put("PIT", dg.toJsonObject()).put("threads", array).encodePrettily());

		response.putHeader("content-type", "application/json").end(new JsonObject().put("PIT", array).encodePrettily());
	}

	@Override
	public void stop() {
//		List<Future> futures = new ArrayList<>();

	}

	public static void main(String[] args) {
		Vertx vertx = Vertx.vertx();
		vertx.deployVerticle(new ForwarderVerticle(), ar -> {
			if (ar.succeeded()) {
				System.out.println("verticle deployed successfully!");
			}
		});
		vertx.deployVerticle(new EbClient(), ar -> {
			if (ar.succeeded()) {
				System.out.println("verticle deployed successfully!");
			}
		});
	}

}
