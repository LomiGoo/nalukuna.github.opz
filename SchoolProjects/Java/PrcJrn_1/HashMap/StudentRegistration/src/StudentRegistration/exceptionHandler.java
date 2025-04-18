package StudentRegistration;
import java.util.Scanner;

class invalidStringInputException extends Exception {
    invalidStringInputException(String message) {
        super(message);
    }
}

class numericalDetector {
    exceptionHandler inStr = new exceptionHandler();
    
    static String detectNumeric(String test) throws invalidStringInputException {
        if(test.matches(".*\\d.*")) {
            throw new invalidStringInputException("Error, Contains Numerical Value/s. Try Again.");
        } else {
            return test;
        }
    }
}
public class exceptionHandler {
    static Scanner s = new Scanner(System.in);
    
    static String containerString;
	static String invalidStringInput() {
	    do {
	        try {
	            containerString = s.nextLine();
	            numericalDetector.detectNumeric(containerString);
		        return containerString;
	        } catch(invalidStringInputException e) {
	            System.out.println(e.getMessage());
	            System.out.print("\nEnter name again : ");
	        }
	    } while(true);
	}
	
	static int containerInteger;
	static long containerLong;
	
	
	static int invalidIntegerQuanInput() {
	    do {
	        try {
	            containerInteger = Integer.parseInt(s.nextLine());
		        return containerInteger;
	        } catch(NumberFormatException e) {
	            System.out.println("Error, Contains Alphabetic Value/s. try again.");
	            System.out.print("\nEnter quantity again : ");
	        }
	    } while(true);
	}
	
	static int invalidIntegerAgeInput() {
	    do {
	        try {
	            containerInteger = Integer.parseInt(s.nextLine());
		        return containerInteger;
	        } catch(NumberFormatException e) {
	            System.out.println("Error, Contains Alphabetic Value/s. try again.");
	            System.out.print("\nEnter age again : ");
	        }
	    } while(true);
	}
	
	static int invalidIntegerYearInput() {
	    do {
	        try {
	            containerInteger = Integer.parseInt(s.nextLine());
		        return containerInteger;
	        } catch(NumberFormatException e) {
	            System.out.println("Error, Contains Alphabetic Value/s. try again.");
	            System.out.print("\nEnter year again : ");
	        }
	    } while(true);
	}
	
	static long invalidLongIDInput() {
	    do {
	        try {
	            containerLong = Long.parseLong(s.nextLine());
		        return containerLong;
	        } catch(NumberFormatException e) {
	            System.out.println("Error, Contains Alphabetic Value/s. try again.");
	            System.out.print("\nEnter student ID again : ");
	        }
	    } while(true);
	}
	
	static int invalidIntegerAnsInput() {
	    do {
	        try {
	            containerInteger = Integer.parseInt(s.nextLine());
		        return containerInteger;
	        } catch(NumberFormatException e) {
	            System.out.println("Error, Contains Alphabetic Value/s. try again.");
	            System.out.print("\nEnter answer again : ");
	        }
	    } while(true);
	}
}