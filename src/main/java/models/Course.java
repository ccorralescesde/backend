package models;

import java.time.LocalDate;

public class Course {
    private long idCourse;
    private String codeCurse;
    private String nameCurse;
    private String desCurse;
    private int maxCapacity;
    private String createDate;

    public Course(long idCourse, String bd01PROM, String basesDeDatos, String desCurse, int maxCapacity) {
    }


    public Course(long idCourse, String codeCurse, String nameCurse, String desCurse, int maxCapacity, String createDate) {
        this.idCourse = idCourse;
        this.codeCurse = codeCurse;
        this.nameCurse = nameCurse;
        this.desCurse = desCurse;
        this.maxCapacity = maxCapacity;
        this.createDate = createDate;
    }


    public long getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(long idCourse) {
        this.idCourse = idCourse;
    }

    public String getCodeCurse() {
        return codeCurse;
    }

    public void setCodeCurse(String codeCurse) {
        this.codeCurse = codeCurse;
    }

    public String getNameCurse() {
        return nameCurse;
    }

    public void setNameCurse(String nameCurse) {
        this.nameCurse = nameCurse;
    }

    public String getDesCurse() {
        return desCurse;
    }

    public void setDesCurse(String desCurse) {
        this.desCurse = desCurse;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
