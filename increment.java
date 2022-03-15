import java.util.Scanner;
import java.io.*;

class increment_salary{
      String emp_name,emp_id,designation;
      double salary;
      Scanner s=new Scanner(System.in);
      InputStreamReader ir=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(ir);

        void inc_sal() throws IOException{
          System.out.print("Enter your name: ");
          emp_name=s.next();

          System.out.print("Enter you id: ");
          emp_id=s.next();

          System.out.print("Enter your designation: ");
          designation=br.readLine();
      }

        void display(){
          if(designation.equalsIgnoreCase("CEO")){
              System.out.println("Congratulations your salary is increment by 20000");
          }

          else if(designation.equalsIgnoreCase("MANAGER")){
              System.out.println("Congratulations your salary is incremented by 5000");
          }

          else if(designation.equalsIgnoreCase("GENERAL MANAGER")){
              System.out.println("Congratulations your salary is incemented by 10000");
          }

          else{
            System.out.println("Congratulations your salary is incremented by 2000");
          }
      }
}

public class increment {
        public static void main(String [] args) throws IOException {
            increment_salary i=new increment_salary();

            i.inc_sal();
            i.display();
        }
}

