package Consulta.Negocios;
import Consulta.Negocios.Beans.AgendaSaude;
import java.util.List;

public class ControladorAgendaSaúde {
    private List<AgendaSaude> agendaSaudeList;

    public ControladorAgendaSaúde(List<AgendaSaude> agendaSaudeList) {
        this.agendaSaudeList = agendaSaudeList;
    }

    public void adicionarConsulta(AgendaSaude novaConsulta) {
        this.agendaSaudeList.add(novaConsulta);
    }

    public void removerConsulta(AgendaSaude consultaRemovida) {
        this.agendaSaudeList.remove(consultaRemovida);
    }

    public List<AgendaSaude> listarConsultas() {
        return this.agendaSaudeList;
    }

    // Outros métodos relacionados à lógica de negócios da agenda de saúde
}
