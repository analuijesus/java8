import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("murilo", "ana", "luciana silva", "juracema");

        //um dos tipos de foreach para exibir em linhas
//        for (String nome : palavras) {
//            System.out.println(nome);
//        }

        Comparator<String> comparador = new ComparandoPorTamanho();
        Collections.sort(nomes, comparador); //implementa o Comparator que escrevemos
        nomes.sort(comparador); // faz exatamente a mesma instrução da linha de cima, uma nova forma mais "limpa"

        System.out.println(nomes);

        Consumer<String> consumidor = new ExibePorLinha();
        nomes.forEach(consumidor);

        //Sem a implementação de Comparator, utilizamos auto a implementação Comparable -> padrão alfabéticos de A - Z
        Collections.sort(nomes);
        System.out.println(nomes);

    }
}

class ExibePorLinha implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparandoPorTamanho implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()){ // comparação para ordenar do menor para o maior
            return -1; // negativo -> segue a ordem do < ele irá exibir do menor para o maior
        }
        if (s1.length() > s2.length()){
            return 1; // positivo -> inverte a ordem se > ele irá trazer do menor para o maior
        }
        return 0; // segue a mesma ordem do imput
    }
}
