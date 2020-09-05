package Model1.javaaproach.be.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Grade {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Person person;


    private BigDecimal gradeValue;

    @OneToOne
    private Exam exam;

    private String comment;

    private String internalComment;

    private Boolean isAbsent;

    private Boolean isPostponed;

    private LocalDate date;

    public Long getId() {
        return id;
    }

    public Grade setId(Long id) {
        this.id = id;
        return this;
    }

    public Person getPerson() {
        return person;
    }

    public Grade setPerson(Person person) {
        this.person = person;
        return this;
    }

    public BigDecimal getGradeValue() {
        return gradeValue;
    }

    public Grade setGradeValue(BigDecimal gradeValue) {
        this.gradeValue = gradeValue;
        return this;
    }

    public Exam getExam() {
        return exam;
    }

    public Grade setExam(Exam exam) {
        this.exam = exam;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public Grade setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getInternalComment() {
        return internalComment;
    }

    public Grade setInternalComment(String internalComment) {
        this.internalComment = internalComment;
        return this;
    }

    public Boolean getAbsent() {
        return isAbsent;
    }

    public Grade setAbsent(Boolean absent) {
        isAbsent = absent;
        return this;
    }

    public Boolean getPostponed() {
        return isPostponed;
    }

    public Grade setPostponed(Boolean postponed) {
        isPostponed = postponed;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public Grade setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", person=" + person +
                ", gradeValue=" + gradeValue +
                ", exam=" + exam +
                ", comment='" + comment + '\'' +
                ", internalComment='" + internalComment + '\'' +
                ", isAbsent=" + isAbsent +
                ", isPostponed=" + isPostponed +
                ", date=" + date +
                '}';
    }
}

