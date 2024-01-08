package CollectionInterFace;

import java.util.*;
public class StackDemo {

    public static void showpush(Stack st, int a) {
        st.push(Integer.valueOf(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    public static void showpop(Stack st) {
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }


}