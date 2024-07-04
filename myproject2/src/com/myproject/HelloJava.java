package com.myproject;

public class HelloJava { 
	int id;
	String name;
	String adress;
	
	HelloJava(int id,String name,String adress){
		this.id=id;
		this.name=name;
		this.adress=adress;
	}
	
	public void display() {	
		System.out.println(id+name+adress);
	}
	public static void main(String args[]) {
		HelloJava t=new HelloJava(1,"tharun","bvrm");
		t.display();
	}
	

}
