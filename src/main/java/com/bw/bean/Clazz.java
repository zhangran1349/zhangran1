package com.bw.bean;

public class Clazz {
	private int cid;
	private String cname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Clazz(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public Clazz(String cname) {
		super();
		this.cname = cname;
	}
	public Clazz() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Clazz [cid=" + cid + ", cname=" + cname + "]";
	}
	
}
