/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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

import org.omg.sysml.lang.sysml.ForLoopActionUsage;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.VisibilityKind;
import utils.TypeUtil;

public class ForLoopActionUsageAdapter extends LoopActionUsageAdapter {

	public ForLoopActionUsageAdapter(ForLoopActionUsage element) {
		super(element);
	}
	
	public ForLoopActionUsage getTarget() {
		return (ForLoopActionUsage)super.getTarget();
	}
	
	public void transformLoopVariable() {
		ForLoopActionUsage target = getTarget();
		ReferenceUsage loopVariable = target.getLoopVariable();
		if (loopVariable != null) {
			Membership membership = loopVariable.getOwningMembership();
			if (membership.getVisibility() == VisibilityKind.PUBLIC) {
				membership.setVisibility(VisibilityKind.PROTECTED);
			}
			TypeUtil.addDefaultGeneralTypeTo(
					loopVariable, SysMLPackage.eINSTANCE.getRedefinition(), getDefaultSupertype("loopVariable"));
			ReferenceUsage seqParameter = TypeUtil.getOwnedParameterOf(target, 0, ReferenceUsage.class);
			if (seqParameter != null) {
				TypeUtil.addImplicitGeneralTypeTo(loopVariable, SysMLPackage.eINSTANCE.getSubsetting(), seqParameter);
			}
			TypeUtil.setIsAddImplicitGeneralTypesFor(loopVariable, false);
		}
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		transformLoopVariable();
	}

}