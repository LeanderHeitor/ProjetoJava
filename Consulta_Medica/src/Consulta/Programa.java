package Consulta;
import Consulta.Negocios.Beans.Paciente;
import Consulta.Negocios.Beans.ConsultaInfo;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exemplo de uso da classe Paciente
        Paciente paciente = new Paciente(1, "João", "01/01/1990", "Plano Ouro", "01/01/2024");

        int opcao;
        do {
            // Exibir o menu
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Agendar consulta para o paciente");
            System.out.println("2 - Exibir informações do paciente");
            System.out.println("3 - Verificar validade do plano");
            System.out.println("4 - Cancelar consulta do paciente");
            System.out.println("5 - Verificar se o paciente possui consultas agendadas");
            System.out.println("6 - Sair");

            // Ler a escolha do usuário
            System.out.print("Digite o número da opção desejada: ");
            opcao = scanner.nextInt();

            // Executar a opção escolhida
            switch (opcao) {
                case 1:
                    // Agendar consulta usando a classe Paciente
                    System.out.println("Digite a data da consulta (dd/MM/yyyy): ");
                    String dataConsulta = scanner.next();

                    System.out.println("Digite a hora da consulta (HH:mm): ");
                    String horaConsulta = scanner.next();

                    System.out.println("Digite o número do consultório: ");
                    int numeroConsultorio = scanner.nextInt();

                    System.out.println("Digite o tipo da consulta: ");
                    String tipoConsulta = scanner.next();

                    paciente.agendarConsulta(dataConsulta, horaConsulta, numeroConsultorio, tipoConsulta);
                    break;

                case 2:
                    // Exibir informações do paciente
                    paciente.exibirInformacoes();
                    break;

                case 3:
                    // Verificar validade do plano
                    paciente.verificarValidadePlano();
                    break;

                case 4:
                    // Cancelar consulta do paciente
                    paciente.cancelarConsulta();
                    break;

                case 5:
                    // Verificar se o paciente possui consultas agendadas
                    boolean possuiConsultas = paciente.possuiConsultasAgendadas();
                    System.out.println("O paciente possui consultas agendadas? " + possuiConsultas);

                    // Se houver consultas agendadas, mostrar informações da última consulta
                    if (possuiConsultas) {
                        ConsultaInfo ultimaConsulta = paciente.obterUltimaConsultaAgendada();
                        System.out.println("Informações da última consulta agendada:");
                        System.out.println("Data: " + ultimaConsulta.getData());
                        System.out.println("Hora: " + ultimaConsulta.getHora());
                        System.out.println("Consultório: " + ultimaConsulta.getNumeroConsultorio());
                        System.out.println("Tipo de Consulta: " + ultimaConsulta.getTipoConsulta());
                    }
                    break;

                case 6:
                    System.out.println("Saindo do programa. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 6);

        scanner.close();
    }
}
