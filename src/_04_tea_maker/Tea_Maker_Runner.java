package _04_tea_maker;

public class Tea_Maker_Runner {
public static void main(String[] args) {
	
	TeaBag Bag = new TeaBag("Green");
	System.out.println(Bag.getFlavor());
	
	Kettle kettle = new Kettle();
	kettle.getWater();
	kettle.boil();
}
}
