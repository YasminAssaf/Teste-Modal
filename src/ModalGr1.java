
public class ModalGr1 {

	
	public static void main(String[] args) {

		int vetor[] = {1,5,10,15,20,25,35,40,45,50,55,60,65,70,75,80,85,90,95,96};
		int  vetor2[] = {1,5,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,30,50};
		int [] v = new int [20]; 
		
		
		 
		for (int i = 0; i < vetor.length; i++) {
		    if(vetor[i] == vetor2[i]) {
		    	v[i] = vetor2[i];
		    }
			System.out.println (v[i]);
		    
		}
	}
}
