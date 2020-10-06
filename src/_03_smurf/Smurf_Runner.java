package _03_smurf;

public class Smurf_Runner {
public static void main(String[] args) {
	
	Smurf HandySmurf = new Smurf("HandySmurf");
	HandySmurf.eat();
	System.out.println(HandySmurf.getName());
	System.out.println(HandySmurf.getHatColor());
	System.out.println(HandySmurf.isGirlOrBoy());
	
	Smurf Papa = new Smurf("Papa");
	System.out.println(Papa.getName());
	System.out.println(Papa.getHatColor());
	System.out.println(Papa.isGirlOrBoy());
	
	Smurf Smurfette = new Smurf("Smurfette");
	System.out.println(Smurfette.getName());
	System.out.println(Smurfette.getHatColor());
	System.out.println(Smurfette.isGirlOrBoy());
	
}
}
