/*
 * generated by Xtext 2.31.0
 */
package statemachine.dsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import statemachine.dsl.services.MachineDslGrammarAccess;
import statemachine.model.Counter;
import statemachine.model.EventHandler;
import statemachine.model.JumpStatement;
import statemachine.model.Machine;
import statemachine.model.ModelPackage;
import statemachine.model.PrintCounter;
import statemachine.model.PrintStatement;
import statemachine.model.State;

@SuppressWarnings("all")
public class MachineDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MachineDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ModelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ModelPackage.COUNTER:
				sequence_Counter(context, (Counter) semanticObject); 
				return; 
			case ModelPackage.EVENT_HANDLER:
				sequence_EventHandler(context, (EventHandler) semanticObject); 
				return; 
			case ModelPackage.JUMP_STATEMENT:
				sequence_JumpStatement(context, (JumpStatement) semanticObject); 
				return; 
			case ModelPackage.MACHINE:
				sequence_Machine(context, (Machine) semanticObject); 
				return; 
			case ModelPackage.PRINT_COUNTER:
				sequence_PrintCounter(context, (PrintCounter) semanticObject); 
				return; 
			case ModelPackage.PRINT_STATEMENT:
				sequence_PrintStatement(context, (PrintStatement) semanticObject); 
				return; 
			case ModelPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Counter returns Counter
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Counter(ISerializationContext context, Counter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCounterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EventHandler returns EventHandler
	 *
	 * Constraint:
	 *     ((kind=NormalEventHandlerKind | kind=EntryEventHandlerKind | kind=ExitEventHandlerKind) name=ID? statements+=Statement*)
	 * </pre>
	 */
	protected void sequence_EventHandler(ISerializationContext context, EventHandler semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns JumpStatement
	 *     JumpStatement returns JumpStatement
	 *
	 * Constraint:
	 *     target=[State|ID]
	 * </pre>
	 */
	protected void sequence_JumpStatement(ISerializationContext context, JumpStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.JUMP_STATEMENT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.JUMP_STATEMENT__TARGET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJumpStatementAccess().getTargetStateIDTerminalRuleCall_1_0_1(), semanticObject.eGet(ModelPackage.Literals.JUMP_STATEMENT__TARGET, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Machine returns Machine
	 *
	 * Constraint:
	 *     (name=ID counter=Counter? states+=State*)
	 * </pre>
	 */
	protected void sequence_Machine(ISerializationContext context, Machine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns PrintCounter
	 *     PrintCounter returns PrintCounter
	 *
	 * Constraint:
	 *     (text=STRING value=ID text2=STRING)
	 * </pre>
	 */
	protected void sequence_PrintCounter(ISerializationContext context, PrintCounter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.PRINT_COUNTER__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.PRINT_COUNTER__TEXT));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.PRINT_COUNTER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.PRINT_COUNTER__VALUE));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.PRINT_COUNTER__TEXT2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.PRINT_COUNTER__TEXT2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrintCounterAccess().getTextSTRINGTerminalRuleCall_1_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getPrintCounterAccess().getValueIDTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getPrintCounterAccess().getText2STRINGTerminalRuleCall_5_0(), semanticObject.getText2());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns PrintStatement
	 *     PrintStatement returns PrintStatement
	 *
	 * Constraint:
	 *     text=STRING
	 * </pre>
	 */
	protected void sequence_PrintStatement(ISerializationContext context, PrintStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.PRINT_STATEMENT__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.PRINT_STATEMENT__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrintStatementAccess().getTextSTRINGTerminalRuleCall_1_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (initial?='initial'? name=ID handlers+=EventHandler*)
	 * </pre>
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
