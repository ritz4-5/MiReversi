package com.example.mireversi.model;

import com.example.mireversi.model.Cell.E_STATUS;

public class HumanPlayer extends Player {

	public HumanPlayer(E_STATUS turn, String name, Board board){
		super(turn, name, board);
	}
	
	@Override
	public boolean isHuman() {
		return true;
	}

	@Override
	public void StartThinking(IPlayerCallback callback) {
		callback.onEndThinking(-1, -1);
	}


}
