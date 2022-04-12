import java.util.*;


public class att18 {
    public static void main( String[] args ) {
        Scanner leia = new Scanner(System.in);
        int a, idade[]=new int[10];
        String nome[] = new String [10]; 
        double altura[] = new double [10];
        System.out.println("Digite quantas pessoas serão informadas OBS=MAX 10:");
        a=leia.nextInt();
        for(int i=0; i<a; i++){
            System.out.println("Digite seu nome");
            nome[i]=leia.next();
            System.out.println("Digite sua idade");
            idade[i]=leia.nextInt();
            System.out.println("Digite sua altura");
            altura[i]=leia.nextDouble();


        }
        int menor=0;
        double soma=0, percentual =0, media=0;
        for(int i=0; i<a; i++){
            soma= soma+altura[i];
            if(idade[i]<16){
                menor++;
                

            }


        }
        media= soma/a;
        percentual= (double)menor/a*100;
        System.out.printf("A media de altura é =%.2f %n",media);
        System.out.printf("A porcentagem de pessoas menores de 16 anos é =%.2f %n",percentual+"%");
        for(int i=0; i<a; i++){
            if(idade[i]<16){
                System.out.println(nome[i]);
            }
        }
    }

}
