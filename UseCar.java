package oops;

public class UseCar {
public static void main(String [] args) {
	Engine eng1=new Engine();
	eng1.setBrand("BMW");
	eng1.setPrice(800000);
	eng1.setnoOfPistons(5);
	
	Engine eng2=new Engine();
	eng2.setBrand("Ford");
	eng2.setPrice(300000);
	eng2.setnoOfPistons(5);
	
	Car car1=new Car();
	car1.setBrand("BMW");
	car1.setPrice(4000000);
	car1.setEngine(eng1);
	
	
	Car car2=new Car();
	car2.setBrand("FORD");
	car2.setPrice(2000000);
	car2.setEngine(eng2);

	
	
	System.out.println(car1.getBrand()+" "+car2.getBrand());
	System.out.println(car1.getPrice()+" "+car2.getPrice());
	System.out.println(car1.getEngine().getBrand()+" "+car2.getEngine().getBrand());
	System.out.println(car1.getEngine().getPrice()+" "+car2.getEngine().getPrice());
	System.out.println(car1.getEngine().getnoOfPistons()+" "+car2.getEngine().getnoOfPistons());
	
	
}
}
