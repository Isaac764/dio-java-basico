package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
		String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
			
		}
	}
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else 
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			//elas precisaram sofrer alterações
			
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentaiva ");
		else
			System.out.println("não conseguimos o contato com " + candidato + " na " + ", número máximo de tentativas " + tentativasRealizadas + " realizadas");
		
    }
		//metodo auxiliar
		static boolean atender() {
			return new Random().nextInt(3)==1;	
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

