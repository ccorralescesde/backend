package models;

public class Course {
    private long id;
    private String nombreCurso;
    private String desCurso;

    public Course(){

    }

    public Course(long id, String nombreCurso, String desCurso) {
        this.id = id;
        this.nombreCurso = nombreCurso;
        this.desCurso = desCurso;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getDesCurso() {
        return desCurso;
    }

    public void setDesCurso(String desCurso) {
        this.desCurso = desCurso;
    }
}
