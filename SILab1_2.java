import java.util.List;

public class SILab1_2 {

    public String makeBigStringFrom(List<String> strings, int minLength) {
        StringBuilder result = new StringBuilder();
        for (String s : strings) {
            if (s.length() >= minLength) {
                result.append(s);
            }
        }
        return result.toString();
    }

}