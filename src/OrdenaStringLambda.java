import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStringLambda {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("murilo", "ana", "luciana silva", "juracema");

//        Comparator<String> comparador = new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                if (s1.length() < s2.length()) { // comparação para ordenar do menor para o maior
//                    return -1; // negativo -> segue a ordem do < ele irá exibir do menor para o maior
//                }
//                if (s1.length() > s2.length()) {
//                    return 1; // positivo -> inverte a ordem se > ele irá trazer do menor para o maior
//                }
//                return 0; // segue a mesma ordem do imput
//            }
//        };

//        nomes.sort(new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                if (s1.length() < s2.length()) {
//                    return -1;
//                }
//                if (s1.length() > s2.length()) {
//                    return 1;
//                }
//                return 0;
//            }
//        });

//        nomes.sort(new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                if (s1.length() < s2.length()) {
//                    return -1;
//                }
//                if (s1.length() > s2.length()) {
//                    return 1;
//                }
//                return 0;
//            }
//        });

//        nomes.sort((s1, s2) -> {
//            if (s1.length() < s2.length()){
//                return -1;
//            }
//            if (s1.length() > s2.length()) {
//                return 1;
//            }
//            return 0;
//        });

//        nomes.sort((s1, s2) -> {
//            return Integer.compare(s1.length(), s2.length());
//        });

        nomes.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(nomes);

//        Consumer<String> consumidor = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };

//        nomes.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        nomes.forEach((String s) -> {
//            System.out.println(s);
//        });

//        nomes.forEach(s -> {
//            System.out.println(s);
//        });

        nomes.forEach(s -> System.out.println(s));
    }
}