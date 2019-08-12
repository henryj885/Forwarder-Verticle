package com.henry.forwarder;

import com.fasterxml.jackson.annotation.JsonProperty;



import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.vertx.core.json.JsonObject;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "RxFrames", "RxOctets", "L2DecodeErrs", "Reass", "L3DecodeErrs", "RxInterests", "RxData",
		"RxNacks", "FragGood", "FragBad", "TxAllocErrs", "TxQueued", "TxDropped", "TxInterests", "TxData", "TxNacks",
		"TxFrames", "TxOctets" })
class Counters {

	@JsonProperty("RxFrames")
	private Long rxFrames;
	@JsonProperty("RxOctets")
	private Long rxOctets;
	@JsonProperty("L2DecodeErrs")
	private Integer l2DecodeErrs;
	@JsonProperty("Reass")
	private Reass reass;
	@JsonProperty("L3DecodeErrs")
	private Integer l3DecodeErrs;
	@JsonProperty("RxInterests")
	private Long rxInterests;
	@JsonProperty("RxData")
	private Long rxData;
	@JsonProperty("RxNacks")
	private Long rxNacks;
	@JsonProperty("FragGood")
	private Long fragGood;
	@JsonProperty("FragBad")
	private Long fragBad;
	@JsonProperty("TxAllocErrs")
	private Long txAllocErrs;
	@JsonProperty("TxQueued")
	private Long txQueued;
	@JsonProperty("TxDropped")
	private Long txDropped;
	@JsonProperty("TxInterests")
	private Long txInterests;
	@JsonProperty("TxData")
	private Long txData;
	@JsonProperty("TxNacks")
	private Long txNacks;
	@JsonProperty("TxFrames")
	private Long txFrames;
	@JsonProperty("TxOctets")
	private Long txOctets;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("RxFrames")
	public Long getRxFrames() {
		return rxFrames;
	}

	@JsonProperty("RxFrames")
	public void setRxFrames(Long rxFrames) {
		this.rxFrames = rxFrames;
	}

	@JsonProperty("RxOctets")
	public Long getRxOctets() {
		return rxOctets;
	}

	@JsonProperty("RxOctets")
	public void setRxOctets(Long rxOctets) {
		this.rxOctets = rxOctets;
	}

	@JsonProperty("L2DecodeErrs")
	public Integer getL2DecodeErrs() {
		return l2DecodeErrs;
	}

	@JsonProperty("L2DecodeErrs")
	public void setL2DecodeErrs(Integer l2DecodeErrs) {
		this.l2DecodeErrs = l2DecodeErrs;
	}

	@JsonProperty("Reass")
	public Reass getReass() {
		return reass;
	}

	@JsonProperty("Reass")
	public void setReass(Reass reass) {
		this.reass = reass;
	}

	@JsonProperty("L3DecodeErrs")
	public Integer getL3DecodeErrs() {
		return l3DecodeErrs;
	}

	@JsonProperty("L3DecodeErrs")
	public void setL3DecodeErrs(Integer l3DecodeErrs) {
		this.l3DecodeErrs = l3DecodeErrs;
	}

	@JsonProperty("RxInterests")
	public Long getRxInterests() {
		return rxInterests;
	}

	@JsonProperty("RxInterests")
	public void setRxInterests(Long rxInterests) {
		this.rxInterests = rxInterests;
	}

	@JsonProperty("RxData")
	public Long getRxData() {
		return rxData;
	}

	@JsonProperty("RxData")
	public void setRxData(Long rxData) {
		this.rxData = rxData;
	}

	@JsonProperty("RxNacks")
	public Long getRxNacks() {
		return rxNacks;
	}

	@JsonProperty("RxNacks")
	public void setRxNacks(Long rxNacks) {
		this.rxNacks = rxNacks;
	}

	@JsonProperty("FragGood")
	public Long getFragGood() {
		return fragGood;
	}

	@JsonProperty("FragGood")
	public void setFragGood(Long fragGood) {
		this.fragGood = fragGood;
	}

	@JsonProperty("FragBad")
	public Long getFragBad() {
		return fragBad;
	}

	@JsonProperty("FragBad")
	public void setFragBad(Long fragBad) {
		this.fragBad = fragBad;
	}

	@JsonProperty("TxAllocErrs")
	public Long getTxAllocErrs() {
		return txAllocErrs;
	}

	@JsonProperty("TxAllocErrs")
	public void setTxAllocErrs(Long txAllocErrs) {
		this.txAllocErrs = txAllocErrs;
	}

	@JsonProperty("TxQueued")
	public Long getTxQueued() {
		return txQueued;
	}

	@JsonProperty("TxQueued")
	public void setTxQueued(Long txQueued) {
		this.txQueued = txQueued;
	}

	@JsonProperty("TxDropped")
	public Long getTxDropped() {
		return txDropped;
	}

	@JsonProperty("TxDropped")
	public void setTxDropped(Long txDropped) {
		this.txDropped = txDropped;
	}

	@JsonProperty("TxInterests")
	public Long getTxInterests() {
		return txInterests;
	}

