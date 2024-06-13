public class ResultadoEscolar {

    public static void main(String[] args) {
        //CONDICIONAL COMPOSTA/CONDICIONAL ENCADEADA

       int nota = 7;
       String nome = "Pedro";
       
       if(nota >= 7)
        System.out.println(nome + " Aprovado");

        else if (nota >= 5 && nota < 7)
        System.out.println("Prova Recueração");

       else
        System.out.println(nome + " Reprovado");

    }
}