package Consulta.Dados;

import Consulta.Negocios.Beans.ConsultaInfo;

import java.util.ArrayList;
import java.util.List;

public class RepositorioConsultaInfo {
    private List<ConsultaInfo> consultas;

    public RepositorioConsultaInfo() {
        consultas = new ArrayList<>();
    }

    public void agendarConsulta(ConsultaInfo consulta) {
        consultas.add(consulta);
    }

    public void cancelarConsulta(ConsultaInfo consulta) {
        consultas.remove(consulta);
    }

    public List<ConsultaInfo> listarConsultas() {
        return new ArrayList<>(consultas);
    }

    public ConsultaInfo buscarConsulta(int codigoConsulta) {
        for (ConsultaInfo consulta : consultas) {
            if (consulta.getCodigoConsulta() == codigoConsulta) {
                return consulta;
            }
        }
        return null;
    }
}
