package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    /*
    // další instance třídy (další objekt)
    private.Turtle nela;
     */

    public void start() {

       zofka = new Turtle();

       nakresliObdelnik(100,200);

        /* ctverec(100, Color.BLUE);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.penDown();

        ctverec(200, Color.MAGENTA);

*/
        /*
        //vytvoření instance (objektu) , volání konstruktoru, new je konstruktor
        nela = new Turtle();

         //zastínění
        Turtle zofka = new Turtle();

        zofka.move(30);

        // hodnota se uloží až při volání metody
        pokracovani(7);
         */
    }

    /*public void ctverec(double delkaStrany, Color barva) {
        zofka.setPenColor(barva);

        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(90);

        }


     */


    /* private void nakresliCtverec(double delkaStrany) {

        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(90);
        }
    }

    private void nakresliBarevnyCtverec(double delkaStrany, Color barva) {
        zofka.setPenColor(barva);
        nakresliCtverec(delkaStrany);
    }

     */

    private void nakresliObdelnik(double delkaStranyA, double delkaStranyB){
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
            zofka.turnRight(90);

        }

    }


/*
     // definice nové metody
    public void pokracovani (int cislo) {
        zofka.penUp();
    }

 */

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
