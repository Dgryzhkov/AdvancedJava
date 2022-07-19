import org.jetbrains.annotations.VisibleForTesting;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.*;

public class Test {

    public static void main(String[] args) {

        String a = "Hello1231there1321321hey";
        String[] words = a.split("\\d+");
        System.out.println(Arrays.toString(words));

        String b ="Hello12312312there123123123hey";

        String modifiedString = b.replaceAll("\\d+", ".");
        System.out.println(modifiedString);
        String modifiedString2 = b.replaceFirst("\\d+", "-");
        System.out.println(modifiedString2);
    }
}