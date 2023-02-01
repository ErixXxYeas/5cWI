package at.ran.test;

import at.ran.test.Move.MoveHorizontal;
import at.ran.test.Move.MoveStrategy;
import at.ran.test.Move.MoveVertical;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class Main extends BasicGame {
    private List<Actor> actors;

    public Main(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        MoveStrategy right = new MoveHorizontal(200, 500, 0.09f);
        MoveStrategy right2 = new MoveHorizontal(200, 500, 0.3f);
        MoveStrategy left = new MoveHorizontal(300, 600, -0.09f);
        MoveStrategy down = new MoveVertical(400,700, 0.09f);
        MoveStrategy up = new MoveVertical(500,100, -0.09f);

        MoveStrategy[] direction = {right,left,down,up , right2};
    this.actors = new ArrayList<>();
    int x = 0;
        for (int i = 0; i < 8; i++) {
            this.actors.add(new Circle(100, right2 ));
            this.actors.add(new Rect(300,200,direction[x]));
            x++;
            if (x==4){
                x = 0;
            }
        }
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        for(Actor actor : this.actors) {
            actor.update(gameContainer, i);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
    for(Actor actor : this.actors) {
        actor.render(graphics);
    }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Main("Interface"));
            container.setDisplayMode(1000,1000,false);
            container.setVSync(true);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}