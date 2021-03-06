/*
 * ((e)) emite: A pure Google Web Toolkit XMPP library
 * Copyright (c) 2008-2011 The Emite development team
 * 
 * This file is part of Emite.
 *
 * Emite is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 *
 * Emite is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with Emite.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.calclab.emite.core.browser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.calclab.emite.browser.AutoConfigBoot.SerializableMap;

public class SerializableMapTest {

	@Test
	public void shouldSerialize() {
		final SerializableMap original = new SerializableMap();
		original.put("name1", "value1");
		original.put("name2", "value2");
		final String serialized = original.serialize();
		final SerializableMap copy = SerializableMap.restore(serialized);
		assertEquals(original, copy);
	}
}
