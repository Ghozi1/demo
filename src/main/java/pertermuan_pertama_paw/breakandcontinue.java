package pertermuan_pertama_paw;

public class breakandcontinue {
    public static void main(String[] args) {
        var counter =1;
        while(true) {
            System.out.println("Perulangan Ke -" + counter);
            counter++;

            if(counter > 18){
                break;
            }
        }
    }
}
