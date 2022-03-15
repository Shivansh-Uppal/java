public class Sstr {
    public static void main(String [] args) {

        String str=new String();

        str="My name is "+"shivansh";

        char []x={'h','e','l','l','o'};
        String str2=new String(x);
        String str3="HELLO";

        System.out.println(str);

        char ch=str.charAt(2);

        System.out.println("Using charAt: "+ch);

        System.out.println(str.equals(str2));

        System.out.println(str2.equalsIgnoreCase(str3));

        System.out.println(str.startsWith("my"));

        System.out.println(str.endsWith("ansh"));

        System.out.println(str2.compareTo(str3));

        System.out.println(str2.compareToIgnoreCase(str3));

        System.out.println(str.indexOf("y"));

        System.out.println(str.lastIndexOf("h"));

        System.out.println(str.substring(0, 3));

        System.out.println(str.length());

        System.out.println(str.concat(" uppal"));

        System.out.println(str2.replace('h','e'));

        System.out.println(str3.toLowerCase());

        System.out.println(str2.toUpperCase());


        StringBuffer l=new StringBuffer();
        StringBuffer m=new StringBuffer(15);
        StringBuffer n=new StringBuffer("hello");

        System.out.println(l.length());
        System.out.println(m.length());
        System.out.println(n.length());

        System.out.println(l.append(str));
        System.out.println(n.insert(5,str3));

        System.out.println(n.delete(1,2));

        System.out.println(n.replace(0,4,"Hi "));

        System.out.println(n.reverse());

        l.setLength(300);
        System.out.println(l.length());

        System.out.println(n.capacity());

    }
}
