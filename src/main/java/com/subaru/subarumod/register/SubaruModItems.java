package com.subaru.subarumod.register;

import com.subaru.subarumod.item.ItemSubaruIngot;
import com.subaru.subarumod.main.Subaru;

import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Subaru.MOD_ID)
public class SubaruModItems {
	
	public static final ItemSubaruIngot SUBARU_INGOT = new ItemSubaruIngot();
	
	@Mod.EventBusSubscriber(modid = Subaru.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Register{
		
		@SubscribeEvent
		public static void registerItem(final RegistryEvent.Register<Item> event) {
			
			final Item[] items = {
				SUBARU_INGOT
			};
			event.getRegistry().registerAll(items);
			
		}
		
	}

}
