import java.io.FileOutputStream;
public class file_handle2 {
    public static void main(String args[]){
           try{
             FileOutputStream fout=new FileOutputStream("C:\\programming languages\\java\\test2.txt");
             String s="Welcome";
             byte b[]=s.getBytes();
             fout.write(b);
             fout.close();
             System.out.println("success...");
            }
            catch(Exception e){System.out.println(e);}
      }
}
