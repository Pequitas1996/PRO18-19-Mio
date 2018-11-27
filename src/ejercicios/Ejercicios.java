package ejercicios;

import java.util.Random;

import modelo.Persona;

public class Ejercicios {
	public void pruebasAPI() { 
		
		/*--------04/10/2018-----------*/
		
		/* 1. Imprime por consola el valor de 2 elevado a 3 2. Imprime por consola un
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
	
	/*------------------------------18/10/2018----------------------*/
	/* 1) imprime por consola n números aleatorios enteros aleatorios entre inferior
	 * y superior
	 */

	public void imprimeAleatorios(int n, int inferior, int superior) { // n, cuantos números
		Random rnd = new Random();
		for (int i = 0; i < n; i++) {
			int numero = inferior + rnd.nextInt(superior - inferior + 1);
			System.out.println(i + 1 + ".- " + numero);
		}

	}

	/* 2)Generar un metodo que cuando se lanze varias veces un dado o otra cosa se
	 * guarde las n veces que aparece el mismo numero y que se guarde dentro de un
	 * array */
	public int[] generaEstadisticaAparicion(int n, int inferior, int superior) {
		// metodo de mauricion
		int[] resultado = new int[superior - inferior + 1];
		Random rnd = new Random();
		for (int i = 0; i < n; i++) {
			int numero = inferior + rnd.nextInt(superior - inferior + 1);
			resultado[numero - 1]++;
		}
		return resultado;
	}

	public int[] generaEstadisticaAparicion1(int cuantos, int inferior, int superior) {
		// metodo distinto al de mauricio que funciona generado el año pasado
		int[] resultado = new int[superior - inferior + 1];
		int[] aleatorios = this.generaAleatorios(cuantos, inferior, superior);
		// Random rnd= new Random();
		for (int i = 0; i < aleatorios.length; i++) {

			resultado[aleatorios[i] - 1]++;
		}
		return resultado;
	}

	/*--------------------------24/10/2018*---------------------------------*/

	/* crear un metodo que devuelva una lista de n personas, se crea las personas
	 * con el constructor Persona.*/

	public Persona[] listarPersonas(int n) {
		Persona[] lista = new Persona[n];

		for (int i = 0; i < lista.length; i++) {
			lista[i] = new Persona();

		}

		return lista;
	}

	/* crear un metodo que devuelva el saldo de una cuenta, partiendo de una lista
	 * de movimientos y del saldo inicial*/

	public float saldoDeUnaCuenta(float saldoInicial, float[] movimientos) {
		float saldoFinal = saldoInicial;
		for (int i = 0; i < movimientos.length; i++)
			saldoFinal += movimientos[i];
		return saldoFinal;
	}

	/*--------------------------25/10/2018-----------------------------*/
	public void pruebaCadena() {

		String nombre = "LAS PALMAS DE GRAN CANARIA";// declaramos el objeto tipo String
		// iterar en la cadena mostrando todos sus caracteres
		for (int i = 0; i < nombre.length(); i++) {
			System.out.println(nombre.charAt(i));
		}
	}

	/*------------------Comparar cadenas---------------*/
	public void compararCadenas() {
		String cad1 = "abca";
		String cad2 = "abcdaaaaaaaaaaaa";
		// System.out.println(cad1.compareTo(cad2));
		System.out.println(cad2.compareToIgnoreCase(cad1));

	}

	/*------------------31/10/201------------------------*/
	/*Empezamos a trabajar con matrices en donde una matriz es un array de arrays
	 * en donde se explica como crear matrices con arrays */

	/* Crear un metodo que recorra la matriz de y recoga el acumulado de cada
	 * vendedor y lo sume y tener un resumen */

	public float[] resumenVentasPorVendedor(float[][] ventas) {
		float[] resultado = new float[ventas.length];
		float acumulador = 0;
		// iterar por filas/columnas acumulado ventas de cada año

		for (int i = 0; i < ventas.length; i++) {
			acumulador = 0;
			for (int j = 0; j < ventas[i].length; j++)
				acumulador += ventas[i][j];
			resultado[i] = acumulador;
		}
		return resultado;
	}

	/*-------------------------06/11/2018--------------------*/
	/* Actividad de devolver numeros de una cadena de numeros y si no se puede que
	 * nos devuelva un -1 */

	public int[] convierteCadenas(String[] cadenaNumerica) {
		// el Array de salida tiene el mismo numero de elementos que el de entrada

		// si un numero no es valido, se pone -1
		int[] resultado = new int[cadenaNumerica.length];
		for (int i = 0; i < resultado.length; i++)
			try {
				resultado[i] = Integer.parseInt(cadenaNumerica[i]);
				// System.out.println("LLega aqui");

			} catch (NumberFormatException e) {
				// numero no valido
				resultado[i] = -1;
			}

		return resultado;
	}

	/*---------------Matriz ventas por mes-------------------*/
	public float[] resumenVentasPorMes(float[][] ventas) {
		// floar acumVendedor=0;
		float[] resultado = new float[ventas.length];
		// iterar por filas/columnas acumulado ventas por mes de cada año
		for (int i = 0; i < ventas.length; i++) {
			// acumVendedor= 0;
			for (int j = 0; j < ventas[i].length; j++)
				resultado[i] += ventas[i][j];
			// resultado[i]= acumVendedor;
		}

		return resultado;
	}

	/*-----------------07/11/018----------------------------*/
	/* Vamos a leer la matriz por columnas y averiguar el resultado de cada mes */

	public float[] resumenVentasdeCadaMes(float[][] resumen) {
		float[] resultado = new float[resumen[0].length];
		// float acumVendedor;
		for (int j = 0; j < resumen[0].length; j++) {
			// acumVendedor = 0;
			for (int i = 0; i < resumen.length; i++)
				// acumVendedor += resumen[i][j]; primera forma de hacerlo con un acumulador a 0
				// resultado[j]= acumVendedor;
				resultado[j] += resumen[i][j];
			// segunda forma de hacerlo en donde el programa te da el acumulado ya en 0

		}
		return resultado;
	}

	/* Vamos a crear un bucle para un reloj, en donde generamos 3 for en donde se
	 * suman las horas, minutos y segundos. */

	public void mostrarReloj() {
		
		for (int h = 0; h < 1; h++) {
			for (int m = 0; m < 60; m++) 
				for (int s = 0; s < 60 ; s++) {
					System.out.println(h +":" +  m + ":" + s);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		}
	}
	
	/*----------------08/11/2018-------------------------*/
	/*Creacion de un metodo para averiguar si el numero es primo o no*/
	
	public boolean esPrimo(int n) {
		for (int i = 2; i < n; i++) 
			if (n % i == 0) 
				return false;
			
		return true;
		
	}
	
	/*Metodo para hacer un listado de numeros primos*/
	
	
	public void listarPrimos (int desde, int hasta) {
		for (int i = desde; i < hasta; i++) 
			if (esPrimo(i)) 
				System.out.print(i + ", ");
				
	}
	
	/*Listar primos 2*/
	public void listarPrimos2 (int desde, int cuantos) {
		int contador = 0;
		while (contador < cuantos) 
			if (esPrimo(desde++) ) { 
				System.out.print(desde + ", ");
				contador ++;
			}
	}
	
	/*Lista primos 3 y que se guarden en una lista*/
	
	public int[]listarPrimos3 (int desde, int cuantos) {
		int[] resultado = new int[cuantos];
		int contador = 0;

		while (contador < cuantos) 
			if (esPrimo(desde) ) { 
				//System.out.print(desde + ", ");
				resultado[contador] = desde;
				contador ++;
			}
		
			desde++;
		return resultado;
	}

	/*----------------------13/11/2018----------------------*/
	
	/* 1)Vamos a desglosar monedas de una cantidad cuantas monedas lleva cada una */

	public int[] desgloseMoneda(int cantidad) {
		int[] monedas = { 200, 100, 50, 20, 10, 5, 2, 1 };
		int[] resultado = new int[monedas.length];
		int indice = 0;
		// bucle con while
		while (cantidad % monedas[indice] != 0) { 
			//dice que cantidad de tanto por ciento de monedas tiene que ser distinto de 0

			// if (cantidad / monedas[indice] > 0) {
			// cantidad = cantidad % monedas[indice];
			resultado[indice] = cantidad / monedas[indice];
			//en donde la cantidad dividido por monedas e indice igualado a 0
			cantidad = cantidad % monedas[indice];
			//lo multipilice o sume 

			indice++; //y se sume dentro de la array
		}

		// Para que cuando el resto sea 0 coja el valor
		resultado[indice] = cantidad / monedas[indice];

		return resultado;
	}
	
	/*public int[] desgloseMoneda(int cantidad) { //desglose con un bucle for
		int[] monedas = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int[] resultado = new int[monedas.length];
		int resto = cantidad;
			for (int i = 0; i < monedas.length; i++) {
					resultado[i]= resto / monedas[i];
					resto = resto%monedas[i];
			}
			return resultado;
	}*/
	
	/*2) Ahora vamos a crear otro metodo que llame al anterior pero te lo listara 
	 * por pantalla todas las monedad que se utilizan*/
	
	public void listaDesgloseMoneda(int cantidad){
		System.out.println("Cantidad " + cantidad);
		int[] monedas = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int[] resultado = desgloseMoneda(cantidad);
		
		for (int i = 0; i < resultado.length; i++)
			if (resultado[i] !=0) {
				System.out.println(monedas[i]  + " -> " + resultado[i]);
			}
	}
	
	public void ordenaArray(int[] array) {
		for (int i = 0; i < array.length -1 ; i++) 
			for (int j = i + 1; j < array.length; j++) 
				if (array[i] < array[j]) {
					int aux = array[i];
					array[i] = array[j];
					array[j]=  aux;
					
				}
	}
	
	/*-----------------------14/11/2018----------------------*/
	
	/* 1) ordenar dentro de un array de numeros, ordenar un array de cadenas*/
	
	public void ordenaCadena(String[] cadena) {
		
		for (int i = 0; i < cadena.length - 1 ; i++)
			for (int j = i + 1 ; j < cadena.length; j++)
				if (cadena[i].compareTo(cadena[j]) > 0) {
					String aux = cadena[i];
					cadena[i] = cadena[j];
					cadena[j] = aux;
					
				}
	}
	
	/*-------------------20/11/2018------------------------*/
	
	
	/* 1.Invertir una lista*/
	
	public void invertirLista(int[] lista){
		
		int[]resultado = new int[lista.length];
		
		for (int i = lista.length; i>= 0; i--) {
			resultado[(lista.length) -1] = lista[i];
		}

	}
	
	
	/* 2.“Mesclar” dos listas, previamente ordenadas*/
	public int[]mezclarlistaOrdenada(int[] l1, int[] l2){
		int i=0; int j=0; int k=0; //igualamos las variables que vamosa utlizar en esta actividad a 0
		int [] resutado = new int[l1.length + l2.length];
		 while(k < l1.length + l2.length) {
			 
		//while(l1[i] != Integer.MAX_VALUE || l2[j] != Integer.MAX_VALUE) {
			/* en esta linea lo que estamos declarando es que mientras la l1 y l2
			 * sean menores que el maximo que permite los numeros enteros y se pueda mesclar*/
			try {
				if (l1[i] < l2[j]) {
					//aqui comparamos las dos listas para saber cual es la mas pequña 
					resutado[k] = l1[i++]; // es donde sumamos a la nueva lista el numero de la lista de i.
					
				}else {  // si no 
					resutado[k] = l2[j++]; // sumamos el numero de la lista de j
				}
				k++;
			} catch(ArrayIndexOutOfBoundsException e) {
				// y despueslos vamos smando y guardando
				if (i == l1.length) // aqui comparamos que la lista de i sea igual a a l1
					l1[-- i] = Integer.MAX_VALUE;
				//si es asi, es donde le igualamos el maximo permitido a cada array de numeros.
			
				if(j == l2.length)
					l2[-- j] = Integer.MAX_VALUE;
			}
		}
		
		return resutado; //aqui retornamos para que se cumpla en todos los posibles momentos
	}
	
	/* 3.Invertir caracteres de una cadena*/
	
	public String invertirCaracteres(String caracteres) {
		
		String caracter = new String(); // creamos una variable vacia en donde se guardaran los caracteres
		
		for (int i = caracteres.length() -1 ; i >=0; i--) {
		/* en el for igualamos la i con el numero de caracteres que tiene la palabra que vamos a utilizar y
		 * le restamos 1 y decimos que tiene que ser mayor o igual que 0 para despues restarle para 
		 * que se lea al reves*/	
			caracter += caracteres.charAt(i);
			/* la variable caracter la igualamos o la sumamos a la suma de los caracteres que tenga 
			 * la i con el metodo charAt*/
		}
		return caracter;
		
	}
	
	/*-----------------21/11/2018-------------------*/
	/* Vamoos a ordenar una matriz*/
	
	public void ordenaFilasMatriz(int[][] matriz) {
		
		for (int i = 0; i < matriz.length; i++) //recorre la matriz desde 0 hasta length
			ordenaArray(matriz[i]);
		
	}
	/*----------------27/11/2018-------------------*/
	/*Guardalo en un array de entetos*/
	
	
	public int[]matrizToArrayOrdenado(int[][] matriz){
		//implementacion
		int[]resultado = new int[1];
		ordenaFilasMatriz(matriz);
		
		for (int i = 0; i < matriz.length; i++) 
			resultado= mezclarlistaOrdenada(matriz[i], resultado);
		
		return resultado;	

	}
	

	
}
