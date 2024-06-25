package com.cea.afpvn.arrowhead.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.util.UMLUtil;

import ArrowheadDSL.IDD;


public class PortRule extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Class clazz = (Class)context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if(eType == EMFEventType.NULL) {
			IDD IDD=UMLUtil.getStereotypeApplication(clazz, IDD.class); 
			if(IDD!= null) {	
				if(IDD.getPort()==0) {
					return context.createFailureStatus(clazz.getName() +" IDD Port should be set");
					 //Create warning
					
					
				}
				
			}
			
		}
		return context.createSuccessStatus();
	}
}