package Consulta.Negocios;

import Consulta.Dados.RepositorioConsultaInfo;
import Consulta.Negocios.Beans.ConsultaInfo;

import java.util.List;

public class ControladorConsultaInfo {
    private RepositorioConsultaInfo repositorioConsultaInfo;
    private static ControladorConsultaInfo instance;

    private ControladorConsultaInfo() {
        this.repositorioConsultaInfo = new RepositorioConsultaInfo();
    }

    public static ControladorConsultaInfo getInstance() {
        if (instance == null) {
            instance = new ControladorConsultaInfo();
        }
        return instance;
    }

    public void agendarConsulta(int codigoConsulta, String data, String hora, int numeroConsultorio, String tipoConsulta) {
        ConsultaInfo consulta = new ConsultaInfo(codigoConsulta, data, hora, numeroConsultorio, tipoConsulta);
        repositorioConsultaInfo.agendarConsulta(consulta);
    }

    public void cancelarConsulta(int codigoConsulta) {
        ConsultaInfo consulta = repositorioConsultaInfo.buscarConsulta(codigoConsulta);
        if (consulta != null) {
            repositorioConsultaInfo.cancelarConsulta(consulta);
        } else {
            System.out.println("Consulta não encontrada.");
        }
    }

    public List<ConsultaInfo> listarConsultas() {
        return repositorioConsultaInfo.listarConsultas();
    }

    public ConsultaInfo buscarConsulta(int codigoConsulta) {
        return repositorioConsultaInfo.buscarConsulta(codigoConsulta);
    }

}
