import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Criar uma lista para armazenar enfermeiros
        List<Enfermeiro> enfermeiroo = new ArrayList<>();

        // Criar uma lista para armazenar pacientes
        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente());
        pacientes.add(new Paciente());
        pacientes.add(new Paciente());
        pacientes.add(new Paciente());
        pacientes.add(new Paciente());
        pacientes.add(new Paciente());

        // Exemplo de enfermeiros
        enfermeiroo.add(new Enfermeiro("Cardiologia", 2311));
        enfermeiroo.add(new Enfermeiro("Pediatria", 4536));
        enfermeiroo.add(new Enfermeiro("Ortopedia", 0475));
        enfermeiroo.add(new Enfermeiro("Ginecologia", 8162));
        enfermeiroo.add(new Enfermeiro("Cirurgia", 5948));
        enfermeiroo.add(new Enfermeiro("Oncologia", 7362));

        // Iterar sobre a lista de enfermeiros e associar um enfermeiro a cada paciente
        for (int i = 0; i < enfermeiros.size(); i++) {
            Enfermeiro enfermeiro = enfermeiros.get(i);
            Paciente paciente = pacientes.get(i);

            enfermeiro.exibirInformacoes();
            enfermeiro.realizarProcedimento(paciente.nome, "Procedimento específico para " + enfermeiro.getEspecialidade());
            System.out.println(); // Adiciona uma linha em branco entre as informações de enfermeiros
        }
    }
}

