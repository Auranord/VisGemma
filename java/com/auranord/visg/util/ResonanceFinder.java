package com.auranord.visg.util;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldInfo;

public class ResonanceFinder {
	
	public static boolean getResonanceBool(World worldIn, int chunkX, int chunkZ) {
		

	    long limit = Reference.WORLD_LIMIT;

	    if((chunkX > limit)||(chunkZ > limit)||(chunkX < 0-limit)||(chunkZ < 0-limit))
	    	return false;
	    
	    long x = chunkX + limit;
		long y = chunkZ + limit;
		long index;

		index = ((x+y-2)*(x+y-1))/2+x;
		
	    Random generator = new Random(worldIn.getWorldInfo().getSeed()+index);
		
	    int multiplier = 100000;
	    int result = generator.nextInt(100*multiplier);
				
	    if(result > (100-Reference.RESONANCE_PERCENT)*multiplier)
	    	return true;
				
	    return false;
				
	}
	
	
	public static String getResonanceType(World worldIn, int chunkX, int chunkZ) {
		

	    long limit = Reference.WORLD_LIMIT;

	    if((chunkX > limit)||(chunkZ > limit)||(chunkX < 0-limit)||(chunkZ < 0-limit))
	    	return "None";
	    
	    long x = chunkX + limit;
		long y = chunkZ + limit;
		long index;

		index = ((x+y-2)*(x+y-1))/2+x;
		
	    Random generator = new Random(worldIn.getWorldInfo().getSeed()+index);
		
	    int multiplier = 100000;
	    int result = generator.nextInt(100*multiplier);
	    
	    result = result % 7;
				
	    String type;
	    
	    switch (result) {
	    
        case 0:  type = "Pure";
        		 break;
        case 1:  type = "Fire";
                 break;
        case 2:  type = "Water";
                 break;
        case 3:  type = "Air";
                 break;
        case 4:  type = "Earth";
                 break;
        case 5:  type = "Life";
                 break;
        case 6:  type = "Ice";
                 break;
        default: type = "Error";
                 break;
   
	    }
	    
	    return type;
				
	}
	
	

}
