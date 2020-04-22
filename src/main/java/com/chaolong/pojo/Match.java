package com.chaolong.pojo;

import java.io.Serializable;

public class Match implements Serializable{
	private Integer mid;
	private String time;
	private String mat;
	private String zhu;
	private String ke;
	private Integer ji;
	private String pic;
	private Integer id;
	private String tname;
	private Type type;
	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Match(Integer mid, String time, String mat, String zhu, String ke, Integer ji, String pic, Integer id,
			String tname, Type type) {
		super();
		this.mid = mid;
		this.time = time;
		this.mat = mat;
		this.zhu = zhu;
		this.ke = ke;
		this.ji = ji;
		this.pic = pic;
		this.id = id;
		this.tname = tname;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Match [mid=" + mid + ", time=" + time + ", mat=" + mat + ", zhu=" + zhu + ", ke=" + ke + ", ji=" + ji
				+ ", pic=" + pic + ", id=" + id + ", tname=" + tname + ", type=" + type + "]";
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	public String getZhu() {
		return zhu;
	}
	public void setZhu(String zhu) {
		this.zhu = zhu;
	}
	public String getKe() {
		return ke;
	}
	public void setKe(String ke) {
		this.ke = ke;
	}
	public Integer getJi() {
		return ji;
	}
	public void setJi(Integer ji) {
		this.ji = ji;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	
	
	
}
