package Consulta;

public class Paciente {
	private int codigoCarteirinha;
    private String nome;
    private String dataNascimento;
    private String tipoPlano;
    private String validade;

// Atributos

public Paciente(int codigoCarteirinha, String nome, String dataNascimento, String tipoPlano, String validade) {
    this.codigoCarteirinha = codigoCarteirinha;
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.tipoPlano = tipoPlano;
    this.validade = validade;
    //Construtor
}

// Getters e setters
public int getCodigoCarteirinha() {
    return codigoCarteirinha;
}

public void setCodigoCarteirinha(int codigoCarteirinha) {
    this.codigoCarteirinha = codigoCarteirinha;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getDataNascimento() {
    return dataNascimento;
}

public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
}

public String getTipoPlano() {
    return tipoPlano;
}

public void setTipoPlano(String tipoPlano) {
    this.tipoPlano = tipoPlano;
}

public String getValidade() {
    return validade;
}

public void setValidade(String validade) {
    this.validade = validade;
}
} 
