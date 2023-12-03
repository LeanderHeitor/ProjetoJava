
package Consulta.Negocios.Beans;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Paciente {
    private int codigoCarteirinha;
    private String nome;
    private String dataNascimento;
    private String tipoPlano;
    private String validade;

    // Lista para armazenar consultas agendadas
    private List<ConsultaInfo> consultasAgendadas;

    // Construtor
    public Paciente(int codigoCarteirinha, String nome, String dataNascimento, String tipoPlano, String validade) {
        this.codigoCarteirinha = codigoCarteirinha;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.tipoPlano = tipoPlano;
        this.validade = validade;
        this.consultasAgendadas = new ArrayList<>();
    }
    

    // Getters e setters (consertados)
    public int getCodigoCarteirinha() {
        return codigoCarteirinha;
    }

    public void setCodigoCarteirinha(int codigoCarteirinha) {
        this.codigoCarteirinha = codigoCarteirinha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    // Método para agendar consulta
    public void agendarConsulta(String data, String hora, int numeroConsultorio, String tipoConsulta) {
        // Cria uma instância de ConsultaInfo e a adiciona à lista de consultas agendadas
        ConsultaInfo consultaAgendada = new ConsultaInfo(1, data, hora, numeroConsultorio, tipoConsulta);
        consultasAgendadas.add(consultaAgendada);
        System.out.println("Consulta agendada com sucesso!");
    }

    // Método para cancelar consulta
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

    // Método para verificar validade do plano
    public boolean verificarValidadePlano() {
        // Lógica para verificar a validade do plano
        // Pode envolver comparação da data atual com a data de validade

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dataValidade = sdf.parse(validade);
            Date dataAtual = new Date(); // Data atual

            // Se a data atual for posterior à data de validade, o plano não é válido
            boolean planoValido = !dataAtual.after(dataValidade);

            if (planoValido) {
                System.out.println("O plano está válido.");
            } else {
                System.out.println("O plano está vencido. Por favor, renove seu plano.");
            }

            return planoValido;
        } catch (ParseException e) {
            System.out.println("Erro ao comparar datas. Verifique o formato das datas.");
            return false;
        }
    }

    // Método para exibir informações do paciente
    public void exibirInformacoes() {
        System.out.println("Informações do Paciente:");
        System.out.println("Código Carteirinha: " + codigoCarteirinha);
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Tipo de Plano: " + tipoPlano);
        System.out.println("Validade do Plano: " + validade);
    }

    // Método para verificar se possui consultas agendadas
    public boolean possuiConsultasAgendadas() {
        return !consultasAgendadas.isEmpty();
    }
    // Adicione este método na classe Paciente
public ConsultaInfo obterUltimaConsultaAgendada() {
    if (!consultasAgendadas.isEmpty()) {
        return consultasAgendadas.get(consultasAgendadas.size() - 1);
    } else {
        return null; // Retorna null se não houver consultas agendadas
    }
}

    
}
