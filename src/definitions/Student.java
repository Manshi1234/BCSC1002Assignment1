/*  Created by IntelliJ IDEA.
 *  User: Manshi Raj
 *  Date: 30/08/20
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String firstNameOfStudent;
    private String middleNameOfStudent;
    private String lastNameOfStudent;
    private long studentUniversityRollNo;
    private int numberOfBooksIssued;
    private Book[] BooksIssuedByStudent;

//NOW, WE WILL CREATE GETTER METHOD FOR ABOVE FIELDS

    public Student(String firstNameOfStudent, String secondNameOfStudent, String lastNameOfStudent,
                   long studentUniversityRollNo, int numberOfBooksIssued) {
        this.firstNameOfStudent = firstNameOfStudent;
        this.middleNameOfStudent = middleNameOfStudent;
        this.lastNameOfStudent = lastNameOfStudent;
        this.studentUniversityRollNo = studentUniversityRollNo;
        this.numberOfBooksIssued = numberOfBooksIssued;


    }

    public Student() {
        this.BooksIssuedByStudent = new Book[20];
    }

    public String getFirstNameOfStudent() {
        return firstNameOfStudent;
    }

    public void setFirstNameOfStudent(String firstNameOfStudent) {
        this.firstNameOfStudent = firstNameOfStudent;
    }

    public String getMiddleNameOfStudent() {
        return middleNameOfStudent;
    }

    public void setMiddleNameOfStudent(String middleNameOfStudent) {
        this.middleNameOfStudent = middleNameOfStudent;
    }

    public String getLastNameOfStudent() {
        return lastNameOfStudent;
    }

    public void setLastNameOfStudent(String lastNameOfStudent) {
        this.lastNameOfStudent = lastNameOfStudent;
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
}
