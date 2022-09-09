package com.garcia;


import com.badlogic.gdx.Game;

public class MyGdxGame extends Game {

	@Override
	public void create() {
		setScreen(new GameScreen());
	}
}
//MineSweeeper: 1-8 = # of bombs; 9 = bomb; 0 = no bomb
// +10 -> empty tile
//+20 -> marked tile
//+30 question tile