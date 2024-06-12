import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java","Descrição curso Java",8);
        Curso curso2 = new Curso("Curso JavaScript","Descrição Curso JavaScript", 4);

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Descrição Mentoria Java",LocalDate.now());
        Mentoria mentoria2 = new Mentoria("Mentoria JavaScript","Descrição Mentoria JavaScript",LocalDate.now());



        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descrição do BootCamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLeticia = new Dev();
        devLeticia.setNome("Leticia");
        devLeticia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Leticia: " + devLeticia.getConteudosInscritos());
        devLeticia.progredir();
        devLeticia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos Leticia: " + devLeticia.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Leticia: " + devLeticia.getConteudosInscritos());
        System.out.println("XP:" + devLeticia.calcularTotalXP());

        System.out.println("-----------------------------------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("XP:" + devCamila.calcularTotalXP());

    }
}