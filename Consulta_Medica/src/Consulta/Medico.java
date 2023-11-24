package Consulta;

public class Medico {
    // Atributos
    private int codigoDoutor;
    private String nome;
    private String especialidade;
    

    // Construtor
    public Medico(int codigoDoutor, String nome, String especialidade) {
        this.codigoDoutor = codigoDoutor;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    // Getters e setters
    public int getCodigoDoutor() {
        return codigoDoutor;
    }

    public void setCodigoDoutor(int codigoDoutor) {
        this.codigoDoutor = codigoDoutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    
}
