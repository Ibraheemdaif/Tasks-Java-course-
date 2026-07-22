public class Katryoshka {
    long eyes;
    long mouths;
    long bodies;
    long total_katryoshka = 0;

    public Katryoshka(long eyes, long mouths, long bodies) {
        setEyes(eyes);
        setMouths(mouths);
        setBodies(bodies);

    }

    public void setEyes(long eyes) {
        if (eyes >= 0) {

            this.eyes = eyes;
        }
    }

    public void setMouths(long mouths) {
        if (mouths >= 0) {

            this.mouths = mouths;
        }
    }

    public void setBodies(long bodies) {
        if (bodies >= 0) {

            this.bodies = bodies;
        }
    }

    public void calculateKatryoshka() {
        if (eyes > 0 && bodies > 0) {
            total_katryoshka += Math.min(eyes, Math.min(mouths, bodies));
            eyes -= total_katryoshka;
            bodies -= total_katryoshka;
    
            total_katryoshka += Math.min(eyes / 2, bodies);

        } else {
            total_katryoshka = 0;
        }
        System.out.println(total_katryoshka);
    }

}
