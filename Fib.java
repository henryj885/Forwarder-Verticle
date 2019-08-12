package com.henry.forwarder;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

public class Fib {
	String name;
	String nexthops;
	String cost;

	public Fib(String name, String nexthops, String cost) {
		this.name = name;
		this.nexthops = nexthops;
		this.cost = cost;
	}
	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
        
    public String getNexthops() {
        return nexthops;
    }
    public void setNexthops(String nexthops) {
    	this.nexthops = nexthops;
    }
    
    public String getCost() {
        return cost;
    }
    public void setCost(String cost) {
        this.cost=cost;
    }
}

class fibInsert {
	@JsonProperty
	boolean IsNew;

	public String toString() {
		return "isNew: " + IsNew;
	}
}

class fibErase {
	public String toString() {
		return "{}";
	}
}

class fibFind {
	@JsonProperty("HasEntry")
	private Boolean hasEntry;
	@JsonProperty("Name")
	private String name;
	@JsonProperty("Nexthops")
	private List<Integer> nexthops = null;
	@JsonProperty("StrategyId")
	private Integer strategyId;

	public JsonObject toJsonObject() {
		return new JsonObject()
				.put("hasEntry", hasEntry).put("name", name)
				.put("Nexthops", nexthops)
				.put("strategyId", strategyId);
	}
	public String toString() {
		return this.toJsonObject().encodePrettily();
	}

}