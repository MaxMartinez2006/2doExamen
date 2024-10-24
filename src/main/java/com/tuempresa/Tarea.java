package com.tuempresa;


	import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

	@Entity
	public class Tarea {

	    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nombre;

	    @Stereotype("MEMO")
	    private String descripcion;

	    private String estado;

	    @Column(name = "fecha_limite")
	    private Date fechaLimite;

	    // Relación con Proyecto: Muchas tareas pueden estar asociadas a un proyecto
	    @ManyToOne
	    @ReferenceView("Simple")  // Vista simplificada para el proyecto
	    private Proyecto proyecto;

	    // Relación con Empleado: Muchas tareas pueden estar asignadas a un empleado
	    @ManyToOne
	    @ReferenceView("EmpleadoSimple")  // Vista simplificada para el empleado
	    private Empleado empleado;

	    // Relación con Avance: Una tarea puede tener múltiples avances
	    @OneToMany(mappedBy = "tarea", cascade = CascadeType.ALL)
	    private List<Avance> avances;

	    // Getters y Setters

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }

	    public void setDescripcion(String descripcion) {
	        this.descripcion = descripcion;
	    }

	    public String getEstado() {
	        return estado;
	    }

	    public void setEstado(String estado) {
	        this.estado = estado;
	    }

	    public Date getFechaLimite() {
	        return fechaLimite;
	    }

	    public void setFechaLimite(Date fechaLimite) {
	        this.fechaLimite = fechaLimite;
	    }

	    public Proyecto getProyecto() {
	        return proyecto;
	    }

	    public void setProyecto(Proyecto proyecto) {
	        this.proyecto = proyecto;
	    }

	    public Empleado getEmpleado() {
	        return empleado;
	    }

	    public void setEmpleado(Empleado empleado) {
	        this.empleado = empleado;
	    }

	    public List<Avance> getAvances() {
	        return avances;
	    }

	    public void setAvances(List<Avance> avances) {
	        this.avances = avances;
	    }
	}


