public class Kot implements Organizm {

    String Plec;
    int iloscKotow;

    @Override
    public void jedz() {
        System.out.println("Zjadlem Chomika");
    }

    @Override
    public void rozmnazajSie() {
        iloscKotow = iloscKotow * 2;
    }
}
