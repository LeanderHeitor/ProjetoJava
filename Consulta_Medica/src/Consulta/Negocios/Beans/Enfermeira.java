package Consulta.Negocios.Beans;

public class Enfermeira {
    // Atributos
    private String especialidade;
    private int codigo;

    public Enfermeira(String especialidade, int codigo) {
        this.especialidade = especialidade;
        this.codigo = codigo;
    }

    public void realizarProcedimento(String nomePaciente, String procedimento) {
        System.out.println("Enfermeira está realizando o seqguinte procedimento: " + procedimento +
                " para o paciente " + nomePaciente);
    }

    // Métodos de acesso (getters e setters)
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // Método para exibir informações da enfermeira
    public void exibirInformacoes() {
        System.out.println("     *Enfermeira* \nEspecialidade: " + especialidade + "\nCódigo: " + codigo);
    }
}
