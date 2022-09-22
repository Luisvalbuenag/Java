public class ClaseAplicaciones {

	public static void main (String [] args)

	{
		System.out.println("Hola Mundo"); //Impresion de titulo
		Multiplicacion operador = new Multiplicacion(); //Se instancia objeto
		Persona Fernando = new Persona(); //Instancia de objeto
		System.out.println("La edad es: "); //Impresion de texto
        System.out.println(Fernando.getEdad());//Impresion metodo edad
		System.out.println("El resultado de la operacion es: "); //Impresion de texto
		System.out.println(operador.multiplicacion(7,10)); //Impresion de dato (objeto.metodo(numero que se va a multiplicar, numero que va a multiplicar))

	}

}
