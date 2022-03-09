
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class OpenClose {
    public void generateReport(Reporting reporting)
    {
        System.out.println("===================================");
        System.out.println("=====Generating Report - Card======");
        System.out.println("===================================");
 
        reporting.generating();
        System.out.println("===================================");
        System.out.println("=======Report Card Generated=======");
        System.out.println("===================================");
    }
}      

interface Reporting{
    void generating();
}

class lowerKinderGarden implements Reporting{
 
    @Override
    public void generating() {
        System.out.println("Generating Report card L_kg");
        System.out.println("Enter name of the students");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter roll no");
        int roll = sc.nextInt();
        System.out.println("Enter Marks of English");
        int English = sc.nextInt();
        System.out.println("Enter Marks of Hindi");
        int Hindi = sc.nextInt();
        System.out.println("Enter Marks of EVS");
        int EVS = sc.nextInt();
        System.out.println("Enter Marks of Maths");
        int Maths = sc.nextInt();
        int Grandtotal = English + Hindi + EVS + Maths ;
        System.out.println("Total marks = " + Grandtotal);
        if(Grandtotal > 90){
            System.out.println(" Grade: A+");
        }
        else if(Grandtotal > 80){
            System.out.println(" Grade: A");
        }
        else if(Grandtotal > 70){
            System.out.println(" Grade: B");
        }
        else if(Grandtotal > 60){
            System.out.println(" Grade: C");
        }
        else if(Grandtotal > 50){
            System.out.println(" Grade: D");
        }
        else if(Grandtotal > 40){
            System.out.println(" Grade: NI");
        }
        else
        System.out.println("Grade: F");

        System.out.println("A+ : Excelent");
        System.out.println("A  : V.Good");
        System.out.println("B  : Average");
        System.out.println("C  : Below Average");
        System.out.println("D  : Poor");
        System.out.println("NI : Need Improvement");
        System.out.println("F  : Fail");
    }
}
class UpperGarden implements Reporting {
 
    @Override
    public void generating() {
            System.out.println("Generating Report card UpperKinderGarden");
            System.out.println("Enter name of the students");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.println("Enter roll no");
            int roll = sc.nextInt();
            System.out.println("Enter Marks of English");
            int English = sc.nextInt();
            System.out.println("Enter Marks of Hindi");
            int Hindi = sc.nextInt();
            System.out.println("Enter Marks of EVS");
            int EVS = sc.nextInt();
            System.out.println("Enter Marks of Maths");
            int Maths = sc.nextInt();
            int Grandtotal = English + Hindi + EVS + Maths ;
            System.out.println("Total marks = " + Grandtotal);
            if(Grandtotal > 90){
                System.out.println(" Grade: A+");
            }
            else if(Grandtotal > 80){
                System.out.println(" Grade: A");
            }
            else if(Grandtotal > 70){
                System.out.println(" Grade: B");
            }
            else if(Grandtotal > 60){
                System.out.println(" Grade: C");
            }
            else if(Grandtotal > 50){
                System.out.println(" Grade: D");
            }
            else if(Grandtotal > 40){
                System.out.println(" Grade: NI");
            }
            else
            System.out.println("Grade: F");
    
            System.out.println("A+ : Excelent");
            System.out.println("A  : V.Good");
            System.out.println("B  : Average");
            System.out.println("C  : Below Average");
            System.out.println("D  : Poor");
            System.out.println("NI : Need Improvement");
            System.out.println("F  : Fail");
        }
    }
     class finalreport {
 
        public static void main(String[] args) {
            OpenClose open = new OpenClose();
     
            //Generate L_kg report card
            Reporting Lkg = new reporting();
            open.generateReport(Lkg);
     
            //Generate U_g report card
            Reporting Ukg = new reporting();
            open.generateReport(Ukg);
        }
    }
