package com.subaru.subarumod.main;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("subarumod")
public class Subaru {
	
	public static final String MOD_ID = "subarumod";
	public static final CreativeModeTab SUBARUMOD_TAB = new SubaruModTab();
	
	public Subaru() {
		MinecraftForge.EVENT_BUS.register(this);
	}

}