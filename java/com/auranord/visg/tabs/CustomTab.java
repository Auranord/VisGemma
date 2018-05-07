package com.auranord.visg.tabs;

import com.auranord.visg.init.BlockInit;
import com.auranord.visg.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CustomTab extends CreativeTabs {

	public CustomTab(String label) {
		super("visgemmatab");
	}
	
	public ItemStack getTabIconItem() {
		
		return new ItemStack(BlockInit.MORTAR_T1);
		
	}

}
