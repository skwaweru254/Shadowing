package ke.co.skwaweru254;

public class VarShadowing {

    static int x = 38; //it is shadowed at ine 9

    public static void main(String[] args) {
        System.out.println(x);
        int x = 39;
        System.out.println(x);
        shawdowvar();


    }

    static void shawdowvar() {

        System.out.println("Variable shadowing?!");
    }


}
