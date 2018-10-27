package JavaProgram;

public class PascalTriangle {

	public static void main(String[] args) {
	
		int day = 9;
		String month = "March";
		int year = 1993;
		char grade='A';
		int marks=99;
		//System.out.printf("Born on %dth %s, %d\n", day,month,year);
		//System.out.format("Secured %d%% marks and %c grade", marks,grade);
		 int n = 5;
		 
	        for (int i = 0; i < n; i++) {
	            int number = 1;
	            System.out.printf("%" + (n - i) * 2 + "s", "");
	            for (int j = 0; j <= i; j++) {
	                System.out.printf("%4d", number);
	                number = number * (i - j) / (j + 1);
	            }
	            System.out.println();
	        }
	 
	    }
	 
	}