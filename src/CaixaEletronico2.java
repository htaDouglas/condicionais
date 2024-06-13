public class CaixaEletronico2 {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorDepositado = 17.0;

 
        if(valorDepositado < saldo)
         saldo = saldo + valorDepositado;
 
         System.out.println(saldo);

    }
    
}
