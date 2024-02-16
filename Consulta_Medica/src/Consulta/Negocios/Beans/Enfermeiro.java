public class Enfermeiro {
    public String especialidade;
    public int codigo;

    public Enfermeiro(String especialidade, int codigo) {
        this.especialidade = especialidade;
        this.codigo = codigo;
    }

    public void realizarProcedimento(String nomePaciente, String procedimento) {
        if (nomePaciente.equals("Ana")) {
            System.out.println("Enfermeiro está realizando o seguinte procedimento: " + procedimento + " para a paciente " + nomePaciente);
        } else {
            System.out.println("Enfermeiro está realizando o seguinte procedimento: " + procedimento + " para o paciente " + nomePaciente);
        }
    }

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
        System.out.println("Especialidade: " + getEspecialidade() + "\nCódigo: " + getCodigo());
    }
}
