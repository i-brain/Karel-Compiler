/*
 * generated by Xtext 2.31.0
 */
package statemachine.dsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import statemachine.dsl.ide.contentassist.antlr.internal.InternalMachineDslParser;
import statemachine.dsl.services.MachineDslGrammarAccess;

public class MachineDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MachineDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MachineDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEventHandlerAccess().getKindAlternatives_0_0(), "rule__EventHandler__KindAlternatives_0_0");
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getMachineAccess().getGroup(), "rule__Machine__Group__0");
			builder.put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
			builder.put(grammarAccess.getEventHandlerAccess().getGroup(), "rule__EventHandler__Group__0");
			builder.put(grammarAccess.getIncrementCounterAccess().getGroup(), "rule__IncrementCounter__Group__0");
			builder.put(grammarAccess.getCounterAccess().getGroup(), "rule__Counter__Group__0");
			builder.put(grammarAccess.getPrintStatementAccess().getGroup(), "rule__PrintStatement__Group__0");
			builder.put(grammarAccess.getPrintCounterAccess().getGroup(), "rule__PrintCounter__Group__0");
			builder.put(grammarAccess.getJumpStatementAccess().getGroup(), "rule__JumpStatement__Group__0");
			builder.put(grammarAccess.getMachineAccess().getNameAssignment_1(), "rule__Machine__NameAssignment_1");
			builder.put(grammarAccess.getMachineAccess().getCounterAssignment_3(), "rule__Machine__CounterAssignment_3");
			builder.put(grammarAccess.getMachineAccess().getStatesAssignment_4(), "rule__Machine__StatesAssignment_4");
			builder.put(grammarAccess.getStateAccess().getInitialAssignment_0(), "rule__State__InitialAssignment_0");
			builder.put(grammarAccess.getStateAccess().getNameAssignment_2(), "rule__State__NameAssignment_2");
			builder.put(grammarAccess.getStateAccess().getHandlersAssignment_4(), "rule__State__HandlersAssignment_4");
			builder.put(grammarAccess.getEventHandlerAccess().getKindAssignment_0(), "rule__EventHandler__KindAssignment_0");
			builder.put(grammarAccess.getEventHandlerAccess().getNameAssignment_1(), "rule__EventHandler__NameAssignment_1");
			builder.put(grammarAccess.getEventHandlerAccess().getStatementsAssignment_3(), "rule__EventHandler__StatementsAssignment_3");
			builder.put(grammarAccess.getCounterAccess().getNameAssignment_1(), "rule__Counter__NameAssignment_1");
			builder.put(grammarAccess.getPrintStatementAccess().getTextAssignment_1(), "rule__PrintStatement__TextAssignment_1");
			builder.put(grammarAccess.getPrintCounterAccess().getTextAssignment_1(), "rule__PrintCounter__TextAssignment_1");
			builder.put(grammarAccess.getPrintCounterAccess().getValueAssignment_3(), "rule__PrintCounter__ValueAssignment_3");
			builder.put(grammarAccess.getPrintCounterAccess().getText2Assignment_5(), "rule__PrintCounter__Text2Assignment_5");
			builder.put(grammarAccess.getJumpStatementAccess().getTargetAssignment_1(), "rule__JumpStatement__TargetAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MachineDslGrammarAccess grammarAccess;

	@Override
	protected InternalMachineDslParser createParser() {
		InternalMachineDslParser result = new InternalMachineDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MachineDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MachineDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
