/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Model Driven Solutions, Inc.
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/

package org.omg.sysml.expressions.functions;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.omg.sysml.expressions.ModelLevelExpressionEvaluator;
import org.omg.sysml.expressions.util.EvaluationUtil;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Type;
import utils.ExpressionUtil;

public class DotFunction extends ControlFunction {

	@Override
	public String[] getOperatorNames() {
		return new String[]{"'.'"};
	}

	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target, ModelLevelExpressionEvaluator evaluator) {
		EList<Element> list = evaluator.evaluateArgument(invocation, 0, target);			
		if (list != null) {
			Element targetFeature = ExpressionUtil.getTargetFeatureFor(invocation);
			if (targetFeature instanceof Feature) {
				Type type = target instanceof Type? (Type)target: null;
				EList<Element> result = new BasicEList<>();
				for (Element element: list) {
					if (element instanceof Feature) {
						EList<Feature> chainingFeatures = new BasicEList<>();
						chainingFeatures.add((Feature)element);
						EList<Feature> targetChainingFeatures = ((Feature) targetFeature).getChainingFeature();
						if (targetChainingFeatures.isEmpty()) {
							chainingFeatures.add((Feature)targetFeature);
						} else {
							chainingFeatures.addAll(targetChainingFeatures);
						}
						EList<Element> value = evaluator.evaluateFeatureChain(chainingFeatures, type);
						if (value != null) {
							result.addAll(value);
						}
					}
				}
				return result;
			}
		}
		return EvaluationUtil.singletonList(invocation);
	}

}
