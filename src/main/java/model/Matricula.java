package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the matriculas database table.
 * 
 */
@Entity
@Table(name="matriculas")
@NamedQuery(name="Matricula.findAll", query="SELECT m FROM Matricula m")
public class Matricula implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_matricula")
	private int idMatricula;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_matricula")
	private Date fechaMatricula;

	@Column(name="id_estudiante")
	private int idEstudiante;

	//bi-directional many-to-one association to Curso
	@ManyToOne
	@JoinColumn(name="id_curso")
	private Curso curso;

	public Matricula() {
	}

	public int getIdMatricula() {
		return this.idMatricula;
	}

	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}

	public Date getFechaMatricula() {
		return this.fechaMatricula;
	}

	public void setFechaMatricula(Date fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public int getIdEstudiante() {
		return this.idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public Curso getCurso() {
		return this.curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}