import java.util.Locale;
import java.util.Scanner;

public class Contador{

public static void main(String[] args) throws Exception{

	try (Scanner terminal = new Scanner(System.in)) {
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		}
	}

	static void contagemParametros(){
					
		for(int parametroUm= 1; parametroUm<=20; parametroUm++){
			if (parametroUm==1) {
				System.out.println("Imprimir parametroUm " + parametroUm);}
			}
		}
		static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
			if (parametroUm > parametroDois)
			throw new ParametrosInvalidosException();
	
			int contagem = parametroDois - parametroUm;{
			for(parametroDois = 1; parametroUm >=1; parametroUm ++);

		}
	}
}


		
