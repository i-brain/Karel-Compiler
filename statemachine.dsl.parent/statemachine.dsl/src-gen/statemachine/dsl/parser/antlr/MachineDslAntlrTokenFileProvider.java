/*
 * generated by Xtext 2.31.0
 */
package statemachine.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MachineDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("statemachine/dsl/parser/antlr/internal/InternalMachineDsl.tokens");
	}
}