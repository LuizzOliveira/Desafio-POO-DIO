import br.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso cur = new Curso();
        Curso cur2 = new Curso();
        Mentoria mentoria = new Mentoria();

        cur.setTitulo("Java");
        cur.setDescricao("Linguagem de programação orientada a objeto!");
        cur.setCargaHoraria(8);

        cur2.setTitulo("Python");
        cur2.setDescricao("Mentoria de automação");
        cur2.setCargaHoraria(4);

        Mentoria ment = new Mentoria();
        ment.setTitulo("Mentoria de Java");
        ment.setDescricao("Mentoria de Linguagem de programação orientada a objeto!");
        ment.setData(LocalDate.now());

        Mentoria ment2 = new Mentoria();
        ment2.setTitulo("Mentoria de Python");
        ment2.setDescricao("Mentoria de Linguagem de programação orientada a objeto!");
        ment2.setData(LocalDate.now());



        Conteudo conteudo = new Curso();

        /*System.out.println(cur);
        System.out.println(cur2);
        System.out.println(ment);*/

        Bootcamp boot = new Bootcamp();
        boot.setNome("Bootcamp Java Developer");
        boot.setDescricao("Descrição Bootcamp Java Developer");
        boot.getConteudos().add(cur);
        boot.getConteudos().add(ment);

        Bootcamp boot2 = new Bootcamp();
        boot2.setNome("Bootcamp Python Developer");
        boot2.setDescricao("Descrição Bootcamp Python Developer");
        boot2.getConteudos().add(cur2);
        boot2.getConteudos().add(ment2);


        Dev dev = new Dev();
        dev.setNome("Luiz");
        dev.inscreverBootcamp(boot);
        System.out.println("Conteúdos Inscritos Luiz: " + dev.getConteudoInscritos() + "\n");
        dev.progredir();
        System.out.println("Conteúdos Inscritos Luiz: " + dev.getConteudoInscritos() + "\n");
        dev.progredir();
        System.out.println("Conteúdos Concluídos Luiz: " + dev.getConteudoInscritos());
        System.out.println("Xp: " + dev.calcularTotalXp() + "\n");


        Dev dev1 = new Dev();
        dev1.setNome("Henrique");
        dev1.inscreverBootcamp(boot2);
        System.out.println("Conteúdos Inscritos Henrique: " + dev1.getConteudoInscritos() + "\n");

    }
}
