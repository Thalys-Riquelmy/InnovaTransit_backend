package innovaBackend.InnovaTransit.integracao.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true) 
public class TarefaResponse {
	
	private String evento;
	
	private String horarioInicial;
	
	private String horarioFinal;
}