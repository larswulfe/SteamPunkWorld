package com.larswulfe.steampunkworldmod.init;

import java.util.ArrayList;
import java.util.List;

import com.larswulfe.steampunkworldmod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ZINC_ORE = new BlockBase("zinc_ore", Material.IRON);
	public static final Block ZINC_BLOCK = new BlockBase("zinc_block", Material.IRON);
	public static final Block COPPER_ORE = new BlockBase("copper_ore", Material.IRON);
	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON);
	public static final Block BRASS_BLOCK = new BlockBase("brass_block", Material.IRON);
	
	
}
