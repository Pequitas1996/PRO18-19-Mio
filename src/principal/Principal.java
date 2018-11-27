package principal;

import java.time.LocalDate;

import java.util.Random;

import org.omg.CORBA.PUBLIC_MEMBER;

import modelo.Persona;

import ejercicios.Ejercicios;

public class Principal {

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

		// int x = 10;
		// int y = 30;

		// ejer.listaIntervaloEnteros(x, y);
		/*---------------------10/10/2018-----------------------------*/
		// serieFibonnaci(8);

		/*---------------------11/10/2018------------------------------*/
		// int a = 3;int b = 50; int c = 10; int d =12;
		// system.out.println("el menor es : " + ejer.calculaMenor(a, b, c));

		// *---------------------17/10/2018----------------------------*/

		// System.out.println("el menor es : " + ejer.calculaMenor(a, b, c, d));
		// ejer.imprimeAleatorios(15);
		int[] numeros = ejer.generaAleatorios(15, 10, 200);

		// int[] estatidisticaDados = ejercicios.generaEstadisticaAparicion(10, 1, 6);
		// int[] estadistica = ejercicios.generaEstadisticaAparicion1(20, 1, 20);

		/*-----------------------24/10/218----------------------*/
		Persona[] personas = ejer.listarPersonas(10);

		float saldo = 100.0f;
		float[] movimientos = { 10.0f, -5.0f, 20.5f };

		// System.out.println("El saldo final es : " +
		// ejercicios.saldoDeUnaCuenta(saldo, movimientos));

		/*-------------------25/10/2018------------------*/
		// ejercicios.pruebaCadena();
		ejer.compararCadenas();
		// String[] diasSemana = {"LUNES", "MARTES"};
		// System.out.println("el menor es : " + menor);

		/*-------------------31/10/2018-----------------*/

		float[][] ventaYears = {

				/* hay 3 filas (vendedores) y 12 columnas(meses) */
				{ 12.5f, 13.50f, 8.5f, 5.0f, 10.5f, 9.5f, 20.5f, 10.5f, 4.0f, 6.5f, 5.5f, 6.0f },
				{ 10.5f, 15.50f, 3.5f, 2.0f, 11.5f, 9.5f, 2.5f, 10.5f, 4.0f, 6.5f, 5.5f, 6.0f },
				{ 11.5f, 10.50f, 4.5f, 1.0f, 9.5f, 9.5f, 3.5f, 10.5f, 7.0f, 1.5f, 3.5f, 6.0f } };

		// crear un array que guarde el resumen de cada vendedor
		float[] resumenVendedor = ejer.resumenVentasPorVendedor(ventaYears);

		/*--------------------06/11/2018------------------*/

		String[] nombresVendedor = { "JUAN CARLOS", "ISABEL", "MARTA" };
		float[][] ventaYear = {

				/* hay 3 filas (vendedores) y 12 columnas(meses) */
				{ 12.5f, 13.50f, 8.5f, 5.0f, 10.5f, 9.5f, 20.5f, 10.5f, 4.0f, 6.5f, 5.5f, 6.0f },
				{ 10.5f, 15.50f, 3.5f, 2.0f, 11.5f, 9.5f, 2.5f, 10.5f, 4.0f, 6.5f, 5.5f, 6.0f },
				{ 11.5f, 10.50f, 4.5f, 1.0f, 9.5f, 9.5f, 3.5f, 10.5f, 7.0f, 1.5f, 3.5f, 6.0f } };

		float[] ventas = ejer.resumenVentasPorVendedor(ventaYear);

		/*-------------------07/11/2018-----------------------*/
		float[][] ventaMes = {

				/* hay 3 filas (vendedores) y 12 columnas(meses) */
				{ 12.5f, 13.50f, 8.5f, 5.0f, 10.5f, 9.5f, 20.5f, 10.5f, 4.0f, 6.5f, 5.5f, 6.0f },
				{ 10.5f, 15.50f, 3.5f, 2.0f, 11.5f, 9.5f, 2.5f, 10.5f, 4.0f, 6.5f, 5.5f, 6.0f },
				{ 11.5f, 10.50f, 4.5f, 1.0f, 9.5f, 9.5f, 3.5f, 10.5f, 7.0f, 1.5f, 3.5f, 6.0f } };
		float[] mes = ejer.resumenVentasdeCadaMes(ventaMes);

		// Metodo muestra reloj

		// ejercicios.mostrarReloj();

		/*----------------08/11/2018-------------------------*/

		// System.out.println(ejercicios.esPrimo(99525));
		int inicio = 500;
		int cuantos = 5;
		//ejer.listarPrimos2(inicio, cuantos);
		System.out.println();

		// int[] numeros = ejer.listarPrimos3(inicio, cuantos);
		// String[]cadena= {"123", "63A", "101", "8k8", "9811", "xyz"};

		// int[] datos = ejer.convierteCadenas(cadena);

		/*---------------13/11/2018---------------------*/

		// int[] desgloce = ejercicios.desgloseMoneda(13);
		// ejercicios.listaDesgloseMoneda(1234);

		int[] x = { 78, 34, 1, 34, 54, 29, 3 };
		ejer.ordenaArray(x);

		/*--------------------14/11/2018--------------------*/
		String[] cadena = { "perro", "gato", "145", "arroz" };
		ejer.ordenaCadena(cadena);
		
		/*-------------------20/11/2018---------------------*/
		
		/* ejercicio 2*/
		int[] array1 = { 3, 6, 9, 9, 10, 15, 20, 25, 70 };
		int[] array2 = { 1, 2, 9, 9, 25, 39, 58, 67, 77, 88, 99 };
		int[] listamezclada = ejer.mezclarlistaOrdenada(array1, array2);
		
		
		/* ejercicio 3*/
		String palabra = "Hola a todas las personas";
		//System.out.println("la palabra invertida es: " + ejer.invertirCaracteres(palabra));
		
		/*---------------21/11/2018--------------------*/
		int [] [] datos = 
			{
				{ 1 , 4 },
				{ 7 , 4 , 6 },
				{ 6 },
				{ 5 , 2 , 3 },
				{ 4 , 2 , 5 , 1 , 9 , 0 , 3 },
				{ 5 , 6 , 1 , 3 }
			};
		ejer.ordenaFilasMatriz (datos);
		
		/*-------------27/11/2018-----------------------*/
		int[][]matriz= {
				{2, 6, 4},
				{5},
				{7, 9},
				{10, 8, 3, 5}
		};
		
		int[] resultado = ejer.matrizToArrayOrdenado(matriz);

		System.out.println("FIN DEL PROGRAMA");

	}

}
