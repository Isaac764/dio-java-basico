package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
		imprimirCandidato();	
    }

	static void imprimirCandidato(){
		String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};

		System.out.println("Imprimir a lista de candidatos informando o indice do elemento");

		for(int indice=0; indice < candidatos.length;indice++){
			System.out.println("O candidato de nº " +  (indice+1) + " é o " + candidatos[indice]);
		}

		System.out.println("Forma abreviada de interação FOR EACH");

		for(String candidato: candidatos){		
			System.err.println("O candidato selecionado foi " + candidato);
		}
		}

	static void selecaoCandidatos() {
		String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
		
		int candidatosSelecionado = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionado < 5 && candidatoAtual < candidatos.length){
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + "Solicitou este valor de salario" + salarioPretendido);
			if(salarioBase > salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecioando para a vaga" );
				candidatosSelecionado++;
				}
				candidatoAtual ++;
			}
		}
		static double valorPretendido() {
			return ThreadLocalRandom.current().nextDouble(1800, 2200);
		}

	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido){
		System.out.println("LIGAR PARA O CANDIDATO");				
		}else if(salarioBase==salarioPretendido)
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		
		else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		}

	}
	
}

