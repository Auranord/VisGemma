package com.auranord.visg.objects.items;

import com.auranord.visg.init.ItemInit;
import com.auranord.visg.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDust extends ItemBase implements IHasModel {

	public ItemDust(String name) {
		super(name);
		this.maxStackSize = 1;
	}
	
}