package at.ran.Main.DOGS;

public class main {
    public static void main(String[] args) {
        BarkStrat bark = new Wuuf();
        Boxer b1 = new Boxer("bill", bark );
        Boxer b2 = new Boxer("sam", bark );

        b1.run();

    }
}
