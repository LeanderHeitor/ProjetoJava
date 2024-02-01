ackage Consulta.Negocios.Beans;

import java.time.LocalDate;
import java.time.LocalTime;

public class AgendaSaude {
	   // Atributos
	   private Medico medico;
	   private LocalDate data;
	   private LocalTime hora;
	   private String tipoConsulta;
	   private int numeroConsultorio;
	   private String gravidade;
	   

	   // Construtor
	   public AgendaSaude(Medico medico, LocalDate data,
	   LocalTime hora, String tipoConsulta, int numeroConsultorio, String gravidade) {
			this.medico = medico;
	    	this.data = data;
	    	this.hora = hora;
	    	this.tipoConsulta = tipoConsulta;
			this.numeroConsultorio = numeroConsultorio;
			this.gravidade = gravidade;
	   }

	   // Gets e sets
	   public Medico getMedico(){
			return medico;
	   }

	   public LocalDate getData() {
	       return data;
	   }

	   public void setData(LocalDate data) {
	       this.data = data;
	   }

	   public LocalTime getHora() {
	       return hora;
	   }

	   public void setHora(LocalTime hora) {
	       this.hora = hora;
	   }

	   public String getTipoConsulta() {
	       return tipoConsulta;
	   }

	   public void setMedico(Medico medico){
			this.medico = medico;
	   }

	   public void setTipoConsulta(String tipoConsulta) {
	       this.tipoConsulta = tipoConsulta;
	   }

	   public int getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(int numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

	public String getGravidade() {
		return gravidade;
	
	}

	public void setGravidade(String gravidade) {
		this.gravidade = gravidade;
	}
	}
