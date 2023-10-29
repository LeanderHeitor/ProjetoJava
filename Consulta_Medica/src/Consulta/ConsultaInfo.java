package Consulta;

public class ConsultaInfo {
    // Atributos
    private int codigoConsulta;
    private String data;
    private String hora;
    private int numeroConsultorio;

    // Construtor
    public ConsultaInfo(int codigoConsulta, String data, String hora, int numeroConsultorio) {
        this.codigoConsulta = codigoConsulta;
        this.data = data;
        this.hora = hora;
        this.numeroConsultorio = numeroConsultorio;
    }

    // Getters e setters
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
}