	@JsonProperty("TxInterests")
	public void setTxInterests(Long txInterests) {
		this.txInterests = txInterests;
	}

	@JsonProperty("TxData")
	public Long getTxData() {
		return txData;
	}

	@JsonProperty("TxData")
	public void setTxData(Long txData) {
		this.txData = txData;
	}

	@JsonProperty("TxNacks")
	public Long getTxNacks() {
		return txNacks;
	}

	@JsonProperty("TxNacks")
	public void setTxNacks(Long txNacks) {
		this.txNacks = txNacks;
	}

	@JsonProperty("TxFrames")
	public Long getTxFrames() {
		return txFrames;
	}

	@JsonProperty("TxFrames")
	public void setTxFrames(Long txFrames) {
		this.txFrames = txFrames;
	}

	@JsonProperty("TxOctets")
	public Long getTxOctets() {
		return txOctets;
	}

	@JsonProperty("TxOctets")
	public void setTxOctets(Long txOctets) {
		this.txOctets = txOctets;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Ipackets", "Opackets", "Ibytes", "Obytes", "Imissed", "Ierrors", "Oerrors", "Rx_nombuf",
		"Q_ipackets", "Q_opackets", "Q_ibytes", "Q_obytes", "Q_errors" })
class ExCounters {

	@JsonProperty("Ipackets")
	private Long ipackets;
	@JsonProperty("Opackets")
	private Long opackets;
	@JsonProperty("Ibytes")
	private Long ibytes;
	@JsonProperty("Obytes")
	private Long obytes;
	@JsonProperty("Imissed")
	private Integer imissed;
	@JsonProperty("Ierrors")
	private Integer ierrors;
	@JsonProperty("Oerrors")
	private Integer oerrors;
	@JsonProperty("Rx_nombuf")
	private Integer rxNombuf;
	@JsonProperty("Q_ipackets")
	private List<Long> qIpackets = null;
	@JsonProperty("Q_opackets")
	private List<Long> qOpackets = null;
	@JsonProperty("Q_ibytes")
	private List<Long> qIbytes = null;
	@JsonProperty("Q_obytes")
	private List<Long> qObytes = null;
	@JsonProperty("Q_errors")
	private List<Long> qErrors = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("Ipackets")
	public Long getIpackets() {
		return ipackets;
	}

	@JsonProperty("Ipackets")
	public void setIpackets(Long ipackets) {
		this.ipackets = ipackets;
	}

	@JsonProperty("Opackets")
	public Long getOpackets() {
		return opackets;
	}

	@JsonProperty("Opackets")
	public void setOpackets(Long opackets) {
		this.opackets = opackets;
	}

	@JsonProperty("Ibytes")
	public Long getIbytes() {
		return ibytes;
	}

	@JsonProperty("Ibytes")
	public void setIbytes(Long ibytes) {
		this.ibytes = ibytes;
	}

	@JsonProperty("Obytes")
	public Long getObytes() {
		return obytes;
	}

	@JsonProperty("Obytes")
	public void setObytes(Long obytes) {
		this.obytes = obytes;
	}

	@JsonProperty("Imissed")
	public Integer getImissed() {
		return imissed;
	}

	@JsonProperty("Imissed")
	public void setImissed(Integer imissed) {
		this.imissed = imissed;
	}

	@JsonProperty("Ierrors")
	public Integer getIerrors() {
		return ierrors;
	}

	@JsonProperty("Ierrors")
	public void setIerrors(Integer ierrors) {
		this.ierrors = ierrors;
	}

	@JsonProperty("Oerrors")
	public Integer getOerrors() {
		return oerrors;
	}

	@JsonProperty("Oerrors")
	public void setOerrors(Integer oerrors) {
		this.oerrors = oerrors;
	}

	@JsonProperty("Rx_nombuf")
	public Integer getRxNombuf() {
		return rxNombuf;
	}

	@JsonProperty("Rx_nombuf")
	public void setRxNombuf(Integer rxNombuf) {
		this.rxNombuf = rxNombuf;
	}

	@JsonProperty("Q_ipackets")
	public List<Long> getQIpackets() {
		return qIpackets;
	}

	@JsonProperty("Q_ipackets")
	public void setQIpackets(List<Long> qIpackets) {
		this.qIpackets = qIpackets;
	}

	@JsonProperty("Q_opackets")
	public List<Long> getQOpackets() {
		return qOpackets;
	}

	@JsonProperty("Q_opackets")
	public void setQOpackets(List<Long> qOpackets) {
		this.qOpackets = qOpackets;
	}

	@JsonProperty("Q_ibytes")
	public List<Long> getQIbytes() {
		return qIbytes;
	}

	@JsonProperty("Q_ibytes")
	public void setQIbytes(List<Long> qIbytes) {
		this.qIbytes = qIbytes;
	}

	@JsonProperty("Q_obytes")
	public List<Long> getQObytes() {
		return qObytes;
	}

	@JsonProperty("Q_obytes")
	public void setQObytes(List<Long> qObytes) {
		this.qObytes = qObytes;
	}

	@JsonProperty("Q_errors")
	public List<Long> getQErrors() {
		return qErrors;
	}

