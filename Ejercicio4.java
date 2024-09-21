public class Ejercicio4 {

    public static void main(String[] args) {
        
        int manzanas = 80;
        int peras = 50;

        manzanas = manzanas + peras;
        peras = manzanas - peras;
        manzanas = manzanas - peras;

        System.out.println(Integer.toBinaryString(manzanas));
        System.out.println(Integer.toBinaryString(peras));

    }
    
}
