import java.util.Scanner;

public class palindrome {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String check="",rev="";
        char ch;

        System.out.println("enter the string: ");
        check=sc.next();
        
        for(int j=check.length()-1;j>=0;j--){
            ch=check.charAt(j);
            rev=rev+ch;
        }   
       
        if(rev.equals(check)){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not palindrome");
        } 
        sc.close();
    }  
}
