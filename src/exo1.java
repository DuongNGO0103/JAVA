import java.sql.SQLOutput;
import java.util.Scanner;
public class exo1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        /*exo1 System.out.println("input votre nom");
        String nom=read.nextLine();
        System.out.println("Bienvenue "+ nom);
        */
         /*exo 2
        System.out.println("entrer le premier numero");
        int numero1=read.nextInt();
        System.out.println("entrer le deuxieme numero");
        int numero2=read.nextInt();

        System.out.println("total deux numeros: "+ (numero1 + numero2));

    */
        /*
        exo3
        System.out.println("entrer le prix facbrication: " );
        float prixF=read.nextFloat();
        System.out.println("entrer le prix de vente :" );
        float prixV=read.nextFloat();
        if(prixV>prixF){
            System.out.println("profit "+(prixV-prixF));
        }else{
            System.out.println("perte" + (prixF-prixV));
        }

         */
        /*
        Exo4
        System.out.println("entrer numero1: ");
        int num1= read.nextInt();
        System.out.println("entrer numero2: ");
        int num2= read.nextInt();
        System.out.println("entrer numero3: ");
        int num3=read.nextInt();
        int max=0;
        if(num1>max){
            max=num1;
        }
        if (num2>max) {
            max=num2;
        }
        if(num3>max){
            max=num3;
        }
        System.out.println("max :" + max);

         */
/*
exo6

        int note=345678;
        while(note>0){
            System.out.println("entrer votre note ou tape -1 sortir de la boucle");
            note=read.nextInt();
            switch (note){
                case 0,1,2,3,4:
                    System.out.println("Catastrope");
                    break;
                case 5,6,7,8,9,10:
                    System.out.println("Insuffisant");
                    break;
                case 11,12,13,14:
                    System.out.println("Peut mieux faire");
                    break;
                case 15,16,17:
                    System.out.println("Bien");
                    break;
                case 18,19,20:
                    System.out.println("Exelent travail");
                    break;
                case -1:
                    System.out.println("Byebye");
                    break;
                default:
                    System.out.println("invalide");
            }

}
*/

        /*
        exo6
        System.out.println("entrer le premier operande");
        float operande1= read.nextFloat();
        System.out.println("entrer l'operateur (+,-,*,/)");
        char operator= read.next().charAt(0);
        System.out.println("entrer le deuxieme operande");
        float operande2=read.nextFloat();
        switch (operator){
            case'+':
                System.out.println(operande1 +"+"+operande2+"="+(operande1+operande2));
                break;
            case '-':
                System.out.println(operande1 +"-"+operande2+"="+(operande1-operande2));
                break;
            case '*':
                System.out.println(operande1 +"*"+operande2+"="+(operande1*operande2));
                break;
            case '/':
                System.out.println(operande1 +"/"+operande2+"="+(operande1/operande2));
                break;
            default:
                System.out.println("operation NO valide");
                }
                */
        /*
        System.out.println("entrer votre numero");
        int numero = read.nextInt();
        int somme=0;
        for(int i=1; i<=numero;i++){
            somme=somme+i;
            if(i==1){
                System.out.print(i);
            }else{
            System.out.print("+" +i);
        }

        }
        System.out.print("="+somme);

    */
        /*
        System.out.println("entrer votre numero");
        int numero = read.nextInt();
        String charac="";
        for(int i=1; i<=numero;i++){
            charac+="*";
            System.out.println(charac);
        }

         */
/*
        System.out.println("entrer votre numero");
        int numero = read.nextInt();
        String charac="";
        for(int i=1; i<numero;++i){
            charac+="*";
            System.out.println(charac);
        }
        for(int i=numero; i>=1;--i) {
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
            System.out.println();
            }
*/


    }
}
