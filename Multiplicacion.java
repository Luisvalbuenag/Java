public class Multiplicacion
{	
	public int multiplicacion(int m, int M) //metodo
	{
		
		if(M == 0) //Si el numero que multiplicara "M" es = a 0 el resultado sera 0 y lo retornara
		{
			return 0; //Retorno de resultado
		}
		else
		{
			if(M == 1) //Si el numero que multiplicara "M" es = a 1 el resultado sera el numero multiplicado
			{
				return m; //Retorno de resultado
			}
			else
			{
			return m + multiplicacion(m,M-1); //Suma de numero multiplicado mas el metodo donde traera el resultado de: la suma de el numero multiplicado, sumado el numero de veces que se multiplicara - 1 ya que lo sumamos desde el inicio de la linea, en este ejemplo 10 veces el numero 7, 7 + (7 + 7 + 7 + 7 + 7 + 7 + 7 + 7 + 7)
			}
		}
		
	}
}