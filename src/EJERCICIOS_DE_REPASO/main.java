package EJERCICIOS_DE_REPASO;

import java.util.Scanner;

public class main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcion = 0;
		
		do {
			System.out.println("MENU DE EJERCICIOS");
			System.out.println("1 AL 5 CICLOS NUMERICOS");
			System.out.println("6 AL 8 CONDICIONES");
			System.out.println("9 AL 10 SWICHT");
			System.out.println("11 AL 15 ANALISIS NUMERICOS");
			System.out.println("16 AL 20 TRANSFORMACIONES");
			System.out.println("0 PARA SALIR");
			System.out.println("ELIJA EL EJERCICIOQUE DESEA (0-20): ");
			
			opcion = sc.nextInt();
			
			System.out.println("--------------------------------");
			switch (opcion) {
			case 1: ejercicio1(); break;
			case 2: ejercicio2(); break;
			case 3: ejercicio3(); break;
			case 4: ejercicio4(); break;
			case 5: ejercicio5(); break;
			case 6: ejercicio6(); break;
			case 7: ejercicio7(); break;
			case 8: ejercicio8(); break;
			case 9: ejercicio9(); break;
			case 10: ejercicio10(); break;
			case 11: ejercicio11(); break;
			case 12: ejercicio12(); break;
			case 13: ejercicio13(); break;
			case 14: ejercicio14(); break;
			case 15: ejercicio15(); break;
			case 16: ejercicio16(); break;
			case 17: ejercicio17(); break;
			case 18: ejercicio18(); break;
			case 19: ejercicio19(); break;
			case 20: ejercicio20(); break;
			case 0: System.out.println("HAZ SALIDO"); break;
			default: System.out.println("OPCION NO VALIDA"); break;
			
			}
			
		} while (opcion !=0);


	}

	private static void ejercicio1() {
		System.out.print("INGRESE N: ");
		int n = sc.nextInt();
		int suma = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 4 == 0) suma +=i;
		}
		System.out.println("LA SUMA DE DIVISIBLES ENTRE 4 ES " + suma);
	}

	private static void ejercicio2() {
		System.out.print("INGRESE N: ");
		int n = sc.nextInt();
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			 factorial *=i;
		}
		System.out.println("EL FACTORIAL DE " + n + " es " + factorial);
	}

	private static void ejercicio3() {
		System.out.print("INGRESE LA CANTIDAD DE NUMEROS: ");
		int n = sc.nextInt();
		int positivos = 0, negativos = 0, ceros = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("INGRESE NUMEROS: ");
			 int num = sc.nextInt();
			 if (num > 0) positivos++;
			 else if (num < 0) negativos ++;
			 else ceros++;
		}
		System.out.println("POSITIVOS: " + positivos + " NEGATIVOS: " + negativos + " CEROS: " + ceros);
		
	}

	private static void ejercicio4() {
		System.out.print("INGRESE N: ");
		int n = sc.nextInt();
		int sumaPares = 0, contadoresPares = 0; 
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) 
				sumaPares += i; 
			contadoresPares++;
			
		}
		if (contadoresPares > 0) System.out.println("PROMEDIO DE PARES: " + ((double) sumaPares / contadoresPares));
		else System.out.println("NO HAY NUMERO PARES.");
		
	}

	private static void ejercicio5() {
		System.out.print("INGRESE UN NUMERO: ");
		int n = Math.abs(sc.nextInt());
		int sumaDigitos = 0;
		while (n > 0 ) {
			sumaDigitos += n % 10;
			n /= 10;
		}
		System.out.println("LA SUMA DE LOS DIGITOS ES: " + sumaDigitos);
	}

	private static void ejercicio6() {
		System.out.print("INGRESE N: ");
		int n = sc.nextInt();
		if (n % 7 == 0 || n % 11 == 0) System.out.println(n + " ES MULTIPLO DE 7 O DE 11.");
		else System.out.println(n+ " NO ES MULTIPLO DE 7 NI DE 11.");
	}

	private static void ejercicio7() {
		System.out.print("INGRESE N: ");
		int n = sc.nextInt();
		System.out.print("DIVISIBLES ENTRE 3 Y NO ENTRE 2: ");
		for (int i = 1; i <= n; i++) {
			if ( i % 3 == 0 && i % 2 !=0) System.out.println(i);
		}
	}

	private static void ejercicio8() {
		System.out.print("INGRESE LA HORA EN FORMATO 24H (O-23): ");
		int hora = sc.nextInt();
		if (hora >=6 && hora <= 11) System.out.println("MAÑANA");
		else if (hora >=12 && hora <= 18) System.out.println("TARDE");
		else if (hora >=19 && hora <= 23) System.out.println("NOCHE");
	}

	private static void ejercicio9() {
		System.out.print("INGRESE UN NUMERO (1-5): ");
		int num = sc.nextInt();
		switch (num) {
		case 1: System.out.println("I"); break;
		case 2: System.out.println("II"); break;
		case 3: System.out.println("III"); break;
		case 4: System.out.println("IV"); break;
		case 5: System.out.println("V"); break;
		default: System.out.print("NUMERO FUERA DE RANGO.");
		}
	}

	private static void ejercicio10() {
		// TODO Auto-generated method stub
		
	}

	private static void ejercicio11() {
		// TODO Auto-generated method stub
		
	}

	private static void ejercicio12() {
		// TODO Auto-generated method stub
		
	}

	private static void ejercicio13() {
		// TODO Auto-generated method stub
		
	}

	private static void ejercicio14() {
		// TODO Auto-generated method stub
		
	}

	private static void ejercicio15() {
		// TODO Auto-generated method stub
		
	}

	private static void ejercicio16() {
		// TODO Auto-generated method stub
		
	}

	private static void ejercicio17() {
		// TODO Auto-generated method stub
		
	}

	private static void ejercicio18() {
		// TODO Auto-generated method stub
		
	}

	private static void ejercicio19() {
		// TODO Auto-generated method stub
		
	}

	private static void ejercicio20() {
		// TODO Auto-generated method stub
		
	}

	private static void ejercicio8() {
		// TODO Auto-generated method stub
		
	}

}
