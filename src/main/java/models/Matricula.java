package models;

import java.time.LocalDateTime;

public class Matricula {
    private long id;
    private int cursoId;
    private int studentId;
    private LocalDateTime fechaMatricula;
    private String periodoAcademico;

    public Matricula(long id, String number, String s, String string, String periodoAcademico) {
        this.id = id;
        this.cursoId = cursoId;
        this.studentId = studentId;
        this.fechaMatricula = fechaMatricula;
        this.periodoAcademico = periodoAcademico;

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public LocalDateTime getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(LocalDateTime fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public String getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(String periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }
}
