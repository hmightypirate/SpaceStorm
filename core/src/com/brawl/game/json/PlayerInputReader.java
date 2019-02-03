package com.brawl.game.json;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.SerializationException;

public class PlayerInputReader {
	
	/**
	 *  process a json file to obtain the player information
	 * 
	 * @param filepath path to the JSON file
	 * @return an object with the player information
	 */
	public static PlayerSON playerReader(String filepath)
	{
		Json json = new Json();
		
		PlayerSON playerSON = null;
		
		try
		{
			playerSON = json.fromJson(PlayerSON.class, Gdx.files.internal(filepath));	
		
		} catch(SerializationException e)
		{
			e.printStackTrace();
			
		}
		
		
		return playerSON;
	}

}
