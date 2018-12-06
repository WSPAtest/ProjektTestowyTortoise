import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Figura> figury = new ArrayList<Figura>();

        figury.add(new Kwadrat(6));
        figury.add(new Prostokat(6, 5));
        figury.add(new Okrag(5));

        System.out.println(figury.get(0).liczPole());
        System.out.println(figury.get(1).liczPole());
        System.out.println(figury.get(2).liczPole());


    }

}


/*
 List<Figura> figury = new ArrayList<Figura>();

        figury.add(new Kwadrat(6));
        figury.add(new Prostokat(6, 5));
        figury.add(new Okrag(5));

        System.out.println(figury.get(0).liczPole());
        System.out.println(figury.get(1).liczPole());
        System.out.println(figury.get(2).liczPole());
 */