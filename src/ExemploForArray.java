public class ExemploForArray {
    public static void main(String[] args) {
        
        //EM ARRAY O INDICE INICIA COM 0

        String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	for (int x=0; x < alunos.length; x++) {

		System.out.println("O aluno no indice x = " + x + " é " +  alunos [ x ]);


        //String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
	
        //Forma abreviada

	//for(String aluno : alunos) {
	  //System.out.println(alunos);

      // for (String aluno : alunos ) { System.out.println("nome do aluno é: " + aluno)}
    }
}
}
