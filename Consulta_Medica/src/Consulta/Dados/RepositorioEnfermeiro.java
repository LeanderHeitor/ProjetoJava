import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EnfermeiroRepository {

    private List<Enfermeiro> enfermeiros;

    public EnfermeiroRepository() {
        this.enfermeiros = new ArrayList<>();
    }

    public void adicionarEnfermeiro(Enfermeiro enfermeiro) {
        enfermeiro.setCodigo(enfermeiros.size() + 1);
        enfermeiros.add(enfermeiro);
    }

    public void removerEnfermeiro(int codigoEnfermeiro) {
        Iterator<Enfermeiro> iterator = enfermeiros.iterator();
        while (iterator.hasNext()) {
            Enfermeiro enfermeiro = iterator.next();
            if (enfermeiro.getCodigo() == codigoEnfermeiro) {
                iterator.remove();
                break;
            }
        }
    }

    public List<Enfermeiro> listarEnfermeiros() {
        return new ArrayList<>(enfermeiros);
    }

    public static void main(String[] args) {
        EnfermeiroRepository repository = new EnfermeiroRepository();

        // Exemplo de enfermeiros
        repository.adicionarEnfermeiro(new Enfermeiro("Cardiologia", 0));
        repository.adicionarEnfermeiro(new Enfermeiro("Pediatria", 0));
        repository.adicionarEnfermeiro(new Enfermeiro("Ortopedia", 0));
        repository.adicionarEnfermeiro(new Enfermeiro("Ginecologia", 0));
        repository.adicionarEnfermeiro(new Enfermeiro("Cirurgia", 0));
        repository.adicionarEnfermeiro(new Enfermeiro("Oncologia", 0));

        System.out.println("Enfermeiros cadastrados:");
        repository.listarEnfermeiros().forEach(Enfermeiro::exibirInformacoes);

        // Remover um enfermeiro (substitua o código pelo desejado)
        repository.removerEnfermeiro(1);

        System.out.println("\nEnfermeiros após remoção:");
        repository.listarEnfermeiros().forEach(Enfermeiro::exibirInformacoes);
    }
}
