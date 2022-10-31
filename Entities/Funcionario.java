package Entities;


public class Funcionario extends Pessoa {

    int codigo;

    public Funcionario(String nome, String dataNascimento, int codigo) {
        super(nome, dataNascimento);
        this.codigo = codigo;
    }


    public void realizarCheckin(){

        System.out.println("Checkin relizado com sucesso");

    }

    public void realizarCheckout(){

        System.out.println("Checkout relizado com sucesso");

    }
}
