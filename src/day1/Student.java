package day1;

public class Student {
    private  String name ;
    private double id ,grade1,grade2,grade3 ;

    Student (String n , double idd , double g1 , double g2 , double g3) {
        name = n ;
        id = idd ;
        grade1= g1 ;
        grade2 = g2 ;
        grade3 = g3 ;
    }
    Student(){
        name = "Unknown" ;
        id = 0 ;
        grade1= 0 ;
        grade2 = 0 ;
        grade3 = 0 ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(double id) {
        this.id = id;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }

    public String getName() {
        return name;
    }

    public double getId() {
        return id;
    }

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public static double calcAvg (double grade1 , double grade2 , double grade3){
        double avg = (grade1+grade2+grade3) / 3 ;
return avg ;
    }
    public static boolean isPassed (double avg){
        if (avg >= 50)
            return true  ;
        else
            return false ;
    }

    public void displayInfo() {
        double theavg = calcAvg( grade1 ,  grade2 , grade3) ;
        boolean flag = isPassed(theavg) ;

        System.out.println("Student Name : " + getName());
        System.out.println( " ID : "+getId());
        System.out.println(" G1 : " +getGrade1());
        System.out.println(" G2 : "+ getGrade2());
        System.out.println(" G3 : "+ getGrade3());
        System.out.println(" Avg : " +theavg);
        System.out.println(" Status : "+ flag);

    }

}
