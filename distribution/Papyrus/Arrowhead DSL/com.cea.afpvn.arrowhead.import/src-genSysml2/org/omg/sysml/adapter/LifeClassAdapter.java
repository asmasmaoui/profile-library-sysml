/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2024 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/

package org.omg.sysml.adapter;

import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.LifeClass;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLPackage;
import utils.FeatureUtil;

public class LifeClassAdapter extends ClassAdapter {

	public LifeClassAdapter(LifeClass element) {
		super(element);
	}
	
	@Override
	public LifeClass getTarget() {
		return (LifeClass)super.getTarget();
	}
	
	// Transformation

	@Override
	public void addDefaultGeneralType() {
		super.addDefaultGeneralType();
		Namespace owner = getTarget().getOwningNamespace();
		if (owner instanceof Classifier) {
			addImplicitGeneralType(SysMLPackage.eINSTANCE.getSubclassification(), (Classifier)owner);
		}
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		FeatureUtil.addMultiplicityTo(getTarget());
	}
	
}