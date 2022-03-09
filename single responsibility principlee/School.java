public class School {
    public static void main(String[] args) {
        SchoolWorks works= new SchoolWorks();
        works.Activity();
    }
    
}
class SchoolWorks{
    Admission admission = new Admission();
    ConductingClass conductingClass= new ConductingClass();
    SportsDep sportsdep = new SportsDep();
    ExamsDep examsdep = new ExamsDep();


    public void Activity(){
        System.out.println("This is conducting exams");
        admission.Registration();
        admission.FormSubmission();
        admission.FeesSubmission();
        conductingClass.OnlineClass();
        conductingClass.HomeWorks();
        conductingClass.ProjectWorks();
        sportsdep.Cricket();
        sportsdep.Football();
        examsdep.MidTermExams();
        examsdep.FinalExams();
    }
}


class Admission{
    public void Registration(){
        System.out.println("Registration has been done");
    }
    public void FormSubmission(){
        System.out.println("All nessery forms has been done");
    }
    public void FeesSubmission(){
        System.out.println("Submitted the school fees.");
    }
}
class ConductingClass{
    public void OnlineClass(){
        System.out.println("Conducting online class on regular basis ");
    }
    public void HomeWorks(){
        System.out.println("Give Home work on daily basis");
    }
    public void ProjectWorks(){
        System.out.println("Give Project works to all the students.");
    }
}
class SportsDep{
    public void Cricket(){
        System.out.println("Organizing Cricket matches");
    }
    public void Football(){
        System.out.println("Organizing football Matches");
    }
}
class ExamsDep{
    public void MidTermExams(){
        System.out.println("showing the results of the exam");
    }
    public void FinalExams(){
        System.out.println("Conducted final exams.");
    }
}
