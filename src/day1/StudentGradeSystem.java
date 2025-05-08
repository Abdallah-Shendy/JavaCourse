package day1;

import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in) ;


      Student [] arrstudent = new Student[3];
 for (int i = 1 ; i <= arrstudent.length; i ++) {
     System.out.println("Please Enter Inf About student No " + i );
     arrstudent [i-1] = new Student() ;
     System.out.println("Please Enter Name For Student NO " + i );
     arrstudent[i-1].setName(input.next());
     System.out.println("Please Enter Id For Student NO " + i ) ;
     arrstudent[i-1].setId(input.nextDouble());
     System.out.println("Please Enter Grade1 For Student NO " + i) ;
     arrstudent[i-1].setGrade1(input.nextDouble());
     System.out.println("Please Enter Grade2 For Student NO " + i ) ;
     arrstudent[i-1].setGrade2(input.nextDouble());
     System.out.println("Please Enter Grade3 For Student NO " + i ) ;
     arrstudent[i-1].setGrade3(input.nextDouble());
     System.out.println("Student Report");
     arrstudent[i-1].displayInfo();

 }







        }
}
