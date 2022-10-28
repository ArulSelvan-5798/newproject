package oops;

public class UseMobile {
	public static void main(String [] args) {
		Battery bat1=new Battery();
		bat1.brand="ABC";
		bat1.price=3000;
		bat1.capacity="5000mah";
		
		Battery bat2=new Battery();
		bat2.brand="DEF";
		bat2.price=7000;
		bat2.capacity="10000mah";
		
		Mobile mob1=new Mobile();
		mob1.brand="Gionee";
		mob1.price=10000;
		mob1.isWaterProof=false;
		mob1.battery=bat1;
		
		Mobile mob2=new Mobile();
		mob2.brand="Redmi";
		mob2.price=39000;
		mob2.isWaterProof=true;
		mob2.battery=bat2;
		
		System.out.println(mob1.brand+" "+mob2.brand);
		System.out.println(mob1.price+" "+mob2.price);
		System.out.println(mob1.isWaterProof+" "+mob2.isWaterProof);
		System.out.println(mob1.battery.brand+" "+mob2.battery.brand);
		System.out.println(mob1.battery.price+" "+mob2.battery.price);
		System.out.println(mob1.battery.capacity+" "+mob1.battery.capacity);
	}

}
