package br.com.dio.desafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev{

    private String nome;

    // Set<Conteudo> ultilizando da herança e polimorfismmo Set<Conteudo>  conteudoInscritos = new LinkedHashSet<>();

    private Set<Conteudo>  conteudoInscritos = new LinkedHashSet<>(); //salvar na memoria e com LinkedHashSet<> salva na mesma ordem

    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); // LinkedHashSet<> só permite que salva elementos unicos

    //metodos
    // quando chamar o metodo e colocar o bootcamp parametro se inscreve no bootcamp

    public void inscreverBootcamp(Bootcamp bootcamp) {

        this.conteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);

    }

    public void progredir() {

        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();

        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());
            System.out.println("Concluido: " + this.conteudosConcluidos);

        }else{
            System.out.println("Você não está matriculado em nenhum conteúdo!");
        }

    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    // por estar trabalhando com Hash LinkedHashSet<>
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscritos, dev.conteudoInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscritos, conteudosConcluidos);
    }
}
