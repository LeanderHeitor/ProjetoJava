package Consulta.Negocios.Beans;

public class Recepcionista {
	   // Atributos
	   private int codigoFuncionario; 
	   private String turno; 
	   private String contato;

	   // Construtor
	   public Recepcionista(int codigoFuncionario, String turno, String contato) { 
	       this.codigoFuncionario = codigoFuncionario; 
	       this.turno = turno; 
	       this.contato = contato; 
	   }

	   // Getters e setters
	   public int getCodigoFuncionario() { 
	       return codigoFuncionario; 
	   }

	   public void setCodigoFuncionario(int codigoFuncionario) { 
	       this.codigoFuncionario = codigoFuncionario; 
	   }

	   public String getTurno() { 
	       return turno; 
	   }

	   public void setTurno(String turno) { 
	       this.turno = turno; 
	   }

	   public String getContato() { 
	       return contato; 
	   }

	   public void setContato(String contato) { 
	       this.contato = contato; 
	   }
	}