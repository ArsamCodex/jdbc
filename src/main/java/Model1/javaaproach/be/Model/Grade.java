package Model1.javaaproach.be.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Grade {

    
    private Long id;

    
    private Person person;


    private BigDecimal gradeValue;

    
    private Exam exam;

    private String comment;

    private String internalComment;

    private Boolean absent;

    private Boolean postponed;

    private LocalDate date;
}
