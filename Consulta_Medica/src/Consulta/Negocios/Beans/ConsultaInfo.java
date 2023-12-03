package Consulta.Negocios.Beans;
import java.util.ArrayList;
import java.util.List;

public class ConsultaInfo {
    private int codigoConsulta;
    private String data;
    private String hora;
    private int numeroConsultorio;
    private String tipoConsulta;

    // Lista para armazenar consultas agendadas
    private static List<ConsultaInfo> consultasAgendadas = new ArrayList<>();

    // Construtor (corrigido)
    public ConsultaInfo(int codigoConsulta, String data, String hora, int numeroConsultorio, String tipoConsulta) {
        this.codigoConsulta = codigoConsulta;
        this.data = data;
        this.hora = hora;
        this.numeroConsultorio = numeroConsultorio;
        this.tipoConsulta = tipoConsulta;
    }

    // Getters e setters (corrigidos)
    public int getCodigoConsulta() {
        return codigoConsulta;
    }

    public void setCodigoConsulta(int codigoConsulta) {
        this.codigoConsulta = codigoConsulta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(int numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    // Método para agendar consulta (corrigido)
    public void agendarConsulta(String data, String hora, int numeroConsultorio, String tipoConsulta) {
        // Cria uma instância de ConsultaInfo e a adiciona à lista de consultas agendadas
        ConsultaInfo consultaAgendada = new ConsultaInfo(1, data, hora, numeroConsultorio, tipoConsulta);
        consultasAgendadas.add(consultaAgendada);
        System.out.println("Consulta agendada com sucesso!");
    }

    // Método para visualizar próximas consultas (corrigido)
    public void visualizarProximasConsultas() {
        // Lógica para visualizar próximas consultas
        // Pode envolver a iteração sobre a lista de consultas agendadas e exibir as informações

        if (!consultasAgendadas.isEmpty()) {
            System.out.println("Próximas consultas agendadas:");
            for (ConsultaInfo consulta : consultasAgendadas) {
                System.out.println("Data: " + consulta.getData() + ", Hora: " + consulta.getHora() +
                        ", Consultório: " + consulta.getNumeroConsultorio() + ", Tipo de Consulta: " + consulta.getTipoConsulta());
            }
        } else {
            System.out.println("Não há consultas agendadas.");
        }
    }

    // Método para cancelar consulta (corrigido)
    public void cancelarConsulta() {
        // Lógica para cancelar consulta
        // Supondo que queremos cancelar a última consulta agendada

        if (!consultasAgendadas.isEmpty()) {
            consultasAgendadas.remove(consultasAgendadas.size() - 1);
            System.out.println("Consulta cancelada com sucesso!");
        } else {
            System.out.println("Não há consultas agendadas para cancelar.");
        }
    }

    // Método para verificar se possui consultas agendadas (corrigido)
    public boolean possuiConsultasAgendadas() {
        return !consultasAgendadas.isEmpty();
    }
}
