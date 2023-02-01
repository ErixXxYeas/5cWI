package at.ran.Main.DOGS;

public class Boxer extends Dogs {

    private BarkStrat bark;

    public Boxer(String name, BarkStrat bark ) {
        super(name);
        this.bark = bark;
    }


    @Override
    public void run() {
        System.out.println("I'm a Boxer and my name " + getName()  );
        bark.Bark();
    }

}
