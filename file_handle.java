import java.io.FileOutputStream;
public class file_handle {
    public static void main(String args[]){
           try{
             FileOutputStream fout=new FileOutputStream("C:\\programming languages\\java\\test.txt");
             fout.write(66);
             fout.close();
             System.out.println("success...");
            }
            catch(Exception e)
            {
                  System.out.println(e);
            }
      }
}