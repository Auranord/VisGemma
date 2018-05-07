package com.auranord.visg.objects.items;

import com.auranord.visg.util.ResonanceFinder;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemSensor extends ItemBase {

	public ItemSensor(String name) {
		super(name);
		this.maxStackSize = 1;
		setContainerItem(this);
		
	}
	
	
	@Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
		if(worldIn.isRemote == true)
			return EnumActionResult.FAIL;

		player.sendMessage(new TextComponentString(
				"Resonance: " + ResonanceFinder.getResonanceBool(worldIn, player.chunkCoordX, player.chunkCoordZ) +
				" Type: " + ResonanceFinder.getResonanceType(worldIn, player.chunkCoordX, player.chunkCoordZ))
				);       
				
        return EnumActionResult.PASS;
    }
	
	

}
