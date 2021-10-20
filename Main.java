import java.util.Random;


public class Main {


    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100-1)+1;
        int[] tab=new int[n];
        for(int i =0;i<=n-1;i++) {
            tab[i] = r.nextInt(1000+999)-999;
            System.out.println(tab[i]);


        }
        int par = 0;
        int parr = 0;
        for(int i = 0;i<=n-1;i++) {
            if(tab[i]%2 == 0)
                par+=1;
            if(tab[i]%2 != 0 )
                parr+=1;

        }

        int ujemne = 0;
        int dodatnie = 0;
        int zerowe = 0;
        for(int i = 0;i<=n-1;i++){
            if (tab[i]>0)
                dodatnie+=1;
            if (tab[i]==0)
                zerowe +=1;
            if (tab[i]<0)
                ujemne +=1;

        }

        int max = tab[0];
        int suma = 0;
        for(int i = 0;i<=n-1;i++) {
            if (tab[i]>=max)
                max = tab[i];

        }
        for(int i = 0;i<=n-1;i++) {
            if (tab[i] == max)
                suma+=1;
        }





        System.out.println("liczba wygenerowanych liczb: "+n);
        System.out.println("parzyste: "+par);
        System.out.println("nieparzyste :"+parr);
        System.out.println("dodatnie: "+dodatnie);
        System.out.println("ujemne : "+ujemne);
        System.out.println("zerowe: "+zerowe);
        System.out.println("max: "+max);
        System.out.println("liczba max: "+suma);
    }
}