package com.chaolong.pojo;

import java.io.Serializable;
import java.util.List;

public class Type implements Serializable{
	
	private Integer id;
	private String type;
	private List<Match> matchs;
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Type(Integer id, String type, List<Match> matchs) {
		super();
		this.id = id;
		this.type = type;
		this.matchs = matchs;
	}
	@Override
	public String toString() {
		return "Type [id=" + id + ", type=" + type + ", matchs=" + matchs + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Match> getMatchs() {
		return matchs;
	}
	public void setMatchs(List<Match> matchs) {
		this.matchs = matchs;
	}
	
	
}
