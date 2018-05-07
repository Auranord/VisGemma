package com.auranord.visg.init;

import java.util.ArrayList;
import java.util.List;

import com.auranord.visg.objects.blocks.BlockBase;
import com.auranord.visg.objects.blocks.MortarBlock;
import com.auranord.visg.objects.blocks.SieveBlock;
import com.auranord.visg.objects.machines.worktable.WorkTableBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	
	//Tier 1
	public static final Block SIEVE_T1 = new SieveBlock("sieve_t1", Material.WOOD);
	public static final Block MORTAR_T1 = new MortarBlock("mortar_t1", Material.ROCK);
	
	//Tier 2
	public static final Block SIEVE_T2 = new SieveBlock("sieve_t2", Material.WOOD);
	public static final Block MORTAR_T2 = new MortarBlock("mortar_t2", Material.ROCK);
	
	
	//Tier 3
	public static final Block SIEVE_T3 = new SieveBlock("sieve_t3", Material.WOOD);
	public static final Block MORTAR_T3 = new MortarBlock("mortar_t3", Material.ROCK);
	
	
	//Tier 4
	public static final Block SIEVE_T4 = new SieveBlock("sieve_t4", Material.WOOD);
	public static final Block MORTAR_T4 = new MortarBlock("mortar_t4", Material.ROCK);
	
	
	public static final Block WORK_TABLE = new WorkTableBlock("work_table");
	
	
}
