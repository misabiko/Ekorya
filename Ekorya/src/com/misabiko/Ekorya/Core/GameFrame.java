package com.misabiko.Ekorya.Core;

import javax.swing.JFrame;

import com.misabiko.Ekorya.GameScenes.Game;
import com.misabiko.Ekorya.GameScenes.GameScene;

public class GameFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	private GameScene scene = new Game(this);
	
	public static void main(String[] args) {
		new GameFrame("Ekorya");
	}
	
	public GameFrame(String name) {
		super(name);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		
		scene.init();
		scene.run();
	}
	
//	public void changeScene(GameScene scene) {
//		this.scene = scene;
//	}
}
