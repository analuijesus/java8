import sun.security.ec.ECKeyPairGenerator;
import sun.util.resources.cldr.saq.CurrencyNames_saq;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

public class StreamTeste {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso("Java", 53));
        cursos.add(new Curso("CSharp", 137));
        cursos.add(new Curso("Python", 114));
        cursos.add(new Curso("HTML & CSS", 38));

//        cursos.sort(comparing(c -> c.getCurso()));
//        cursos.forEach(c -> System.out.println(c.getCurso()));
//
//        cursos.sort(comparingInt(Curso::getAluno));
//        cursos.forEach(c -> System.out.println(c.getAluno()));

//        cursos.stream()
//                .filter(c -> c.getAluno() >= 100)
//                .map(Curso::getAluno)
//                //.map(c -> c.getAluno()) -> mesmo map acima
//                .forEach(System.out::println);
//
//        int soma = cursos.stream()
//                .filter(c -> c.getAluno() >= 100)
//                .mapToInt(Curso::getAluno)
//                .sum();
//        System.out.println(soma);

//        cursos.stream() // cada stream feito é "começado" do zero. como se anterior não tivesse diferenteça utilizando o Collectores.toList isso muda
//                .filter(c -> c.getAluno() >= 100)
//                .findAny()
//                .ifPresent(c -> System.out.println(c.getCurso()));
//
//        cursos.stream()
//                .filter(c -> c.getAluno() >= 100)
//                .collect(Collectors.toList()); // transforma em uma "nova lista"

//        Map<String, Integer> map = cursos.stream()
//                .filter(c -> c.getAluno() >= 100)
//                .collect(Collectors.toMap(Curso::getCurso, Curso::getAluno));
//
//        System.out.println(map);

        cursos.stream()
                .filter(c -> c.getAluno() >= 100)
                //.collect(Collectors.toMap(Curso::getCurso, Curso::getAluno))
                .collect(Collectors.toMap(c -> c.getCurso(), c -> c.getAluno()))
                .forEach((Curso::getAluno, Curso::getCurso) -> System.out.println("Oi"); // pesquisar como implementar esse código

    }
}

