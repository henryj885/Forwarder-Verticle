package com.henry.forwarder;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vertx.core.json.JsonObject;

public class Face {
	Integer id;

	private Locator locator;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("Id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("Id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("Locator")
	public Locator getLocator() {
		return locator;
	}

	@JsonProperty("Locator")
	public void setLocator(Locator locator) {
		this.locator = locator;
	}
	
	public JsonObject toJsonObject() {
		return new JsonObject().put("id", id).put("locator", locator.toJsonObject());
	}

	public String toString() {
		return this.toJsonObject().encodePrettily();
	}

}

class Locator {

	@JsonProperty("Scheme")
	private String scheme;
	@JsonProperty("Port")
	private String port;
	@JsonProperty("Local")
	private String local;
	@JsonProperty("Remote")
	private String remote;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("Scheme")
	public String getScheme() {
		return scheme;
	}

	public JsonObject toJsonObject() {
		return new JsonObject().put("scheme", scheme).put("port", port).put("local", local).put("remote", remote);
	}

	@JsonProperty("Port")
	public String getPort() {
		return port;
	}

	@JsonProperty("Local")
	public String getLocal() {
		return local;
	}

	@JsonProperty("Remote")
	public String getRemote() {
		return remote;
	}

}
