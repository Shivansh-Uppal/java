import java.util.Scanner;

public class age {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);

        int present_date, present_month;
        int present_year, birth_date, birth_month, birth_year;
        int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
        System.out.println("Enter your birth date: ");
        birth_date=s.nextInt();

        System.out.println("Enter your birth month: ");
        birth_month=s.nextInt();

        System.out.println("Enter your birth year: ");
        birth_year=s.nextInt();

        System.out.println("Enter today's date: ");
        present_date=s.nextInt();

        System.out.println("Enter present month: ");
        present_month=s.nextInt();

        System.out.println("Enter present year: ");
        present_year=s.nextInt();

        if (birth_date > present_date) {
               present_date = present_date + month[birth_month - 1];
               present_month = present_month - 1;
        }

        if (birth_month > present_month) {
               present_year = present_year - 1;
               present_month = present_month + 12;
        }

            int final_date = present_date - birth_date;
            int final_month = present_month - birth_month;
            int final_year = present_year - birth_year;

        System.out.println("You are "+final_year+" years "+final_month+" months "+final_date+" days old");    

        s.close();
    }
}
