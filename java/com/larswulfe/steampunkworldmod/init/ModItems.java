package com.larswulfe.steampunkworldmod.init;

import java.util.ArrayList;
import java.util.List;

import com.larswulfe.steampunkworldmod.items.ItemBase;

import net.minecraft.item.Item;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item ZINC_INGOT = new ItemBase("zinc_ingot");
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item BRASS_INGOT = new ItemBase("brass_ingot");
}
