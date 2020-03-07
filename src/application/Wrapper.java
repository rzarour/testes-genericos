/*
 * 
 *  São classes equivalentes aos tipos primitivos
 *  
 *  boolean Boolean
 *  char Character
 *  byte Byte
 *  short Short
 *  int Integer
 *  long Long
 *  float Float
 *  double Double
 *  
 *  Tipos referência aceitam valor null e
 *  usufruem dos recursos de OO
 *  
 *  Vide aula 90
 *  
 */

package application;

public class Wrapper {

	public static void main(String[] args) {

		int x = 20;

		Object obj = x;

		System.out.println(obj);

		int y = (int) obj;

		System.out.println(y);
		
		System.out.println("-------------------------------");
		
		System.out.println("Usando Wrapper Class");
		
		int w = 20;

		Integer wrp = w;

		System.out.println(wrp);

		int z = wrp;

		System.out.println(z);
		

	}

}
