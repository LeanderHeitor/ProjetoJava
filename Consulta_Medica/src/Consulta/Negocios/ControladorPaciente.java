package Consulta.Negocios;

import Consulta.Dados.RepositorioConsultaInfo;
import Consulta.Dados.RepositorioPaciente;
import Consulta.Negocios.Beans.ConsultaInfo;
import Consulta.Negocios.Beans.Paciente;

import java.util.List;

public class ControladorPaciente {
    private RepositorioPaciente repositorioPaciente;
    private RepositorioConsultaInfo repositorioConsultaInfo;
    private static ControladorPaciente instance;

    private ControladorPaciente() {
        this.repositorioPaciente = new RepositorioPaciente();
        this.repositorioConsultaInfo = new RepositorioConsultaInfo();
    }

    public static ControladorPaciente getInstance() {
        if (instance == null) {
            instance = new ControladorPaciente();
        }
        return instance;
    }

    private Paciente buscarPacientePorCodigo(int codigoCarteirinha) {
        Paciente paciente = repositorioPaciente.buscarPaciente(codigoCarteirinha);
        if (paciente == null) {
            System.out.println("Paciente não encontrado.");
        }
        return paciente;
    }

    public void cadastrarPaciente(Paciente paciente) {
        repositorioPaciente.addPaciente(paciente);
    }

    public void agendarConsulta(int codigoCarteirinha, String data, String hora, int numeroConsultorio, String tipoConsulta) {
        Paciente paciente = buscarPacientePorCodigo(codigoCarteirinha);
        if (paciente != null) {
            paciente.agendarConsulta(data, hora, numeroConsultorio, tipoConsulta);
            
            // Adiciona a consulta ao RepositorioConsultaInfo
            ConsultaInfo consulta = new ConsultaInfo(1, data, hora, numeroConsultorio, tipoConsulta);
            repositorioConsultaInfo.agendarConsulta(consulta);
        }
    }

    public List<Paciente> listarPacientes() {
        return repositorioPaciente.listarPacientes();
    }

    public Paciente buscarPaciente(int codigoCarteirinha) {
        return buscarPacientePorCodigo(codigoCarteirinha);
    }

    public void removerPaciente(int codigoCarteirinha) {
        repositorioPaciente.removerPaciente(codigoCarteirinha);
    }

    public ConsultaInfo obterUltimaConsultaAgendada(int codigoCarteirinha) {
        Paciente paciente = buscarPacientePorCodigo(codigoCarteirinha);
        return paciente != null ? paciente.obterUltimaConsultaAgendada() : null;
    }

    public void cancelarUltimaConsultaAgendada(int codigoCarteirinha) {
        Paciente paciente = buscarPacientePorCodigo(codigoCarteirinha);
        if (paciente != null) {
            paciente.cancelarConsulta();
            
            // Cancela a última consulta no RepositorioConsultaInfo
            ConsultaInfo ultimaConsulta = paciente.obterUltimaConsultaAgendada();
            if (ultimaConsulta != null) {
                repositorioConsultaInfo.cancelarConsulta(ultimaConsulta);
            }
        }
    }

    public boolean verificarValidadePlano(int codigoCarteirinha) {
        Paciente paciente = buscarPacientePorCodigo(codigoCarteirinha);
        return paciente != null && paciente.verificarValidadePlano();
    }

    public void exibirInformacoesPaciente(int codigoCarteirinha) {
        Paciente paciente = buscarPacientePorCodigo(codigoCarteirinha);
        if (paciente != null) {
            paciente.exibirInformacoes();
        }
    }


}
