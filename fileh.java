import java.io.*;
import java.lang.*;
import java.util.*;

public class fileh {
    public static void main(String[] args) {
        File g=new File("aap.txt");
        String st="";
    try{
        g.createNewFile();
    }

    catch(Exception e){
        System.out.println("Not created");
        e.printStackTrace();
    }
    

    try{
        FileWriter fw=new FileWriter("aap.txt");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the command: ");
        String n=sc.nextLine();

        fw.write(n);
        fw.close();
    }

    catch(Exception e){
        System.out.println("Some error");
        e.printStackTrace();
    }

    try{
        Scanner sc=new Scanner(g);
        while(sc.hasNext())
           st=st+sc.next()+" ";
    }

    catch(Exception e){
        System.out.println("not read");
        e.printStackTrace();
    }

    finally{
        System.out.println(st);
    }

    File h=new File("app.txt");
    try{
        h.createNewFile();
    }

    catch(Exception e){
        System.out.println("Not created");
        e.printStackTrace();
    }

    try{
        FileWriter fl=new FileWriter("app.txt");

        fl.write(st);
        fl.close();
    }

    catch(Exception e){
        e.getStackTrace();
    }
}
}