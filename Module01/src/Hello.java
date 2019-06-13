import java.util.ArrayList;

/**
 * @author xuwn
 * @date 2019/5/13 - 11:02
 */
public class Hello {



    public static void main(String[] args) {
        System.out.println("args = [" + args + "]");
        System.out.println("Hello.main");
        System.out.println("args = " + args);
        int num =0;
        System.out.println("num = " + num);
        System.out.println(num);
        get();

    }

    private static void get() {
        ArrayList<String> objects = new ArrayList<String>();
        for (String object : objects) {

        }
        for (int i = 0; i < objects.size(); i++) {
            
        }
        for (int i = objects.size() - 1; i >= 0; i--) {
            
        }

        System.out.println("");
        System.out.println();
    }


}
