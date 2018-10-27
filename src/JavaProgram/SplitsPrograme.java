package JavaProgram;



public class SplitsPrograme {

	public static void main(String[] args) {
		/*String A = "$199.00";
	
		String B= A.replaceAll(".", "");
		*/
		
		String str = "$199.00";
	      String delimiters = ".\\+";

	      // analyzing the string
	      String[] tokensVal = str.split(delimiters);
		
	      for(String token : tokensVal) {
	          System.out.print(token);
	       }    
	      
		

	}

}
