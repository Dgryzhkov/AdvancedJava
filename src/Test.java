import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*interface Executable {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable e) {
       int a= e.execute(10, 20);
        System.out.println(a);
    }
}*/
public class Test {
    public static void main(String[] args) {
/*            Runner runner = new Runner();

            runner.run(new Executable() {
                @Override
                public int execute(int x, int y) {
                    return x+y+10;
                }
            });

           final int a=1;
            runner.run((x,y)->x+y+10+a);
            */

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Goodbye");
        list.add("a");
        list.add("ab");

/*           list.sort(new Comparator<String>() {
               @Override
               public int compare(String o1, String o2) {
                   if (o1.length()>o2.length()){
                       return 1;
                   } else if (o1.length()<o2.length()){
                       return -1;
                   } else {
                       return 0;
                   }
               }
           });*/

        // можно укоротить сорт
        list.sort((s1, s2) -> {
            if (s1.length() > s2.length()) {
                return 1;
            } else if (s1.length() < s2.length()) {
                return -1;
            } else {
                return 0;
            }
        });

        System.out.println(list);

    }
}