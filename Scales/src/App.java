import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Neck neck = new Neck("E",
                "B",
                "G",
                "D",
                "A",
                "E");

        ArrayList<String> penta = new ArrayList<>();
        penta.add("E");
        penta.add("G");
        penta.add("B");
        penta.add("C");
        penta.add("D#");

        PrintNeck.printNeck(neck, penta);
    }
}
