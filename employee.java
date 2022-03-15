import java.util.Scanner;


public class employee{
      
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
      
        class emp{
        String name="";
        String email="", ecode="", phone="";
        
        
        void details(){
              System.out.println("enter the name: ");
              name=n.next();

              System.out.println("enter the email: ");
              email=n.next();

              System.out.println("enter the employee code: ");
              ecode=n.next();

              System.out.println("enter the phone number: ");
              phone=n.next();

        }

        void format2(){
            System.out.println("Name of employee" + "\tMail-id" + "\t\temp-code"+ "\tPhone number");
        }
        void format(){
            System.out.print(String.format("%5s", name));
            System.out.print(String.format("%30s", email));
            System.out.print(String.format("%12s", ecode));
            System.out.println(String.format("%19s", phone));
        }
    }

    emp e1=new emp();
    e1.details();

    emp e2=new emp();
    e2.details();
    
    e1.format2();
    e1.format();
    e2.format();
    
    n.close();
        }
}