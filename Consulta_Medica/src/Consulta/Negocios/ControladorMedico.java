/*
package Consulta.Negocios;

import Consulta.Dados.RepositorioMedico;
import Consulta.Negocios.Beans.Medico;
import java.util.List;

public class ControladorMedico {
    private RepositorioMedico repositorioMedico;
    private static ControladorMedico instance;

    private ControladorMedico() {
        this.repositorioMedico = new RepositorioMedico();
    }

    public static ControladorMedico getInstance() {
        if (instance == null) {
            instance = new ControladorMedico();
        }
        return instance;
    }

    public void cadastrarMedico(Medico medico) {
        repositorioMedico.addMedico(medico);
    }

    public void removerMedico(int codigoDoutor) {
        repositorioMedico.removerMedico(codigoDoutor);
    }

    public Medico buscarMedico(int codigoDoutor) {
        return repositorioMedico.buscarMedico(codigoDoutor);
    }

    
}
*/