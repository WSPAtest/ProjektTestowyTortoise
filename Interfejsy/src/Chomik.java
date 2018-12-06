public class Chomik implements Organizm {

    String Plec;
    int iloscChomikow;

    @Override
    public void jedz() {
        System.out.println("Zjadlem ziarno");
    }

    @Override
    public void rozmnazajSie() {
        iloscChomikow = iloscChomikow*iloscChomikow;
    }
}
