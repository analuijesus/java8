import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

        cursos.stream()
                .filter(c -> c.getAluno() >= 100)
                .map(Curso::getAluno)
                //.map(c -> c.getAluno()) -> mesmo map acima
                .forEach(System.out::println);
    }
}

