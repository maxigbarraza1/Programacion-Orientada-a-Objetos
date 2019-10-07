import calculadora.Division;
import calculadora.Potencia;
import calculadora.Producto;
import calculadora.Resta;
import calculadora.Suma;
import composite.Expresion;
import composite.Valor;

public class MAIN {

	public MAIN() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//Valores
		Valor uno = new Valor(1);
		Valor dos = new Valor(2);
		Valor tres = new Valor(3);
		Valor cinco = new Valor(5);
		Valor siete = new Valor(7);
		Valor ocho = new Valor(8);

		
		//Primer ejemplo
		Suma suma1 = new Suma (dos,tres);
		Expresion laSuma1 = new Expresion (dos,tres,"Suma",suma1);
		
		Producto multiplicacion = new Producto(laSuma1,cinco);
		Expresion elProducto1 = new Expresion (laSuma1,cinco,"Producto",multiplicacion);
		
		System.out.println(elProducto1.toString());
		System.out.println("Resultado 1: " + elProducto1.getValor());
		System.out.println (" ");
		
		//Segundo ejemplo
		Suma suma2 = new Suma(cinco,cinco);
		Expresion laSuma2 = new Expresion (cinco,cinco,"Suma",suma2);
		
		Resta resta2 = new Resta(tres,uno);
		Expresion laResta1 = new Expresion(tres,uno,"Resta",resta2);
		
		Potencia potencia1 = new Potencia(laSuma2,laResta1);
		Expresion laPotencia1 = new Expresion(laSuma2,laResta1,"Potencia",potencia1);
		
		System.out.println(laPotencia1.toString());
		System.out.println("Resultado 2: " + laPotencia1.getValor());
		System.out.println(" ");
		
		//Tercer ejemplo
		Suma suma3=new Suma (siete,ocho);
		Expresion laSuma3 = new Expresion (siete,ocho,"Suma",suma3);
		
		Resta resta3=new Resta(cinco,tres);
		Expresion laResta3 = new Expresion (cinco,tres,"Resta",resta3);
		
		Division division3 = new Division(laSuma3,laResta3);
		Expresion laDivision3 = new Expresion(laSuma3,laResta3,"Division",division3);
		
		System.out.println(laDivision3.toString());
		System.out.println("Resultado 3: " + laDivision3.getValor());
		System.out.println (" ");
	}

}
