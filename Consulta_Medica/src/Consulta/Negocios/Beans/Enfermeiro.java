package Consulta.Negocios.Beans;

public class Enfermeiro {
	  // Atributos
	  private int codigoEnfermeiro; 
	  private String especialidade; 
	  private String procedimento;

	  // Construtor
	  public Enfermeiro(int codigoEnfermeiro, String especialidade, String procedimento) { 
	      this.codigoEnfermeiro = codigoEnfermeiro; 
	      this.especialidade = especialidade; 
	      this.procedimento = procedimento; 
	  }

	  // Getters e setters
	  public int getCodigoEnfermeiro() { 
	      return codigoEnfermeiro; 
	  }

	  public void setCodigoEnfermeiro(int codigoEnfermeiro) { 
	      this.codigoEnfermeiro = codigoEnfermeiro; 
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
