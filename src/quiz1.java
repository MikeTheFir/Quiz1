
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // New city and robot
        City kw = new City();
        Robot mtf = new Robot(kw, 4, 0, Direction.EAST);
        // staircase
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);
        // things
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);
        // move mtf up stairs while picking things up
            mtf.move();
            mtf.pickThing();
            mtf.turnLeft();
            mtf.move();
            mtf.turnLeft();
            mtf.turnLeft();
            mtf.turnLeft();
            mtf.move();
            mtf.pickThing();
            mtf.turnLeft();
            mtf.move();
            mtf.turnLeft();
            mtf.turnLeft();
            mtf.turnLeft();
            mtf.move();
            mtf.pickThing();
            mtf.turnLeft();
            mtf.move();
            mtf.turnLeft();
            mtf.turnLeft();
            mtf.turnLeft();
            mtf.move();
            mtf.pickThing();
            // move mtf down stairs while putting things down
            mtf.move();
            mtf.putThing();
            mtf.move();
            mtf.turnLeft();
            mtf.turnLeft();
            mtf.turnLeft();
            mtf.move();
            mtf.putThing();
            mtf.turnLeft();
            mtf.move();
            mtf.turnLeft();
            mtf.turnLeft();
            mtf.turnLeft();
            mtf.move();
            mtf.putThing();
            mtf.turnLeft();
            mtf.move();
            mtf.turnLeft();
            mtf.turnLeft();
            mtf.turnLeft();
            mtf.move();
            mtf.putThing();
            mtf.turnLeft();
            mtf.move();
    }
}
    

