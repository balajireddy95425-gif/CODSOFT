import java.util.ArrayList;
import java.util.Scanner;
public class Studentmanagement  {
int rollno;
String name;
double marks;
static String schoolname = "arunodya techno school";
static int totalstudents;
//constructor
Studentmanagement(int r,String n,double m ){
    rollno = r;
    name = n;
    marks = m;
    totalstudents++;
}
//display the student details
public void displayinfo(){
    System.out.println("roll no:"+rollno);
    System.out.println("name:"+name);
    System.out.println("marks:"+marks);
    System.out.println("school name:"+Studentmanagement.schoolname);
}
//update the marks 
public void updateMarks(double newMarks){
    this.marks = newMarks;//this keyword refers to the current object,KO,
    System.out.println("marks updated for:"+name+"marks"+marks);
}
static void showTotalStudents(){
    System.out.println("total students"+Studentmanagement.totalstudents);
}
}
 class SMSApp{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Studentmanagement>student = new ArrayList<>();
    static void  showmenu(){
     System.out.println("-------Student management system----------");
     System.out.println("1.Add Student");
     System.out.println("2.display all students");
     System.out.println("3.show  total Student");
     System.out.println("4. Search by Roll No");
    System.out.println("5. Update Marks");
    System.out.println("6. Remove Marks");
    System.out.println("7. Exit");
    } 
    
    static void Addstudent(){
    System.out.println("enter the rollno");
         int rollno = sc.nextInt();
          sc.nextLine();
    System.out.println("enter the name");
         String name = sc.nextLine();
    System.out.println("enter the marks");
         double marks = sc.nextDouble();
    Studentmanagement s = new Studentmanagement(rollno,name,marks);
    student.add(s);     
    }
    static void displayAllStudents(){
        if(student.isEmpty()){
            System.out.println("student list is empty");
        }else{
            for(Studentmanagement s : student){
                s.displayinfo();
            }
        }
    }
    static void searchRollno(){
        System.out.println("enter the roll no");
        int searchRollno = sc.nextInt();
        for(Studentmanagement s : student){
            if(s.rollno == searchRollno){
            System.out.println("found"+s.name+ " "+s.marks);
            }
        }
    }
    static void updateMarks(){
      System.out.println("enter your roll no");
      int roll = sc.nextInt();
      for(Studentmanagement s : student){
        if(s.rollno == roll){
           System.out.println("enter your marks:");
           double newMarks = sc.nextDouble();
           s.updateMarks(newMarks);
           return;
        }
      }
    }
    static void removeMarks(){
        System.out.println("enter your roll no");
        int roll = sc.nextInt();
        for(Studentmanagement s : student){
            if (s.rollno == roll){
               s.marks = 0;
              System.out.println("after removing the student marks"+roll);
              return;
            }
        }
    }
    static void exitProgram(){
        System.out.println("exiting program:");
        sc.close();
        System.exit(0);
    }

public static void main(String[]args){
    
   while(true){
   SMSApp.showmenu();
   System.out.println("enter your choice");
   int choice = sc.nextInt();
   switch (choice) {
                case 1: 
                Addstudent(); 
                break;
                case 2: 
                displayAllStudents(); 
                break;
                case 3: 
                Studentmanagement.showTotalStudents(); 
                break;
                case 4: 
                searchRollno();
                 break;
                case 5: 
                updateMarks(); 
                break;
                case 6: 
                removeMarks(); 
                break;
                case 7: 
                exitProgram(); 
                break;
                default: System.out.println("Invalid choice!");
            }
        }
   } 
}

