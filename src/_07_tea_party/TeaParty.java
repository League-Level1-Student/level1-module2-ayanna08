package _07_tea_party;

public class TeaParty {
	// "Austen True False
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String greeting = "";

		greeting += "Hello";

		if (isWoman) {

			if (isKnighted) {
				greeting += " Lady ";
			}

			if (isKnighted == false) {
				greeting += " Ms. ";
			}

		} else {
			// isWoman = false

			if (isKnighted) {
				greeting += " Sir ";
			}

			if (isKnighted == false) {
				greeting += " Mr. ";
			}

		}

		greeting += name;

		System.out.println(greeting);
		return greeting;

	}
}
