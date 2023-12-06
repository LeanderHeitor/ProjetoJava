package Consulta.Dados;

import Consulta.Negocios.Beans.AgendaSaude;
import java.util.ArrayList;
import java.util.List;

public class RepositorioAgendaSaude {
    private List<AgendaSaude> agendaSaudeList;

    public RepositorioAgendaSaude() {
        this.agendaSaudeList = new ArrayList<>();
    }

    public void adicionarAgenda(AgendaSaude agenda) {
        this.agendaSaudeList.add(agenda);
    }

    public void removerAgenda(AgendaSaude agenda) {
        this.agendaSaudeList.remove(agenda);
    }

    public List<AgendaSaude> listarAgendas() {
        return this.agendaSaudeList;
    }
}
