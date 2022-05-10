
package studentgradejava;

public class Student {
  private String name;
  private double TotalGrade;
  private int NumOfGrades;
  
  //constructor
  public Student(String n)
  {
      this.name=n;
      this.TotalGrade=0;
  }
  public void AddGrade(double grade)
  {
      this.TotalGrade += grade;
      
  }
  public double CalcAverage(int n)
  {
      this.NumOfGrades=n;
      
      return this.TotalGrade/=n;
           
  }
  
  public String GetLetterGrade(double total)
  {
      this.TotalGrade=total;
      
      if (total>=100)
        {
          return "A+";
        }
      else if (total>=93)
        {
          return "A";
        }
      else if (total>=90)
        {
          return "A-";
        }
      else if (total>=87)
        {
          return "B+";
        }
      else if (total>=83)
        {
          return "B";
        }
      else if (total>=80)
        {
          return "B-";
        }
      else if (total>=77)
        {
          return "C+";
        }  
      else if (total>=73)
        {
          return "C";
        }   
      else if (total>=70)
        {
          return "C-";
        } 
      else if (total>=67)
        {
          return "D+";
        }      
      else if (total>=63)
        {
          return "D";
        }
      else if (total>=60)
        {
          return "D-";
        }     
      else 
      {
          return"F";
      }
  }
 
  
}

