package myProject;

public class myProject {
	
		public static void main(String args[]) {
			
			System.out.println("Benvenuti alla prima lezione di Back End");
			
			//<<<<<<<<<<<<<<<<<TIPOLOGIE NUMERICHE>>>>>>>>>>>>>>>>>
			//numeri interi
			int x = 10;
			short y = 5;
			long p = 123456;
			
			
			System.out.print("questo è x: ");// stampa in linea
			System.out.println(x);//stampa andando a capo
			System.out.print("questo è y: ");
			System.out.println(y);
			System.out.print("questo è p: ");
			System.out.println(p);
			
			//numeri decimali
			double w = 10.50;
			float r = 10.4524524f; //non si usa così
			
			
			System.out.println("questo è r: " + r);
			
			System.out.println("questo è w: " + w);
			
			//riassegnare una variabile
			x = 15;
			
			System.out.print("questo è x modificato: ");
			System.out.println(x);
			
			
			//per creare una costante usa final
			final long z = 123456;
			
			System.out.print("questo è z: ");
			System.out.println(z);
			
			
			
			//<<<<<<<<<<<<<<<<TIPOLOGIE DI STRINGHE>>>>>>>>>>>>>>>>
			String c = "questo è z: ";
			
			
			System.out.println(c + z);
			
			
			//<<<<<<<<<<<<<<<<TIPOLOGIE DI BOOLEANI>>>>>>>>>>>>>>>>
			
			boolean g = true;
			
			System.out.println("questo è g: " + g);
			
			
			//<<<<<<<<<<<<<<<<GLI OPERATORI>>>>>>>>>>>>>>>>
			
			//aritmetici + - * / % 
			float j = x + r;
			
			
			System.out.println("questo è j: " + j);
			
			//relazionali != == < > <= >=
			boolean res= x > y;
			
		
			System.out.println("x è maggiore di y? " + res);
			
			boolean res2 = x == y;
			
			
			System.out.println("x è uguale a y? " + res2);
			
			//logici && || ! ^
			boolean and = res && res2;
			
			
			System.out.println("res e res2 sono entrabi true? " + and);
			
			
			
			
		}
	
}
