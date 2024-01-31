package Consulta;
import Consulta.Negocios.Beans.Paciente;
import Consulta.Negocios.ControladorAgendaSaude;
import Consulta.Negocios.ControladorMedico;
import Consulta.Negocios.Beans.AgendaSaude;
import Consulta.Negocios.Beans.ConsultaInfo;
import Consulta.Negocios.Beans.Medico;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Criando 12 Médicos
        Medico medico1 = new Medico(1, "João Silva", "Cardiologia");
        Medico medico2 = new Medico(2, "Maria Oliveira", "Pediatria");
        Medico medico3 = new Medico(3, "Carlos Santos", "Ortopedia");
        Medico medico4 = new Medico(4, "Ana Costa", "Ginecologia");
        Medico medico5 = new Medico(5, "Pedro Almeida", "Dermatologia");
        Medico medico6 = new Medico(6, "Sofia Pereira", "Psiquiatria");
        Medico medico7 = new Medico(7, "Miguel Ferreira", "Otorrinolaringologia");
        Medico medico8 = new Medico(8, "Beatriz Ramos", "Endocrinologia");
        Medico medico9 = new Medico(9, "Ricardo Gonçalves", "Neurologia");
        Medico medico10 = new Medico(10, "Isabel Marques", "Oncologia");
        Medico medico11 = new Medico(11, "Tiago Lopes", "Urologia");
        Medico medico12 = new Medico(12, "Laura Fernandes", "Oftalmologia");
        
        ControladorMedico controlador = ControladorMedico.getInstance();
        List<Medico> listaDeMedicos = new ArrayList<>();
        
        // Adicione os médicos à lista
        listaDeMedicos.add(medico1);
        listaDeMedicos.add(medico2);
        listaDeMedicos.add(medico3);
        listaDeMedicos.add(medico4);
        listaDeMedicos.add(medico5);
        listaDeMedicos.add(medico6);
        listaDeMedicos.add(medico7);
        listaDeMedicos.add(medico8);
        listaDeMedicos.add(medico9);
        listaDeMedicos.add(medico10);
        listaDeMedicos.add(medico11);
        listaDeMedicos.add(medico12);

        // Iterar sobre a lista e cadastrar os médicos
        for (Medico medico : listaDeMedicos) {
            controlador.cadastrarMedico(medico);
        }

        //Criado a agenda saúde para cada médico
        LocalDate dataExemplo = LocalDate.of(2023, 10, 15); // Exemplo de data
        LocalTime horaExemplo = LocalTime.of(14, 30); // Exemplo de horário
        String tipoConsultaExemplo = "Consulta de rotina"; // Exemplo de tipo de consulta
        int numeroConsultorioExemplo = 3; // Exemplo de número do consultório

        AgendaSaude agendaMedico1 = new AgendaSaude(1, "João Silva", "Cardiologia", dataExemplo, horaExemplo, tipoConsultaExemplo, numeroConsultorioExemplo);
        AgendaSaude agendaMedico2 = new AgendaSaude(2, "Maria Oliveira", "Pediatria", dataExemplo, horaExemplo, tipoConsultaExemplo, numeroConsultorioExemplo);
        AgendaSaude agendaMedico3 = new AgendaSaude(3, "Carlos Santos", "Ortopedia", dataExemplo, horaExemplo, tipoConsultaExemplo, numeroConsultorioExemplo);
        AgendaSaude agendaMedico4 = new AgendaSaude(4, "Ana Costa", "Ginecologia", dataExemplo, horaExemplo, tipoConsultaExemplo, numeroConsultorioExemplo);
        AgendaSaude agendaMedico5 = new AgendaSaude(5, "Pedro Almeida", "Dermatologia", dataExemplo, horaExemplo, tipoConsultaExemplo, numeroConsultorioExemplo);
        AgendaSaude agendaMedico6 = new AgendaSaude(6, "Sofia Pereira", "Psiquiatria", dataExemplo, horaExemplo, tipoConsultaExemplo, numeroConsultorioExemplo);
        AgendaSaude agendaMedico7 = new AgendaSaude(7, "Miguel Ferreira", "Otorrinolaringologia", dataExemplo, horaExemplo, tipoConsultaExemplo, numeroConsultorioExemplo);
        AgendaSaude agendaMedico8 = new AgendaSaude(8, "Beatriz Ramos", "Endocrinologia", dataExemplo, horaExemplo, tipoConsultaExemplo, numeroConsultorioExemplo);
        AgendaSaude agendaMedico9 = new AgendaSaude(9, "Ricardo Gonçalves", "Neurologia", dataExemplo, horaExemplo, tipoConsultaExemplo, numeroConsultorioExemplo);
        AgendaSaude agendaMedico10 = new AgendaSaude(10, "Isabel Marques", "Oncologia", dataExemplo, horaExemplo, tipoConsultaExemplo, numeroConsultorioExemplo);
        AgendaSaude agendaMedico11 = new AgendaSaude( 11, "Tiago Lopes", "Urologia", dataExemplo, horaExemplo, tipoConsultaExemplo, numeroConsultorioExemplo);
        AgendaSaude agendaMedico12 = new AgendaSaude(12, "Laura Fernandes", "Oftalmologia", dataExemplo, horaExemplo, tipoConsultaExemplo, numeroConsultorioExemplo);

        //Adicionar as agendasaúdes para o reposiitório
        List<AgendaSaude> listadeAgendaSaudes = new ArrayList<>();

        // Adicione os médicos à lista
        listadeAgendaSaudes.add(agendaMedico1);
        listadeAgendaSaudes.add(agendaMedico2);
        listadeAgendaSaudes.add(agendaMedico3);
        listadeAgendaSaudes.add(agendaMedico4);
        listadeAgendaSaudes.add(agendaMedico5);
        listadeAgendaSaudes.add(agendaMedico6);
        listadeAgendaSaudes.add(agendaMedico7);
        listadeAgendaSaudes.add(agendaMedico8);
        listadeAgendaSaudes.add(agendaMedico9);
        listadeAgendaSaudes.add(agendaMedico10);
        listadeAgendaSaudes.add(agendaMedico11);
        listadeAgendaSaudes.add(agendaMedico12);
        
        // Adicionando a agenda de saúde para cada médico
        for (Medico medico : listaDeMedicos) {
        AgendaSaude agendaMedico = new AgendaSaude(numeroConsultorioExemplo, tipoConsultaExemplo, tipoConsultaExemplo, dataExemplo, horaExemplo, tipoConsultaExemplo, numeroConsultorioExemplo);
        listadeAgendaSaudes.add(agendaMedico);
        }
        
        // Criar uma lista para armazenar enfermeiros
        List<Enfermeiro> enfermeiroo = new ArrayList<>();

        // Criar uma lista para armazenar pacientes
        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente());
        pacientes.add(new Paciente());
        pacientes.add(new Paciente());
        pacientes.add(new Paciente());
        pacientes.add(new Paciente());
        pacientes.add(new Paciente());

        // Exemplo de enfermeiros
        enfermeiroo.add(new Enfermeiro("Cardiologia", 2311));
        enfermeiroo.add(new Enfermeiro("Pediatria", 4536));
        enfermeiroo.add(new Enfermeiro("Ortopedia", 0475));
        enfermeiroo.add(new Enfermeiro("Ginecologia", 8162));
        enfermeiroo.add(new Enfermeiro("Cirurgia", 5948));
        enfermeiroo.add(new Enfermeiro("Oncologia", 7362));

        // Iterar sobre a lista de enfermeiros e associar um enfermeiro a cada paciente
        for (int i = 0; i < enfermeiros.size(); i++) {
            Enfermeiro enfermeiro = enfermeiros.get(i);
            Paciente paciente = pacientes.get(i);

            enfermeiro.exibirInformacoes();
            enfermeiro.realizarProcedimento(paciente.nome, "Procedimento específico para " + enfermeiro.getEspecialidade());
            System.out.println();
        }
    }
}
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
