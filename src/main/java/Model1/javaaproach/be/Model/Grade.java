package Model1.javaaproach.be.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Grade {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private List<Person> person;


    private BigDecimal gradeValue;

    @OneToOne
    private Exam exam;

    private String comment;

    private String internalComment;

    private Boolean absent;

    private Boolean postponed;

    private LocalDate date;

    public Long getId() {
        return id;
    }

    public Grade setId(Long id) {
        this.id = id;
        return this;
    }

    public List<Person> getPerson() {
        return person;
    }

    public Grade setPerson(List<Person> person) {
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
        return absent;
    }

    public Grade setAbsent(Boolean absent) {
        this.absent = absent;
        return this;
    }

    public Boolean getPostponed() {
        return postponed;
    }

    public Grade setPostponed(Boolean postponed) {
        this.postponed = postponed;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public Grade setDate(LocalDate date) {
        this.date = date;
        return this;
    }
}
