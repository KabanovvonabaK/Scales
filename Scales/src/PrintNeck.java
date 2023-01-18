import java.util.ArrayList;
import java.util.HashMap;

public class PrintNeck {

    public static void printNeck(Neck neck, ArrayList<String> penta) {
        HashMap<Integer, ArrayList<String>> strings = neck.getGuitarNeck();

        for (ArrayList<String> string : strings.values()) {
            if (penta.contains(string.get(0))) {
                System.out.print(string.get(0));
            } else {
                System.out.print(" ");
            }
            System.out.print("||");
            for (int i = 1; i < string.size(); i++) {
                if (penta.contains(string.get(i))) {
                    if (string.get(i).contains("#")) {
                        System.out.print("  " + string.get(i) + "  |");
                    } else {
                        System.out.print("  " + string.get(i) + "   |");
                    }
                } else {
                    System.out.print("      |");
                }
            }

            System.out.println();
        }
    }

}
