package Consulta;
import java.time.LocalDate;

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
	
	// Métodos de marcação, desmarcação e visualização de consultas
    
    public void marcarConsulta(Paciente paciente, LocalDate dataConsulta) {
        // Marcação de consulta
        
        System.out.println("Consulta marcada para " + paciente.getNome() + " em " + dataConsulta);
    }

    public void desmarcarConsulta(Paciente paciente, LocalDate dataConsulta) {
        // Desmarcação da consulta
        
        System.out.println("Consulta desmarcada para " + paciente.getNome() + " em " + dataConsulta);
    }

    public void verConsultas() {
        // Visualizar consultas marcadas
        
        System.out.println("Consultas agendadas:");
       
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
