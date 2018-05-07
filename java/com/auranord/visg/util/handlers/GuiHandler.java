package com.auranord.visg.util.handlers;


import com.auranord.visg.objects.machines.worktable.ContainerWorkTable;
import com.auranord.visg.objects.machines.worktable.GuiWorkTable;
import com.auranord.visg.objects.machines.worktable.TileEntityWorkTable;
import com.auranord.visg.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_WORK_TABLE) return new ContainerWorkTable(player.inventory, (TileEntityWorkTable)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_WORK_TABLE) return new GuiWorkTable(player.inventory, (TileEntityWorkTable)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

}