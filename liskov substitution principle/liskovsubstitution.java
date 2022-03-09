import java.util.Scanner;

class BankingSystem{
    double accbalance = 0;
    public void OpeningAccount(){
        System.out.println("Opening account.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String Name = sc.nextLine();
        System.out.println("Enter your mail id");
        String email = sc.nextLine();
        System.out.println("Enter your address.");
        String Address = sc.nextLine();
        System.out.println("account created.");
        System.out.println("Account holder: " + Name);
        System.out.println("Email id : " + email);
        System.out.println("Address : " + Address);

    }
    public void Deposit(){
        System.out.println("Depositing money.");
        
        Scanner sc = new Scanner(System.in);
        double depositamount = sc.nextDouble();
        accbalance = accbalance + depositamount;
        System.out.println("Deposited amount: " + depositamount);
        System.out.println("Current Balance: " + accbalance);
    }
    public void Withdraw(){
        System.out.println("You can withdraw money from the bank.");
        Scanner sc = new Scanner(System.in);
        int withdrawammount = sc.nextInt();
        accbalance = accbalance - withdrawammount;
        System.out.println("Withdrawl ammount: " + withdrawammount);
        System.out.println("Current Balance: " + accbalance);
    }
    public void Loan(){
        System.out.println("You can awail loan. TC applied");
        if (accbalance > 30000.00){
            System.out.println("you are eligible to avail loan.");
            System.out.println("Press (Y): to continue (N): to exit");
            Scanner sc = new Scanner(System.in);
            String descision = sc.nextLine();
            if(descision == "Y" || descision == "y"){
                System.out.println("Your loan has been sanctioned sucessfully");
            }
        }
        else
            System.out.println("Sorry to inform You, that you are not eligible to avail loan.");
    }
}

class StateBnak extends BankingSystem{
    double accbalance = 0;
    public void OpeningAccount(){
        System.out.println("Opening account in State Bank of India.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String Name = sc.nextLine();
        System.out.println("Enter your mail id");
        String email = sc.nextLine();
        System.out.println("Enter your address.");
        String Address = sc.nextLine();
        System.out.println("account created.");
        System.out.println("Account holder: " + Name);
        System.out.println("Email id : " + email);
        System.out.println("Address : " + Address);

    }
    public void Deposit(){
        System.out.println("Depositing money in State Bank Of India.");
        
        Scanner sc = new Scanner(System.in);
        double depositamount = sc.nextDouble();
        accbalance = accbalance + depositamount;
        System.out.println("Deposited amount: " + depositamount);
        System.out.println("Current Balance: " + accbalance);
    }
    public void Withdraw(){
        System.out.println("You can withdraw money from State Bank Of India..");
        Scanner sc = new Scanner(System.in);
        int withdrawammount = sc.nextInt();
        accbalance = accbalance - withdrawammount;
        System.out.println("Withdrawl ammount: " + withdrawammount);
        System.out.println("Current Balance: " + accbalance);
    }
    public void Loan(){
        System.out.println("You can awail loan in State Bank Of India.. TC applied");
        if (accbalance > 30000.00){
            System.out.println("you are eligible to avail loan.");
            System.out.println("Press (Y): to continue (N): to exit");
            Scanner sc = new Scanner(System.in);
            String descision = sc.nextLine();
            if(descision == "Y" || descision == "y"){
                System.out.println("Your loan has been sanctioned sucessfully");
            }
        }
        else
            System.out.println("Sorry to inform You, that you are not eligible to avail loan.");
    }
}

class Axis extends BankingSystem{
    double accbalance = 0;
    public void OpeningAccount(){
        System.out.println("Opening account in Axis bank.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String Name = sc.nextLine();
        System.out.println("Enter your mail id");
        String email = sc.nextLine();
        System.out.println("Enter your address.");
        String Address = sc.nextLine();
        System.out.println("account created.");
        System.out.println("Account holder: " + Name);
        System.out.println("Email id : " + email);
        System.out.println("Address : " + Address);

    }
    public void Deposit(){
        System.out.println("Depositing money in Axis bank.");
        
        Scanner sc = new Scanner(System.in);
        double depositamount = sc.nextDouble();
        accbalance = accbalance + depositamount;
        System.out.println("Deposited amount: " + depositamount);
        System.out.println("Current Balance: " + accbalance);
    }
    public void Withdraw(){
        System.out.println("You can withdraw money from Axis bank.");
        Scanner sc = new Scanner(System.in);
        int withdrawammount = sc.nextInt();
        accbalance = accbalance - withdrawammount;
        System.out.println("Withdrawl ammount: " + withdrawammount);
        System.out.println("Current Balance: " + accbalance);
    }
    public void Loan(){
        System.out.println("You can awail loan in Axis bank. TC applied");
        if (accbalance > 30000.00){
            System.out.println("you are eligible to avail loan.");
            System.out.println("Press (Y): to continue (N): to exit");
            Scanner sc = new Scanner(System.in);
            String descision = sc.nextLine();
            if(descision == "Y" || descision == "y"){
                System.out.println("Your loan has been sanctioned sucessfully");
            }
        }
        else
            System.out.println("Sorry to inform You, that you are not eligible to avail loan.");
    }
}
public class liskovsubstitution{
    static void Bank(BankingSystem bankingSystem){
        bankingSystem.OpeningAccount();
        bankingSystem.Deposit();
        bankingSystem.Withdraw();
        bankingSystem.Loan();
    }

    public static void main(String[] args) {
        Bank(new BankingSystem());
        Bank(new Axis());
        Bank(new StateBnak());
    }
}


