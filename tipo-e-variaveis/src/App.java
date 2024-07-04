public class App {
    public static void main(String[] args) throws Exception {
        /* 
        boolean flag = true;
        char ch = 'a';
        byte b = 12;
        short s = 24;
        int i = 257;
        long l = 214322345L;
        float f = 3.4535f;
        double d = 2.342;

        System.out.println("flag = " + flag);
        System.out.println("char " + ch);
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
*/
    double d1 = 3.2;
    double d2 = 3.9999999;

    int i1 = (int)d1;
    int i2 = (int)d2;
    double d3 = (double) i2;
    
    int i3 = 42;
    double d4 = i3;

    char ch1 = 'A';
    int i5 = ch1; 
    char ch2 = 66;
System.out.println(d1+" "+ d2+" "+i1+" "+i2+" "+d3+" "+d4 +" " +i3+" "+ch1+" "+i5+" "+ch2);

    }
}
