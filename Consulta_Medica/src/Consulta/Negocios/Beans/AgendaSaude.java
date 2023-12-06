package Consulta.Negocios.Beans;

import java.time.LocalDate;
import java.time.LocalTime;

public class AgendaSaude extends Medico {
    //Atributos
	private LocalDate data;
    private LocalTime hora;
    private String tipoConsulta;
    private int numeroConsultorio;

	//Construtor
    public AgendaSaude(int id, String nome, String especialidade, LocalDate data, LocalTime hora, String tipoConsulta, int numeroConsultorio) {
        super(id, nome, especialidade);
        this.data = data;
        this.hora = hora;
        this.tipoConsulta = tipoConsulta;
        this.numeroConsultorio = numeroConsultorio;
    }

	   // Getters e setters
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
