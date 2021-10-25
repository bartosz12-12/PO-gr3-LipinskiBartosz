import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
//        zad1
//        Random r = new Random();
//        int n = r.nextInt(100-1)+1;
//        int[] tab=new int[n];
//        for(int i =0;i<=n-1;i++) {
//            tab[i] = r.nextInt(1000+999)-999;
//            System.out.println(tab[i]);
//
//
//        }
//        int par = 0;
//        int parr = 0;
//        for(int i = 0;i<=n-1;i++) {
//            if(tab[i]%2 == 0)
//                par+=1;
//            if(tab[i]%2 != 0 )
//                parr+=1;
//
//        }
//
//        int ujemne = 0;
//        int dodatnie = 0;
//        int zerowe = 0;
//        for(int i = 0;i<=n-1;i++){
//            if (tab[i]>0)
//                dodatnie+=1;
//            if (tab[i]==0)
//                zerowe +=1;
//            if (tab[i]<0)
//                ujemne +=1;
//
//        }
//
//        int max = tab[0];
//        int suma = 0;
//        for(int i = 0;i<=n-1;i++) {
//            if (tab[i]>=max)
//                max = tab[i];
//
//        }
//        for(int i = 0;i<=n-1;i++) {
//            if (tab[i] == max)
//                suma+=1;
//        }
//        int suma1 = 0;
//        int suma2 = 0;
//        for(int i = 0;i<=n-1;i++) {
//            if(tab[i]>0)
//                suma1+=1;
//            if(tab[i]<0)
//                suma2 +=1;
//        }
//        for(int i = 0;i<=n-1;i++) {
//            if(tab[i]>0)
//                tab[i]= 1;
//            if(tab[i]<0)
//                tab[i]= 0;
//            System.out.println(tab[i]);
//        }
//        int count1 = 0;
//        int count2 = 0;
//        for(int i = 0; i<=n-1; i++) {
//            if (tab[i] > 0)
//                count1++;
//            if (tab[i] < 0) {
//                if (count1 < count2)
//                    count1 = 0;
//                else {
//                    count2 = count1;
//                    count1 = 0;
//                }
//
//            }
//        }
//
//
//
//
//        System.out.println("liczba wygenerowanych liczb: "+n);
//        System.out.println("parzyste: "+par);
//        System.out.println("nieparzyste :"+parr);
//        System.out.println("dodatnie: "+dodatnie);
//        System.out.println("ujemne : "+ujemne);
//        System.out.println("zerowe: "+zerowe);
//        System.out.println("max: "+max);
//        System.out.println("liczba max: "+suma);
//        System.out.println("dłługoć: "+ count2);

//    }
//    public  static int ileParzystych(int[] tab){
//        int ile = 0;
//        for(int i = 0; i<=tab.length-1;i++){
//            if(tab[i] %2 == 0){
//                ile++;
//            }
//        }
//        return ile;
//    }
//
//    public static int ileNieparzystych(int[] tab) {
//        int ile = 0;
//        for (int i = 0; i <= tab.length - 1; i++) {
//            if (tab[i] % 2 != 0) {
//                ile++;
//            }
//        }
//
//        return ile;
//    }
//    public static int ileDodatnich(int[] tab){
//        int ile = 0;
//        for (int i = 0; i<= tab.length-1; i++){
//            if(tab[i] > 0)
//                ile++;
//        }
//
//
//        return ile;
//    }
//    public static int ileUjemnych(int[] tab){
//        int ile = 0;
//        for(int i = 0; i <=tab.length-1;i++){
//            if(tab[i] < 0 )
//                ile++;
//        }
//        return ile;
//    }
//
//    public static int ileZer(int[] tab){
//        int ile = 0;
//        for(int i = 0; i <=tab.length-1;i++){
//            if(tab[i] == 0)
//                ile++;
//        }
//
//        return ile;
//    }
//
//    public static int ileMax(int[] tab){
//        int ile = 0;
//        int max = tab[0];
//        for(int i = 0; i<= tab.length-1; i++){
//            if(tab[i] > max){
//                max = tab[i];
//            }
//        }
//        for(int i = 0; i <=tab.length-1; i++){
//            if (tab[i] == max)
//                ile++;
//        }
//
//        return ile;
//    }
//    public static int sumaDodatnich(int[] tab){
//        int suma = 0;
//        for (int i = 0; i<=tab.length-1; i++){
//            if(tab[i] > 0){
//                suma +=tab[i];
//            }
//
//        }
//        return suma;
//    }
//    public static int sumaUjemnych(int[] tab){
//        int suma = 0;
//        for (int i = 0; i<=tab.length-1; i++){
//            if(tab[i] < 0){
//                suma +=tab[i];
//            }
//
//        }
//        return suma;
//    }
//    public static int[] signum(int[] tab){
//        int[] sgn = new int[tab.length];
//        for (int i = 0; i<=tab.length-1; i++){
//            if(tab[i] < 0)
//                sgn[i] = -1;
//            if(tab[i] > 0)
//                sgn[i] = 1;
//            if(tab[i] == 0)
//                sgn[i] = 0;
//        }
//
//        return sgn;
//    }

        //        //3
        Scanner scan = new Scanner(System.in);
        Random r = new Random();


        int m = scan.nextInt();
        while (m < 0 || m > 10) {
            m = scan.nextInt();
        }
        int n = scan.nextInt();
        while (n < 0 || n > 10) {
            n = scan.nextInt();
        }
        int k = scan.nextInt();
        while (k < 0 || k > 10) {
            k = scan.nextInt();
        }

        int[][] a = new int[m][n];
        int[][] b = new int[n][k];
        int[][] c = new int[m][k];

        //wypelnianie a[]
        for (int i = 0; i <= m - 1; i++) {
            System.out.println();
            for (int j = 0; j <= n - 1; j++) {
                a[i][j] = r.nextInt(1000 + 999) - 999;
                System.out.print("[" + a[i][j] + "]");
            }
        }
        System.out.println();
        System.out.println();
        //wypelnianie b[]
        for (int i = 0; i <= n - 1; i++) {
            System.out.println();
            for (int j = 0; j <= k - 1; j++) {
                b[i][j] = r.nextInt(1000 + 999) - 999;
                System.out.print("[" + b[i][j] + "]");
            }

        }
        //mnozenie a[]xb[]
        System.out.println("\n\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                c[i][j] = 0;

                for (int l = 0; l < n; l++) {
                    c[i][j] += a[i][l] * b[l][j];
                }
                System.out.print("[" + c[i][j] + "]");
            }
            System.out.println();
        }
    }




}
