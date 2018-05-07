package com.auranord.visg.objects.machines.worktable.slots;

import net.minecraft.inventory.Slot;

import com.auranord.visg.objects.machines.worktable.TileEntityWorkTable;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotWorkTableInput extends Slot
{
	public SlotWorkTableInput(IInventory inventory, int index, int x, int y) 
	{
		super(inventory, index, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return true; //TileEntityWorkTable.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) 
	{
		return super.getItemStackLimit(stack);
	}
}