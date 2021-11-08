import animal.*;
import ingredients.*;
import pizza.*;

public class App {
    public static void main(String[] args) throws Exception {
        /* Animal Farm  Case -------------------------------------------- */
        /**
            Disini belum menerapkan prototype design.
         */

        Chicken fChicken = new Chicken(10, 20.12);
        System.out.println(fChicken.eat());
        
        Sheep fSheep = new Sheep(10, 20.12);
        System.out.println(fSheep.eat());
        /* Animal Farm  Case -------------------------------------------- */


    
        /* Pizza Case -------------------------------------------- */
        /**
            Menerapkan decorator design
            karena Toppingable bertindak sebagai abstraksi decorator dan
            Beef, Mushroom dalah konkret decoratornya
         */
        Toppingable[] ts;
        ts = new Toppingable[2];
        ts[0] = new Mushroom();
        ts[1] = new Beef();
        
        Pizza p = new Pizza(ts, "meat loveers");

        for (int index = 0; index < ts.length; index++) {
            System.out.println(
                p.getToppings()[index].sliceIntoPieces()
            );
        }
        /* Pizza Case -------------------------------------------- */

    }
}