public class Prostokat implements Figura {
    int bok_x;
    int bok_y;

    public Prostokat(int bok_x, int bok_y) {
        this.bok_x = bok_x;
        this.bok_y = bok_y;
    }

    @Override
    public int liczPole() {
        return bok_x*bok_y;
    }

    @Override
    public int liczObwod() {
        return 2*bok_x+ 2*bok_y;
    }
}
