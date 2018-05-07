package com.auranord.visg.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class SieveBlock extends BlockBase {

	public static final AxisAlignedBB BLOCK_AABB = new AxisAlignedBB(0.25D, 0, 0.25D, 0.75D, 0.5D, 0.75D);
	
	public SieveBlock(String name, Material material) {
		super(name, material);
	}
	
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
	{
		return BLOCK_AABB;
	}
	

}
