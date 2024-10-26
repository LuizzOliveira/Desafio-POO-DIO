package br.com.dio.desafio;

public class Certificado {

    public static void gerarCertificado(Dev dev, Bootcamp bootcamp) {
        // Título do Certificado
        System.out.println("=== Certificado de Conclusão ===\n");

        // Nome do desenvolvedor
        System.out.println("Certificamos que o(a) desenvolvedor(a) " + dev.getNome() + " concluiu o bootcamp:");

        // Nome e descrição do Bootcamp
        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Descrição: " + bootcamp.getDescricao());
        System.out.println("Data de Conclusão: " + bootcamp.getDataFinal());

        System.out.println("\n--- Conteúdos Concluídos ---");

        // Listagem dos conteúdos concluídos
        dev.getConteudosConcluidos().forEach(conteudo -> {
            System.out.println("- " + conteudo.getTitulo() + " | XP: " + conteudo.calcularXp());
        });

        // Total de XP acumulado
        System.out.println("\nTotal de XP: " + dev.calcularTotalXp());

        System.out.println("\nParabéns pela conquista!");
    }
}