	@JsonProperty("Q_errors")
	public void setQErrors(List<Long> qErrors) {
		this.qErrors = qErrors;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "jsonrpc", "id", "result" })
class Example {

	@JsonProperty("jsonrpc")
	private String jsonrpc;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("result")
	private FaceData faceData;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("jsonrpc")
	public String getJsonrpc() {
		return jsonrpc;
	}

	@JsonProperty("jsonrpc")
	public void setJsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("result")
	public FaceData getResult() {
		return faceData;
	}

	@JsonProperty("result")
	public void setResult(FaceData faceData) {
		this.faceData = faceData;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Count", "Min", "Max", "Mean", "Stdev" })
class Latency {

	@JsonProperty("Count")
	private Integer count;
	@JsonProperty("Min")
	private Integer min;
	@JsonProperty("Max")
	private Integer max;
	@JsonProperty("Mean")
	private Double mean;
	@JsonProperty("Stdev")
	private Double stdev;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("Count")
	public Integer getCount() {
		return count;
	}

	@JsonProperty("Count")
	public void setCount(Integer count) {
		this.count = count;
	}

	@JsonProperty("Min")
	public Integer getMin() {
		return min;
	}

	@JsonProperty("Min")
	public void setMin(Integer min) {
		this.min = min;
	}

	@JsonProperty("Max")
	public Integer getMax() {
		return max;
	}

	@JsonProperty("Max")
	public void setMax(Integer max) {
		this.max = max;
	}

	@JsonProperty("Mean")
	public Double getMean() {
		return mean;
	}

	@JsonProperty("Mean")
	public void setMean(Double mean) {
		this.mean = mean;
	}

	@JsonProperty("Stdev")
	public Double getStdev() {
		return stdev;
	}

	@JsonProperty("Stdev")
	public void setStdev(Double stdev) {
		this.stdev = stdev;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Accepted", "OutOfOrder", "Delivered", "Incomplete" })
class Reass {

	@JsonProperty("Accepted")
	private Integer accepted;
	@JsonProperty("OutOfOrder")
	private Integer outOfOrder;
	@JsonProperty("Delivered")
	private Integer delivered;
	@JsonProperty("Incomplete")
	private Integer incomplete;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("Accepted")
	public Integer getAccepted() {
		return accepted;
	}

	@JsonProperty("Accepted")
	public void setAccepted(Integer accepted) {
		this.accepted = accepted;
	}

	@JsonProperty("OutOfOrder")
	public Integer getOutOfOrder() {
		return outOfOrder;
	}

	@JsonProperty("OutOfOrder")
	public void setOutOfOrder(Integer outOfOrder) {
		this.outOfOrder = outOfOrder;
	}

	@JsonProperty("Delivered")
	public Integer getDelivered() {
		return delivered;
	}

	@JsonProperty("Delivered")
	public void setDelivered(Integer delivered) {
		this.delivered = delivered;
	}

	@JsonProperty("Incomplete")
	public Integer getIncomplete() {
		return incomplete;
	}

	@JsonProperty("Incomplete")
	public void setIncomplete(Integer incomplete) {
		this.incomplete = incomplete;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Id", "IsDown", "Counters", "ExCounters", "Latency" })
public class FaceData {
	
	@JsonProperty("Id")
	private Integer id;
	@JsonProperty("IsDown")
	private Boolean isDown;
	@JsonProperty("Counters")
	private Counters counters;
	@JsonProperty("ExCounters")
	private ExCounters exCounters;
	@JsonProperty("Latency")
	private Latency latency;
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

	@JsonProperty("IsDown")
	public Boolean getIsDown() {
		return isDown;
	}

	@JsonProperty("IsDown")
	public void setIsDown(Boolean isDown) {
		this.isDown = isDown;
	}

	@JsonProperty("Counters")
	public Counters getCounters() {
		return counters;
	}

	@JsonProperty("Counters")
	public void setCounters(Counters counters) {
		this.counters = counters;
	}

	@JsonProperty("ExCounters")
	public ExCounters getExCounters() {
		return exCounters;
	}

	@JsonProperty("ExCounters")
	public void setExCounters(ExCounters exCounters) {
		this.exCounters = exCounters;
	}

	@JsonProperty("Latency")
	public Latency getLatency() {
		return latency;
	}

	@JsonProperty("Latency")
	public void setLatency(Latency latency) {
		this.latency = latency;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
	
	public JsonObject toJsonObject() {
		return  new JsonObject().put("counters", new JsonObject()
				.put("rxFrames", counters.getRxFrames())
				.put("rxOctets", counters.getRxOctets())
				.put("rxInterests", counters.getRxInterests())
				.put("rxData", counters.getRxData())
				.put("rxNacks", counters.getRxNacks())
				.put("txFrames", counters.getTxFrames())
				.put("txOctets", counters.getTxOctets())
				.put("txInterests", counters.getTxInterests())
				.put("txData", counters.getTxData())
				.put("txNacks", counters.getTxNacks()));
				
	}
	public String toString() {
		return this.toJsonObject().encodePrettily();
	}

}
