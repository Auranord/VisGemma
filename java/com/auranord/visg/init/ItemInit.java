package com.auranord.visg.init;

import java.util.ArrayList;

import java.util.List;

import com.auranord.visg.objects.armour.ArmorBase;
import com.auranord.visg.objects.items.ItemBase;
import com.auranord.visg.objects.items.ItemSensor;
import com.auranord.visg.objects.items.ItemDust;
import com.auranord.visg.objects.tools.ToolAxe;
import com.auranord.visg.objects.tools.ToolHoe;
import com.auranord.visg.objects.tools.ToolPickaxe;
import com.auranord.visg.objects.tools.ToolShovel;
import com.auranord.visg.objects.tools.ToolSword;
import com.auranord.visg.util.Reference;

import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	//Sensor
	public static final Item SENSOR = new ItemSensor("sensor");
		
	//Dusts
	public static final Item DUST_BASE = new ItemDust("dust_base");
	public static final Item DUST_RES = new ItemDust("dust_res");
	

}
