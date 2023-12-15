package dev.jaxydog.utility;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public interface AstralItemStack {

	public default void astral$setItem(Item item) {}

	public default ItemStack astral$copyWithItem(Item item) {
		if (((ItemStack) this).isEmpty()) {
			return ItemStack.EMPTY;
		}

		final ItemStack copy = ((ItemStack) this).copy();

		copy.astral$setItem(item);

		return copy;
	}

}