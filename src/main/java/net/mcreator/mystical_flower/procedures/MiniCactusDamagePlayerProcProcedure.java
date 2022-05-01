package net.mcreator.mystical_flower.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.mystical_flower.MysticalFlowerMod;

import java.util.Map;

public class MiniCactusDamagePlayerProcProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MysticalFlowerMod.LOGGER.warn("Failed to load dependency entity for procedure MiniCactusDamagePlayerProc!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
	}
}
