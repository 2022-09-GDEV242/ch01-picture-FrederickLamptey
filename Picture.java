/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 *The image represents a small village somwehere in the world.
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Frederick Lamptey
 * @version 2022.09.08
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Square wall2;
    private Square window2;
    private Triangle roof2;
    private Person person;
    private Person person2;
    private Circle sun;
    private boolean drawn;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();
        wall2 = new Square();
        window2 = new Square();
        roof2 = new Triangle();
        sun = new Circle();
        person = new Person();
        person2 = new Person();
        drawn = false;    
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            person.moveHorizontal(-140);
            person.moveVertical(80);
            person.makeVisible();
            
            person2.moveHorizontal(-180);
            person2.moveVertical(80);
            person2.makeVisible();
            
            wall2.moveHorizontal(-290);
            wall2.moveVertical(-1);
            wall2.changeSize(120);
            wall2.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
            
            window2.changeColor("black");
            window2.moveHorizontal(-285);
            window2.moveVertical(40);
            window2.changeSize(40);
            window2.makeVisible();
                
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
            
            roof2.changeSize(60, 180);
            roof2.moveHorizontal(-130);
            roof2.moveVertical(-60);
            roof2.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        wall2.changeColor("black");
        window2.changeColor("white");
        roof2.changeColor("black");
        person.changeColor("white");
        person2.changeColor("white");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        wall2.changeColor("blue");
        window2.changeColor("black");
        roof2.changeColor("green");
        person.changeColor("black");
        person2.changeColor("black");
        sun.changeColor("yellow");
    }
}