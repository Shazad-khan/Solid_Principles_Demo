public class SingleResponsibilityViolation {
    public static void main(String[] args) {
        SchoolWorks works= new SchoolWorks();
        works.Activity();
    }
    
}
class SchoolWorks{
    SchoolActivity schoolActivity = new SchoolActivity();

    public void Activity(){
        System.out.println("All these things will be done by the school.");
        schoolActivity.Registration();
        schoolActivity.FormSubmission();
        schoolActivity.FeesSubmission();
        schoolActivity.OnlineClass();
        schoolActivity.HomeWorks();
        schoolActivity.ProjectWorks();
        schoolActivity.Cricket();
        schoolActivity.Football();
        schoolActivity.MidTermExams();
        schoolActivity.FinalExams();
    }
}


class SchoolActivity{
    public void Registration(){
        System.out.println("Registration has been done");
    }
    public void FormSubmission(){
        System.out.println("All nessery forms has been done");
    }
    public void FeesSubmission(){
        System.out.println("Submitted the school fees.");
    }
    public void OnlineClass(){
        System.out.println("Conducting online class on regular basis ");
    }
    public void HomeWorks(){
        System.out.println("Give Home work on daily basis");
    }
    public void ProjectWorks(){
        System.out.println("Give Project works to all the students.");
    }
    public void Cricket(){
        System.out.println("Organizing Cricket matches");
    }
    public void Football(){
        System.out.println("Organizing football Matches");
    }
    public void MidTermExams(){
        System.out.println("showing the results of the exam");
    }
    public void FinalExams(){
        System.out.println("Conducted final exams.");
    }
}

    

