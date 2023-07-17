package rover.model;


import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class APIResponse {


	protected int statusCode;
	protected HttpStatus status;
	protected String clientMessage;
	protected String developerMessage;
	protected Object body;
	
}