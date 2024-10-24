package com.tuempresa.evaluacion2.modelo;

import java.time.*;

import javax.persistence.*;

import lombok.*;


@Embeddable @Getter @Setter	
public class Avance {

	String describe;
	LocalDate Fecha;
	String Comentario;
}
