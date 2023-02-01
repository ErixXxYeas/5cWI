package at.ran.Main.DOGS;

public abstract class Dogs implements Dog  {


    private String name;



    public Dogs(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
