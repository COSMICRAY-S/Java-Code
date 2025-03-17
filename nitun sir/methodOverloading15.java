// Posting java: A program to illustrate method overloading. 
import java.util.Scanner; 
class methodOverloading15 {
 int[] jobCodes ={131,132,133}; 
int courseMark; 
int aptTest; 
int techTest; 
int interview;
void employee (int courseWork, int aptTest, int techTest, int interview) 
{
int x=courseMark +aptTest + techTest+ interview;
 if (x >=80) 
 System.out.println("Congrats! You are selected as Programmer.\n");
 else 
System.out.println("Sorry. Not selected." +"Try again! All the best.\n");
}
void employee(int techTest, int interview) 
{
 int x= techTest+interview; 
if (x > 85) 
System.out.println("Congrats! You are selected as Team Leader."); 
else 
System.out.println("Sorry. Not selected."+"Try again! All the best.\n"); 
}
void employee (int interview) 
{ 
int x = interview;
 if (x >= 90) 
 System.out.println( "Congrats! You are selected as Project Manager."); 
else 
System.out.println( "Sorry. Not selected. Try again! All the best."); 
}
void readMarks(int code)
 { 
    Scanner sc = new Scanner(System.in); 
    switch(code) 
    { 
    case 131: 
    System.out.println("Enter Course mark (Max: 25):"); 
    courseMark = sc.nextInt(); 
    System.out.println("Enter aptTest mark (Max: 25):"); 
    aptTest = sc.nextInt(); 
    System.out.println("Enter TechTest mark (Max: 25):"); 
    techTest = sc.nextInt(); 
    System.out.println("Enter interview mark (Max: 25):"); 
    interview = sc.nextInt(); 
    break; 
    case 132: 
    System.out.println("Enter TechTest mark (Max: 50):"); 
    techTest = sc.nextInt(); 
    System.out.println("Enter interview mark (Max: 50):"); 
    interview = sc.nextInt(); 
    break; 
    case 133: System.out.println("Enter interview mark (Max: 100):"); 
    interview = sc.nextInt(); 
    }
}
public static void main(String[] args) 
{ 
    methodOverloading15 emp = new methodOverloading15(); 
emp.readMarks (emp.jobCodes [0]); 
emp.employee (emp.courseMark, emp.aptTest, + emp.techTest, emp.interview); 
emp.readMarks (emp.jobCodes [1]); 
emp.employee (emp.techTest, emp.interview);
emp.readMarks (emp.jobCodes [2]); 
emp.employee (emp.techTest, emp.interview);
}
}