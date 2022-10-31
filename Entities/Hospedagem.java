package Entities;

import java.util.Scanner;


public class Hospedagem extends Cliente implements ImpostoService{

    String dataChekin;
    String dataCheckout;
    double valorDiario;

    public Hospedagem(String nome, String dataNascimento, String email, String dataChekin, String dataCheckout, double valorDiario) {
        super(nome, dataNascimento, email);
        this.dataChekin = dataChekin;
        this.dataCheckout = dataCheckout;
        this.valorDiario = valorDiario;
    }
    

    public void gerarRelatorio(String dataChekin,String dataCheckout){

        System.out.println("Olá " + this.nome + ", aqui está o seu relatório da sua hospedagem -> " +
                "você chegou no dia " + dataChekin + " e saiu no dia " + dataCheckout);
    }


    public double calcularCusto(double valorDiario){
        Scanner g1 = new Scanner(System.in);
        System.out.println("Quantos dias você passou hospedado(a)");
        int diasHosp = g1.nextInt();

        double valorTotal = valorDiario * diasHosp;
        System.out.println("O valor que você irá pagar é R$ " + valorTotal);
        return valorTotal;
    }



    @Override
    public double calcularImposto(double imposto) {
        return 0;
    }

}
