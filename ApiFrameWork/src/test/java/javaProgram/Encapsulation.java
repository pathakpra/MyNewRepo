package javaProgram;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

 class Defi {

	private String name;
	private String id;
	private int mid;
	
	public Defi(String name, String id)
	{
		this.name=name;
		this.id=id;
	}
	
	public void test() {
		 System.out.println(name);
		 System.out.println(id);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
//	public void setId(String id) {
//		this.id=id;
//	}

	public String getId() {
		return id;
	}

	public int getMid() {
		return mid;
	}
	
	public int getMid1() {
		System.out.println("Make Change");
		return mid;
	}
	
	
}

 
 
//public class Encapsulation{
//public static void main(String[] args) {
//	Defi ep = new Defi("prachii", "556789");
//	ep.test();
//	
//	}
//	

	

