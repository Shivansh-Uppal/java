import java.util.Scanner;
import java.util.Arrays;
class books{
    static int j=5;
    static String select;
    int yn=0;
    String[] book=new String[5];
    void available_books(){
        book[0]="Alice and wonderland";
        book[1]="Goosebumps";
        book[2]="Harry potter";
        book[3]="Premchand stories";
        book[4]="Panchtantra";
        System.out.println("There are "+j+" books available");
        for(int i=0;i<5;i++){
        System.out.println(i+1 +" "+book[i]);
        }
    }

    void issued_book(){
        System.out.println("You can issue only 1 book for 7 days");
        System.out.println("Please select books from the list shown above");
        while(yn!=1){
            Scanner s=new Scanner(System.in);
            String v=select;
            select=s.nextLine();

            if(j<5)
            for(int i=0;i<5;i++){
                if(select.equals(v)){
                    System.out.println("This book is already issued, so not available");
                    s.close();
                    return;
                }
            }

            if(Arrays.asList(book).contains(select)){
            System.out.println("Are you sure you want this book to be issued ?(enter for 1 yes and 0 for no)");
            yn=s.nextInt();
            }
            if(yn==1){
                System.out.println("OK! Your book is at counter please collect");
                j--;
            }
            else{
                System.out.println("Sorry book not found!");
            }
        }
    }
}

public class library{
     public static void main(String[] args) {

         books b=new books();
         b.available_books();
         b.issued_book();

         books b2=new books();
         b2.available_books();
         b2.issued_book();

     }
}