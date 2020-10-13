package _07_tea_party;

	public class TeaParty {
	    public String welcome(String name, boolean isWoman, boolean isKnighted) {
	        String greeting = "";
	        
	        if( isWoman ) {
	        	greeting += "Ms.";
	        	
	        	if( isKnighted )
		        	greeting += "Lady ";
	        	
	        } else {
	        	greeting += "Mr.";
	        	
	        	if( isKnighted )
		        	greeting += "Sir ";
	        }
	       
	    	
	    	return greeting;
	    }
	}

