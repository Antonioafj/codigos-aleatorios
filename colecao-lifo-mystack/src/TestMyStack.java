public class TestMyStack {
    
    public static void main(String[] args) {
        
        MyStack<Integer> s = new LinkedListStack<Integer>();

        for (int i = 1; i <= 8 ; i ++)
            s.push(i);
        System.out.println(s);


    for(int i = 0; i < 4; i ++) {
        int aux = s.pop();
        System.out.println("s.pop() =" + aux);
    }
    System.out.println(s);
    
    System.out.println("s.size()" + s.size());
    System.out.println("s.isEmpty() = " + s.isEmpty());
    System.out.println("s.top = " + s.top());
    }   
}