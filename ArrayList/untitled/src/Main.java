import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            ArrayList<String> colours = new ArrayList<String>();
            colours.add("blue");
            colours.add("green");
            colours.add("pink");
            colours.add("purple");
            for (int i = 0; i < colours.size(); i++)
            {
            int j = colours.size() - i - 1;
            System.out.println(colours.get(j));
            }
        };
    }