package Consulta;

import java.util.ArrayList;
import java.util.List;

public class RepositorioMedico {
    private List <Medico> medicos;

    public RepositorioMedico() {
        medicos = new ArrayList<>();
    }

    public void addMedico(Medico medico){
        medicos.add(medico);
    }

    public void removerMedico(int codigo){
        for(Medico medico : medicos){
            if(medico.getCodigoDoutor() == codigo){
                medicos.remove(medico);
                break;
            }
        }
    }

    public Medico buscarMedico (int codigo){
        for(Medico medico: medicos){
            if(medico.getCodigoDoutor() == codigo){
                return medico;
            }
        }
        return null;
    }
  
}
