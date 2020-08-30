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
}
