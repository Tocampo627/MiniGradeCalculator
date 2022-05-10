
package studentgradejava;
import java.util.Scanner;

public class StudentGradeJava {
   
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        // variables         
        String name;
        double TotalGrade;
        int NumOfGrades=0; //number of grades user has decided to input
        int counter=1;
   
        
        // get user input
        System.out.print("Enter the student name ==> ");
        name=scan.next();
        System.out.print("How many grades would you like to enter for " + name + "? ==> ");
        NumOfGrades= scan.nextInt();
       // instance Student       
        Student stu1=new Student(name);
        
        while(counter <= NumOfGrades)
        {
            System.out.print("Enter the grade # " + counter + " ==> ");
            TotalGrade=scan.nextDouble();
            stu1.AddGrade(TotalGrade); 
            counter++;            
        }
        TotalGrade = stu1.CalcAverage(NumOfGrades);
        System.out.println(name +" your grade is " + stu1.GetLetterGrade(TotalGrade));
    }
    
}
