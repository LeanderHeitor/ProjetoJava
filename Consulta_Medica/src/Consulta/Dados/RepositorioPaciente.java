package Consulta.Dados;
import Consulta.Negocios.Beans.Paciente;
import java.util.ArrayList;
import java.util.List;

public class RepositorioPaciente {
    private List<Paciente> pacientes;

    public RepositorioPaciente() {
        pacientes = new ArrayList<>();
    }

    public void addPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void removerPaciente(int codigoCarteirinha) {
        // Utilize um iterator para evitar ConcurrentModificationException
        for (java.util.Iterator<Paciente> iterator = pacientes.iterator(); iterator.hasNext();) {
            Paciente paciente = iterator.next();
            if (paciente.getCodigoCarteirinha() == codigoCarteirinha) {
                iterator.remove();
                break;
            }
        }
    }

    public Paciente buscarPaciente(int codigoCarteirinha) {
        for (Paciente paciente : pacientes) {
            if (paciente.getCodigoCarteirinha() == codigoCarteirinha) {
                return paciente;
            }
        }
        return null;
    }

    public List<Paciente> listarPacientes() {
        return new ArrayList<>(pacientes); // Retorna uma cópia da lista para evitar alterações externas
    }
}
