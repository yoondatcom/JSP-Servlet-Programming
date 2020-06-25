package com.edu.test;

public class Order {

	private String goodsname;
	private int price;
	private int cnt;
	private int amount;
	
	public Order() {
		this.goodsname = "";
		this.price = 0;
		this.amount = 0;
	}
	
	public Order(String goodsname, int price, int cnt) {
		super();
		this.goodsname = goodsname;
		this.price = price;
		this.cnt = cnt;
		this.amount = price * cnt;
	}
	
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	public int getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Order [goodsname=" + goodsname + ", price=" + price + ", cnt=" + cnt + "]";
	}

	

}
