package assyong;

import java.util.StringTokenizer;

public class VectorTest_A {
    public static void main(String[] args) {
        String str = "hello java";
        StringTokenizer st = new StringTokenizer(str,"," );
        while (st.hasMoreTokens()){
            System.out.println(st.nextElement());
        }
    }
}
