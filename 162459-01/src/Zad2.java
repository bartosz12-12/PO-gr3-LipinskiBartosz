import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
public class Zad2 {
    public static void main(String[] arg){
        ArrayList<String> ar = new ArrayList<>();
        ar.add("pierwszy");
        ar.add("drugi");
        ar.add("trzeci");

        HashSet<String> hset = new HashSet<String>(ar);
        TreeSet<String> tset = new TreeSet<String>(ar);

        wypiszCoDrugi(ar);
        wypiszCoDrugi(hset);
        wypiszCoDrugi(tset);

    }
    public static<T extends Iterable>void wypiszCoDrugi(T t){
        t.forEach(x -> System.out.print(x +","));
    }
}