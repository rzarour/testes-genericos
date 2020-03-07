package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class LearnDateClass {

	public static void main(String[] args) throws ParseException {
		
		/*
		 *  sdf1 é criado como tipo SimpleDateFormat e construído
		 *  no formato "dd/MM/YYYY"
		 *  
		 *  y1 é criado como tipo Date e carregado com o resultado
		 *  (padrão de data/hora do método de SimpleDateFormat em
		 *   sdf1.parse("dd/MM/yyy")
		 */
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Date y1 = sdf1.parse("25/06/2018");
		System.out.println("sdf1: " + sdf1);
		System.out.println("y1: " + y1);
		
		System.out.println("----------------------------------------");
		/*
		 *  sdf2 é criado como tipo SimpleDateFormar e contruído
		 *  no formato "dd/MM/yyyy HH:mm:ss"
		 *  
		 *  Y2 é criado como tipo Date e carregado com o resultado
		 *  (padrão de data/hora) do métrodo de SimpleDateFormat em
		 *  sdf2.parse("dd/MM/yyyy HH:mm:ss")
		 */
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		System.out.println("sdf2: " + sdf2); // apresenta no padrão sem formato
		System.out.println("y2: " + y2); // apresenta no padrão sem formato
		
		System.out.println("----------------------------------------");
		/*
		 *  Observação:
		 *  
		 *  sdf1 e sdf2 são objetos que definem o padrão de apresentação de
		 *  data/hora no exemplo acima. se desejarmos apresentar utilizando
		 *  tais padrões, poderiamos fazer uma chamada do tipo
		 *  sdf1.format(y1 ou y2) ou
		 *  sdf2.format(y1 ou y2)
		 *  
		 *  Vejamos abaixo
		 */
		
		System.out.println("y1 em formato sdf1: " + sdf1.format(y1));// formato sdf1
		System.out.println("y1 em formato sdf2: " + sdf2.format(y1));// formato sdr2
		
		System.out.println("----------------------------------------");
		
		System.out.println("y2 em formato sdf1: " + sdf1.format(y2));// formato sdf1
		System.out.println("y2 em formato sdf2: " + sdf2.format(y2));// formato sdr2
		
		System.out.println("----------------------------------------");
		
		/*
		 * Criando uma data atual com new Date()
		 */
		
		Date x1 = new Date();
		System.out.println("x1 em formato sdf1: " + sdf1.format(x1));
		System.out.println("x1 em formato sdf2: " + sdf2.format(x1));
		
		System.out.println("----------------------------------------");
		
		/*
		 * Criando uma data atual com new Date(System.currentTimeMillis())
		 */
		
		Date x2 = new Date(System.currentTimeMillis());
		System.out.println("x2 em formato sdf1: " + sdf1.format(x2));
		System.out.println("x2 em formato sdf2: " + sdf2.format(x2));
		
		System.out.println("----------------------------------------");
		/*
		 * Criando uma data arbitrária com new Date(long argumento)
		 * 
		 */
		Date x3 = new Date(0L);
		System.out.println("x3 em formato sdf1: " + sdf1.format(x3));
		System.out.println("x3 em formato sdf2: " + sdf2.format(x3));
		
		System.out.println("----------------------------------------");
		/*
		 *  Criando uma data no padrão ISO 8601
		 *  "yyyy-MM-ddTHH:mm:ssz"
		 */
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println("y3 ISO-8601 em formato sdf1: " + sdf1.format(y3));
		System.out.println("y3 ISO-8601 em formato sdf2: " + sdf2.format(y3));
		
		System.out.println("----------------------------------------");
		
		/*
		 *  Especificando Time Zone em objeto tipo SimpleDateFormat
		 */
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		System.out.println("y3 ISO-8601 TimeZone sdf3: " + sdf3.format(y3));
		System.out.println("y3 ISO-8601 TimeZone sem formato: " + y3);
		
	}

}
