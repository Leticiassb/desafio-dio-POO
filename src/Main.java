import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        Mentoria mentoria1 = new Mentoria();
        Mentoria mentoria2 = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());

        mentoria1.setTitulo("Mentoria JavaScript");
        mentoria1.setDescricao("Descrição Mentoria JavaScript");
        mentoria1.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);
//        System.out.println(mentoria2);

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