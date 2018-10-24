package principal;

import java.time.LocalDate;
import java.util.Random;

import org.omg.CORBA.PUBLIC_MEMBER;

import modelo.Persona;

public class Ejercicios {

	public void pruebasAPI() { /*--------04/10/2018-----------*/
		/*
		 * 1. Imprime por consola el valor de 2 elevado a 3 2. Imprime por consola un
		 * valor aleatorio entre 1 y 100. 3. En la cadena "LAS PALMAS DE GRAN CANARIA",
		 * imprime "GRAN"
		 */

		// 1. Usa la clase estatica Math y su método pow

		// System.out.println("el resultado del ejercicio 1 es: " + Math.pow(2.0f,
		// 3.0f));

		// 2. Usa la clase java.util.Ramdom y el método rnd

		//Random rnd = new Random();
		// System.out.println("el resultado del ejercicio 2 es: " + rnd.nextInt(100));

		// 3. Usar el método substring de la clase java.lang.String

		// System.out.println("el resultado del ejercicio 3 es: " + "LAS PALMAS DE GRAN
		// CANARIA".substring(14, 18));
	}

	/*-----------------------09/10/2018--------------------------*/
	/* Mostrar por consola los numeros comprendidos entre dos enteros a y b */

	// 1. prototipo, cabezera

	public void listaIntervaloEnteros(int primero, int ultimo) {
		// 2. cuerpo, implementacion del método
		int i = primero;
		/*
		 * while(i <= ultimo) { System.out.println(i); i++; //incrementador. }
		 */

		for (int j = primero; j <= ultimo; j++)
			System.out.println(j);

	}

	/*-----------------------------11/10/2018---------------------*/
	/* Actividad sobre las series fibonnaci. */

	public static void serieFibonnaci(int cuantos) {
		int num1 = 0;
		int num2 = 1;
		int total = 1;
		System.out.print(num1 + ", " + num2);
		for (int i = 0; i < cuantos; i++) {
			total = num1 + num2;
			System.out.print("," + total);
			num1 = num2;
			num2 = total;
		}
		System.out.println();
	}

	/*-----------------------11/10/2018-------------------------------*/
	/*-------------------Actividad para casa-------------------------*/
	/* 1)Devolver el numero menor de tres numeros */

	public int calculaMenor(int x, int y, int z) {
		if (x < y)
			if (x < z)
				return x;
			else
				return z;
		else if (y < z)
			return y;
		else
			return z;

	}

	/*-----------------------17/10/2018--------------------------*/

	/* 1) Hacer una version del metodo "calcNumMenor que devuelva el menor de 4
	 * números.*/

	public int calculaMenor(int x, int y, int z, int w) {
		if (x < y) // condicion que indica si x es menor que y;
			if (x < z)// condicion que indica si x es menor que z;
				if (x < w) // condicion que indica si x es menor que w;
					return x; // si es menor que w se devuelve al numero x;
				else // si no
					return w; // devuelve el numero w
			// se cierra el primer bucle en donde se conoce si x < w;
			else if (z < w) // si es distinto a x salta a buscar si z es menor que w
				return z;// devuelve el numero z;
			else // si no
				return w; // devuelve el numero z;
			//Se cierra el segundo bucle donde se conoce si z < w;
		else // si no
			// aqui se abren otros bucles primero para averiguar si y es menor que los otros parametros;
			if(y < z)//condicion que indica si y es menor que z;
				if(y < w) //condicion en donde averiguamos si y es menor que w;
					return y; //devuelve el numero y;
				else // si no 
					return w; //duelve el numero w;
				//se cierra el primer bucle en donde se conoce si y < w
			else if(z < w) // se vuelve a preguntar en otro bucle si z es menos que w
				return z; //devuelve el numero z
			else // si no 
				return w; //devuelve el numero w;
			//se cierra el segundo bucle donde se conoce que z < w
	//se cierra el primero de todos los bucles en donde se compara que x < y.
	}
	
	/*2) imprime por consola n números aleatorios enteros aleatorios entre 1 y 100*/
	
	public void imprimeAleatorios(int n) { //n es el numero de veces que se genera los aleatorios
		Random rnd = new Random();
		for (int i = 0; i < n; i++) {
			int numero = rnd.nextInt(6);
			System.out.println(i + 1 +  ".-" + numero);
			
		}
	}
	
	/*3) Genera aleatorios que los guarde en un array */
	public int[] generaAleatorios(int cuantos, int inferior, int superior) { //parametro a usar
		Random rnd = new Random();
		int[] resultado = new int[cuantos];
		//creamos una variable donde se guardan los resultados dentro del array
		for (int i = 0; i < cuantos; i++) {
			//System.out.println(inferior + rnd.nextInt(superior  - inferior + 1));
			resultado[i] = inferior + rnd.nextInt(superior - inferior + 1);	
		}
		return resultado;

	}

	public static void main(String[] args) {

		Persona juan = new Persona("42268525F", "Juan", 47);
		Persona persona1 = new Persona();
		/*---------------02/10/2018 Parametros con el Constructor--------------------
		 * El metodo Persona() tiene que ver con el Constructor, en donde le estamos pasando los
		 * parametros con los que vamos a trabajar */
		// int pasos = juan.caminar(20);

		/*-----------------------------04/10/2018---------------------------------*/
		Ejercicios ejer = new Ejercicios();

		// ejer.pruebasAPI();

		/*-----------------------09/10/2018--------------------------*/

		//int x = 10;
		//int y = 30;

		// ejer.listaIntervaloEnteros(x, y);
		/*---------------------10/10/2018-----------------------------*/
		// serieFibonnaci(8);

		/*---------------------11/10/2018------------------------------*/
		//int a = 3;int b = 50; int c = 10; int d =12;
		//system.out.println("el menor es : " + ejer.calculaMenor(a, b, c));

		//*---------------------*17/10/2018----------------------------*/
		
		//System.out.println("el menor es : " + ejer.calculaMenor(a, b, c, d));
		//ejer.imprimeAleatorios(15);
		int[] numeros = ejer.generaAleatorios(20, 5, 50);
		
		System.out.println("FIN DEL PROGRAMA");
	}

}
