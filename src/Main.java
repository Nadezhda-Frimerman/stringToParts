import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String str = "Hello, Tom! Now do yur do?";
        List<String> list = transformString(str);
        for (String l : list) {
            System.out.println(l);
        }
/*
или
 */
        String[] words = str.split("[?! ]+");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static List<String> transformString(String str) {
        List<String> parts = new ArrayList<>();
        String part = "";
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (c == ',' || c == ' ' || c == '.' || c == '!' || c == '?') {
                if (!part.isEmpty()) {
                    parts.add(part);
                    part = "";
                }
                // пропускаем пробелы подряд
                while (i + 1 < str.length() && str.charAt(i + 1) == ' ') {
                    i++;
                }
            } else {
                part += c;
            }
            i++;
        }
        if (!part.isEmpty()) {
            parts.add(part);
        }
        return parts;
    }
}





