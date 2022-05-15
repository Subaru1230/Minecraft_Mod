package com.subaru.subarumod.item;

import com.subaru.subarumod.main.Subaru;

import net.minecraft.world.item.Item;

public class ItemSubaruIngot extends Item{

	public ItemSubaruIngot() {
		super(new Properties().tab(Subaru.SUBARUMOD_TAB).fireResistant());
		this.setRegistryName("subaru_ingot");
	}

}
