package com.bw.beans;

public class Hero {

	private Integer id;
	private String hname;
	private double price;
	private int cid;
	private String cname;
	private String uptime;
	private int status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
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
	public String getUptime() {
		return uptime;
	}
	public void setUptime(String uptime) {
		this.uptime = uptime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Hero [id=" + id + ", hname=" + hname + ", price=" + price + ", cid=" + cid + ", cname=" + cname
				+ ", uptime=" + uptime + ", status=" + status + "]";
	}
	public Hero(Integer id, String hname, double price, int cid, String cname, String uptime, int status) {
		super();
		this.id = id;
		this.hname = hname;
		this.price = price;
		this.cid = cid;
		this.cname = cname;
		this.uptime = uptime;
		this.status = status;
	}
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
