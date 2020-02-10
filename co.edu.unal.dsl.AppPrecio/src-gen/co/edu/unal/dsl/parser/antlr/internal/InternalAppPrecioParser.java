package co.edu.unal.dsl.parser.antlr.internal;

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
import co.edu.unal.dsl.services.AppPrecioGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAppPrecioParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'appPrecio'", "'{'", "'}'", "'dominio'", "'arquitectura'", "'tecnologia'", "'llave'", "':'", "'servicio'", "'metodo'", "'MetodoServicio'", "'mensaje'", "'tipoParametro'", "'tipoRetornoPromesa'", "'valor'", "'interfaz'", "'componente'", "'titulo'", "'campoEntrada'", "'contenido'", "'modelo'", "'campo'", "'boton'", "'evento'", "'botonBotonOpcionItem'", "'color'", "'lista'", "'arreglo'", "'tipo'", "'listado'", "'click'", "'number'", "'string'", "'any'", "'recondary'", "'danger'", "'primary'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAppPrecioParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAppPrecioParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAppPrecioParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAppPrecio.g"; }



     	private AppPrecioGrammarAccess grammarAccess;

        public InternalAppPrecioParser(TokenStream input, AppPrecioGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AppPrecio";
       	}

       	@Override
       	protected AppPrecioGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAppPrecio"
    // InternalAppPrecio.g:65:1: entryRuleAppPrecio returns [EObject current=null] : iv_ruleAppPrecio= ruleAppPrecio EOF ;
    public final EObject entryRuleAppPrecio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppPrecio = null;


        try {
            // InternalAppPrecio.g:65:50: (iv_ruleAppPrecio= ruleAppPrecio EOF )
            // InternalAppPrecio.g:66:2: iv_ruleAppPrecio= ruleAppPrecio EOF
            {
             newCompositeNode(grammarAccess.getAppPrecioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppPrecio=ruleAppPrecio();

            state._fsp--;

             current =iv_ruleAppPrecio; 
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
    // $ANTLR end "entryRuleAppPrecio"


    // $ANTLR start "ruleAppPrecio"
    // InternalAppPrecio.g:72:1: ruleAppPrecio returns [EObject current=null] : (otherlv_0= 'appPrecio' otherlv_1= '{' ( (lv_dominio_2_0= ruleDominio ) ) ( (lv_arquitectura_3_0= ruleArquitectura ) ) ( (lv_tecnologia_4_0= ruleTecnologia ) ) otherlv_5= '}' ) ;
    public final EObject ruleAppPrecio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_dominio_2_0 = null;

        EObject lv_arquitectura_3_0 = null;

        EObject lv_tecnologia_4_0 = null;



        	enterRule();

        try {
            // InternalAppPrecio.g:78:2: ( (otherlv_0= 'appPrecio' otherlv_1= '{' ( (lv_dominio_2_0= ruleDominio ) ) ( (lv_arquitectura_3_0= ruleArquitectura ) ) ( (lv_tecnologia_4_0= ruleTecnologia ) ) otherlv_5= '}' ) )
            // InternalAppPrecio.g:79:2: (otherlv_0= 'appPrecio' otherlv_1= '{' ( (lv_dominio_2_0= ruleDominio ) ) ( (lv_arquitectura_3_0= ruleArquitectura ) ) ( (lv_tecnologia_4_0= ruleTecnologia ) ) otherlv_5= '}' )
            {
            // InternalAppPrecio.g:79:2: (otherlv_0= 'appPrecio' otherlv_1= '{' ( (lv_dominio_2_0= ruleDominio ) ) ( (lv_arquitectura_3_0= ruleArquitectura ) ) ( (lv_tecnologia_4_0= ruleTecnologia ) ) otherlv_5= '}' )
            // InternalAppPrecio.g:80:3: otherlv_0= 'appPrecio' otherlv_1= '{' ( (lv_dominio_2_0= ruleDominio ) ) ( (lv_arquitectura_3_0= ruleArquitectura ) ) ( (lv_tecnologia_4_0= ruleTecnologia ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAppPrecioAccess().getAppPrecioKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAppPrecioAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAppPrecio.g:88:3: ( (lv_dominio_2_0= ruleDominio ) )
            // InternalAppPrecio.g:89:4: (lv_dominio_2_0= ruleDominio )
            {
            // InternalAppPrecio.g:89:4: (lv_dominio_2_0= ruleDominio )
            // InternalAppPrecio.g:90:5: lv_dominio_2_0= ruleDominio
            {

            					newCompositeNode(grammarAccess.getAppPrecioAccess().getDominioDominioParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_dominio_2_0=ruleDominio();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppPrecioRule());
            					}
            					set(
            						current,
            						"dominio",
            						lv_dominio_2_0,
            						"co.edu.unal.dsl.AppPrecio.Dominio");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAppPrecio.g:107:3: ( (lv_arquitectura_3_0= ruleArquitectura ) )
            // InternalAppPrecio.g:108:4: (lv_arquitectura_3_0= ruleArquitectura )
            {
            // InternalAppPrecio.g:108:4: (lv_arquitectura_3_0= ruleArquitectura )
            // InternalAppPrecio.g:109:5: lv_arquitectura_3_0= ruleArquitectura
            {

            					newCompositeNode(grammarAccess.getAppPrecioAccess().getArquitecturaArquitecturaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_arquitectura_3_0=ruleArquitectura();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppPrecioRule());
            					}
            					set(
            						current,
            						"arquitectura",
            						lv_arquitectura_3_0,
            						"co.edu.unal.dsl.AppPrecio.Arquitectura");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAppPrecio.g:126:3: ( (lv_tecnologia_4_0= ruleTecnologia ) )
            // InternalAppPrecio.g:127:4: (lv_tecnologia_4_0= ruleTecnologia )
            {
            // InternalAppPrecio.g:127:4: (lv_tecnologia_4_0= ruleTecnologia )
            // InternalAppPrecio.g:128:5: lv_tecnologia_4_0= ruleTecnologia
            {

            					newCompositeNode(grammarAccess.getAppPrecioAccess().getTecnologiaTecnologiaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_tecnologia_4_0=ruleTecnologia();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppPrecioRule());
            					}
            					set(
            						current,
            						"tecnologia",
            						lv_tecnologia_4_0,
            						"co.edu.unal.dsl.AppPrecio.Tecnologia");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAppPrecioAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAppPrecio"


    // $ANTLR start "entryRuleDominio"
    // InternalAppPrecio.g:153:1: entryRuleDominio returns [EObject current=null] : iv_ruleDominio= ruleDominio EOF ;
    public final EObject entryRuleDominio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDominio = null;


        try {
            // InternalAppPrecio.g:153:48: (iv_ruleDominio= ruleDominio EOF )
            // InternalAppPrecio.g:154:2: iv_ruleDominio= ruleDominio EOF
            {
             newCompositeNode(grammarAccess.getDominioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDominio=ruleDominio();

            state._fsp--;

             current =iv_ruleDominio; 
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
    // $ANTLR end "entryRuleDominio"


    // $ANTLR start "ruleDominio"
    // InternalAppPrecio.g:160:1: ruleDominio returns [EObject current=null] : ( () otherlv_1= 'dominio' otherlv_2= '{' ( (lv_servicios_3_0= ruleServicio ) )* ( (lv_entidades_4_0= ruleEntidad ) )* otherlv_5= '}' ) ;
    public final EObject ruleDominio() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_servicios_3_0 = null;

        EObject lv_entidades_4_0 = null;



        	enterRule();

        try {
            // InternalAppPrecio.g:166:2: ( ( () otherlv_1= 'dominio' otherlv_2= '{' ( (lv_servicios_3_0= ruleServicio ) )* ( (lv_entidades_4_0= ruleEntidad ) )* otherlv_5= '}' ) )
            // InternalAppPrecio.g:167:2: ( () otherlv_1= 'dominio' otherlv_2= '{' ( (lv_servicios_3_0= ruleServicio ) )* ( (lv_entidades_4_0= ruleEntidad ) )* otherlv_5= '}' )
            {
            // InternalAppPrecio.g:167:2: ( () otherlv_1= 'dominio' otherlv_2= '{' ( (lv_servicios_3_0= ruleServicio ) )* ( (lv_entidades_4_0= ruleEntidad ) )* otherlv_5= '}' )
            // InternalAppPrecio.g:168:3: () otherlv_1= 'dominio' otherlv_2= '{' ( (lv_servicios_3_0= ruleServicio ) )* ( (lv_entidades_4_0= ruleEntidad ) )* otherlv_5= '}'
            {
            // InternalAppPrecio.g:168:3: ()
            // InternalAppPrecio.g:169:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDominioAccess().getDominioAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDominioAccess().getDominioKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDominioAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAppPrecio.g:183:3: ( (lv_servicios_3_0= ruleServicio ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAppPrecio.g:184:4: (lv_servicios_3_0= ruleServicio )
            	    {
            	    // InternalAppPrecio.g:184:4: (lv_servicios_3_0= ruleServicio )
            	    // InternalAppPrecio.g:185:5: lv_servicios_3_0= ruleServicio
            	    {

            	    					newCompositeNode(grammarAccess.getDominioAccess().getServiciosServicioParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_servicios_3_0=ruleServicio();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDominioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"servicios",
            	    						lv_servicios_3_0,
            	    						"co.edu.unal.dsl.AppPrecio.Servicio");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalAppPrecio.g:202:3: ( (lv_entidades_4_0= ruleEntidad ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==26) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAppPrecio.g:203:4: (lv_entidades_4_0= ruleEntidad )
            	    {
            	    // InternalAppPrecio.g:203:4: (lv_entidades_4_0= ruleEntidad )
            	    // InternalAppPrecio.g:204:5: lv_entidades_4_0= ruleEntidad
            	    {

            	    					newCompositeNode(grammarAccess.getDominioAccess().getEntidadesEntidadParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_entidades_4_0=ruleEntidad();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDominioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entidades",
            	    						lv_entidades_4_0,
            	    						"co.edu.unal.dsl.AppPrecio.Entidad");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDominioAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDominio"


    // $ANTLR start "entryRuleArquitectura"
    // InternalAppPrecio.g:229:1: entryRuleArquitectura returns [EObject current=null] : iv_ruleArquitectura= ruleArquitectura EOF ;
    public final EObject entryRuleArquitectura() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArquitectura = null;


        try {
            // InternalAppPrecio.g:229:53: (iv_ruleArquitectura= ruleArquitectura EOF )
            // InternalAppPrecio.g:230:2: iv_ruleArquitectura= ruleArquitectura EOF
            {
             newCompositeNode(grammarAccess.getArquitecturaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArquitectura=ruleArquitectura();

            state._fsp--;

             current =iv_ruleArquitectura; 
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
    // $ANTLR end "entryRuleArquitectura"


    // $ANTLR start "ruleArquitectura"
    // InternalAppPrecio.g:236:1: ruleArquitectura returns [EObject current=null] : ( () otherlv_1= 'arquitectura' otherlv_2= '{' ( (lv_componentes_3_0= ruleComponente ) )* otherlv_4= '}' ) ;
    public final EObject ruleArquitectura() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_componentes_3_0 = null;



        	enterRule();

        try {
            // InternalAppPrecio.g:242:2: ( ( () otherlv_1= 'arquitectura' otherlv_2= '{' ( (lv_componentes_3_0= ruleComponente ) )* otherlv_4= '}' ) )
            // InternalAppPrecio.g:243:2: ( () otherlv_1= 'arquitectura' otherlv_2= '{' ( (lv_componentes_3_0= ruleComponente ) )* otherlv_4= '}' )
            {
            // InternalAppPrecio.g:243:2: ( () otherlv_1= 'arquitectura' otherlv_2= '{' ( (lv_componentes_3_0= ruleComponente ) )* otherlv_4= '}' )
            // InternalAppPrecio.g:244:3: () otherlv_1= 'arquitectura' otherlv_2= '{' ( (lv_componentes_3_0= ruleComponente ) )* otherlv_4= '}'
            {
            // InternalAppPrecio.g:244:3: ()
            // InternalAppPrecio.g:245:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArquitecturaAccess().getArquitecturaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getArquitecturaAccess().getArquitecturaKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getArquitecturaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAppPrecio.g:259:3: ( (lv_componentes_3_0= ruleComponente ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAppPrecio.g:260:4: (lv_componentes_3_0= ruleComponente )
            	    {
            	    // InternalAppPrecio.g:260:4: (lv_componentes_3_0= ruleComponente )
            	    // InternalAppPrecio.g:261:5: lv_componentes_3_0= ruleComponente
            	    {

            	    					newCompositeNode(grammarAccess.getArquitecturaAccess().getComponentesComponenteParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_componentes_3_0=ruleComponente();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArquitecturaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"componentes",
            	    						lv_componentes_3_0,
            	    						"co.edu.unal.dsl.AppPrecio.Componente");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArquitecturaAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleArquitectura"


    // $ANTLR start "entryRuleTecnologia"
    // InternalAppPrecio.g:286:1: entryRuleTecnologia returns [EObject current=null] : iv_ruleTecnologia= ruleTecnologia EOF ;
    public final EObject entryRuleTecnologia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTecnologia = null;


        try {
            // InternalAppPrecio.g:286:51: (iv_ruleTecnologia= ruleTecnologia EOF )
            // InternalAppPrecio.g:287:2: iv_ruleTecnologia= ruleTecnologia EOF
            {
             newCompositeNode(grammarAccess.getTecnologiaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTecnologia=ruleTecnologia();

            state._fsp--;

             current =iv_ruleTecnologia; 
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
    // $ANTLR end "entryRuleTecnologia"


    // $ANTLR start "ruleTecnologia"
    // InternalAppPrecio.g:293:1: ruleTecnologia returns [EObject current=null] : (otherlv_0= 'tecnologia' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'llave' otherlv_4= ':' ( (lv_llave_5_0= ruleLLave ) ) ( (lv_metodos_6_0= ruleMetodoTecnologia ) )* otherlv_7= '}' ) ;
    public final EObject ruleTecnologia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_llave_5_0 = null;

        EObject lv_metodos_6_0 = null;



        	enterRule();

        try {
            // InternalAppPrecio.g:299:2: ( (otherlv_0= 'tecnologia' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'llave' otherlv_4= ':' ( (lv_llave_5_0= ruleLLave ) ) ( (lv_metodos_6_0= ruleMetodoTecnologia ) )* otherlv_7= '}' ) )
            // InternalAppPrecio.g:300:2: (otherlv_0= 'tecnologia' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'llave' otherlv_4= ':' ( (lv_llave_5_0= ruleLLave ) ) ( (lv_metodos_6_0= ruleMetodoTecnologia ) )* otherlv_7= '}' )
            {
            // InternalAppPrecio.g:300:2: (otherlv_0= 'tecnologia' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'llave' otherlv_4= ':' ( (lv_llave_5_0= ruleLLave ) ) ( (lv_metodos_6_0= ruleMetodoTecnologia ) )* otherlv_7= '}' )
            // InternalAppPrecio.g:301:3: otherlv_0= 'tecnologia' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'llave' otherlv_4= ':' ( (lv_llave_5_0= ruleLLave ) ) ( (lv_metodos_6_0= ruleMetodoTecnologia ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTecnologiaAccess().getTecnologiaKeyword_0());
            		
            // InternalAppPrecio.g:305:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAppPrecio.g:306:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAppPrecio.g:306:4: (lv_name_1_0= RULE_ID )
            // InternalAppPrecio.g:307:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTecnologiaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTecnologiaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getTecnologiaAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getTecnologiaAccess().getLlaveKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getTecnologiaAccess().getColonKeyword_4());
            		
            // InternalAppPrecio.g:335:3: ( (lv_llave_5_0= ruleLLave ) )
            // InternalAppPrecio.g:336:4: (lv_llave_5_0= ruleLLave )
            {
            // InternalAppPrecio.g:336:4: (lv_llave_5_0= ruleLLave )
            // InternalAppPrecio.g:337:5: lv_llave_5_0= ruleLLave
            {

            					newCompositeNode(grammarAccess.getTecnologiaAccess().getLlaveLLaveParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_llave_5_0=ruleLLave();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTecnologiaRule());
            					}
            					set(
            						current,
            						"llave",
            						lv_llave_5_0,
            						"co.edu.unal.dsl.AppPrecio.LLave");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAppPrecio.g:354:3: ( (lv_metodos_6_0= ruleMetodoTecnologia ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAppPrecio.g:355:4: (lv_metodos_6_0= ruleMetodoTecnologia )
            	    {
            	    // InternalAppPrecio.g:355:4: (lv_metodos_6_0= ruleMetodoTecnologia )
            	    // InternalAppPrecio.g:356:5: lv_metodos_6_0= ruleMetodoTecnologia
            	    {

            	    					newCompositeNode(grammarAccess.getTecnologiaAccess().getMetodosMetodoTecnologiaParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_metodos_6_0=ruleMetodoTecnologia();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTecnologiaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"metodos",
            	    						lv_metodos_6_0,
            	    						"co.edu.unal.dsl.AppPrecio.MetodoTecnologia");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTecnologiaAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTecnologia"


    // $ANTLR start "entryRuleServicio"
    // InternalAppPrecio.g:381:1: entryRuleServicio returns [EObject current=null] : iv_ruleServicio= ruleServicio EOF ;
    public final EObject entryRuleServicio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServicio = null;


        try {
            // InternalAppPrecio.g:381:49: (iv_ruleServicio= ruleServicio EOF )
            // InternalAppPrecio.g:382:2: iv_ruleServicio= ruleServicio EOF
            {
             newCompositeNode(grammarAccess.getServicioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServicio=ruleServicio();

            state._fsp--;

             current =iv_ruleServicio; 
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
    // $ANTLR end "entryRuleServicio"


    // $ANTLR start "ruleServicio"
    // InternalAppPrecio.g:388:1: ruleServicio returns [EObject current=null] : (otherlv_0= 'servicio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_metodos_3_0= ruleMetodoServicio ) )* otherlv_4= '}' ) ;
    public final EObject ruleServicio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_metodos_3_0 = null;



        	enterRule();

        try {
            // InternalAppPrecio.g:394:2: ( (otherlv_0= 'servicio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_metodos_3_0= ruleMetodoServicio ) )* otherlv_4= '}' ) )
            // InternalAppPrecio.g:395:2: (otherlv_0= 'servicio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_metodos_3_0= ruleMetodoServicio ) )* otherlv_4= '}' )
            {
            // InternalAppPrecio.g:395:2: (otherlv_0= 'servicio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_metodos_3_0= ruleMetodoServicio ) )* otherlv_4= '}' )
            // InternalAppPrecio.g:396:3: otherlv_0= 'servicio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_metodos_3_0= ruleMetodoServicio ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getServicioAccess().getServicioKeyword_0());
            		
            // InternalAppPrecio.g:400:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAppPrecio.g:401:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAppPrecio.g:401:4: (lv_name_1_0= RULE_ID )
            // InternalAppPrecio.g:402:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServicioAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServicioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getServicioAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAppPrecio.g:422:3: ( (lv_metodos_3_0= ruleMetodoServicio ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAppPrecio.g:423:4: (lv_metodos_3_0= ruleMetodoServicio )
            	    {
            	    // InternalAppPrecio.g:423:4: (lv_metodos_3_0= ruleMetodoServicio )
            	    // InternalAppPrecio.g:424:5: lv_metodos_3_0= ruleMetodoServicio
            	    {

            	    					newCompositeNode(grammarAccess.getServicioAccess().getMetodosMetodoServicioParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_metodos_3_0=ruleMetodoServicio();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServicioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"metodos",
            	    						lv_metodos_3_0,
            	    						"co.edu.unal.dsl.AppPrecio.MetodoServicio");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getServicioAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleServicio"


    // $ANTLR start "entryRuleMetodoComponente"
    // InternalAppPrecio.g:449:1: entryRuleMetodoComponente returns [EObject current=null] : iv_ruleMetodoComponente= ruleMetodoComponente EOF ;
    public final EObject entryRuleMetodoComponente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetodoComponente = null;


        try {
            // InternalAppPrecio.g:449:57: (iv_ruleMetodoComponente= ruleMetodoComponente EOF )
            // InternalAppPrecio.g:450:2: iv_ruleMetodoComponente= ruleMetodoComponente EOF
            {
             newCompositeNode(grammarAccess.getMetodoComponenteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetodoComponente=ruleMetodoComponente();

            state._fsp--;

             current =iv_ruleMetodoComponente; 
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
    // $ANTLR end "entryRuleMetodoComponente"


    // $ANTLR start "ruleMetodoComponente"
    // InternalAppPrecio.g:456:1: ruleMetodoComponente returns [EObject current=null] : (otherlv_0= 'metodo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'MetodoServicio' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'mensaje' otherlv_7= ':' ( (lv_mensaje_8_0= RULE_STRING ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleMetodoComponente() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_mensaje_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalAppPrecio.g:462:2: ( (otherlv_0= 'metodo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'MetodoServicio' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'mensaje' otherlv_7= ':' ( (lv_mensaje_8_0= RULE_STRING ) ) )? otherlv_9= '}' ) )
            // InternalAppPrecio.g:463:2: (otherlv_0= 'metodo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'MetodoServicio' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'mensaje' otherlv_7= ':' ( (lv_mensaje_8_0= RULE_STRING ) ) )? otherlv_9= '}' )
            {
            // InternalAppPrecio.g:463:2: (otherlv_0= 'metodo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'MetodoServicio' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'mensaje' otherlv_7= ':' ( (lv_mensaje_8_0= RULE_STRING ) ) )? otherlv_9= '}' )
            // InternalAppPrecio.g:464:3: otherlv_0= 'metodo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'MetodoServicio' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'mensaje' otherlv_7= ':' ( (lv_mensaje_8_0= RULE_STRING ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getMetodoComponenteAccess().getMetodoKeyword_0());
            		
            // InternalAppPrecio.g:468:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAppPrecio.g:469:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAppPrecio.g:469:4: (lv_name_1_0= RULE_ID )
            // InternalAppPrecio.g:470:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMetodoComponenteAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetodoComponenteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getMetodoComponenteAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAppPrecio.g:490:3: (otherlv_3= 'MetodoServicio' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAppPrecio.g:491:4: otherlv_3= 'MetodoServicio' otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getMetodoComponenteAccess().getMetodoServicioKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getMetodoComponenteAccess().getColonKeyword_3_1());
                    			
                    // InternalAppPrecio.g:499:4: ( (otherlv_5= RULE_ID ) )
                    // InternalAppPrecio.g:500:5: (otherlv_5= RULE_ID )
                    {
                    // InternalAppPrecio.g:500:5: (otherlv_5= RULE_ID )
                    // InternalAppPrecio.g:501:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMetodoComponenteRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_5, grammarAccess.getMetodoComponenteAccess().getMetodoServicioMetodoServicioCrossReference_3_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAppPrecio.g:513:3: (otherlv_6= 'mensaje' otherlv_7= ':' ( (lv_mensaje_8_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAppPrecio.g:514:4: otherlv_6= 'mensaje' otherlv_7= ':' ( (lv_mensaje_8_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getMetodoComponenteAccess().getMensajeKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getMetodoComponenteAccess().getColonKeyword_4_1());
                    			
                    // InternalAppPrecio.g:522:4: ( (lv_mensaje_8_0= RULE_STRING ) )
                    // InternalAppPrecio.g:523:5: (lv_mensaje_8_0= RULE_STRING )
                    {
                    // InternalAppPrecio.g:523:5: (lv_mensaje_8_0= RULE_STRING )
                    // InternalAppPrecio.g:524:6: lv_mensaje_8_0= RULE_STRING
                    {
                    lv_mensaje_8_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_mensaje_8_0, grammarAccess.getMetodoComponenteAccess().getMensajeSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMetodoComponenteRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"mensaje",
                    							lv_mensaje_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMetodoComponenteAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMetodoComponente"


    // $ANTLR start "entryRuleMetodoServicio"
    // InternalAppPrecio.g:549:1: entryRuleMetodoServicio returns [EObject current=null] : iv_ruleMetodoServicio= ruleMetodoServicio EOF ;
    public final EObject entryRuleMetodoServicio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetodoServicio = null;


        try {
            // InternalAppPrecio.g:549:55: (iv_ruleMetodoServicio= ruleMetodoServicio EOF )
            // InternalAppPrecio.g:550:2: iv_ruleMetodoServicio= ruleMetodoServicio EOF
            {
             newCompositeNode(grammarAccess.getMetodoServicioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetodoServicio=ruleMetodoServicio();

            state._fsp--;

             current =iv_ruleMetodoServicio; 
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
    // $ANTLR end "entryRuleMetodoServicio"


    // $ANTLR start "ruleMetodoServicio"
    // InternalAppPrecio.g:556:1: ruleMetodoServicio returns [EObject current=null] : (otherlv_0= 'metodo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'tipoParametro' otherlv_4= ':' ( (lv_tipoParametro_5_0= ruleTipos ) ) )? (otherlv_6= 'tipoRetornoPromesa' otherlv_7= ':' ( (lv_tipoRetorno_8_0= ruleTipos ) ) ) otherlv_9= '}' ) ;
    public final EObject ruleMetodoServicio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_tipoParametro_5_0 = null;

        EObject lv_tipoRetorno_8_0 = null;



        	enterRule();

        try {
            // InternalAppPrecio.g:562:2: ( (otherlv_0= 'metodo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'tipoParametro' otherlv_4= ':' ( (lv_tipoParametro_5_0= ruleTipos ) ) )? (otherlv_6= 'tipoRetornoPromesa' otherlv_7= ':' ( (lv_tipoRetorno_8_0= ruleTipos ) ) ) otherlv_9= '}' ) )
            // InternalAppPrecio.g:563:2: (otherlv_0= 'metodo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'tipoParametro' otherlv_4= ':' ( (lv_tipoParametro_5_0= ruleTipos ) ) )? (otherlv_6= 'tipoRetornoPromesa' otherlv_7= ':' ( (lv_tipoRetorno_8_0= ruleTipos ) ) ) otherlv_9= '}' )
            {
            // InternalAppPrecio.g:563:2: (otherlv_0= 'metodo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'tipoParametro' otherlv_4= ':' ( (lv_tipoParametro_5_0= ruleTipos ) ) )? (otherlv_6= 'tipoRetornoPromesa' otherlv_7= ':' ( (lv_tipoRetorno_8_0= ruleTipos ) ) ) otherlv_9= '}' )
            // InternalAppPrecio.g:564:3: otherlv_0= 'metodo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'tipoParametro' otherlv_4= ':' ( (lv_tipoParametro_5_0= ruleTipos ) ) )? (otherlv_6= 'tipoRetornoPromesa' otherlv_7= ':' ( (lv_tipoRetorno_8_0= ruleTipos ) ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getMetodoServicioAccess().getMetodoKeyword_0());
            		
            // InternalAppPrecio.g:568:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAppPrecio.g:569:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAppPrecio.g:569:4: (lv_name_1_0= RULE_ID )
            // InternalAppPrecio.g:570:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMetodoServicioAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetodoServicioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getMetodoServicioAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAppPrecio.g:590:3: (otherlv_3= 'tipoParametro' otherlv_4= ':' ( (lv_tipoParametro_5_0= ruleTipos ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAppPrecio.g:591:4: otherlv_3= 'tipoParametro' otherlv_4= ':' ( (lv_tipoParametro_5_0= ruleTipos ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getMetodoServicioAccess().getTipoParametroKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getMetodoServicioAccess().getColonKeyword_3_1());
                    			
                    // InternalAppPrecio.g:599:4: ( (lv_tipoParametro_5_0= ruleTipos ) )
                    // InternalAppPrecio.g:600:5: (lv_tipoParametro_5_0= ruleTipos )
                    {
                    // InternalAppPrecio.g:600:5: (lv_tipoParametro_5_0= ruleTipos )
                    // InternalAppPrecio.g:601:6: lv_tipoParametro_5_0= ruleTipos
                    {

                    						newCompositeNode(grammarAccess.getMetodoServicioAccess().getTipoParametroTiposParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_tipoParametro_5_0=ruleTipos();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMetodoServicioRule());
                    						}
                    						set(
                    							current,
                    							"tipoParametro",
                    							lv_tipoParametro_5_0,
                    							"co.edu.unal.dsl.AppPrecio.Tipos");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAppPrecio.g:619:3: (otherlv_6= 'tipoRetornoPromesa' otherlv_7= ':' ( (lv_tipoRetorno_8_0= ruleTipos ) ) )
            // InternalAppPrecio.g:620:4: otherlv_6= 'tipoRetornoPromesa' otherlv_7= ':' ( (lv_tipoRetorno_8_0= ruleTipos ) )
            {
            otherlv_6=(Token)match(input,24,FOLLOW_13); 

            				newLeafNode(otherlv_6, grammarAccess.getMetodoServicioAccess().getTipoRetornoPromesaKeyword_4_0());
            			
            otherlv_7=(Token)match(input,18,FOLLOW_19); 

            				newLeafNode(otherlv_7, grammarAccess.getMetodoServicioAccess().getColonKeyword_4_1());
            			
            // InternalAppPrecio.g:628:4: ( (lv_tipoRetorno_8_0= ruleTipos ) )
            // InternalAppPrecio.g:629:5: (lv_tipoRetorno_8_0= ruleTipos )
            {
            // InternalAppPrecio.g:629:5: (lv_tipoRetorno_8_0= ruleTipos )
            // InternalAppPrecio.g:630:6: lv_tipoRetorno_8_0= ruleTipos
            {

            						newCompositeNode(grammarAccess.getMetodoServicioAccess().getTipoRetornoTiposParserRuleCall_4_2_0());
            					
            pushFollow(FOLLOW_7);
            lv_tipoRetorno_8_0=ruleTipos();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMetodoServicioRule());
            						}
            						set(
            							current,
            							"tipoRetorno",
            							lv_tipoRetorno_8_0,
            							"co.edu.unal.dsl.AppPrecio.Tipos");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMetodoServicioAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMetodoServicio"


    // $ANTLR start "entryRuleMetodoTecnologia"
    // InternalAppPrecio.g:656:1: entryRuleMetodoTecnologia returns [EObject current=null] : iv_ruleMetodoTecnologia= ruleMetodoTecnologia EOF ;
    public final EObject entryRuleMetodoTecnologia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetodoTecnologia = null;


        try {
            // InternalAppPrecio.g:656:57: (iv_ruleMetodoTecnologia= ruleMetodoTecnologia EOF )
            // InternalAppPrecio.g:657:2: iv_ruleMetodoTecnologia= ruleMetodoTecnologia EOF
            {
             newCompositeNode(grammarAccess.getMetodoTecnologiaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetodoTecnologia=ruleMetodoTecnologia();

            state._fsp--;

             current =iv_ruleMetodoTecnologia; 
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
    // $ANTLR end "entryRuleMetodoTecnologia"


    // $ANTLR start "ruleMetodoTecnologia"
    // InternalAppPrecio.g:663:1: ruleMetodoTecnologia returns [EObject current=null] : (otherlv_0= 'metodo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'llave' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'valor' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleMetodoTecnologia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalAppPrecio.g:669:2: ( (otherlv_0= 'metodo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'llave' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'valor' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) )
            // InternalAppPrecio.g:670:2: (otherlv_0= 'metodo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'llave' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'valor' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            {
            // InternalAppPrecio.g:670:2: (otherlv_0= 'metodo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'llave' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'valor' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            // InternalAppPrecio.g:671:3: otherlv_0= 'metodo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'llave' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'valor' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getMetodoTecnologiaAccess().getMetodoKeyword_0());
            		
            // InternalAppPrecio.g:675:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAppPrecio.g:676:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAppPrecio.g:676:4: (lv_name_1_0= RULE_ID )
            // InternalAppPrecio.g:677:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMetodoTecnologiaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetodoTecnologiaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getMetodoTecnologiaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAppPrecio.g:697:3: (otherlv_3= 'llave' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAppPrecio.g:698:4: otherlv_3= 'llave' otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getMetodoTecnologiaAccess().getLlaveKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getMetodoTecnologiaAccess().getColonKeyword_3_1());
                    			
                    // InternalAppPrecio.g:706:4: ( (otherlv_5= RULE_ID ) )
                    // InternalAppPrecio.g:707:5: (otherlv_5= RULE_ID )
                    {
                    // InternalAppPrecio.g:707:5: (otherlv_5= RULE_ID )
                    // InternalAppPrecio.g:708:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMetodoTecnologiaRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_5, grammarAccess.getMetodoTecnologiaAccess().getLlaveLLaveCrossReference_3_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAppPrecio.g:720:3: (otherlv_6= 'valor' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAppPrecio.g:721:4: otherlv_6= 'valor' otherlv_7= ':' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getMetodoTecnologiaAccess().getValorKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getMetodoTecnologiaAccess().getColonKeyword_4_1());
                    			
                    // InternalAppPrecio.g:729:4: ( (otherlv_8= RULE_ID ) )
                    // InternalAppPrecio.g:730:5: (otherlv_8= RULE_ID )
                    {
                    // InternalAppPrecio.g:730:5: (otherlv_8= RULE_ID )
                    // InternalAppPrecio.g:731:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMetodoTecnologiaRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_8, grammarAccess.getMetodoTecnologiaAccess().getValorTiposArregloListadoCrossReference_4_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMetodoTecnologiaAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMetodoTecnologia"


    // $ANTLR start "entryRuleEntidad"
    // InternalAppPrecio.g:751:1: entryRuleEntidad returns [EObject current=null] : iv_ruleEntidad= ruleEntidad EOF ;
    public final EObject entryRuleEntidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidad = null;


        try {
            // InternalAppPrecio.g:751:48: (iv_ruleEntidad= ruleEntidad EOF )
            // InternalAppPrecio.g:752:2: iv_ruleEntidad= ruleEntidad EOF
            {
             newCompositeNode(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntidad=ruleEntidad();

            state._fsp--;

             current =iv_ruleEntidad; 
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
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalAppPrecio.g:758:1: ruleEntidad returns [EObject current=null] : this_Interfaz_0= ruleInterfaz ;
    public final EObject ruleEntidad() throws RecognitionException {
        EObject current = null;

        EObject this_Interfaz_0 = null;



        	enterRule();

        try {
            // InternalAppPrecio.g:764:2: (this_Interfaz_0= ruleInterfaz )
            // InternalAppPrecio.g:765:2: this_Interfaz_0= ruleInterfaz
            {

            		newCompositeNode(grammarAccess.getEntidadAccess().getInterfazParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Interfaz_0=ruleInterfaz();

            state._fsp--;


            		current = this_Interfaz_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleInterfaz"
    // InternalAppPrecio.g:776:1: entryRuleInterfaz returns [EObject current=null] : iv_ruleInterfaz= ruleInterfaz EOF ;
    public final EObject entryRuleInterfaz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaz = null;


        try {
            // InternalAppPrecio.g:776:49: (iv_ruleInterfaz= ruleInterfaz EOF )
            // InternalAppPrecio.g:777:2: iv_ruleInterfaz= ruleInterfaz EOF
            {
             newCompositeNode(grammarAccess.getInterfazRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfaz=ruleInterfaz();

            state._fsp--;

             current =iv_ruleInterfaz; 
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
    // $ANTLR end "entryRuleInterfaz"


    // $ANTLR start "ruleInterfaz"
    // InternalAppPrecio.g:783:1: ruleInterfaz returns [EObject current=null] : (otherlv_0= 'interfaz' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_propiedades_3_0= rulePropiedad ) )* otherlv_4= '}' ) ;
    public final EObject ruleInterfaz() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_propiedades_3_0 = null;



        	enterRule();

        try {
            // InternalAppPrecio.g:789:2: ( (otherlv_0= 'interfaz' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_propiedades_3_0= rulePropiedad ) )* otherlv_4= '}' ) )
            // InternalAppPrecio.g:790:2: (otherlv_0= 'interfaz' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_propiedades_3_0= rulePropiedad ) )* otherlv_4= '}' )
            {
            // InternalAppPrecio.g:790:2: (otherlv_0= 'interfaz' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_propiedades_3_0= rulePropiedad ) )* otherlv_4= '}' )
            // InternalAppPrecio.g:791:3: otherlv_0= 'interfaz' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_propiedades_3_0= rulePropiedad ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfazAccess().getInterfazKeyword_0());
            		
            // InternalAppPrecio.g:795:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAppPrecio.g:796:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAppPrecio.g:796:4: (lv_name_1_0= RULE_ID )
            // InternalAppPrecio.g:797:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInterfazAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterfazRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getInterfazAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAppPrecio.g:817:3: ( (lv_propiedades_3_0= rulePropiedad ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAppPrecio.g:818:4: (lv_propiedades_3_0= rulePropiedad )
            	    {
            	    // InternalAppPrecio.g:818:4: (lv_propiedades_3_0= rulePropiedad )
            	    // InternalAppPrecio.g:819:5: lv_propiedades_3_0= rulePropiedad
            	    {

            	    					newCompositeNode(grammarAccess.getInterfazAccess().getPropiedadesPropiedadParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_propiedades_3_0=rulePropiedad();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInterfazRule());
            	    					}
            	    					add(
            	    						current,
            	    						"propiedades",
            	    						lv_propiedades_3_0,
            	    						"co.edu.unal.dsl.AppPrecio.Propiedad");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInterfazAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleInterfaz"


    // $ANTLR start "entryRulePropiedad"
    // InternalAppPrecio.g:844:1: entryRulePropiedad returns [EObject current=null] : iv_rulePropiedad= rulePropiedad EOF ;
    public final EObject entryRulePropiedad() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropiedad = null;


        try {
            // InternalAppPrecio.g:844:50: (iv_rulePropiedad= rulePropiedad EOF )
            // InternalAppPrecio.g:845:2: iv_rulePropiedad= rulePropiedad EOF
            {
             newCompositeNode(grammarAccess.getPropiedadRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropiedad=rulePropiedad();

            state._fsp--;

             current =iv_rulePropiedad; 
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
    // $ANTLR end "entryRulePropiedad"


    // $ANTLR start "rulePropiedad"
    // InternalAppPrecio.g:851:1: rulePropiedad returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_tipoDato_2_0= ruleTipoDato ) ) ) ;
    public final EObject rulePropiedad() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_tipoDato_2_0 = null;



        	enterRule();

        try {
            // InternalAppPrecio.g:857:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_tipoDato_2_0= ruleTipoDato ) ) ) )
            // InternalAppPrecio.g:858:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_tipoDato_2_0= ruleTipoDato ) ) )
            {
            // InternalAppPrecio.g:858:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_tipoDato_2_0= ruleTipoDato ) ) )
            // InternalAppPrecio.g:859:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_tipoDato_2_0= ruleTipoDato ) )
            {
            // InternalAppPrecio.g:859:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAppPrecio.g:860:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAppPrecio.g:860:4: (lv_name_0_0= RULE_ID )
            // InternalAppPrecio.g:861:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPropiedadAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropiedadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getPropiedadAccess().getColonKeyword_1());
            		
            // InternalAppPrecio.g:881:3: ( (lv_tipoDato_2_0= ruleTipoDato ) )
            // InternalAppPrecio.g:882:4: (lv_tipoDato_2_0= ruleTipoDato )
            {
            // InternalAppPrecio.g:882:4: (lv_tipoDato_2_0= ruleTipoDato )
            // InternalAppPrecio.g:883:5: lv_tipoDato_2_0= ruleTipoDato
            {

            					newCompositeNode(grammarAccess.getPropiedadAccess().getTipoDatoTipoDatoEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_tipoDato_2_0=ruleTipoDato();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropiedadRule());
            					}
            					set(
            						current,
            						"tipoDato",
            						lv_tipoDato_2_0,
            						"co.edu.unal.dsl.AppPrecio.TipoDato");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "rulePropiedad"


    // $ANTLR start "entryRuleComponente"
    // InternalAppPrecio.g:904:1: entryRuleComponente returns [EObject current=null] : iv_ruleComponente= ruleComponente EOF ;
    public final EObject entryRuleComponente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponente = null;


        try {
            // InternalAppPrecio.g:904:51: (iv_ruleComponente= ruleComponente EOF )
            // InternalAppPrecio.g:905:2: iv_ruleComponente= ruleComponente EOF
            {
             newCompositeNode(grammarAccess.getComponenteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponente=ruleComponente();

            state._fsp--;

             current =iv_ruleComponente; 
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
    // $ANTLR end "entryRuleComponente"


    // $ANTLR start "ruleComponente"
    // InternalAppPrecio.g:911:1: ruleComponente returns [EObject current=null] : (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'interfaz' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'servicio' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'tecnologia' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'titulo' otherlv_13= ':' ( (lv_titulo_14_0= RULE_STRING ) ) ( (lv_camposEntradas_15_0= ruleCampoEntrada ) )* ( (lv_botones_16_0= ruleBoton ) )* ( (lv_botonesOpcionItem_17_0= ruleBotonOpcionItem ) )* ( (lv_metodos_18_0= ruleMetodoComponente ) )* ( (lv_arreglos_19_0= ruleArreglo ) )* ( (lv_listado_20_0= ruleListado ) )* ( (lv_lista_21_0= ruleLista ) )? otherlv_22= '}' ) ;
    public final EObject ruleComponente() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_titulo_14_0=null;
        Token otherlv_22=null;
        EObject lv_camposEntradas_15_0 = null;

        EObject lv_botones_16_0 = null;

        EObject lv_botonesOpcionItem_17_0 = null;

        EObject lv_metodos_18_0 = null;

        EObject lv_arreglos_19_0 = null;

        EObject lv_listado_20_0 = null;

        EObject lv_lista_21_0 = null;



        	enterRule();

        try {
            // InternalAppPrecio.g:917:2: ( (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'interfaz' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'servicio' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'tecnologia' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'titulo' otherlv_13= ':' ( (lv_titulo_14_0= RULE_STRING ) ) ( (lv_camposEntradas_15_0= ruleCampoEntrada ) )* ( (lv_botones_16_0= ruleBoton ) )* ( (lv_botonesOpcionItem_17_0= ruleBotonOpcionItem ) )* ( (lv_metodos_18_0= ruleMetodoComponente ) )* ( (lv_arreglos_19_0= ruleArreglo ) )* ( (lv_listado_20_0= ruleListado ) )* ( (lv_lista_21_0= ruleLista ) )? otherlv_22= '}' ) )
            // InternalAppPrecio.g:918:2: (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'interfaz' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'servicio' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'tecnologia' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'titulo' otherlv_13= ':' ( (lv_titulo_14_0= RULE_STRING ) ) ( (lv_camposEntradas_15_0= ruleCampoEntrada ) )* ( (lv_botones_16_0= ruleBoton ) )* ( (lv_botonesOpcionItem_17_0= ruleBotonOpcionItem ) )* ( (lv_metodos_18_0= ruleMetodoComponente ) )* ( (lv_arreglos_19_0= ruleArreglo ) )* ( (lv_listado_20_0= ruleListado ) )* ( (lv_lista_21_0= ruleLista ) )? otherlv_22= '}' )
            {
            // InternalAppPrecio.g:918:2: (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'interfaz' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'servicio' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'tecnologia' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'titulo' otherlv_13= ':' ( (lv_titulo_14_0= RULE_STRING ) ) ( (lv_camposEntradas_15_0= ruleCampoEntrada ) )* ( (lv_botones_16_0= ruleBoton ) )* ( (lv_botonesOpcionItem_17_0= ruleBotonOpcionItem ) )* ( (lv_metodos_18_0= ruleMetodoComponente ) )* ( (lv_arreglos_19_0= ruleArreglo ) )* ( (lv_listado_20_0= ruleListado ) )* ( (lv_lista_21_0= ruleLista ) )? otherlv_22= '}' )
            // InternalAppPrecio.g:919:3: otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'interfaz' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'servicio' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'tecnologia' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'titulo' otherlv_13= ':' ( (lv_titulo_14_0= RULE_STRING ) ) ( (lv_camposEntradas_15_0= ruleCampoEntrada ) )* ( (lv_botones_16_0= ruleBoton ) )* ( (lv_botonesOpcionItem_17_0= ruleBotonOpcionItem ) )* ( (lv_metodos_18_0= ruleMetodoComponente ) )* ( (lv_arreglos_19_0= ruleArreglo ) )* ( (lv_listado_20_0= ruleListado ) )* ( (lv_lista_21_0= ruleLista ) )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getComponenteAccess().getComponenteKeyword_0());
            		
            // InternalAppPrecio.g:923:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAppPrecio.g:924:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAppPrecio.g:924:4: (lv_name_1_0= RULE_ID )
            // InternalAppPrecio.g:925:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponenteAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponenteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getComponenteAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getComponenteAccess().getInterfazKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getComponenteAccess().getColonKeyword_4());
            		
            // InternalAppPrecio.g:953:3: ( (otherlv_5= RULE_ID ) )
            // InternalAppPrecio.g:954:4: (otherlv_5= RULE_ID )
            {
            // InternalAppPrecio.g:954:4: (otherlv_5= RULE_ID )
            // InternalAppPrecio.g:955:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponenteRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_5, grammarAccess.getComponenteAccess().getInterfazInterfazCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getComponenteAccess().getServicioKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getComponenteAccess().getColonKeyword_7());
            		
            // InternalAppPrecio.g:974:3: ( (otherlv_8= RULE_ID ) )
            // InternalAppPrecio.g:975:4: (otherlv_8= RULE_ID )
            {
            // InternalAppPrecio.g:975:4: (otherlv_8= RULE_ID )
            // InternalAppPrecio.g:976:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponenteRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_8, grammarAccess.getComponenteAccess().getServicioServicioCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getComponenteAccess().getTecnologiaKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getComponenteAccess().getColonKeyword_10());
            		
            // InternalAppPrecio.g:995:3: ( (otherlv_11= RULE_ID ) )
            // InternalAppPrecio.g:996:4: (otherlv_11= RULE_ID )
            {
            // InternalAppPrecio.g:996:4: (otherlv_11= RULE_ID )
            // InternalAppPrecio.g:997:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponenteRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_11, grammarAccess.getComponenteAccess().getTecnologiaTecnologiaCrossReference_11_0());
            				

            }


            }

            otherlv_12=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getComponenteAccess().getTituloKeyword_12());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_13, grammarAccess.getComponenteAccess().getColonKeyword_13());
            		
            // InternalAppPrecio.g:1016:3: ( (lv_titulo_14_0= RULE_STRING ) )
            // InternalAppPrecio.g:1017:4: (lv_titulo_14_0= RULE_STRING )
            {
            // InternalAppPrecio.g:1017:4: (lv_titulo_14_0= RULE_STRING )
            // InternalAppPrecio.g:1018:5: lv_titulo_14_0= RULE_STRING
            {
            lv_titulo_14_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_titulo_14_0, grammarAccess.getComponenteAccess().getTituloSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponenteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"titulo",
            						lv_titulo_14_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAppPrecio.g:1034:3: ( (lv_camposEntradas_15_0= ruleCampoEntrada ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAppPrecio.g:1035:4: (lv_camposEntradas_15_0= ruleCampoEntrada )
            	    {
            	    // InternalAppPrecio.g:1035:4: (lv_camposEntradas_15_0= ruleCampoEntrada )
            	    // InternalAppPrecio.g:1036:5: lv_camposEntradas_15_0= ruleCampoEntrada
            	    {

            	    					newCompositeNode(grammarAccess.getComponenteAccess().getCamposEntradasCampoEntradaParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_camposEntradas_15_0=ruleCampoEntrada();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponenteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"camposEntradas",
            	    						lv_camposEntradas_15_0,
            	    						"co.edu.unal.dsl.AppPrecio.CampoEntrada");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalAppPrecio.g:1053:3: ( (lv_botones_16_0= ruleBoton ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAppPrecio.g:1054:4: (lv_botones_16_0= ruleBoton )
            	    {
            	    // InternalAppPrecio.g:1054:4: (lv_botones_16_0= ruleBoton )
            	    // InternalAppPrecio.g:1055:5: lv_botones_16_0= ruleBoton
            	    {

            	    					newCompositeNode(grammarAccess.getComponenteAccess().getBotonesBotonParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_botones_16_0=ruleBoton();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponenteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"botones",
            	    						lv_botones_16_0,
            	    						"co.edu.unal.dsl.AppPrecio.Boton");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalAppPrecio.g:1072:3: ( (lv_botonesOpcionItem_17_0= ruleBotonOpcionItem ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==35) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAppPrecio.g:1073:4: (lv_botonesOpcionItem_17_0= ruleBotonOpcionItem )
            	    {
            	    // InternalAppPrecio.g:1073:4: (lv_botonesOpcionItem_17_0= ruleBotonOpcionItem )
            	    // InternalAppPrecio.g:1074:5: lv_botonesOpcionItem_17_0= ruleBotonOpcionItem
            	    {

            	    					newCompositeNode(grammarAccess.getComponenteAccess().getBotonesOpcionItemBotonOpcionItemParserRuleCall_17_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_botonesOpcionItem_17_0=ruleBotonOpcionItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponenteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"botonesOpcionItem",
            	    						lv_botonesOpcionItem_17_0,
            	    						"co.edu.unal.dsl.AppPrecio.BotonOpcionItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalAppPrecio.g:1091:3: ( (lv_metodos_18_0= ruleMetodoComponente ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAppPrecio.g:1092:4: (lv_metodos_18_0= ruleMetodoComponente )
            	    {
            	    // InternalAppPrecio.g:1092:4: (lv_metodos_18_0= ruleMetodoComponente )
            	    // InternalAppPrecio.g:1093:5: lv_metodos_18_0= ruleMetodoComponente
            	    {

            	    					newCompositeNode(grammarAccess.getComponenteAccess().getMetodosMetodoComponenteParserRuleCall_18_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_metodos_18_0=ruleMetodoComponente();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponenteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"metodos",
            	    						lv_metodos_18_0,
            	    						"co.edu.unal.dsl.AppPrecio.MetodoComponente");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalAppPrecio.g:1110:3: ( (lv_arreglos_19_0= ruleArreglo ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==38) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAppPrecio.g:1111:4: (lv_arreglos_19_0= ruleArreglo )
            	    {
            	    // InternalAppPrecio.g:1111:4: (lv_arreglos_19_0= ruleArreglo )
            	    // InternalAppPrecio.g:1112:5: lv_arreglos_19_0= ruleArreglo
            	    {

            	    					newCompositeNode(grammarAccess.getComponenteAccess().getArreglosArregloParserRuleCall_19_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_arreglos_19_0=ruleArreglo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponenteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"arreglos",
            	    						lv_arreglos_19_0,
            	    						"co.edu.unal.dsl.AppPrecio.Arreglo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalAppPrecio.g:1129:3: ( (lv_listado_20_0= ruleListado ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==40) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAppPrecio.g:1130:4: (lv_listado_20_0= ruleListado )
            	    {
            	    // InternalAppPrecio.g:1130:4: (lv_listado_20_0= ruleListado )
            	    // InternalAppPrecio.g:1131:5: lv_listado_20_0= ruleListado
            	    {

            	    					newCompositeNode(grammarAccess.getComponenteAccess().getListadoListadoParserRuleCall_20_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_listado_20_0=ruleListado();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponenteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"listado",
            	    						lv_listado_20_0,
            	    						"co.edu.unal.dsl.AppPrecio.Listado");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalAppPrecio.g:1148:3: ( (lv_lista_21_0= ruleLista ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAppPrecio.g:1149:4: (lv_lista_21_0= ruleLista )
                    {
                    // InternalAppPrecio.g:1149:4: (lv_lista_21_0= ruleLista )
                    // InternalAppPrecio.g:1150:5: lv_lista_21_0= ruleLista
                    {

                    					newCompositeNode(grammarAccess.getComponenteAccess().getListaListaParserRuleCall_21_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_lista_21_0=ruleLista();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComponenteRule());
                    					}
                    					set(
                    						current,
                    						"lista",
                    						lv_lista_21_0,
                    						"co.edu.unal.dsl.AppPrecio.Lista");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getComponenteAccess().getRightCurlyBracketKeyword_22());
            		

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
    // $ANTLR end "ruleComponente"


    // $ANTLR start "entryRuleCampoEntrada"
    // InternalAppPrecio.g:1175:1: entryRuleCampoEntrada returns [EObject current=null] : iv_ruleCampoEntrada= ruleCampoEntrada EOF ;
    public final EObject entryRuleCampoEntrada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCampoEntrada = null;


        try {
            // InternalAppPrecio.g:1175:53: (iv_ruleCampoEntrada= ruleCampoEntrada EOF )
            // InternalAppPrecio.g:1176:2: iv_ruleCampoEntrada= ruleCampoEntrada EOF
            {
             newCompositeNode(grammarAccess.getCampoEntradaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCampoEntrada=ruleCampoEntrada();

            state._fsp--;

             current =iv_ruleCampoEntrada; 
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
    // $ANTLR end "entryRuleCampoEntrada"


    // $ANTLR start "ruleCampoEntrada"
    // InternalAppPrecio.g:1182:1: ruleCampoEntrada returns [EObject current=null] : (otherlv_0= 'campoEntrada' otherlv_1= '{' otherlv_2= 'contenido' otherlv_3= ':' ( (lv_contenido_4_0= RULE_STRING ) ) otherlv_5= 'modelo' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'campo' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' ) ;
    public final EObject ruleCampoEntrada() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_contenido_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalAppPrecio.g:1188:2: ( (otherlv_0= 'campoEntrada' otherlv_1= '{' otherlv_2= 'contenido' otherlv_3= ':' ( (lv_contenido_4_0= RULE_STRING ) ) otherlv_5= 'modelo' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'campo' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' ) )
            // InternalAppPrecio.g:1189:2: (otherlv_0= 'campoEntrada' otherlv_1= '{' otherlv_2= 'contenido' otherlv_3= ':' ( (lv_contenido_4_0= RULE_STRING ) ) otherlv_5= 'modelo' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'campo' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' )
            {
            // InternalAppPrecio.g:1189:2: (otherlv_0= 'campoEntrada' otherlv_1= '{' otherlv_2= 'contenido' otherlv_3= ':' ( (lv_contenido_4_0= RULE_STRING ) ) otherlv_5= 'modelo' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'campo' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' )
            // InternalAppPrecio.g:1190:3: otherlv_0= 'campoEntrada' otherlv_1= '{' otherlv_2= 'contenido' otherlv_3= ':' ( (lv_contenido_4_0= RULE_STRING ) ) otherlv_5= 'modelo' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'campo' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCampoEntradaAccess().getCampoEntradaKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getCampoEntradaAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getCampoEntradaAccess().getContenidoKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getCampoEntradaAccess().getColonKeyword_3());
            		
            // InternalAppPrecio.g:1206:3: ( (lv_contenido_4_0= RULE_STRING ) )
            // InternalAppPrecio.g:1207:4: (lv_contenido_4_0= RULE_STRING )
            {
            // InternalAppPrecio.g:1207:4: (lv_contenido_4_0= RULE_STRING )
            // InternalAppPrecio.g:1208:5: lv_contenido_4_0= RULE_STRING
            {
            lv_contenido_4_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_contenido_4_0, grammarAccess.getCampoEntradaAccess().getContenidoSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCampoEntradaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"contenido",
            						lv_contenido_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getCampoEntradaAccess().getModeloKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getCampoEntradaAccess().getColonKeyword_6());
            		
            // InternalAppPrecio.g:1232:3: ( (otherlv_7= RULE_ID ) )
            // InternalAppPrecio.g:1233:4: (otherlv_7= RULE_ID )
            {
            // InternalAppPrecio.g:1233:4: (otherlv_7= RULE_ID )
            // InternalAppPrecio.g:1234:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCampoEntradaRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_7, grammarAccess.getCampoEntradaAccess().getModeloListadoCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getCampoEntradaAccess().getCampoKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getCampoEntradaAccess().getColonKeyword_9());
            		
            // InternalAppPrecio.g:1253:3: ( (otherlv_10= RULE_ID ) )
            // InternalAppPrecio.g:1254:4: (otherlv_10= RULE_ID )
            {
            // InternalAppPrecio.g:1254:4: (otherlv_10= RULE_ID )
            // InternalAppPrecio.g:1255:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCampoEntradaRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_10, grammarAccess.getCampoEntradaAccess().getCampoPropiedadCrossReference_10_0());
            				

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCampoEntradaAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleCampoEntrada"


    // $ANTLR start "entryRuleBoton"
    // InternalAppPrecio.g:1274:1: entryRuleBoton returns [EObject current=null] : iv_ruleBoton= ruleBoton EOF ;
    public final EObject entryRuleBoton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoton = null;


        try {
            // InternalAppPrecio.g:1274:46: (iv_ruleBoton= ruleBoton EOF )
            // InternalAppPrecio.g:1275:2: iv_ruleBoton= ruleBoton EOF
            {
             newCompositeNode(grammarAccess.getBotonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoton=ruleBoton();

            state._fsp--;

             current =iv_ruleBoton; 
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
    // $ANTLR end "entryRuleBoton"


    // $ANTLR start "ruleBoton"
    // InternalAppPrecio.g:1281:1: ruleBoton returns [EObject current=null] : (otherlv_0= 'boton' otherlv_1= '{' otherlv_2= 'contenido' otherlv_3= ':' ( (lv_contenido_4_0= RULE_STRING ) ) otherlv_5= 'evento' otherlv_6= ':' ( (lv_evento_7_0= ruleEvento ) ) (otherlv_8= 'metodo' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleBoton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_contenido_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_evento_7_0 = null;



        	enterRule();

        try {
            // InternalAppPrecio.g:1287:2: ( (otherlv_0= 'boton' otherlv_1= '{' otherlv_2= 'contenido' otherlv_3= ':' ( (lv_contenido_4_0= RULE_STRING ) ) otherlv_5= 'evento' otherlv_6= ':' ( (lv_evento_7_0= ruleEvento ) ) (otherlv_8= 'metodo' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) )
            // InternalAppPrecio.g:1288:2: (otherlv_0= 'boton' otherlv_1= '{' otherlv_2= 'contenido' otherlv_3= ':' ( (lv_contenido_4_0= RULE_STRING ) ) otherlv_5= 'evento' otherlv_6= ':' ( (lv_evento_7_0= ruleEvento ) ) (otherlv_8= 'metodo' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            {
            // InternalAppPrecio.g:1288:2: (otherlv_0= 'boton' otherlv_1= '{' otherlv_2= 'contenido' otherlv_3= ':' ( (lv_contenido_4_0= RULE_STRING ) ) otherlv_5= 'evento' otherlv_6= ':' ( (lv_evento_7_0= ruleEvento ) ) (otherlv_8= 'metodo' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            // InternalAppPrecio.g:1289:3: otherlv_0= 'boton' otherlv_1= '{' otherlv_2= 'contenido' otherlv_3= ':' ( (lv_contenido_4_0= RULE_STRING ) ) otherlv_5= 'evento' otherlv_6= ':' ( (lv_evento_7_0= ruleEvento ) ) (otherlv_8= 'metodo' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBotonAccess().getBotonKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getBotonAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getBotonAccess().getContenidoKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getBotonAccess().getColonKeyword_3());
            		
            // InternalAppPrecio.g:1305:3: ( (lv_contenido_4_0= RULE_STRING ) )
            // InternalAppPrecio.g:1306:4: (lv_contenido_4_0= RULE_STRING )
            {
            // InternalAppPrecio.g:1306:4: (lv_contenido_4_0= RULE_STRING )
            // InternalAppPrecio.g:1307:5: lv_contenido_4_0= RULE_STRING
            {
            lv_contenido_4_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

            					newLeafNode(lv_contenido_4_0, grammarAccess.getBotonAccess().getContenidoSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBotonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"contenido",
            						lv_contenido_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getBotonAccess().getEventoKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_38); 

            			newLeafNode(otherlv_6, grammarAccess.getBotonAccess().getColonKeyword_6());
            		
            // InternalAppPrecio.g:1331:3: ( (lv_evento_7_0= ruleEvento ) )
            // InternalAppPrecio.g:1332:4: (lv_evento_7_0= ruleEvento )
            {
            // InternalAppPrecio.g:1332:4: (lv_evento_7_0= ruleEvento )
            // InternalAppPrecio.g:1333:5: lv_evento_7_0= ruleEvento
            {

            					newCompositeNode(grammarAccess.getBotonAccess().getEventoEventoEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_14);
            lv_evento_7_0=ruleEvento();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBotonRule());
            					}
            					set(
            						current,
            						"evento",
            						lv_evento_7_0,
            						"co.edu.unal.dsl.AppPrecio.Evento");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAppPrecio.g:1350:3: (otherlv_8= 'metodo' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAppPrecio.g:1351:4: otherlv_8= 'metodo' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getBotonAccess().getMetodoKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getBotonAccess().getColonKeyword_8_1());
                    			
                    // InternalAppPrecio.g:1359:4: ( (otherlv_10= RULE_ID ) )
                    // InternalAppPrecio.g:1360:5: (otherlv_10= RULE_ID )
                    {
                    // InternalAppPrecio.g:1360:5: (otherlv_10= RULE_ID )
                    // InternalAppPrecio.g:1361:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBotonRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_10, grammarAccess.getBotonAccess().getMetodoMetodoComponenteCrossReference_8_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getBotonAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleBoton"


    // $ANTLR start "entryRuleBotonOpcionItem"
    // InternalAppPrecio.g:1381:1: entryRuleBotonOpcionItem returns [EObject current=null] : iv_ruleBotonOpcionItem= ruleBotonOpcionItem EOF ;
    public final EObject entryRuleBotonOpcionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonOpcionItem = null;


        try {
            // InternalAppPrecio.g:1381:56: (iv_ruleBotonOpcionItem= ruleBotonOpcionItem EOF )
            // InternalAppPrecio.g:1382:2: iv_ruleBotonOpcionItem= ruleBotonOpcionItem EOF
            {
             newCompositeNode(grammarAccess.getBotonOpcionItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBotonOpcionItem=ruleBotonOpcionItem();

            state._fsp--;

             current =iv_ruleBotonOpcionItem; 
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
    // $ANTLR end "entryRuleBotonOpcionItem"


    // $ANTLR start "ruleBotonOpcionItem"
    // InternalAppPrecio.g:1388:1: ruleBotonOpcionItem returns [EObject current=null] : (otherlv_0= 'botonBotonOpcionItem' otherlv_1= '{' otherlv_2= 'contenido' otherlv_3= ':' ( (lv_contenido_4_0= RULE_STRING ) ) otherlv_5= 'evento' otherlv_6= ':' ( (lv_evento_7_0= ruleEvento ) ) (otherlv_8= 'color' otherlv_9= ':' ( (lv_color_10_0= ruleColor ) ) )? (otherlv_11= 'metodo' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleBotonOpcionItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_contenido_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Enumerator lv_evento_7_0 = null;

        Enumerator lv_color_10_0 = null;



        	enterRule();

        try {
            // InternalAppPrecio.g:1394:2: ( (otherlv_0= 'botonBotonOpcionItem' otherlv_1= '{' otherlv_2= 'contenido' otherlv_3= ':' ( (lv_contenido_4_0= RULE_STRING ) ) otherlv_5= 'evento' otherlv_6= ':' ( (lv_evento_7_0= ruleEvento ) ) (otherlv_8= 'color' otherlv_9= ':' ( (lv_color_10_0= ruleColor ) ) )? (otherlv_11= 'metodo' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )? otherlv_14= '}' ) )
            // InternalAppPrecio.g:1395:2: (otherlv_0= 'botonBotonOpcionItem' otherlv_1= '{' otherlv_2= 'contenido' otherlv_3= ':' ( (lv_contenido_4_0= RULE_STRING ) ) otherlv_5= 'evento' otherlv_6= ':' ( (lv_evento_7_0= ruleEvento ) ) (otherlv_8= 'color' otherlv_9= ':' ( (lv_color_10_0= ruleColor ) ) )? (otherlv_11= 'metodo' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )? otherlv_14= '}' )
            {
            // InternalAppPrecio.g:1395:2: (otherlv_0= 'botonBotonOpcionItem' otherlv_1= '{' otherlv_2= 'contenido' otherlv_3= ':' ( (lv_contenido_4_0= RULE_STRING ) ) otherlv_5= 'evento' otherlv_6= ':' ( (lv_evento_7_0= ruleEvento ) ) (otherlv_8= 'color' otherlv_9= ':' ( (lv_color_10_0= ruleColor ) ) )? (otherlv_11= 'metodo' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )? otherlv_14= '}' )
            // InternalAppPrecio.g:1396:3: otherlv_0= 'botonBotonOpcionItem' otherlv_1= '{' otherlv_2= 'contenido' otherlv_3= ':' ( (lv_contenido_4_0= RULE_STRING ) ) otherlv_5= 'evento' otherlv_6= ':' ( (lv_evento_7_0= ruleEvento ) ) (otherlv_8= 'color' otherlv_9= ':' ( (lv_color_10_0= ruleColor ) ) )? (otherlv_11= 'metodo' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBotonOpcionItemAccess().getBotonBotonOpcionItemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getBotonOpcionItemAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getBotonOpcionItemAccess().getContenidoKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getBotonOpcionItemAccess().getColonKeyword_3());
            		
            // InternalAppPrecio.g:1412:3: ( (lv_contenido_4_0= RULE_STRING ) )
            // InternalAppPrecio.g:1413:4: (lv_contenido_4_0= RULE_STRING )
            {
            // InternalAppPrecio.g:1413:4: (lv_contenido_4_0= RULE_STRING )
            // InternalAppPrecio.g:1414:5: lv_contenido_4_0= RULE_STRING
            {
            lv_contenido_4_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

            					newLeafNode(lv_contenido_4_0, grammarAccess.getBotonOpcionItemAccess().getContenidoSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBotonOpcionItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"contenido",
            						lv_contenido_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getBotonOpcionItemAccess().getEventoKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_38); 

            			newLeafNode(otherlv_6, grammarAccess.getBotonOpcionItemAccess().getColonKeyword_6());
            		
            // InternalAppPrecio.g:1438:3: ( (lv_evento_7_0= ruleEvento ) )
            // InternalAppPrecio.g:1439:4: (lv_evento_7_0= ruleEvento )
            {
            // InternalAppPrecio.g:1439:4: (lv_evento_7_0= ruleEvento )
            // InternalAppPrecio.g:1440:5: lv_evento_7_0= ruleEvento
            {

            					newCompositeNode(grammarAccess.getBotonOpcionItemAccess().getEventoEventoEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_39);
            lv_evento_7_0=ruleEvento();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBotonOpcionItemRule());
            					}
            					set(
            						current,
            						"evento",
            						lv_evento_7_0,
            						"co.edu.unal.dsl.AppPrecio.Evento");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAppPrecio.g:1457:3: (otherlv_8= 'color' otherlv_9= ':' ( (lv_color_10_0= ruleColor ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAppPrecio.g:1458:4: otherlv_8= 'color' otherlv_9= ':' ( (lv_color_10_0= ruleColor ) )
                    {
                    otherlv_8=(Token)match(input,36,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getBotonOpcionItemAccess().getColorKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,18,FOLLOW_40); 

                    				newLeafNode(otherlv_9, grammarAccess.getBotonOpcionItemAccess().getColonKeyword_8_1());
                    			
                    // InternalAppPrecio.g:1466:4: ( (lv_color_10_0= ruleColor ) )
                    // InternalAppPrecio.g:1467:5: (lv_color_10_0= ruleColor )
                    {
                    // InternalAppPrecio.g:1467:5: (lv_color_10_0= ruleColor )
                    // InternalAppPrecio.g:1468:6: lv_color_10_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getBotonOpcionItemAccess().getColorColorEnumRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_color_10_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBotonOpcionItemRule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_10_0,
                    							"co.edu.unal.dsl.AppPrecio.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAppPrecio.g:1486:3: (otherlv_11= 'metodo' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAppPrecio.g:1487:4: otherlv_11= 'metodo' otherlv_12= ':' ( (otherlv_13= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_11, grammarAccess.getBotonOpcionItemAccess().getMetodoKeyword_9_0());
                    			
                    otherlv_12=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getBotonOpcionItemAccess().getColonKeyword_9_1());
                    			
                    // InternalAppPrecio.g:1495:4: ( (otherlv_13= RULE_ID ) )
                    // InternalAppPrecio.g:1496:5: (otherlv_13= RULE_ID )
                    {
                    // InternalAppPrecio.g:1496:5: (otherlv_13= RULE_ID )
                    // InternalAppPrecio.g:1497:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBotonOpcionItemRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_13, grammarAccess.getBotonOpcionItemAccess().getMetodoMetodoComponenteCrossReference_9_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getBotonOpcionItemAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleBotonOpcionItem"


    // $ANTLR start "entryRuleLista"
    // InternalAppPrecio.g:1517:1: entryRuleLista returns [EObject current=null] : iv_ruleLista= ruleLista EOF ;
    public final EObject entryRuleLista() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLista = null;


        try {
            // InternalAppPrecio.g:1517:46: (iv_ruleLista= ruleLista EOF )
            // InternalAppPrecio.g:1518:2: iv_ruleLista= ruleLista EOF
            {
             newCompositeNode(grammarAccess.getListaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLista=ruleLista();

            state._fsp--;

             current =iv_ruleLista; 
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
    // $ANTLR end "entryRuleLista"


    // $ANTLR start "ruleLista"
    // InternalAppPrecio.g:1524:1: ruleLista returns [EObject current=null] : (otherlv_0= 'lista' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'contenido' otherlv_4= ':' ( (lv_contenido_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleLista() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_contenido_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalAppPrecio.g:1530:2: ( (otherlv_0= 'lista' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'contenido' otherlv_4= ':' ( (lv_contenido_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalAppPrecio.g:1531:2: (otherlv_0= 'lista' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'contenido' otherlv_4= ':' ( (lv_contenido_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalAppPrecio.g:1531:2: (otherlv_0= 'lista' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'contenido' otherlv_4= ':' ( (lv_contenido_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalAppPrecio.g:1532:3: otherlv_0= 'lista' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'contenido' otherlv_4= ':' ( (lv_contenido_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getListaAccess().getListaKeyword_0());
            		
            // InternalAppPrecio.g:1536:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAppPrecio.g:1537:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAppPrecio.g:1537:4: (lv_name_1_0= RULE_ID )
            // InternalAppPrecio.g:1538:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getListaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getListaAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getListaAccess().getContenidoKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getListaAccess().getColonKeyword_4());
            		
            // InternalAppPrecio.g:1566:3: ( (lv_contenido_5_0= RULE_STRING ) )
            // InternalAppPrecio.g:1567:4: (lv_contenido_5_0= RULE_STRING )
            {
            // InternalAppPrecio.g:1567:4: (lv_contenido_5_0= RULE_STRING )
            // InternalAppPrecio.g:1568:5: lv_contenido_5_0= RULE_STRING
            {
            lv_contenido_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_contenido_5_0, grammarAccess.getListaAccess().getContenidoSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"contenido",
            						lv_contenido_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getListaAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLista"


    // $ANTLR start "entryRuleTipos"
    // InternalAppPrecio.g:1592:1: entryRuleTipos returns [EObject current=null] : iv_ruleTipos= ruleTipos EOF ;
    public final EObject entryRuleTipos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipos = null;


        try {
            // InternalAppPrecio.g:1592:46: (iv_ruleTipos= ruleTipos EOF )
            // InternalAppPrecio.g:1593:2: iv_ruleTipos= ruleTipos EOF
            {
             newCompositeNode(grammarAccess.getTiposRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipos=ruleTipos();

            state._fsp--;

             current =iv_ruleTipos; 
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
    // $ANTLR end "entryRuleTipos"


    // $ANTLR start "ruleTipos"
    // InternalAppPrecio.g:1599:1: ruleTipos returns [EObject current=null] : ( ( (lv_tipoPrimitivo_0_0= ruleTipoDato ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleTipos() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_tipoPrimitivo_0_0 = null;



        	enterRule();

        try {
            // InternalAppPrecio.g:1605:2: ( ( ( (lv_tipoPrimitivo_0_0= ruleTipoDato ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalAppPrecio.g:1606:2: ( ( (lv_tipoPrimitivo_0_0= ruleTipoDato ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalAppPrecio.g:1606:2: ( ( (lv_tipoPrimitivo_0_0= ruleTipoDato ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=42 && LA22_0<=44)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalAppPrecio.g:1607:3: ( (lv_tipoPrimitivo_0_0= ruleTipoDato ) )
                    {
                    // InternalAppPrecio.g:1607:3: ( (lv_tipoPrimitivo_0_0= ruleTipoDato ) )
                    // InternalAppPrecio.g:1608:4: (lv_tipoPrimitivo_0_0= ruleTipoDato )
                    {
                    // InternalAppPrecio.g:1608:4: (lv_tipoPrimitivo_0_0= ruleTipoDato )
                    // InternalAppPrecio.g:1609:5: lv_tipoPrimitivo_0_0= ruleTipoDato
                    {

                    					newCompositeNode(grammarAccess.getTiposAccess().getTipoPrimitivoTipoDatoEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tipoPrimitivo_0_0=ruleTipoDato();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTiposRule());
                    					}
                    					set(
                    						current,
                    						"tipoPrimitivo",
                    						lv_tipoPrimitivo_0_0,
                    						"co.edu.unal.dsl.AppPrecio.TipoDato");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAppPrecio.g:1627:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalAppPrecio.g:1627:3: ( (otherlv_1= RULE_ID ) )
                    // InternalAppPrecio.g:1628:4: (otherlv_1= RULE_ID )
                    {
                    // InternalAppPrecio.g:1628:4: (otherlv_1= RULE_ID )
                    // InternalAppPrecio.g:1629:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTiposRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getTiposAccess().getTipoEstructuradoEntidadCrossReference_1_0());
                    				

                    }


                    }


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
    // $ANTLR end "ruleTipos"


    // $ANTLR start "entryRuleLLave"
    // InternalAppPrecio.g:1644:1: entryRuleLLave returns [EObject current=null] : iv_ruleLLave= ruleLLave EOF ;
    public final EObject entryRuleLLave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLLave = null;


        try {
            // InternalAppPrecio.g:1644:46: (iv_ruleLLave= ruleLLave EOF )
            // InternalAppPrecio.g:1645:2: iv_ruleLLave= ruleLLave EOF
            {
             newCompositeNode(grammarAccess.getLLaveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLLave=ruleLLave();

            state._fsp--;

             current =iv_ruleLLave; 
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
    // $ANTLR end "entryRuleLLave"


    // $ANTLR start "ruleLLave"
    // InternalAppPrecio.g:1651:1: ruleLLave returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLLave() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAppPrecio.g:1657:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalAppPrecio.g:1658:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalAppPrecio.g:1658:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalAppPrecio.g:1659:3: (lv_name_0_0= RULE_ID )
            {
            // InternalAppPrecio.g:1659:3: (lv_name_0_0= RULE_ID )
            // InternalAppPrecio.g:1660:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getLLaveAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLLaveRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


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
    // $ANTLR end "ruleLLave"


    // $ANTLR start "entryRuleArreglo"
    // InternalAppPrecio.g:1679:1: entryRuleArreglo returns [EObject current=null] : iv_ruleArreglo= ruleArreglo EOF ;
    public final EObject entryRuleArreglo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArreglo = null;


        try {
            // InternalAppPrecio.g:1679:48: (iv_ruleArreglo= ruleArreglo EOF )
            // InternalAppPrecio.g:1680:2: iv_ruleArreglo= ruleArreglo EOF
            {
             newCompositeNode(grammarAccess.getArregloRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArreglo=ruleArreglo();

            state._fsp--;

             current =iv_ruleArreglo; 
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
    // $ANTLR end "entryRuleArreglo"


    // $ANTLR start "ruleArreglo"
    // InternalAppPrecio.g:1686:1: ruleArreglo returns [EObject current=null] : (otherlv_0= 'arreglo' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'tipo' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleArreglo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAppPrecio.g:1692:2: ( (otherlv_0= 'arreglo' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'tipo' ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalAppPrecio.g:1693:2: (otherlv_0= 'arreglo' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'tipo' ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalAppPrecio.g:1693:2: (otherlv_0= 'arreglo' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'tipo' ( (otherlv_3= RULE_ID ) ) )? )
            // InternalAppPrecio.g:1694:3: otherlv_0= 'arreglo' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'tipo' ( (otherlv_3= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getArregloAccess().getArregloKeyword_0());
            		
            // InternalAppPrecio.g:1698:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAppPrecio.g:1699:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAppPrecio.g:1699:4: (lv_name_1_0= RULE_ID )
            // InternalAppPrecio.g:1700:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(lv_name_1_0, grammarAccess.getArregloAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArregloRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAppPrecio.g:1716:3: (otherlv_2= 'tipo' ( (otherlv_3= RULE_ID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAppPrecio.g:1717:4: otherlv_2= 'tipo' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getArregloAccess().getTipoKeyword_2_0());
                    			
                    // InternalAppPrecio.g:1721:4: ( (otherlv_3= RULE_ID ) )
                    // InternalAppPrecio.g:1722:5: (otherlv_3= RULE_ID )
                    {
                    // InternalAppPrecio.g:1722:5: (otherlv_3= RULE_ID )
                    // InternalAppPrecio.g:1723:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getArregloRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getArregloAccess().getTipoEntidadCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleArreglo"


    // $ANTLR start "entryRuleListado"
    // InternalAppPrecio.g:1739:1: entryRuleListado returns [EObject current=null] : iv_ruleListado= ruleListado EOF ;
    public final EObject entryRuleListado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListado = null;


        try {
            // InternalAppPrecio.g:1739:48: (iv_ruleListado= ruleListado EOF )
            // InternalAppPrecio.g:1740:2: iv_ruleListado= ruleListado EOF
            {
             newCompositeNode(grammarAccess.getListadoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListado=ruleListado();

            state._fsp--;

             current =iv_ruleListado; 
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
    // $ANTLR end "entryRuleListado"


    // $ANTLR start "ruleListado"
    // InternalAppPrecio.g:1746:1: ruleListado returns [EObject current=null] : (otherlv_0= 'listado' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'tipo' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleListado() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAppPrecio.g:1752:2: ( (otherlv_0= 'listado' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'tipo' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalAppPrecio.g:1753:2: (otherlv_0= 'listado' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'tipo' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalAppPrecio.g:1753:2: (otherlv_0= 'listado' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'tipo' ( (otherlv_3= RULE_ID ) ) )
            // InternalAppPrecio.g:1754:3: otherlv_0= 'listado' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'tipo' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getListadoAccess().getListadoKeyword_0());
            		
            // InternalAppPrecio.g:1758:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAppPrecio.g:1759:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAppPrecio.g:1759:4: (lv_name_1_0= RULE_ID )
            // InternalAppPrecio.g:1760:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(lv_name_1_0, grammarAccess.getListadoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListadoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getListadoAccess().getTipoKeyword_2());
            		
            // InternalAppPrecio.g:1780:3: ( (otherlv_3= RULE_ID ) )
            // InternalAppPrecio.g:1781:4: (otherlv_3= RULE_ID )
            {
            // InternalAppPrecio.g:1781:4: (otherlv_3= RULE_ID )
            // InternalAppPrecio.g:1782:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListadoRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getListadoAccess().getTipoEntidadCrossReference_3_0());
            				

            }


            }


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
    // $ANTLR end "ruleListado"


    // $ANTLR start "ruleEvento"
    // InternalAppPrecio.g:1797:1: ruleEvento returns [Enumerator current=null] : (enumLiteral_0= 'click' ) ;
    public final Enumerator ruleEvento() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalAppPrecio.g:1803:2: ( (enumLiteral_0= 'click' ) )
            // InternalAppPrecio.g:1804:2: (enumLiteral_0= 'click' )
            {
            // InternalAppPrecio.g:1804:2: (enumLiteral_0= 'click' )
            // InternalAppPrecio.g:1805:3: enumLiteral_0= 'click'
            {
            enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

            			current = grammarAccess.getEventoAccess().getClicEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getEventoAccess().getClicEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleEvento"


    // $ANTLR start "ruleTipoDato"
    // InternalAppPrecio.g:1814:1: ruleTipoDato returns [Enumerator current=null] : ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'any' ) ) ;
    public final Enumerator ruleTipoDato() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAppPrecio.g:1820:2: ( ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'any' ) ) )
            // InternalAppPrecio.g:1821:2: ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'any' ) )
            {
            // InternalAppPrecio.g:1821:2: ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'any' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt24=1;
                }
                break;
            case 43:
                {
                alt24=2;
                }
                break;
            case 44:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalAppPrecio.g:1822:3: (enumLiteral_0= 'number' )
                    {
                    // InternalAppPrecio.g:1822:3: (enumLiteral_0= 'number' )
                    // InternalAppPrecio.g:1823:4: enumLiteral_0= 'number'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoAccess().getNumeroEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoDatoAccess().getNumeroEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAppPrecio.g:1830:3: (enumLiteral_1= 'string' )
                    {
                    // InternalAppPrecio.g:1830:3: (enumLiteral_1= 'string' )
                    // InternalAppPrecio.g:1831:4: enumLiteral_1= 'string'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoAccess().getCadenaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoDatoAccess().getCadenaEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAppPrecio.g:1838:3: (enumLiteral_2= 'any' )
                    {
                    // InternalAppPrecio.g:1838:3: (enumLiteral_2= 'any' )
                    // InternalAppPrecio.g:1839:4: enumLiteral_2= 'any'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoAccess().getNingunaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoDatoAccess().getNingunaEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleTipoDato"


    // $ANTLR start "ruleColor"
    // InternalAppPrecio.g:1849:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'recondary' ) | (enumLiteral_1= 'danger' ) | (enumLiteral_2= 'primary' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAppPrecio.g:1855:2: ( ( (enumLiteral_0= 'recondary' ) | (enumLiteral_1= 'danger' ) | (enumLiteral_2= 'primary' ) ) )
            // InternalAppPrecio.g:1856:2: ( (enumLiteral_0= 'recondary' ) | (enumLiteral_1= 'danger' ) | (enumLiteral_2= 'primary' ) )
            {
            // InternalAppPrecio.g:1856:2: ( (enumLiteral_0= 'recondary' ) | (enumLiteral_1= 'danger' ) | (enumLiteral_2= 'primary' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt25=1;
                }
                break;
            case 46:
                {
                alt25=2;
                }
                break;
            case 47:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalAppPrecio.g:1857:3: (enumLiteral_0= 'recondary' )
                    {
                    // InternalAppPrecio.g:1857:3: (enumLiteral_0= 'recondary' )
                    // InternalAppPrecio.g:1858:4: enumLiteral_0= 'recondary'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getColor1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getColor1EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAppPrecio.g:1865:3: (enumLiteral_1= 'danger' )
                    {
                    // InternalAppPrecio.g:1865:3: (enumLiteral_1= 'danger' )
                    // InternalAppPrecio.g:1866:4: enumLiteral_1= 'danger'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getColor2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getColor2EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAppPrecio.g:1873:3: (enumLiteral_2= 'primary' )
                    {
                    // InternalAppPrecio.g:1873:3: (enumLiteral_2= 'primary' )
                    // InternalAppPrecio.g:1874:4: enumLiteral_2= 'primary'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getColor3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getColor3EnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleColor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004082000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000602000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00001C0000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002022000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000016A20102000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000016A00102000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000016800102000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000016000102000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000016000002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000012000002000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001000102000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008000000000L});

}