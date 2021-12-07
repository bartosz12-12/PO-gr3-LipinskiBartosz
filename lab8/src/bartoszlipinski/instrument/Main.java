package bartoszlipinski.instrument;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {


        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();
        orkiestra.add(new Skrzypce("Jan", LocalDate.now()));
        orkiestra.add(new Flet("Adam", LocalDate.now()));
        orkiestra.add(new Fortepian("Adam", LocalDate.now()));
        orkiestra.add(new Skrzypce("Dorota", LocalDate.now()));
        orkiestra.add(new Skrzypce("Michal", LocalDate.now()));



        for(int i = 0; i <= orkiestra.size()-1; i++){
            orkiestra.get(i).dzwiek();

        }

    }
}