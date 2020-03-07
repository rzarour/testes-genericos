package application;

public class ForEach {

	public static void main(String[] args) {
		
		// Laço for convencional
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------------------------");
		
		
		// Faz a mesma coisa do laço for acima
		for(String obj : vect) {
			System.out.println(obj);
		}

	}

}
