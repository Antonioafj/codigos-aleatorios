import java.util.Arrays;

import javax.sound.midi.Soundbank;

public class TestString {
    public static void main(String[] args) {
        /* 
        String c1 = new String("CC");
        String c2 = "1007";
        String c3 = c1 + " " + c2 + " rocks";
        System.out.println(c3);


        String s = "algoritmos";
        System.out.println("s.charAt(6) = " + s.charAt(6));
        for(int i = 0; i < s.length(); i ++)
            System.out.println(s.charAt(i));
        System.out.println();

        String s1 =  new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

        String s3 = new String("Good - bye");
        String s4 = new String("HELLO");
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));
*/
        String s5 = "Quentepracatiça";
        String s6 = "calor";
        System.out.println(s5.compareTo(s6));

        System.out.println(s5.substring(2, 5));

        String s7 = "algoritmos";
        char[] a7 = s7.toCharArray();
        //String s8 = new String(a7);
        System.out.println(Arrays.toString(a7));
        System.out.println();
     
    }
}
