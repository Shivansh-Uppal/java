import java.io.FileInputStream;
public class file_handle3 {
     public static void main(String args[]){
         byte a [] = new byte[100];
          try{
            FileInputStream fin=new FileInputStream("C:\\programming languages\\java\\test3.txt");
            int i=fin.read(a);
            String str = new String(a);
            System.out.print(str);
            fin.close();
          }
          catch(Exception e)
          {
            System.out.println(e);
          }
      }
}
