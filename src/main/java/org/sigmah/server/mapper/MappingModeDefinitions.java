package org.sigmah.server.mapper;

/*
 * #%L
 * Sigmah
 * %%
 * Copyright (C) 2010 - 2016 URD
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import java.util.ArrayList;

import org.sigmah.server.domain.base.Entity;
import org.sigmah.shared.dto.base.DTO;

/**
 * Contains all the available mapping modes.
 * 
 * @author Tom Miette (tmiette@ideia.fr)
 */
public class MappingModeDefinitions {

	private final ArrayList<MappingModeDefinition<?, ?>> definitions;

	public MappingModeDefinitions() {
		definitions = new ArrayList<>();
	}

	public ArrayList<MappingModeDefinition<?, ?>> getModes() {
		return definitions;
	}

	public <E extends Entity, D extends DTO> void add(MappingModeDefinition<E, D> def) {
		definitions.add(def);
	}

}
