/*  Created by IntelliJ IDEA.
 *  User: Manshi Raj
 *  Date: 30/08/20
 *  File Name : Student.java
 * */
package definitions;
import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private long studentUniversityRollNo;
    private int numberOfBooksIssued;
    private Book[] BooksIssuedByStudent;

//NOW, WE WILL CREATE GETTER METHOD FOR ABOVE FIELDS

    public Student(String firstName, String secondName, String lastName,
                   long studentUniversityRollNo, int numberOfBooksIssued) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.studentUniversityRollNo = studentUniversityRollNo;
        this.numberOfBooksIssued = numberOfBooksIssued;


    }

    public Student() {
        this.BooksIssuedByStudent = new Book[20];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getStudentUniversityRollNo() {
        return getStudentUniversityRollNo();
    }

    public void setStudentUniversityRollNo(long studentUniversityRollNo) {
        this.studentUniversityRollNo = studentUniversityRollNo;
    }

    public Book[] getBooksIssuedByStudent() {
        return BooksIssuedByStudent.clone();
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    @Override
    public String toString() {
        return Arrays.toString(BooksIssuedByStudent);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getStudentUniversityRollNo() == student.getStudentUniversityRollNo() &&
                numberOfBooksIssued == student.numberOfBooksIssued &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getMiddleName(), student.getMiddleName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Arrays.equals(BooksIssuedByStudent, student.BooksIssuedByStudent);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstName(), getMiddleName(), getLastName(), getStudentUniversityRollNo(), numberOfBooksIssued);
        result = 31 * result + Arrays.hashCode(BooksIssuedByStudent);
        return result;
    }
}

