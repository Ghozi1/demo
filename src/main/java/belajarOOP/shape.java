package belajarOOP;

public class shape {
    int getCorner() {
        return 0;
    }
}
class Rectangle extends shape {
    int getCorner() {
        return 4;
    }
    

    int getParentCorner() {   
        return super.getCorner();
    }
}

