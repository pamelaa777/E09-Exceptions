package Main;
import Cliente.*;
import Contas.*;


public class Main {
    public static boolean realTime = true; //Datas aleatorias/ficticias
    public static void main(String[] args) {

        ClientePessoaFisica junia = new ClientePessoaFisica("Junia", "Av. Antonio Carlos, 662", "010.065.376.20", 20, 'f');
        ClientePessoaFisica joao = new ClientePessoaFisica("Joao", "R. Planalto, 69", "090.957.646.43", 40, 'm');

        ClientePessoaJuridica loja1 = new ClientePessoaJuridica("Brecho", "Av. Antonio Carlos, 112", "555669864", 95, "Shipping");
        ClientePessoaJuridica loja2 = new ClientePessoaJuridica("Americanas", "Av. Fleming, 111", "555669296", 38, "Retail");

        Conta conta1 = new ContaUniversitaria(1021, joao, 565, -500, 3500);
        Conta conta2 = new ContaCorrente(1234, junia, 1000, -300, 1500); //
        conta1.setDono(loja2);
        System.out.println(conta2);

        try{
            //conta1.sacar(40);
            //Conta1.depositar(1);
    	    //conta2.transferir(conta1, 90);
            conta2.sacar(355);
    	    conta2.sacar(4000);
            //conta2.transferir(conta1, 500);
        }catch (Exception v){
            v.printStackTrace();
        }
        
	    

        //System.out.println(conta2);
        conta1.imprimirExtratoConta(1); //Depositos seguido de Saques
        conta2.imprimirExtratoConta(0); //Ordem de Data
        //conta2.imprimirExtratoTaxas();

        //System.out.println(conta2);

        /* System.out.println(ana);
        System.out.println(neuxCIA);

        int media = Operacao.getTotalOperacoes() / Conta.getTotalContas();
        System.out.println("\nMédia de operações por conta aberta: " + media);

        System.out.println("conta1 == conta2 ? " + conta1.equals(conta2));
        System.out.println("ana == vitor ? " + ana.equals(vitor));
        System.out.println("anaC == neuxCIA ? " + neuxCIA.equals(anaC));

        System.out.println("authenticator: " + neuxCIA.autenticar("555669813"));
        */
        //System.err.println(new ValorNegativoException());
    }
    
}

/* public static void delay(long millis){
    if (timeout){
        try{Thread.sleep(millis);}
        catch (InterruptedException e){Thread.currentThread().interrupt();}
    }
} */
