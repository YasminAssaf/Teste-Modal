
public class ModalGr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String  nome = "Ana Maria da Silva Coração";
		 
		int n = 0;
		
		for (int i=0; i<nome.length(); i++) {
			char c = nome.charAt(i);
			if (c == 'a') {
				n++;
				
			}
			
		}
		
		System.out.println("A quantidade de letras 'a' na frase:" + n);
	}
		 
		 
		
}


