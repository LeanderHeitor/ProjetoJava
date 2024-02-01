package Consulta.Negocios.Beans;

public class Medico {
    // Atributos
    private int codigoDoutor;
    private String nome;
    private String especialidade;
    private String status;
    

    // Construtor
    public Medico(int codigoDoutor, String nome, String especialidade, String status) {
        this.codigoDoutor = codigoDoutor;
        this.nome = nome;
        this.especialidade = especialidade;
        this.status = status;
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

    public String getStatus() {
         return status;
    }

    public void setStatus() {
        this.status = status;
    }

    
}
    
}
