import java.util.Scanner;
public class exoFrancois {
    public static void main(String[] args) {
        //exo1();
        //exo2();
        //exo3();
        //exo4();
        //exo5();
        //exo6();
        //exo7();
    }
    public static double demandeDouble() {
        Scanner read = new Scanner(System.in);
        return read.nextDouble();
        }
        public static int demandeInt(){
    Scanner read = new Scanner(System.in);
    return read.nextInt();
        }
        public static String demandeString(){
        Scanner read= new Scanner(System.in);
        return read.nextLine();
        }
    public static String demandeNext(){
        Scanner read= new Scanner(System.in);
        return read.next();
    }

        public static void exo1(){
            System.out.println("entrer votre nom");
            String nom=demandeString();
            System.out.println("Bienvenu" + nom );
    }
    public static void exo2(){
        System.out.println("entrer le premier numero");
        int numero1=demandeInt();
        System.out.println("entrer le deuxieme numero");
        int numero2=demandeInt();

        System.out.println("total deux numeros: "+ (numero1 + numero2));

    }
    public static void exo3(){
        System.out.println("entrer le prix facbrication: " );
        double prixF=demandeDouble();
        System.out.println("entrer le prix de vente :" );
        double prixV=demandeDouble();
        if(prixV>prixF){
            System.out.println("profit "+(prixV-prixF));
        }else{
            System.out.println("perte" + (prixF-prixV));
        }
    }
    public static void exo4(){
        System.out.println("entrer numero1: ");
        int num1= demandeInt();
        System.out.println("entrer numero2: ");
        int num2= demandeInt();
        System.out.println("entrer numero3: ");
        int num3=demandeInt();
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
    }
    public static void exo5(){
        int note=345678;
        while(note>0){
            System.out.println("entrer votre note ou tape -1 sortir de la boucle");
            note=demandeInt();
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
    }
    public static void exo6(){
        System.out.println("entrer le premier operande");
        double operande1= demandeDouble();
        System.out.println("entrer l'operateur (+,-,*,/)");
        char operator= demandeNext().charAt(0);
        System.out.println("entrer le deuxieme operande");
        double operande2=demandeDouble();
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
    }
    public static void exo7(){
        System.out.println("entrer votre numero");
        int numero = demandeInt();
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
    }
    public static void exo8(){
        System.out.println("entrer votre numero");
        int numero = demandeInt();
        String charac="";
        for(int i=1; i<=numero;i++){
            charac+="*";
            System.out.println(charac);
        }
    }
    public static void exo9(){
        System.out.println("entrer votre numero");
        int numero = demandeInt();
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
    }

    public static void exo11(){
        System.out.println("entrer un montant");
        double montant=demandeDouble();
    }



    }

