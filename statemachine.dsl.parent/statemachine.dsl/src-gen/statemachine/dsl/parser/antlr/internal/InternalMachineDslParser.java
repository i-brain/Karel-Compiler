package statemachine.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import statemachine.dsl.services.MachineDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMachineDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'{'", "'}'", "'initial'", "'state'", "'++'", "';'", "'int'", "'print'", "','", "'jump'", "'event'", "'entry'", "'exit'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMachineDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMachineDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMachineDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMachineDsl.g"; }



     	private MachineDslGrammarAccess grammarAccess;

        public InternalMachineDslParser(TokenStream input, MachineDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Machine";
       	}

       	@Override
       	protected MachineDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMachine"
    // InternalMachineDsl.g:65:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // InternalMachineDsl.g:65:48: (iv_ruleMachine= ruleMachine EOF )
            // InternalMachineDsl.g:66:2: iv_ruleMachine= ruleMachine EOF
            {
             newCompositeNode(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMachine=ruleMachine();

            state._fsp--;

             current =iv_ruleMachine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalMachineDsl.g:72:1: ruleMachine returns [EObject current=null] : (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_counter_3_0= ruleCounter ) )? ( (lv_states_4_0= ruleState ) )* otherlv_5= '}' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_counter_3_0 = null;

        EObject lv_states_4_0 = null;



        	enterRule();

        try {
            // InternalMachineDsl.g:78:2: ( (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_counter_3_0= ruleCounter ) )? ( (lv_states_4_0= ruleState ) )* otherlv_5= '}' ) )
            // InternalMachineDsl.g:79:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_counter_3_0= ruleCounter ) )? ( (lv_states_4_0= ruleState ) )* otherlv_5= '}' )
            {
            // InternalMachineDsl.g:79:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_counter_3_0= ruleCounter ) )? ( (lv_states_4_0= ruleState ) )* otherlv_5= '}' )
            // InternalMachineDsl.g:80:3: otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_counter_3_0= ruleCounter ) )? ( (lv_states_4_0= ruleState ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMachineAccess().getMachineKeyword_0());
            		
            // InternalMachineDsl.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMachineDsl.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMachineDsl.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalMachineDsl.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMachineDsl.g:106:3: ( (lv_counter_3_0= ruleCounter ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMachineDsl.g:107:4: (lv_counter_3_0= ruleCounter )
                    {
                    // InternalMachineDsl.g:107:4: (lv_counter_3_0= ruleCounter )
                    // InternalMachineDsl.g:108:5: lv_counter_3_0= ruleCounter
                    {

                    					newCompositeNode(grammarAccess.getMachineAccess().getCounterCounterParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_counter_3_0=ruleCounter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMachineRule());
                    					}
                    					set(
                    						current,
                    						"counter",
                    						lv_counter_3_0,
                    						"statemachine.dsl.MachineDsl.Counter");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMachineDsl.g:125:3: ( (lv_states_4_0= ruleState ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=15)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMachineDsl.g:126:4: (lv_states_4_0= ruleState )
            	    {
            	    // InternalMachineDsl.g:126:4: (lv_states_4_0= ruleState )
            	    // InternalMachineDsl.g:127:5: lv_states_4_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getMachineAccess().getStatesStateParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_states_4_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_4_0,
            	    						"statemachine.dsl.MachineDsl.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleState"
    // InternalMachineDsl.g:152:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMachineDsl.g:152:46: (iv_ruleState= ruleState EOF )
            // InternalMachineDsl.g:153:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMachineDsl.g:159:1: ruleState returns [EObject current=null] : ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_handlers_4_0= ruleEventHandler ) )* otherlv_5= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_handlers_4_0 = null;



        	enterRule();

        try {
            // InternalMachineDsl.g:165:2: ( ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_handlers_4_0= ruleEventHandler ) )* otherlv_5= '}' ) )
            // InternalMachineDsl.g:166:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_handlers_4_0= ruleEventHandler ) )* otherlv_5= '}' )
            {
            // InternalMachineDsl.g:166:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_handlers_4_0= ruleEventHandler ) )* otherlv_5= '}' )
            // InternalMachineDsl.g:167:3: ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_handlers_4_0= ruleEventHandler ) )* otherlv_5= '}'
            {
            // InternalMachineDsl.g:167:3: ( (lv_initial_0_0= 'initial' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMachineDsl.g:168:4: (lv_initial_0_0= 'initial' )
                    {
                    // InternalMachineDsl.g:168:4: (lv_initial_0_0= 'initial' )
                    // InternalMachineDsl.g:169:5: lv_initial_0_0= 'initial'
                    {
                    lv_initial_0_0=(Token)match(input,14,FOLLOW_7); 

                    					newLeafNode(lv_initial_0_0, grammarAccess.getStateAccess().getInitialInitialKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "initial", lv_initial_0_0 != null, "initial");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalMachineDsl.g:185:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMachineDsl.g:186:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMachineDsl.g:186:4: (lv_name_2_0= RULE_ID )
            // InternalMachineDsl.g:187:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMachineDsl.g:207:3: ( (lv_handlers_4_0= ruleEventHandler ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=22 && LA4_0<=24)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMachineDsl.g:208:4: (lv_handlers_4_0= ruleEventHandler )
            	    {
            	    // InternalMachineDsl.g:208:4: (lv_handlers_4_0= ruleEventHandler )
            	    // InternalMachineDsl.g:209:5: lv_handlers_4_0= ruleEventHandler
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getHandlersEventHandlerParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_handlers_4_0=ruleEventHandler();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"handlers",
            	    						lv_handlers_4_0,
            	    						"statemachine.dsl.MachineDsl.EventHandler");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEventHandler"
    // InternalMachineDsl.g:234:1: entryRuleEventHandler returns [EObject current=null] : iv_ruleEventHandler= ruleEventHandler EOF ;
    public final EObject entryRuleEventHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventHandler = null;


        try {
            // InternalMachineDsl.g:234:53: (iv_ruleEventHandler= ruleEventHandler EOF )
            // InternalMachineDsl.g:235:2: iv_ruleEventHandler= ruleEventHandler EOF
            {
             newCompositeNode(grammarAccess.getEventHandlerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventHandler=ruleEventHandler();

            state._fsp--;

             current =iv_ruleEventHandler; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventHandler"


    // $ANTLR start "ruleEventHandler"
    // InternalMachineDsl.g:241:1: ruleEventHandler returns [EObject current=null] : ( ( ( (lv_kind_0_1= ruleNormalEventHandlerKind | lv_kind_0_2= ruleEntryEventHandlerKind | lv_kind_0_3= ruleExitEventHandlerKind ) ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleEventHandler() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_kind_0_1 = null;

        Enumerator lv_kind_0_2 = null;

        Enumerator lv_kind_0_3 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalMachineDsl.g:247:2: ( ( ( ( (lv_kind_0_1= ruleNormalEventHandlerKind | lv_kind_0_2= ruleEntryEventHandlerKind | lv_kind_0_3= ruleExitEventHandlerKind ) ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // InternalMachineDsl.g:248:2: ( ( ( (lv_kind_0_1= ruleNormalEventHandlerKind | lv_kind_0_2= ruleEntryEventHandlerKind | lv_kind_0_3= ruleExitEventHandlerKind ) ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // InternalMachineDsl.g:248:2: ( ( ( (lv_kind_0_1= ruleNormalEventHandlerKind | lv_kind_0_2= ruleEntryEventHandlerKind | lv_kind_0_3= ruleExitEventHandlerKind ) ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' )
            // InternalMachineDsl.g:249:3: ( ( (lv_kind_0_1= ruleNormalEventHandlerKind | lv_kind_0_2= ruleEntryEventHandlerKind | lv_kind_0_3= ruleExitEventHandlerKind ) ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            // InternalMachineDsl.g:249:3: ( ( (lv_kind_0_1= ruleNormalEventHandlerKind | lv_kind_0_2= ruleEntryEventHandlerKind | lv_kind_0_3= ruleExitEventHandlerKind ) ) )
            // InternalMachineDsl.g:250:4: ( (lv_kind_0_1= ruleNormalEventHandlerKind | lv_kind_0_2= ruleEntryEventHandlerKind | lv_kind_0_3= ruleExitEventHandlerKind ) )
            {
            // InternalMachineDsl.g:250:4: ( (lv_kind_0_1= ruleNormalEventHandlerKind | lv_kind_0_2= ruleEntryEventHandlerKind | lv_kind_0_3= ruleExitEventHandlerKind ) )
            // InternalMachineDsl.g:251:5: (lv_kind_0_1= ruleNormalEventHandlerKind | lv_kind_0_2= ruleEntryEventHandlerKind | lv_kind_0_3= ruleExitEventHandlerKind )
            {
            // InternalMachineDsl.g:251:5: (lv_kind_0_1= ruleNormalEventHandlerKind | lv_kind_0_2= ruleEntryEventHandlerKind | lv_kind_0_3= ruleExitEventHandlerKind )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMachineDsl.g:252:6: lv_kind_0_1= ruleNormalEventHandlerKind
                    {

                    						newCompositeNode(grammarAccess.getEventHandlerAccess().getKindNormalEventHandlerKindEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_kind_0_1=ruleNormalEventHandlerKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventHandlerRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_0_1,
                    							"statemachine.dsl.MachineDsl.NormalEventHandlerKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMachineDsl.g:268:6: lv_kind_0_2= ruleEntryEventHandlerKind
                    {

                    						newCompositeNode(grammarAccess.getEventHandlerAccess().getKindEntryEventHandlerKindEnumRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_9);
                    lv_kind_0_2=ruleEntryEventHandlerKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventHandlerRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_0_2,
                    							"statemachine.dsl.MachineDsl.EntryEventHandlerKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalMachineDsl.g:284:6: lv_kind_0_3= ruleExitEventHandlerKind
                    {

                    						newCompositeNode(grammarAccess.getEventHandlerAccess().getKindExitEventHandlerKindEnumRuleCall_0_0_2());
                    					
                    pushFollow(FOLLOW_9);
                    lv_kind_0_3=ruleExitEventHandlerKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventHandlerRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_0_3,
                    							"statemachine.dsl.MachineDsl.ExitEventHandlerKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalMachineDsl.g:302:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMachineDsl.g:303:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMachineDsl.g:303:4: (lv_name_1_0= RULE_ID )
                    // InternalMachineDsl.g:304:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getEventHandlerAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEventHandlerRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getEventHandlerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMachineDsl.g:324:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16||LA7_0==19||LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMachineDsl.g:325:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalMachineDsl.g:325:4: (lv_statements_3_0= ruleStatement )
            	    // InternalMachineDsl.g:326:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getEventHandlerAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventHandlerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"statemachine.dsl.MachineDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEventHandlerAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventHandler"


    // $ANTLR start "entryRuleStatement"
    // InternalMachineDsl.g:351:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMachineDsl.g:351:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMachineDsl.g:352:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMachineDsl.g:358:1: ruleStatement returns [EObject current=null] : (this_PrintStatement_0= rulePrintStatement | this_JumpStatement_1= ruleJumpStatement | this_PrintCounter_2= rulePrintCounter | ruleIncrementCounter ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_PrintStatement_0 = null;

        EObject this_JumpStatement_1 = null;

        EObject this_PrintCounter_2 = null;



        	enterRule();

        try {
            // InternalMachineDsl.g:364:2: ( (this_PrintStatement_0= rulePrintStatement | this_JumpStatement_1= ruleJumpStatement | this_PrintCounter_2= rulePrintCounter | ruleIncrementCounter ) )
            // InternalMachineDsl.g:365:2: (this_PrintStatement_0= rulePrintStatement | this_JumpStatement_1= ruleJumpStatement | this_PrintCounter_2= rulePrintCounter | ruleIncrementCounter )
            {
            // InternalMachineDsl.g:365:2: (this_PrintStatement_0= rulePrintStatement | this_JumpStatement_1= ruleJumpStatement | this_PrintCounter_2= rulePrintCounter | ruleIncrementCounter )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_STRING) ) {
                    int LA8_4 = input.LA(3);

                    if ( (LA8_4==17) ) {
                        alt8=1;
                    }
                    else if ( (LA8_4==20) ) {
                        alt8=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 16:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMachineDsl.g:366:3: this_PrintStatement_0= rulePrintStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPrintStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrintStatement_0=rulePrintStatement();

                    state._fsp--;


                    			current = this_PrintStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMachineDsl.g:375:3: this_JumpStatement_1= ruleJumpStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getJumpStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JumpStatement_1=ruleJumpStatement();

                    state._fsp--;


                    			current = this_JumpStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMachineDsl.g:384:3: this_PrintCounter_2= rulePrintCounter
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPrintCounterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrintCounter_2=rulePrintCounter();

                    state._fsp--;


                    			current = this_PrintCounter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMachineDsl.g:393:3: ruleIncrementCounter
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIncrementCounterParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    ruleIncrementCounter();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleIncrementCounter"
    // InternalMachineDsl.g:404:1: entryRuleIncrementCounter returns [String current=null] : iv_ruleIncrementCounter= ruleIncrementCounter EOF ;
    public final String entryRuleIncrementCounter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIncrementCounter = null;


        try {
            // InternalMachineDsl.g:404:56: (iv_ruleIncrementCounter= ruleIncrementCounter EOF )
            // InternalMachineDsl.g:405:2: iv_ruleIncrementCounter= ruleIncrementCounter EOF
            {
             newCompositeNode(grammarAccess.getIncrementCounterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIncrementCounter=ruleIncrementCounter();

            state._fsp--;

             current =iv_ruleIncrementCounter.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIncrementCounter"


    // $ANTLR start "ruleIncrementCounter"
    // InternalMachineDsl.g:411:1: ruleIncrementCounter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '++' this_ID_1= RULE_ID kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleIncrementCounter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMachineDsl.g:417:2: ( (kw= '++' this_ID_1= RULE_ID kw= ';' ) )
            // InternalMachineDsl.g:418:2: (kw= '++' this_ID_1= RULE_ID kw= ';' )
            {
            // InternalMachineDsl.g:418:2: (kw= '++' this_ID_1= RULE_ID kw= ';' )
            // InternalMachineDsl.g:419:3: kw= '++' this_ID_1= RULE_ID kw= ';'
            {
            kw=(Token)match(input,16,FOLLOW_3); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIncrementCounterAccess().getPlusSignPlusSignKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_11); 

            			current.merge(this_ID_1);
            		

            			newLeafNode(this_ID_1, grammarAccess.getIncrementCounterAccess().getIDTerminalRuleCall_1());
            		
            kw=(Token)match(input,17,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIncrementCounterAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIncrementCounter"


    // $ANTLR start "entryRuleCounter"
    // InternalMachineDsl.g:440:1: entryRuleCounter returns [EObject current=null] : iv_ruleCounter= ruleCounter EOF ;
    public final EObject entryRuleCounter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCounter = null;


        try {
            // InternalMachineDsl.g:440:48: (iv_ruleCounter= ruleCounter EOF )
            // InternalMachineDsl.g:441:2: iv_ruleCounter= ruleCounter EOF
            {
             newCompositeNode(grammarAccess.getCounterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCounter=ruleCounter();

            state._fsp--;

             current =iv_ruleCounter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCounter"


    // $ANTLR start "ruleCounter"
    // InternalMachineDsl.g:447:1: ruleCounter returns [EObject current=null] : (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleCounter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMachineDsl.g:453:2: ( (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMachineDsl.g:454:2: (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMachineDsl.g:454:2: (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalMachineDsl.g:455:3: otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCounterAccess().getIntKeyword_0());
            		
            // InternalMachineDsl.g:459:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMachineDsl.g:460:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMachineDsl.g:460:4: (lv_name_1_0= RULE_ID )
            // InternalMachineDsl.g:461:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCounterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCounterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCounterAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCounter"


    // $ANTLR start "entryRulePrintStatement"
    // InternalMachineDsl.g:485:1: entryRulePrintStatement returns [EObject current=null] : iv_rulePrintStatement= rulePrintStatement EOF ;
    public final EObject entryRulePrintStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintStatement = null;


        try {
            // InternalMachineDsl.g:485:55: (iv_rulePrintStatement= rulePrintStatement EOF )
            // InternalMachineDsl.g:486:2: iv_rulePrintStatement= rulePrintStatement EOF
            {
             newCompositeNode(grammarAccess.getPrintStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintStatement=rulePrintStatement();

            state._fsp--;

             current =iv_rulePrintStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrintStatement"


    // $ANTLR start "rulePrintStatement"
    // InternalMachineDsl.g:492:1: rulePrintStatement returns [EObject current=null] : (otherlv_0= 'print' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject rulePrintStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMachineDsl.g:498:2: ( (otherlv_0= 'print' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalMachineDsl.g:499:2: (otherlv_0= 'print' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalMachineDsl.g:499:2: (otherlv_0= 'print' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalMachineDsl.g:500:3: otherlv_0= 'print' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintStatementAccess().getPrintKeyword_0());
            		
            // InternalMachineDsl.g:504:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalMachineDsl.g:505:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalMachineDsl.g:505:4: (lv_text_1_0= RULE_STRING )
            // InternalMachineDsl.g:506:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_text_1_0, grammarAccess.getPrintStatementAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrintStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPrintStatementAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrintStatement"


    // $ANTLR start "entryRulePrintCounter"
    // InternalMachineDsl.g:530:1: entryRulePrintCounter returns [EObject current=null] : iv_rulePrintCounter= rulePrintCounter EOF ;
    public final EObject entryRulePrintCounter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintCounter = null;


        try {
            // InternalMachineDsl.g:530:53: (iv_rulePrintCounter= rulePrintCounter EOF )
            // InternalMachineDsl.g:531:2: iv_rulePrintCounter= rulePrintCounter EOF
            {
             newCompositeNode(grammarAccess.getPrintCounterRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintCounter=rulePrintCounter();

            state._fsp--;

             current =iv_rulePrintCounter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrintCounter"


    // $ANTLR start "rulePrintCounter"
    // InternalMachineDsl.g:537:1: rulePrintCounter returns [EObject current=null] : (otherlv_0= 'print' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_text2_5_0= RULE_STRING ) ) otherlv_6= ';' ) ;
    public final EObject rulePrintCounter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        Token lv_text2_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMachineDsl.g:543:2: ( (otherlv_0= 'print' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_text2_5_0= RULE_STRING ) ) otherlv_6= ';' ) )
            // InternalMachineDsl.g:544:2: (otherlv_0= 'print' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_text2_5_0= RULE_STRING ) ) otherlv_6= ';' )
            {
            // InternalMachineDsl.g:544:2: (otherlv_0= 'print' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_text2_5_0= RULE_STRING ) ) otherlv_6= ';' )
            // InternalMachineDsl.g:545:3: otherlv_0= 'print' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_text2_5_0= RULE_STRING ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintCounterAccess().getPrintKeyword_0());
            		
            // InternalMachineDsl.g:549:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalMachineDsl.g:550:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalMachineDsl.g:550:4: (lv_text_1_0= RULE_STRING )
            // InternalMachineDsl.g:551:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_text_1_0, grammarAccess.getPrintCounterAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrintCounterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPrintCounterAccess().getCommaKeyword_2());
            		
            // InternalMachineDsl.g:571:3: ( (lv_value_3_0= RULE_ID ) )
            // InternalMachineDsl.g:572:4: (lv_value_3_0= RULE_ID )
            {
            // InternalMachineDsl.g:572:4: (lv_value_3_0= RULE_ID )
            // InternalMachineDsl.g:573:5: lv_value_3_0= RULE_ID
            {
            lv_value_3_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_value_3_0, grammarAccess.getPrintCounterAccess().getValueIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrintCounterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getPrintCounterAccess().getCommaKeyword_4());
            		
            // InternalMachineDsl.g:593:3: ( (lv_text2_5_0= RULE_STRING ) )
            // InternalMachineDsl.g:594:4: (lv_text2_5_0= RULE_STRING )
            {
            // InternalMachineDsl.g:594:4: (lv_text2_5_0= RULE_STRING )
            // InternalMachineDsl.g:595:5: lv_text2_5_0= RULE_STRING
            {
            lv_text2_5_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_text2_5_0, grammarAccess.getPrintCounterAccess().getText2STRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrintCounterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text2",
            						lv_text2_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPrintCounterAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrintCounter"


    // $ANTLR start "entryRuleJumpStatement"
    // InternalMachineDsl.g:619:1: entryRuleJumpStatement returns [EObject current=null] : iv_ruleJumpStatement= ruleJumpStatement EOF ;
    public final EObject entryRuleJumpStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJumpStatement = null;


        try {
            // InternalMachineDsl.g:619:54: (iv_ruleJumpStatement= ruleJumpStatement EOF )
            // InternalMachineDsl.g:620:2: iv_ruleJumpStatement= ruleJumpStatement EOF
            {
             newCompositeNode(grammarAccess.getJumpStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJumpStatement=ruleJumpStatement();

            state._fsp--;

             current =iv_ruleJumpStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJumpStatement"


    // $ANTLR start "ruleJumpStatement"
    // InternalMachineDsl.g:626:1: ruleJumpStatement returns [EObject current=null] : (otherlv_0= 'jump' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleJumpStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMachineDsl.g:632:2: ( (otherlv_0= 'jump' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMachineDsl.g:633:2: (otherlv_0= 'jump' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMachineDsl.g:633:2: (otherlv_0= 'jump' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // InternalMachineDsl.g:634:3: otherlv_0= 'jump' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJumpStatementAccess().getJumpKeyword_0());
            		
            // InternalMachineDsl.g:638:3: ( (otherlv_1= RULE_ID ) )
            // InternalMachineDsl.g:639:4: (otherlv_1= RULE_ID )
            {
            // InternalMachineDsl.g:639:4: (otherlv_1= RULE_ID )
            // InternalMachineDsl.g:640:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJumpStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_1, grammarAccess.getJumpStatementAccess().getTargetStateCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getJumpStatementAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJumpStatement"


    // $ANTLR start "ruleNormalEventHandlerKind"
    // InternalMachineDsl.g:659:1: ruleNormalEventHandlerKind returns [Enumerator current=null] : (enumLiteral_0= 'event' ) ;
    public final Enumerator ruleNormalEventHandlerKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMachineDsl.g:665:2: ( (enumLiteral_0= 'event' ) )
            // InternalMachineDsl.g:666:2: (enumLiteral_0= 'event' )
            {
            // InternalMachineDsl.g:666:2: (enumLiteral_0= 'event' )
            // InternalMachineDsl.g:667:3: enumLiteral_0= 'event'
            {
            enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

            			current = grammarAccess.getNormalEventHandlerKindAccess().getNORMALEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getNormalEventHandlerKindAccess().getNORMALEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNormalEventHandlerKind"


    // $ANTLR start "ruleEntryEventHandlerKind"
    // InternalMachineDsl.g:676:1: ruleEntryEventHandlerKind returns [Enumerator current=null] : (enumLiteral_0= 'entry' ) ;
    public final Enumerator ruleEntryEventHandlerKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMachineDsl.g:682:2: ( (enumLiteral_0= 'entry' ) )
            // InternalMachineDsl.g:683:2: (enumLiteral_0= 'entry' )
            {
            // InternalMachineDsl.g:683:2: (enumLiteral_0= 'entry' )
            // InternalMachineDsl.g:684:3: enumLiteral_0= 'entry'
            {
            enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

            			current = grammarAccess.getEntryEventHandlerKindAccess().getENTRYEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getEntryEventHandlerKindAccess().getENTRYEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntryEventHandlerKind"


    // $ANTLR start "ruleExitEventHandlerKind"
    // InternalMachineDsl.g:693:1: ruleExitEventHandlerKind returns [Enumerator current=null] : (enumLiteral_0= 'exit' ) ;
    public final Enumerator ruleExitEventHandlerKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMachineDsl.g:699:2: ( (enumLiteral_0= 'exit' ) )
            // InternalMachineDsl.g:700:2: (enumLiteral_0= 'exit' )
            {
            // InternalMachineDsl.g:700:2: (enumLiteral_0= 'exit' )
            // InternalMachineDsl.g:701:3: enumLiteral_0= 'exit'
            {
            enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

            			current = grammarAccess.getExitEventHandlerKindAccess().getEXITEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getExitEventHandlerKindAccess().getEXITEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExitEventHandlerKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000004E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001C02000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000292000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});

}