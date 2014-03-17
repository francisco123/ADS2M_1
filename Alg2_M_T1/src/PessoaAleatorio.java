import java.util.Random;
public class PessoaAleatorio {

		
	
		public void pessoa(){
		String nomes[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T"};
		
		int nrAleatorio;
		
		Random random=new Random(2);
		
			for (int i=0; i < nomes.length; i++){
				nrAleatorio=0 + random.nextInt(21);
			
				//if (nomes.c == )
				
				
				System.out.println("Nome: " +nomes[nrAleatorio]);
			}
			
		}
}
