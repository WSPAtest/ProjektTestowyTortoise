public class Kwadrat implements Figura {
    int bok_x;


    public Kwadrat(int bok_x){
        this.bok_x = bok_x;
    }

    @Override
    public int liczPole() {
        return bok_x*bok_x;
    }

    @Override
    public int liczObwod() {
        return 4*bok_x;
    }
}
