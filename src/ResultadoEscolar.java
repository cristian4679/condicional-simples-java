//Condição composta

public class ResultadoEscolar {
    public static void main (String[] args){
        int nota = 10;

        /* Operadores Ternários

        public static void main(String[] args) {
        * int nota = 8;
        * String resultado = nota >=7 ? "Aprovado" :  >=5 && nota <7 ? "Recuperação" : "Reprovado
        *
        * System.out.println(resultado);*/
//condições encadeada
        if(nota >= 7)
            System.out.println("Aprovado");

        else if(nota >= 5 && nota < 7) //true ou false
            System.out.println("Prova de Recuperação");

        else
            System.out.println("Reprovado");
    }
}