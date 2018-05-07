package com.auranord.visg.util.handlers;


import com.auranord.visg.objects.machines.worktable.TileEntityWorkTable;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityWorkTable.class, "work_table");
	}
}