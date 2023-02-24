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

        zofka.setLocation(740,280);
        zofka.turnLeft(90);

       nakresliPravouhlyTrojuhelnik(70);

        zofka.setLocation(90,230);
        nakresliTrojuhelnik(100);















    }
    private void nakresliTrojuhelnik(double strana){
        for (int i = 0; i < 3; i++) {
            zofka.move(strana);
            zofka.turnRight(120);
        }


    }
    private void nakresliKruh(double vysec) {
        for (int i = 0; i < 36; i++) {
            zofka.turnLeft(10);
            zofka.move(vysec);
        }

    }

    private void nakresliPravouhlyTrojuhelnik(double strana){
        double prepona = Math.sqrt(2*Math.pow(strana,2));
        zofka.move(strana);
        zofka.turnLeft(135);
        zofka.move(prepona);
        zofka.turnLeft(135);
        zofka.move(strana);
    }


    public static void main(String[] args) {
        new Tvary().start();
    }


}
