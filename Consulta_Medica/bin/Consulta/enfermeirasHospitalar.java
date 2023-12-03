package app;

public class enfermeirasHospitalar {
    private int Cod;
    private String especialidade;
    private String procedimento;

    public enfermeirasHospitalar(){ }

    //Atributos
    public enfermeirasHospitalar(int Cod, String especialidade, String procedimento) {
        this.Cod = Cod;
        this.especialidade = especialidade;
        this.procedimento = procedimento;

    }

    public int getCod() {
        return Cod;
    }

    public void setCod(int cod) {
        Cod = cod;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }
}
