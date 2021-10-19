import java.util.Scanner;
import static java.lang.Math.*;


public class Main {
//zad1



    public static void main(String[] args) {
        
        //a
//        double wynik=0;
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        for(int i=0;i<=n-1;i++) {
//            double a = scan.nextDouble();
//            wynik += a;
//        }
//      System.out.println(wynik);
//b
//        double wynik=1;
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        for(int i=0;i<=n-1;i++) {
//            double a = scan.nextDouble();
//            wynik *= a;
//        }
//        System.out.println(wynik);

//c
//        double wynik=1;
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        for(int i=0;i<=n-1;i++) {
//            double a = scan.nextDouble();
//            wynik +=abs(a);
//        }
//        System.out.println(wynik);
//d
//        double wynik=1;
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        for(int i=0;i<=n-1;i++) {
//            double a = scan.nextDouble();
//            wynik +=sqrt(a);
//        }
//e
//        System.out.println(wynik);
        //        double wynik=1;
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        for(int i=0;i<=n-1;i++) {
//            double a = scan.nextDouble();
//            wynik +=abs(a);
//        }
//        System.out.println(wynik);

//f
//        double wynik=1;
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        for(int i=0;i<=n-1;i++) {
//            double a = scan.nextDouble();
//            wynik *=pow(a,2);
//        }
//        System.out.println(wynik);
//zad2
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double[] liczby = new double[n];

        //a
//        double wynik=0;
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        for(int i=0;i<=n-1;i++) {
//            double a = scan.nextDouble();
//            if(a%2==0)
//            wynik+=1;
//        }
//        System.out.println(wynik);

//b
//        double wynik=0;
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        for(int i=0;i<=n-1;i++) {
//            double a = scan.nextDouble();
//            if(a%3==0 && a%5!=0)
//                wynik+=1;
//        }
//        System.out.println(wynik);

//c
//        double wynik=0;
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        for(int i=0;i<=n-1;i++) {
//            double a = scan.nextDouble();
//            if(abs(a)%2==0)
//                wynik+=1;
//        }
//        System.out.println(wynik);
//
//
        int counter = 0;
//d
//        for(int i = 0; i<=liczby.length-1; i++) {
//            liczby[i] = scn.nextDouble();
//
//        }
//        for(int i = 1; i<=liczby.length-2; i++){
//            if(liczby[i] < (liczby[i-1]+liczby[i+1])/2)
//                counter++;
//        }
//          System.out.println(counter);

        //e
//        int factorial = 1;
//        for (int i = 0; i <= liczby.length - 1; i++) {
//            liczby[i] = scn.nextDouble();
//
//
//        }
//        for (int i = 1; i <= liczby.length - 1; i++) {
//            factorial *= i;
//            if (pow(2, i) <= liczby[i] && liczby[i] <= factorial)
//                counter++;
//        }
//        System.out.println(counter);

        //f
//        for(int i = 0; i<=liczby.length-1; i++){
//            liczby[i] = scn.nextDouble();
//            if(i+1%2 != 0 && liczby[i]%2==0)
//                counter++;
//       }
//        System.out.println(counter);

//        for(int i = 0; i<=liczby.length-1; i++){
//            liczby[i] = scn.nextDouble();
//            if(liczby[i] %2 !=0 && liczby[i] >=0)
//                counter++;
//        }
//        System.out.println(counter);
//        for(int i = 0; i<=liczby.length-1; i++){
//            liczby[i] = scn.nextDouble();
//            if(abs(liczby[i]) < pow(i, 2))
//                counter++;
//        }
//        System.out.println(counter);

        //2.2
//        double wynik=0;
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        for(int i=0;i<=n-1;i++) {
//            double a = scan.nextDouble();
//            if(a > 0)
//                wynik+=2*a;
//        }
//        System.out.println(wynik);
        //2.3
//        int zeros = 0, plus = 0, minus = 0;
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        for(int i=0;i<=n-1;i++) {
//            double a = scan.nextDouble();
//            if(a == 0)
//                zeros++;
//            if(a < 0)
//                minus++;
//            if(a > 0)
//                plus++;
//        }
//        System.out.println("liczb dodatnich jest:"+plus);
//        System.out.println("liczb ujemnych jest:"+minus);
//        System.out.println("zer jest:"+zeros);
//

        //2.4
//        double max, min;
//
//        for(int i = 0; i<=liczby.length-1; i++){
//            liczby[i] = scn.nextDouble();
//
//        }
//        min = liczby[0];
//        max = liczby[0];
//        for(int i = 0; i<=liczby.length-1;i++)
//                if(i > 0) {
//                    if (liczby[i] > max)
//                        max = liczby[i];
//                    if(liczby[i] < min)
//                        min = liczby[i];
//                }
//
//        System.out.println(min+ "\n" + max);

        //2.5
        

//        for(int i = 0; i<=liczby.length-1; i++){
//            liczby[i] = scn.nextDouble();
//
//        }
//        for(int i = 0; i<=liczby.length-2;i++){
//
//
//            if(liczby[i] > 0 && liczby[i+1] > 0)
//                counter++;
//        }
//
//        System.out.println(counter);


    }
}
