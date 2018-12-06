public class Okrag implements Figura {

    int r;

    public Okrag(int r){
        this.r = r;
    }

    @Override
    public int liczPole() {
        return (int) (pi*r*r);
    }

    @Override
    public int liczObwod() {
        return (int) (2*pi*r);
    }
}
