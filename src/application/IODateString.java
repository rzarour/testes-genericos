package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class IODateString {

	public static void main(String[] args) throws ParseException {
		
		/*
		 *  Usando entrada padrão para ler datas
		 *  em determinados padrões/formatos
		 */
		Scanner sc = new Scanner(System.in);
		
		/*
		 * O prompt espera que seja digitado uma data no formato dd MM yyyy
		 * separados por sinais tais como / . : ; @ # $ % , ) ( = etc
		 * 
		 */
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.print("Entre com uma data no formato dd.MM.yyyy HH:mm:ss: ");
		Date data = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		//data = sdf1.parse(sc.nextLine());
		System.out.println(sdf1.format(sdf1.parse(sc.nextLine())));
		
		System.out.println(sdf1.format(data));
		
		System.out.println("--------------------------------------");
		
		Date d1 = new Date(); 
		System.out.println("Data atual: " + sdf1.format(d1));
		
		System.out.println("--------------------------------------");
		/*
		 *  Utilizando Calendar para artmética com:
		 *  
		 *  	dia
		 *  	mês
		 *  	ano
		 *  	
		 * 
		 * 
		 *  No código abaixo, um objeto cal é instanciado e carregado
		 *  com o conteúdo do objeto Date chamado d1.
		 *  
		 *  Em seguida a esse novo objeto (cal) são acrescentados 4 meses.
		 *  
		 *	Por último, após essa aritmética, recarrega-se em d1 e o imprime
		 *  na tela.
		 */
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d1);
		cal.add(Calendar.MINUTE, 4);
		d1 = cal.getTime();
		System.out.println("Data atual: " + sdf1.format(d1));
		
		sc.close();
	}

}
