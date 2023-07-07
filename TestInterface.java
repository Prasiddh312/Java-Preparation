interface Drawable{
    void draw();

}
class Rectangles implements Drawable{
    public void draw(){
        System.out.println("Drawing Rectangles");
    }
}

class Circles implements Drawable{
    public void draw(){
        System.out.println("Drawing Cirlces");
    }
}
public class TestInterface {
    public static void main(String[] args) {
        Drawable d=new Rectangles();
        //Drawable d=new Circles ();
        d.draw();

    }
}
