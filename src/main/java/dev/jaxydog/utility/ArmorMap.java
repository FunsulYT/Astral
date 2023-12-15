package dev.jaxydog.utility;

import java.util.Set;
import java.util.function.BiFunction;
import dev.jaxydog.utility.register.Registerable;
import net.minecraft.item.ArmorItem.Type;

public class ArmorMap<T extends Registerable> extends RegisterableMap<Type, T> {

	public ArmorMap(String rawId, BiFunction<String, Type, T> constructor) {
		super(rawId, constructor);
	}

	@Override
	public final Set<Type> keys() {
		return Set.of(Type.values());
	}

	@Override
	public final String getRawId(Type key) {
		return String.format("%s_%s", this.getRawId(), key.getName());
	}

	@Override
	protected final int compareKeys(Type a, Type b) {
		return a.compareTo(b);
	}

}