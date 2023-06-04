import java.util.Scanner;

public class ModalGr2 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			 String dados = "Ana, 89,78, Maria, 45.8, 27, 56, Paula Pereira, 978, A, VIVA, 35, 125, 8999";
		        
		        Scanner scanner = new Scanner(dados).useDelimiter(",\\s*");
		        
		        while (scanner.hasNext()) {
		            String n = scanner.next().trim();
		            
		            if (isNumeric(n)) {
		                System.out.println("Números: " + n);
		            } else {
		                System.out.println("String: " + n);
		            }
		        }
		        scanner.close();
	    }
	    
	    public static boolean isNumeric(String s) {
	        try {
	            Double.parseDouble(s);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }
	}
