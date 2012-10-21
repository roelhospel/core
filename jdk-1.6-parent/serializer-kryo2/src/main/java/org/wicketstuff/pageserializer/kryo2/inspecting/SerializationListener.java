package org.wicketstuff.pageserializer.kryo2.inspecting;

import org.wicketstuff.pageserializer.kryo2.common.Interfaces;

public class SerializationListener {
	
	public static ISerializationListener listOf(ISerializationListener ... listener) {
		return Interfaces.proxyList(ISerializationListener.class, listener);
	}
}