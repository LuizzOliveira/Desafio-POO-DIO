import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

public class Main {
    public static void main(String[] args){

        Curso cur = new Curso();
        Mentoria mentoria = new Mentoria();

        cur.setTitulo("Java");
        cur.setDescricao("Linguagem de programação orientada a objeto!");
        cur.setCargaHoraria(8);


        System.out.println(cur);
    }
}
