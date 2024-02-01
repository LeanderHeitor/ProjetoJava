
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

	   // Método para confirmar uma consulta por meio do Status do médico.

	   public boolean confirmarstatusConsulta(Medico medico, AgendaSaude agenda) {
        String status = medico.getStatus();
        if (status.equals("Presente")) {  
            System.out.println("Consulta confirmada para " + agenda.getData() + " às " + agenda.getHora());
            return true;
        } else if (status.equals("Em Deslocamento")) {
            System.out.println("O médico está em deslocamento. Aguarde sua chegada.");
        } else if (status.equals("O médico faltou.")) {  
            System.out.println("O médico não vem. Consulta cancelada.");
        } else {
            System.out.println("Opção de presença do médico inválida. Consulta cancelada.");
        }
        return false;
    }

	// Método para avaliar a gravidade de um atendimento.

	public void avaliarGravidade(AgendaSaude agendaSaude, Enfermeiro enfermeiro) {
        String gravidade = agendaSaude.getGravidade();

        if ("grave".equalsIgnoreCase(gravidade)) {
            // Caso seja grave, chama o enfermeiro
            int codigoEnfermeiro = enfermeiro.getCodigoEnfermeiro();
            System.out.println("Chamando enfermeiro com código: " + codigoEnfermeiro);
        } else {
            // Caso contrário, paciente espera normalmente
            System.out.println("Paciente aguardando normalmente");
        }
    }
	

	
	
	   // Gets e sets
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
