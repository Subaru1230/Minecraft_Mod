package com.subaru.subarumod.main;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class SubaruModTab extends CreativeModeTab{

	public SubaruModTab() {
		super("subarumod_tab");
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(Blocks.DIAMOND_BLOCK);
	}

}
