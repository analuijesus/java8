import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStringMethodReference {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("murilo", "ana", "luciana silva", "juracema");

        //nomes.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        //nomes.sort(Comparator.comparing(s -> s.length()));
        //nomes.sort(Comparator.comparing(String::length));

        Function<String, Integer> funcao2 = s -> s.length();
        Function<String, Integer> funcao3 = String::length;

        Function<String, Integer> funcao = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        nomes.sort(Comparator.comparing(funcao));

        // faz exatamente este código, mas de forma destrinchada  -> nomes.sort(Comparator.comparing(String::length));
        Function<String, Integer> funcao4 = String::length;
        Comparator<String> comparador = Comparator.comparing(funcao4);
        nomes.sort(comparador);

        System.out.println(nomes);

        //nomes.forEach(s -> System.out.println(s));
        nomes.forEach(System.out::println);
    }
}