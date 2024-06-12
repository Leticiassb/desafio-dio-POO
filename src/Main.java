import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java", "Descrição curso Java", 8);
        Curso curso2 = new Curso("Curso JavaScript", "Descrição Curso JavaScript", 4);

        Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Descrição Mentoria Java", LocalDate.now());
        Mentoria mentoria2 = new Mentoria("Mentoria de JavaScript", "Descrição Mentoria JavaScript", LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);


    }
}