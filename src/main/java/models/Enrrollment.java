package models;

import java.time.LocalDateTime;

public class Enrrollment {
    private long idEnrrollment;
    private long idStudent;
    private String status;
    private String enrrollmentDate;


    public Enrrollment(long idEnrrollment, long idStudent, String status, String enrrollmentDate) {
        this.idEnrrollment = idEnrrollment;
        this.idStudent = idStudent;
        this.status = status;
        this.enrrollmentDate = enrrollmentDate;
    }

    public long getIdEnrrollment() {
        return idEnrrollment;
    }

    public void setIdEnrrollment(long idEnrrollment) {
        this.idEnrrollment = idEnrrollment;
    }

    public long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(long idStudent) {
        this.idStudent = idStudent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEnrrollmentDate() {
        return enrrollmentDate;
    }

    public void setEnrrollmentDate(String enrrollmentDate) {
        this.enrrollmentDate = enrrollmentDate;
    }
}

