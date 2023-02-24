package br.com.dio;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        String firstName = "Lucas";
        String lastName = "Henrique";
        String myJob = "Programming Language / Student";

        int anoAtual = 2023;
        int anoNascimento = 1999;
        int idade = anoAtual - anoNascimento;

        System.out.println("My name is" + " " + firstName + " " + lastName + ". "
                + "I have" + " " + idade + " " +
                "years old" + ", " + "my recently job is" + " "
                + myJob);

        Livro livroUm = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livroUm);
    }
}

class Livro{
    private String name;
    private Integer pages;

    public Livro(String name, Integer pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}