package Entities;

public class Cliente extends Pessoa {

    String email;

    public Cliente(String nome, String dataNascimento, String email) {
        super(nome, dataNascimento);
        this.email = email;
    }
}
