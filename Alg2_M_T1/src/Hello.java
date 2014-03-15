import java.util.Scanner;
import static java.lang.System.out;
public class Hello {

	public static void main(String[] args){
		Scanner entrada=new Scanner(System.in);
		out.println("Digite seu nome: ");
		String nome=entrada.next();
		out.println("Hello, "+nome);
	}
}
