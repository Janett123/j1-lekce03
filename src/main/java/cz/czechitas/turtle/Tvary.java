package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.Turtle;

public class Tvary {

    private Turtle zofka;


    public void start() {

        zofka = new Turtle();
        zofka.setLocation(400,180);
        zofka.turnRight(90);


        nakresliKruh(5.2336);

        zofka.setLocation(400,280);
        nakresliKruh(8.7266);


        zofka.setLocation(400,420);
        nakresliKruh(12.2173);

        zofka.setLocation(330,230);
        nakresliKruh(3.4907);

        zofka.setLocation(465,230);

        nakresliKruh(3.4907);








    }

    private void nakresliKruh(double vysec) {
        for (int i = 0; i < 36; i++) {
            zofka.turnLeft(10);
            zofka.move(vysec);
        }

    }


    public static void main(String[] args) {
        new Tvary().start();
    }


}
