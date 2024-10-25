import br.com.dio.desafio.Conteudo;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

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

        Conteudo conteudo = new Curso();

        System.out.println(cur);
        System.out.println(cur2);
        System.out.println(ment);
    }
}
