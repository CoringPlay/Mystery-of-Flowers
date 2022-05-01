
package net.mcreator.mystical_flower.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcreator.mystical_flower.MysticalFlowerModElements;

@MysticalFlowerModElements.ModElement.Tag
public class MysticalFlowerBlockCreativeTabItemGroup extends MysticalFlowerModElements.ModElement {
	public MysticalFlowerBlockCreativeTabItemGroup(MysticalFlowerModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmystical_flower_block_creative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.AIR);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
