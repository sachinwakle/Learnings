package com.tech.intelizin;

public class B {

	private String desc;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public static void modifyDesc(B b, String desc)
	{
		b = new B();
		b.setDesc(desc);
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.setDesc("sachin");
		B b1 = new B();
		b1.setDesc("wakle");
		modifyDesc(b, "pune");
		System.out.println(b.getDesc());
		System.out.println(b1.getDesc());
	}
}

