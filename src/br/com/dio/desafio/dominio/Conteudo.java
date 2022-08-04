package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String tituo;
    private String descricao;

    public abstract double calcularXp();

    public String getTituo() {
        return tituo;
    }

    public void setTituo(String tituo) {
        this.tituo = tituo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
