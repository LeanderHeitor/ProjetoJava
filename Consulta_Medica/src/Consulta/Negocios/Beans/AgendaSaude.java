package Consulta.Negocios.Beans;

import java.time.LocalDate;
import java.time.LocalTime;

public class AgendaSaude {
	   // Atributos
	   private Medico medico;
	   private LocalDate data;
	   private LocalTime hora;
	   private String tipoConsulta;
	   private int numeroConsultorio;
	   

	   // Construtor
	   public AgendaSaude(Medico medico, LocalDate data,
	   LocalTime hora, String tipoConsulta, int numeroConsultorio) {
			this.medico = medico;
	    	this.data = data;
	    	this.hora = hora;
	    	this.tipoConsulta = tipoConsulta;
			this.numeroConsultorio = numeroConsultorio;
	   }

	   // Getters e setters
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
	}
