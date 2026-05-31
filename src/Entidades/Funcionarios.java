package Entidades;

public class Funcionarios extends Pessoa {


    public Funcionarios (){
    }

    public Funcionarios(int codigo, String nome, String telefone, String cpf) {
        super(codigo, nome, telefone, cpf);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
