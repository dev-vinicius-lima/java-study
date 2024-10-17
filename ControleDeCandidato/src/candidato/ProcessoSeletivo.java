package candidato;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        String[] candidatos = { "João", "Maria", "Pedro", "Ana", "Carlos" };

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato) {
        int tentativasRelizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (atendeu) {
                System.out.println("O candidato " + candidato + " atendeu.");
            } else {
                tentativasRelizadas++;
                System.out.println("O candidato " + candidato + " na " + tentativasRelizadas + " tentativa.");
            }

        } while (continuarTentando && tentativasRelizadas < 3);

        if (atendeu) {
            System.out.println(
                    "conseguimos contato com o cadidato " + candidato + " na tentativa realizada "
                            + tentativasRelizadas);
        } else {
            System.out.println("Não conseguimos contato com o cadidato " + candidato + ".");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "João", "Maria", "Pedro", "Ana", "Carlos" };

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println(
                    "O candidato de Nº " + (i + 1) + " é " + candidatos[i] + " e foi selecionado para a vaga.");
        }

    }

    static void selecaoDeCandidatos() {
        String[] candidatos = { "João", "Maria", "Pedro", "Ana", "Carlos" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o salário de R$ " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;

        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        String mensagem = salarioPretendido > salarioBase ? "ligar para o candidato."
                : salarioPretendido == salarioBase ? "Ligar para candidatos para contra proposta."
                        : "Aguardar outros candidatos.";

        System.out.println(mensagem);

    }
}
