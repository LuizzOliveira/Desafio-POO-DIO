import br.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criação de cursos e mentorias
        Curso cur = new Curso();
        cur.setTitulo("Java");
        cur.setDescricao("Linguagem de programação orientada a objeto!");
        cur.setCargaHoraria(8);

        Curso cur2 = new Curso();
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

        // Criação dos bootcamps
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

        // Criação do desenvolvedor Luiz
        Dev dev = new Dev();
        dev.setNome("Luiz");
        dev.inscreverBootcamp(boot);
        System.out.println("Conteúdos Inscritos Luiz: " + dev.getConteudoInscritos() + "\n");

        // Progresso do desenvolvedor Luiz
        dev.progredir();
        System.out.println("Conteúdos Inscritos Luiz: " + dev.getConteudoInscritos() + "\n");
        dev.progredir();
        System.out.println("Conteúdos Concluídos Luiz: " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp() + "\n");

        // Geração do certificado para Luiz
        if (dev.getConteudoInscritos().isEmpty()) {
            Certificado.gerarCertificado(dev, boot);
        } else {
            System.out.println("Conteúdos pendentes para conclusão do bootcamp Luiz.");
        }

        // Criação do desenvolvedor Henrique
        Dev dev1 = new Dev();
        dev1.setNome("Henrique");
        dev1.inscreverBootcamp(boot2);
        System.out.println("Conteúdos Inscritos Henrique: " + dev1.getConteudoInscritos() + "\n");

        // Simulação de progresso para Henrique
        dev1.progredir(); // Progredir um conteúdo
        dev1.progredir(); // Progredir o próximo conteúdo

        // Geração do certificado para Henrique
        if (dev1.getConteudoInscritos().isEmpty()) {
            Certificado.gerarCertificado(dev1, boot2);
        } else {
            System.out.println("Conteúdos pendentes para conclusão do bootcamp Henrique.");
        }
    }
}
