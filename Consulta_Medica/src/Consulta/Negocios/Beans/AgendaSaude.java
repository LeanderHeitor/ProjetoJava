package Consulta.Negocios.Beans;

public class AgendaSaude {
	   // Atributos
	   private int codigoDoutor;
	   private String data;
	   private String hora;
	   private String tipoConsulta;

	   // Construtor
	   public AgendaSaude(int codigoDoutor, String data, String hora, String tipoConsulta) {
	       this.codigoDoutor = codigoDoutor;
	       this.data = data;
	       this.hora = hora;
	       this.tipoConsulta = tipoConsulta;
	   }

	   // Getters e setters
	   public int getCodigoDoutor() {
	       return codigoDoutor;
	   }

	   public void setCodigoDoutor(int codigoDoutor) {
	       this.codigoDoutor = codigoDoutor;
	   }

	   public String getData() {
	       return data;
	   }

	   public void setData(String data) {
	       this.data = data;
	   }

	   public String getHora() {
	       return hora;
	   }

	   public void setHora(String hora) {
	       this.hora = hora;
	   }

	   public String getTipoConsulta() {
	       return tipoConsulta;
	   }

	   public void setTipoConsulta(String tipoConsulta) {
	       this.tipoConsulta = tipoConsulta;
	   }
	}
