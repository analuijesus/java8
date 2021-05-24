import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class MethodReferenceTeste {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("murilo", "ana", "luciana silva", "juracema");

//        nomes.sort((s1, s2) -> {
//            return Integer.compare(s1.length(), s2.length());
//        });

        //nomes.sort(Comparator.comparing(s -> s.length()));
        //nomes.sort(Comparator.comparing(String::length));
        nomes.sort(comparing(String::length));

        System.out.println(nomes);
    }
}
