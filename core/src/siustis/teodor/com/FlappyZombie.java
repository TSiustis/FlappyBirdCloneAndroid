package siustis.teodor.com;

import com.badlogic.gdx.Game;

import siustis.teodor.com.Helpers.AssetLoader;
import siustis.teodor.com.Screens.GameScreen;



public class FlappyZombie extends Game {

    @Override
    public void create() {
        AssetLoader.load();
        setScreen(new GameScreen());
    }

    @Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }
}
