import java.util.*;

public class iter2{
    public static void main(String[]args) {
          ArrayList<String> name=new ArrayList<String>();
          name.add("shivansh");
          name.add("jaisurya");
          name.add("nayan");

          Iterator iterator=name.iterator();
          System.out.println("Your name is: ");

          while(iterator.hasNext()){
              System.out.println(iterator.next());
          }

          iterator.remove();

          System.out.println(name);
    }
}
