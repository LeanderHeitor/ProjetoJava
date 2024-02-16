import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EnfermeiroRepository {

    private List<Enfermeiro> enfermeiros;
    private List<Enfermeiro> enfermeirosRemovidos;
    private String codigo;

    public EnfermeiroRepository() {
        this.enfermeiros = new ArrayList<>();
        this.enfermeirosRemovidos = new ArrayList<>();
    }

    public void adicionarEnfermeiroo(Enfermeiro enfermeiro) {
        enfermeiros.add(enfermeiro);
    }

    public Enfermeiro removerEnfermeiro(int codigoEnfermeiro) {
        Iterator<Enfermeiro> iterator = enfermeiros.iterator();
        while (iterator.hasNext()) {
            Enfermeiro enfermeiro = iterator.next();
            if (enfermeiro.getCodigo() == codigoEnfermeiro) {
                iterator.remove();
                enfermeirosRemovidos.add(enfermeiro);
                return enfermeiro;
            }
        }
        return null;
    }

    public List<String> listarEnfermeirosRemovidos() {
        List<String> informarEnfermeirosRemovidos = new ArrayList<>();
        for (Enfermeiro enfermeiro : enfermeirosRemovidos) {
            informarEnfermeirosRemovidos.add("\nEspecialidade: " + enfermeiro.getEspecialidade() + "\nCódigo: " + enfermeiro.getCodigo());
        }
        return informarEnfermeirosRemovidos;
    }

    public List<Enfermeiro> listarEnfermeiros() {
        return new ArrayList<>(enfermeiros);
    }

    public static void main(String[] args) {
        EnfermeiroRepository repository = new EnfermeiroRepository();

        // Exemplo de enfermeiros
        repository.adicionarEnfermeiroo(new Enfermeiro("Cardiologia", 2311));
        repository.adicionarEnfermeiroo(new Enfermeiro("Pediatria", 4536));
        repository.adicionarEnfermeiroo(new Enfermeiro("Ortopedia", 9075));
        repository.adicionarEnfermeiroo(new Enfermeiro("Ginecologia", 8162));
        repository.adicionarEnfermeiroo(new Enfermeiro("Cirurgia", 5948));
        repository.adicionarEnfermeiroo(new Enfermeiro("Oncologia", 7362));

        // Listar os enfermeiros cadastrados
        List<Enfermeiro> enfermeirosCadastrados = repository.listarEnfermeiros();
        System.out.println("\nLista de Todos Enfermeiros Cadastrados");
        for (Enfermeiro enfermeiro : enfermeirosCadastrados) {
            enfermeiro.exibirInformacoes();
        }

        // Remover um enfermeiro (substitua o código pelo desejado)
        repository.removerEnfermeiro(2311);
        repository.removerEnfermeiro(9075);

        System.out.println("\nLista dos Enfermeiros Removidos");
        for (String informarEnfermeiroRemovido : repository.listarEnfermeirosRemovidos()) {
            System.out.println(informarEnfermeiroRemovido);
        }

        // Listar os enfermeiros após a remoção
        System.out.println("\nLista dos Enfermeiros Atuais");
        for (Enfermeiro enfermeiroo : repository.listarEnfermeiros()) {
            enfermeiroo.exibirInformacoes();
        }
    }
}
