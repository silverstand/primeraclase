
public class variables_condicionales {

	public static void main(String[] args) {
	double num1=5.85;
	// Ejemplo de refundicion, convertir numerico a un entero
	
	int resultado=(int)Math.round(num1);
	System.out.println(resultado);
	
	// Elevar un numero a la potencia, con refundicion
	
	double base=5;
	double exponente=3;
	int resultado2 = (int)Math.pow(base, exponente);
	System.out.println("El resultado de "+base + " elevado a la " + exponente + " es " + resultado2);
			 
	}

}
