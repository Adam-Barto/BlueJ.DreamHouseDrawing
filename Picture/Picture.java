
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square s;
    private Square s1;
    private Square t;
    private Triangle t1;
    private Square wall2;
    private Square wall3;
    private Square wall4;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        s = new Square();
        s.changeColor("blue");
        s.moveVertical(-100);
        s.moveHorizontal(-100);
        s.changeSize(500);
        s.makeVisible();
        
        s = new Square();
        s.changeColor("yellow");
        s.moveVertical(140);
        s.moveHorizontal(-70);
        s.changeSize(500);
        s.makeVisible();
        
        t = new Square();
        t.changeColor("black");
        t.moveHorizontal(-47);
        t.moveVertical(137);
        t.changeSize(50);
        t.makeVisible();
        
        t1 = new Triangle();
        t1.changeColor("yellow");
        t1.moveVertical(172);
        t1.moveHorizontal(-40);
        t1.changeSize(50,100);
        t1.makeVisible();
        
        s1 = new Square();
        s1.changeColor("blue");
        s1.moveVertical(40);
        s1.moveHorizontal(-70);
        s1.changeSize(100);
        s1.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveVertical(90);
        wall.changeSize(100);
        wall.makeVisible();
        
        wall2 = new Square();
        wall2.changeColor("white");
        wall2.moveVertical(92);
        wall2.moveHorizontal(2);
        wall2.changeSize(96);
        wall2.makeVisible();
        
        wall3 = new Square();
        wall3.changeColor("black");
        //wall3.moveVertical(90);
        wall3.changeSize(100);
        wall3.makeVisible();
        
        wall4 = new Square();
        wall4.changeColor("white");
        wall4.moveVertical(2);
        wall4.moveHorizontal(2);
        wall4.changeSize(96);
        wall4.makeVisible();
        
        wall4 = new Square();
        wall4.changeColor("white");
        wall4.moveVertical(10);
        wall4.moveHorizontal(2);
        wall4.changeSize(96);
        wall4.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(35);
        window.moveVertical(140);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(35);
        window.moveVertical(160);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("black");
        roof.changeSize(30, 30);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();
        
        roof = new Triangle();
        roof.changeColor("black");
        roof.changeSize(-30, 30);
        roof.moveHorizontal(60);
        roof.moveVertical(130);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("red");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(100);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
