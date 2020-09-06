package Model1.javaaproach.be.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String familyName;

    @Enumerated
    private Gender gender;

    
    private Course course;


    @OneToMany(mappedby="person")
    Private List<Course> courseHistoey;

      public List<Course> getCourseHisrory() {
        return this;
    }

    public Person setCourseHistory(List<Course> courseHistory) {
        this.courseHistoey = courseHistory;
        return this;
    }


    public Integer getId() {
        return id;
    }

    public Person setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getFamilyName() {
        return familyName;
    }

    public Person setFamilyName(String familyName) {
        this.familyName = familyName;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Person setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public List<Course> getModules() {
        return modules;
    }

    public Person setModules(List<Course> modules) {
        this.modules = modules;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + ' ' +
                ", familyName='" + familyName + ' ' +
                ", gender=" + gender +

                '}';
    }
}
