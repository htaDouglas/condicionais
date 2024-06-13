public class CaixaEletronico {
    public static void main(String[] args) throws Exception {

        //CONDICIONAL SIMPLES
        double saldo = 25.0;
        double valorSolicitado = 1.0;
 
        if(valorSolicitado < saldo  )
          saldo =  saldo -  valorSolicitado;
        

         else
            System.out.println("Saldo insuficiente");
         System.out.println ( " Novo saldo " + saldo + " TRANSAÇÃO REALIZADA COM SUCESSO " );
    }
    
}
