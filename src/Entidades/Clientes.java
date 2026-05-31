package Entidades;

public class Clientes extends Pessoa {

    private String email;

    //Constructors

    public Clientes(){
        email = new String();
    }

    public Clientes(int codigo, String nome, String telefone, String cpf, String email) {
        super(codigo, nome, telefone, cpf);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return super.toString() + "email (" + email + ")" + " ";
    }
}
