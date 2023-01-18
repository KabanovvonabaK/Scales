import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Neck {

    private String stringOneOpen;
    private String stringTwoOpen;
    private String stringThreeOpen;
    private String stringFourOpen;
    private String stringFiveOpen;
    private String stringSixOpen;
    private HashMap<Integer, ArrayList<String>> guitarNeck;

    public Neck(String stringOneOpen, String stringTwoOpen, String stringThreeOpen, String stringFourOpen, String stringFiveOpen, String stringSixOpen) {
        this.stringOneOpen = stringOneOpen;
        this.stringTwoOpen = stringTwoOpen;
        this.stringThreeOpen = stringThreeOpen;
        this.stringFourOpen = stringFourOpen;
        this.stringFiveOpen = stringFiveOpen;
        this.stringSixOpen = stringSixOpen;

        guitarNeck = sixStringGuitarNeck(stringOneOpen,
                stringTwoOpen,
                stringThreeOpen,
                stringFourOpen,
                stringFiveOpen,
                stringSixOpen);
    }

    public Neck(String stringOneOpen, String stringTwoOpen, String stringThreeOpen, String stringFourOpen, String stringFiveOpen) {
        this.stringOneOpen = stringOneOpen;
        this.stringTwoOpen = stringTwoOpen;
        this.stringThreeOpen = stringThreeOpen;
        this.stringFourOpen = stringFourOpen;
        this.stringFiveOpen = stringFiveOpen;
    }

    private HashMap<Integer, ArrayList<String>> sixStringGuitarNeck(String stringOneOpen,
                                                                    String stringTwoOpen,
                                                                    String stringThreeOpen,
                                                                    String stringFourOpen,
                                                                    String stringFiveOpen,
                                                                    String stringSixOpen) {

        HashMap<Integer, ArrayList<String>> guitarNeck = new HashMap<>();
        guitarNeck.put(1, oneStringNotes(stringOneOpen));
        guitarNeck.put(2, oneStringNotes(stringTwoOpen));
        guitarNeck.put(3, oneStringNotes(stringThreeOpen));
        guitarNeck.put(4, oneStringNotes(stringFourOpen));
        guitarNeck.put(5, oneStringNotes(stringFiveOpen));
        guitarNeck.put(6, oneStringNotes(stringSixOpen));

        return guitarNeck;
    }

    private HashMap<Integer, ArrayList<String>> fiveStringBass(String stringOneOpen,
                                                               String stringTwoOpen,
                                                               String stringThreeOpen,
                                                               String stringFourOpen,
                                                               String stringFiveOpen) {

        HashMap<Integer, ArrayList<String>> guitarNeck = new HashMap<>();
        guitarNeck.put(1, oneStringNotes(stringOneOpen));
        guitarNeck.put(2, oneStringNotes(stringTwoOpen));
        guitarNeck.put(3, oneStringNotes(stringThreeOpen));
        guitarNeck.put(4, oneStringNotes(stringFourOpen));
        guitarNeck.put(5, oneStringNotes(stringFiveOpen));

        return guitarNeck;
    }

    private ArrayList<String> oneStringNotes(String note) {
        int indexOfOpenStringNote = Arrays.asList(Chromatic.CHROMATIC).indexOf(note);
        List<String> firstPart = Arrays.asList(Chromatic.CHROMATIC).subList(indexOfOpenStringNote, Chromatic.CHROMATIC.length);
        List<String> secondPart = Arrays.asList(Chromatic.CHROMATIC).subList(0, indexOfOpenStringNote);

        ArrayList<String> finalArray = new ArrayList<>(firstPart);
        finalArray.addAll(secondPart);

        return finalArray;
    }

    public HashMap<Integer, ArrayList<String>> getGuitarNeck() {
        return guitarNeck;
    }
}
