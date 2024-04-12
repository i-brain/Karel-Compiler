/*
 * generated by Xtext 2.31.0
 */
package statemachine.dsl.validation;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;

import statemachine.model.EventHandler;
import statemachine.model.JumpStatement;
import statemachine.model.ModelPackage;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class MachineDslValidator extends AbstractMachineDslValidator {
	
//	public static final String INVALID_NAME = "invalidName";

	@Check(CheckType.NORMAL)
	public void checkGreetingStartsWithCapital(EventHandler handler) {
		var jumpCounter=0;
		for(var stmt: handler.getStatements()) {
			if(stmt instanceof JumpStatement) {
				++jumpCounter;
			}
		}
		if(jumpCounter>1) {
			error("An event handler cannot contain multiple jump statements"
					,ModelPackage.Literals.EVENT_HANDLER__KIND);
		}
	}
	
}
