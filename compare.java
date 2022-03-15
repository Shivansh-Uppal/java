import java.util.ArrayList;
import java.util.List;

public class compare implements Comparable<compare> {
    int age;
    int roll_number;

    compare(int roll_number,int age){
        this.roll_number=roll_number;
        this.age=age;
    }

    @Override
    public int compareTo(compare roll_number) {
        int roll=this.roll_number;

        if(roll!=0){
            System.out.println(age-this.roll_number);
            return 0;
        }

        System.out.println(this.roll_number-age);
        return 0;
    }

    public static void main(String[]args) {
          compare c1=new compare(1,20);
          List<compare>list=new ArrayList<>();
          list.add(c1);
          c1.compareTo(c1);

          compare c2=new compare(31,19);
          list.add(c2);
          c2.compareTo(c2);
    }
}
