package com.chaolong.vo;

public class QueryVo {
	
	private String type;//��������
	private String t1;//����ʱ�� С
	private String t2;//����ʱ�� ��
	private Integer j1;//����  С
	private Integer j2;//���� ��
	private String mat; //����
	private String zhu;//����
	private String ke;//�Ͷ�
	public QueryVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QueryVo(String type, String t1, String t2, Integer j1, Integer j2, String mat, String zhu, String ke) {
		super();
		this.type = type;
		this.t1 = t1;
		this.t2 = t2;
		this.j1 = j1;
		this.j2 = j2;
		this.mat = mat;
		this.zhu = zhu;
		this.ke = ke;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getT1() {
		return t1;
	}
	public void setT1(String t1) {
		this.t1 = t1;
	}
	public String getT2() {
		return t2;
	}
	public void setT2(String t2) {
		this.t2 = t2;
	}
	public Integer getJ1() {
		return j1;
	}
	public void setJ1(Integer j1) {
		this.j1 = j1;
	}
	public Integer getJ2() {
		return j2;
	}
	public void setJ2(Integer j2) {
		this.j2 = j2;
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
	@Override
	public String toString() {
		return "QueryVo [type=" + type + ", t1=" + t1 + ", t2=" + t2 + ", j1=" + j1 + ", j2=" + j2 + ", mat=" + mat
				+ ", zhu=" + zhu + ", ke=" + ke + "]";
	}
	
	
	
	
	
}
