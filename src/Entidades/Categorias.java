package Entidades;

public class Categorias {

    private int codigo;
    private String classificacao;

    public Categorias(){
        codigo = 0;
        classificacao = new String();
    }

    public Categorias(int codigo, String classificacao){
        this.codigo = codigo;
        this.classificacao = classificacao;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getClassificacao(){
        return classificacao;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setClassificacao(String classificacao){
        this.classificacao = classificacao;
    }
    
    public String toString(){
        return "Categoria [" + classificacao + "]";
    }
}
