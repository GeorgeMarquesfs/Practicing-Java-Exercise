package App;


import Entities.Hospedagem;

public class Main {

    public static void main(String[] args) {

        Hospedagem h1 = new Hospedagem("George", "20-07-1999","george@hotmail.com","01-10-2022","08-10-2022",150.00);


        h1.gerarRelatorio("01-10-2022","08-10-2022");


    }
}
