package oops;

public class UseLaptop {
	
	public static void main(String []args) {
		Processor p1=new Processor("Intel",8,"i7");
		Laptop lap1=new Laptop("Dell",45000,false,p1);
		
		Processor p2=new Processor("Ryzan",5,"i7");
		Laptop lap2=new Laptop("Lenova",95000,true,p2);
		
		System.out.println(lap1+"\n"+lap2);
		
		
	}

}
