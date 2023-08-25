package belajarOOP;

public class shapeApp {
    public static void main(String[] args){
    
    var shape = new shape ();
    System.out.println(shape.getCorner());

    var rectable = new Rectangle();

    System.out.println(rectable.getCorner());
    System.out.println(rectable.getParentCorner());
    }

}
