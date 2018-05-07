package com.auranord.visg.objects.machines.worktable;

import java.util.Map;
import java.util.Map.Entry;

import com.auranord.visg.init.BlockInit;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class WorkTableRecipes 
{	
	private static final WorkTableRecipes INSTANCE = new WorkTableRecipes();
	//private final Table<ItemStack, ItemStack, ItemStack> workingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, ItemStack> workingList = Maps.<ItemStack, ItemStack>newHashMap();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static WorkTableRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private WorkTableRecipes() 
	{
		//addSinteringRecipe(new ItemStack(BlockInit.BLOCK_COPPER), new ItemStack(BlockInit.ORE_OVERWORLD), new ItemStack(Blocks.ACACIA_FENCE), 5.0F);
		//addSinteringRecipe(new ItemStack(Blocks.ACACIA_FENCE), new ItemStack(Blocks.ACACIA_FENCE_GATE), new ItemStack(BlockInit.SINTERING_FURNACE), 5.0F);
		
		addWorkingRecipe(new ItemStack(Item.getByNameOrId("minecraft:iron_ingot")), new ItemStack(Item.getByNameOrId("minecraft:diamond")), 5.0F);
	}

	
	
	public void addWorkingRecipe(ItemStack input, ItemStack result, float experience) 
	{
		if(getWorkingResult(input) != ItemStack.EMPTY) return;
		this.workingList.put(input, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getWorkingResult(ItemStack input) 
	{
		ItemStack result = ItemStack.EMPTY;
		
		for(int i = 0; i < workingList.size(); i++)
		{
			result = workingList.get(input);
			if(this.compareItemStacks(result,ItemStack.EMPTY))
				return result;
		}

		return ItemStack.EMPTY;	
		
		/*
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.workingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input, (ItemStack)entry.getKey())) 
			{
				
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
		*/
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	/*
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.workingList;
	}
	*/
	
	public float getSinteringExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}