package com.brawl.game.json;

import java.util.ArrayList;

public class PlayerSON {
	
	private String name;
	private String portraitPath;
	
	// TODO Add special parameters of the fighter here
	
	private ArrayList<TechniqueSON> techniqueList;
	
	public PlayerSON()
	{
		this.techniqueList = new ArrayList<TechniqueSON>();
		
	}
	
	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPortraitPath() {
		return portraitPath;
	}

	public void setPortraitPath(String portraitPath) {
		this.portraitPath = portraitPath;
	}

	public ArrayList<TechniqueSON> getTechniqueList() {
		return techniqueList;
	}

	public void setTechniqueList(ArrayList<TechniqueSON> techniqueList) {
		this.techniqueList = techniqueList;
	}	
	
}
