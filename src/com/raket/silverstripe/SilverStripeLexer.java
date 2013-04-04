/* The following code was generated by JFlex 1.4.3 on 2013-04-05 00:36 */

package com.raket.silverstripe;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.raket.silverstripe.psi.SilverStripeTypes;
import com.raket.silverstripe.psi.SilverStripeTokenType;
import com.intellij.psi.TokenType;
import com.intellij.psi.*;
import com.intellij.psi.xml.*;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.containers.Stack;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 2013-04-05 00:36 from the specification file
 * <tt>C:/IdeaProjects/idea-silverstripe/src/com/raket/silverstripe/SilverStripe.flex</tt>
 */
public class SilverStripeLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int SS_VAR = 2;
  public static final int SS_TRANSLATION = 14;
  public static final int SS_METHOD_ARGUMENTS = 20;
  public static final int SS_BLOCK_VAR = 8;
  public static final int SS_BLOCK_START = 6;
  public static final int SS_BAD_BLOCK_STATEMENT = 10;
  public static final int SS_CACHED_STATEMENT = 22;
  public static final int SS_INCLUDE_STATEMENT = 18;
  public static final int YYINITIAL = 0;
  public static final int SS_IF_STATEMENT = 16;
  public static final int SS_WITH_DELIMITER = 4;
  public static final int SS_COMMENT = 12;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\1\1\0\1\3\1\2\22\0\1\3\1\41\1\14"+
    "\1\0\1\11\1\20\1\42\1\13\1\5\1\6\2\0\1\4\1\51"+
    "\1\7\1\0\12\10\2\0\1\17\1\40\1\21\2\0\32\12\4\0"+
    "\1\37\1\0\1\45\1\44\1\31\1\50\1\35\1\34\1\46\1\30"+
    "\1\26\2\12\1\22\1\12\1\32\1\23\1\24\1\12\1\33\1\36"+
    "\1\27\1\47\1\12\1\25\3\12\1\15\1\43\1\16\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\13\0\3\1\1\2\1\3\1\2\1\4\1\5"+
    "\1\6\1\2\1\7\1\10\1\11\1\12\1\3\1\13"+
    "\1\12\1\14\2\15\1\16\10\15\1\17\1\12\1\20"+
    "\3\12\2\3\1\13\2\12\2\3\1\13\2\12\2\3"+
    "\1\13\1\12\1\21\1\12\1\22\2\12\1\22\1\23"+
    "\3\12\1\24\1\25\1\26\1\27\1\30\3\12\1\2"+
    "\1\31\2\2\1\32\1\33\1\34\3\0\1\35\11\0"+
    "\1\36\5\0\1\37\2\0\1\40\1\0\1\22\1\23"+
    "\1\41\1\0\1\42\2\0\1\43\21\0\1\23\3\0"+
    "\1\44\1\45\3\0\1\46\4\0\1\47\1\50\22\0"+
    "\1\51\3\0\1\52\3\0\1\53\1\54\7\0\1\55"+
    "\3\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[190];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\52\0\124\0\176\0\250\0\322\0\374\0\u0126"+
    "\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8\0\u0222\0\u024c\0\u0276"+
    "\0\u0276\0\u02a0\0\u02ca\0\u0276\0\u0276\0\u02f4\0\u031e\0\u0276"+
    "\0\u0276\0\u0276\0\u02a0\0\u0348\0\u0372\0\u0276\0\u0276\0\u02a0"+
    "\0\u039c\0\u03c6\0\u03f0\0\u041a\0\u0444\0\u046e\0\u0498\0\u04c2"+
    "\0\u04ec\0\u0516\0\u0540\0\u056a\0\u03f0\0\u0594\0\u05be\0\u05be"+
    "\0\u05e8\0\u0612\0\u063c\0\u0666\0\u0666\0\u0690\0\u06ba\0\u06e4"+
    "\0\u070e\0\u070e\0\u0738\0\u0762\0\u078c\0\u07b6\0\u07e0\0\u080a"+
    "\0\u0834\0\u085e\0\u0888\0\u08b2\0\u08b2\0\u08dc\0\u0906\0\u0930"+
    "\0\u095a\0\u0276\0\u0276\0\u0984\0\u02f4\0\u09ae\0\u09d8\0\u0a02"+
    "\0\u0a2c\0\u09ae\0\u09d8\0\u0a56\0\u0a80\0\u0276\0\u0aaa\0\u0ad4"+
    "\0\u0afe\0\u0276\0\u0b28\0\u0b52\0\u0b7c\0\u0ba6\0\u0bd0\0\u0bfa"+
    "\0\u0c24\0\u05be\0\u063c\0\u0276\0\u0666\0\u06e4\0\u0c4e\0\u070e"+
    "\0\u078c\0\u0276\0\u0c78\0\u0834\0\u0276\0\u085e\0\u0ca2\0\u0276"+
    "\0\u0276\0\u09ae\0\u0276\0\u09d8\0\u0ccc\0\u0276\0\u0cf6\0\u0d20"+
    "\0\u0d4a\0\u0d74\0\u0d9e\0\u0dc8\0\u0df2\0\u0e1c\0\u0e46\0\u0e70"+
    "\0\u0e9a\0\u0ec4\0\u0eee\0\u0f18\0\u0f42\0\u0f6c\0\u0f96\0\u080a"+
    "\0\u0fc0\0\u0fea\0\u1014\0\u0276\0\u0276\0\u103e\0\u1068\0\u1092"+
    "\0\u10bc\0\u10e6\0\u1110\0\u113a\0\u1164\0\u0276\0\u0276\0\u118e"+
    "\0\u11b8\0\u11e2\0\u120c\0\u1236\0\u1260\0\u128a\0\u12b4\0\u12de"+
    "\0\u1308\0\u1332\0\u135c\0\u1386\0\u13b0\0\u13da\0\u1404\0\u142e"+
    "\0\u1458\0\u0276\0\u1482\0\u14ac\0\u14d6\0\u0276\0\u1500\0\u152a"+
    "\0\u1554\0\u0276\0\u0276\0\u157e\0\u15a8\0\u15d2\0\u15fc\0\u1626"+
    "\0\u1650\0\u167a\0\u0276\0\u16a4\0\u16ce\0\u16f8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[190];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\11\1\1\15\3\1\1\16\1\1\1\17\32\1\1\20"+
    "\1\21\1\22\1\23\1\20\1\24\1\20\1\25\1\20"+
    "\1\26\1\27\2\20\1\30\1\31\3\20\15\27\5\20"+
    "\5\27\1\20\1\32\1\21\1\33\1\34\5\32\1\35"+
    "\4\32\1\36\33\32\1\37\1\21\1\40\1\41\13\37"+
    "\1\42\1\43\1\37\1\44\2\37\1\45\1\46\2\37"+
    "\1\47\3\37\1\50\6\37\1\51\5\37\1\32\1\21"+
    "\1\33\1\52\5\32\1\53\1\54\5\32\1\55\1\32"+
    "\15\54\5\32\5\54\1\56\1\57\1\60\1\61\1\62"+
    "\14\57\1\63\31\57\1\64\1\65\1\66\1\67\45\64"+
    "\1\70\1\71\1\72\1\73\1\74\14\71\1\75\31\71"+
    "\1\32\1\21\1\33\1\76\5\32\1\77\1\100\1\101"+
    "\1\102\3\32\1\55\1\32\10\100\1\103\4\100\1\32"+
    "\1\104\1\105\1\106\1\107\5\100\2\32\1\21\1\33"+
    "\1\110\6\32\1\111\5\32\1\55\1\32\16\111\4\32"+
    "\6\111\1\32\1\21\1\33\1\23\1\112\1\32\1\113"+
    "\1\25\1\114\1\115\1\27\1\116\1\117\5\32\15\27"+
    "\5\32\5\27\1\32\1\20\1\21\1\22\1\23\1\112"+
    "\4\20\1\120\1\121\1\122\1\123\5\20\15\121\5\20"+
    "\5\121\1\20\11\1\1\15\1\0\2\1\1\16\1\1"+
    "\1\17\2\1\15\0\5\1\5\0\12\1\1\0\3\1"+
    "\1\16\1\1\1\17\43\1\1\15\3\1\1\16\1\1"+
    "\1\17\1\0\31\1\53\0\1\21\53\0\1\23\60\0"+
    "\1\27\7\0\15\27\5\0\5\27\11\0\1\27\1\0"+
    "\1\27\7\0\15\27\5\0\5\27\4\0\1\34\60\0"+
    "\1\124\7\0\15\124\5\0\5\124\4\0\1\41\66\0"+
    "\1\125\52\0\1\126\53\0\1\127\54\0\1\130\55\0"+
    "\1\131\1\0\1\132\40\0\1\133\21\0\1\134\26\0"+
    "\1\135\7\0\1\136\64\0\1\137\7\0\1\52\60\0"+
    "\1\54\7\0\15\54\5\0\5\54\6\0\1\140\1\0"+
    "\1\54\2\0\1\54\7\0\15\54\5\0\5\54\52\0"+
    "\1\141\20\142\1\143\32\142\1\60\16\142\1\143\34\142"+
    "\1\62\14\142\1\143\51\142\1\143\1\144\30\142\51\145"+
    "\1\146\1\145\1\65\47\145\1\146\3\145\1\67\45\145"+
    "\1\146\51\145\1\147\20\150\1\151\32\150\1\72\16\150"+
    "\1\151\34\150\1\74\14\150\1\151\51\150\1\151\1\152"+
    "\30\150\3\0\1\76\60\0\1\100\7\0\15\100\5\0"+
    "\5\100\6\0\1\153\1\0\1\100\2\0\1\100\7\0"+
    "\15\100\5\0\5\100\1\0\13\154\1\155\36\154\14\156"+
    "\1\155\35\156\5\0\1\153\1\0\1\100\2\0\1\100"+
    "\7\0\1\100\1\157\13\100\5\0\5\100\41\0\1\160"+
    "\53\0\1\161\52\0\1\161\11\0\1\110\60\0\1\111"+
    "\7\0\16\111\4\0\6\111\10\0\1\114\41\0\13\162"+
    "\1\163\36\162\14\164\1\163\35\164\12\0\1\121\7\0"+
    "\15\121\5\0\5\121\11\0\1\121\1\0\1\121\7\0"+
    "\15\121\5\0\5\121\6\0\1\165\1\0\1\124\2\0"+
    "\1\124\7\0\15\124\5\0\5\124\30\0\1\166\21\0"+
    "\1\167\23\0\1\170\55\0\1\171\53\0\1\172\52\0"+
    "\1\173\50\0\1\174\56\0\1\175\63\0\1\176\37\0"+
    "\1\177\16\0\2\200\3\0\1\200\1\0\1\200\1\201"+
    "\1\202\5\0\15\200\5\0\5\200\21\0\1\203\31\0"+
    "\20\145\1\204\30\145\1\147\3\0\2\205\3\0\1\205"+
    "\1\0\1\205\1\206\1\207\5\0\15\205\5\0\5\205"+
    "\6\0\1\153\1\0\1\100\2\0\1\100\7\0\5\100"+
    "\1\210\7\100\5\0\5\100\4\0\2\211\3\0\1\211"+
    "\1\0\1\211\1\212\1\213\5\0\15\211\5\0\5\211"+
    "\52\0\1\214\24\0\1\215\55\0\1\215\43\0\1\216"+
    "\56\0\1\217\52\0\1\220\56\0\1\221\53\0\1\222"+
    "\47\0\1\223\17\0\2\200\1\0\1\54\1\0\1\200"+
    "\1\0\1\200\7\0\15\200\5\0\5\200\1\0\13\224"+
    "\1\0\36\224\14\225\1\0\35\225\21\0\1\226\30\0"+
    "\21\145\1\227\27\145\1\146\3\0\2\205\1\0\1\100"+
    "\1\0\1\205\1\0\1\205\7\0\15\205\5\0\5\205"+
    "\1\0\13\230\1\0\36\230\14\231\1\0\35\231\3\0"+
    "\2\211\1\0\1\124\1\0\1\211\1\0\1\211\7\0"+
    "\15\211\5\0\5\211\1\0\13\232\1\0\36\232\14\233"+
    "\1\0\35\233\47\0\1\234\35\0\1\235\53\0\1\236"+
    "\53\0\1\237\34\0\1\240\2\0\1\241\1\242\2\0"+
    "\1\243\57\0\1\244\12\0\13\224\1\245\36\224\14\225"+
    "\1\245\35\225\13\230\1\246\36\230\14\231\1\246\35\231"+
    "\13\232\1\247\36\232\14\233\1\247\35\233\50\0\1\250"+
    "\24\0\1\251\76\0\1\252\27\0\1\253\46\0\1\254"+
    "\54\0\1\255\57\0\1\256\40\0\1\257\21\0\1\260"+
    "\33\0\1\261\30\0\1\54\51\0\1\100\51\0\1\124"+
    "\100\0\1\262\36\0\1\215\63\0\1\263\40\0\1\264"+
    "\55\0\1\265\54\0\1\266\50\0\1\267\65\0\1\270"+
    "\30\0\1\256\55\0\1\256\50\0\1\271\52\0\1\272"+
    "\67\0\1\273\36\0\1\274\53\0\1\275\37\0\1\276"+
    "\76\0\1\256\23\0\1\256\27\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5922];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\13\0\3\1\2\11\2\1\2\11\2\1\3\11"+
    "\3\1\2\11\52\1\2\11\12\1\1\11\3\0\1\11"+
    "\11\0\1\11\5\0\1\11\2\0\1\11\1\0\1\1"+
    "\2\11\1\0\1\11\2\0\1\11\21\0\1\1\3\0"+
    "\2\11\3\0\1\1\4\0\2\11\22\0\1\11\3\0"+
    "\1\11\3\0\2\11\7\0\1\11\3\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[190];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Stack<Integer> stack = new Stack<Integer>();

    public void yypushstate(int newState) {
      stack.push(yystate());
      yybegin(newState);
    }

    public void yypopstate() {
      yybegin(stack.pop());
    }

 	public IElementType checkVariable(IElementType success, IElementType fail) {
        String matchedVar = yytext().toString();
        if (matchedVar.matches("(\\$[a-zA-Z]+)((\\((\\\"(?=[a-zA-Z]*\\\")|\\'(?=[a-zA-Z]*\\')|[a-zA-Z](?=[a-zA-Z]+))[a-zA-Z\\\"\\']+\\))|\\.[a-zA-Z]+)*")) {
           return success;
        }
        else {
           return fail;
        }
 	}

  	public IElementType checkBlockVariable(IElementType success, IElementType fail) {
        String matchedVar = yytext().toString();
        if (matchedVar.matches("(\\$?[a-zA-Z]+)((\\((\\\"(?=[a-zA-Z]*\\\")|\\'(?=[a-zA-Z]*\\')|[a-zA-Z](?=[a-zA-Z]+))[a-zA-Z\\\"\\']+\\))|\\.[a-zA-Z]+)*")) {
           return success;
        }
        else {
           return fail;
        }
 	}


  public SilverStripeLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public SilverStripeLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 118) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 25: 
          { yypushstate(SS_VAR); return SilverStripeTypes.SS_VAR;
          }
        case 46: break;
        case 42: 
          { yybegin(SS_BLOCK_START); return SilverStripeTypes.SS_END_KEYWORD;
          }
        case 47: break;
        case 3: 
          { yybegin(YYINITIAL); return SilverStripeTypes.CRLF;
          }
        case 48: break;
        case 33: 
          { yybegin(SS_IF_STATEMENT); return SilverStripeTypes.SS_AND_OR_OPERATOR;
          }
        case 49: break;
        case 35: 
          { yybegin(SS_TRANSLATION); return SilverStripeTypes.SS_BLOCK_START;
          }
        case 50: break;
        case 44: 
          { yybegin(SS_IF_STATEMENT); return SilverStripeTypes.SS_ELSE_IF_KEYWORD;
          }
        case 51: break;
        case 34: 
          { return SilverStripeTypes.SS_STRING;
          }
        case 52: break;
        case 32: 
          { yybegin(SS_IF_STATEMENT); return SilverStripeTypes.SS_STRING;
          }
        case 53: break;
        case 30: 
          { yybegin(SS_BLOCK_VAR); yypushback(2); return SilverStripeTypes.SS_BAD_BLOCK_STATEMENT;
          }
        case 54: break;
        case 38: 
          { yybegin(SS_BLOCK_START); return SilverStripeTypes.SS_ELSE_KEYWORD;
          }
        case 55: break;
        case 12: 
          { yybegin(YYINITIAL); return SilverStripeTypes.SS_VAR_END_DELIMITER;
          }
        case 56: break;
        case 40: 
          { yybegin(SS_BLOCK_VAR); yypushback(4); return SilverStripeTypes.COMMENT;
          }
        case 57: break;
        case 4: 
          { return TokenType.WHITE_SPACE;
          }
        case 58: break;
        case 5: 
          { yypushstate(SS_METHOD_ARGUMENTS); return SilverStripeTypes.LEFT_PAREN;
          }
        case 59: break;
        case 17: 
          { yybegin(SS_IF_STATEMENT); return TokenType.WHITE_SPACE;
          }
        case 60: break;
        case 8: 
          { return SilverStripeTypes.SS_VAR_START_DELIMITER;
          }
        case 61: break;
        case 6: 
          { return SilverStripeTypes.DOT;
          }
        case 62: break;
        case 23: 
          { yypopstate(); return SilverStripeTypes.RIGHT_PAREN;
          }
        case 63: break;
        case 31: 
          { yybegin(SS_BLOCK_START); yypushback(2); return SilverStripeTypes.SS_TRANSLATION_CONTENT;
          }
        case 64: break;
        case 26: 
          { yybegin(SS_WITH_DELIMITER); return SilverStripeTypes.SS_VAR; //checkVariable(SilverStripeTypes.SS_VAR, SilverStripeTypes.SS_BAD_VAR);
          }
        case 65: break;
        case 21: 
          { yybegin(SS_INCLUDE_STATEMENT); return SilverStripeTypes.SS_INCLUDE_FILE;
          }
        case 66: break;
        case 43: 
          { yybegin(SS_INCLUDE_STATEMENT); return SilverStripeTypes.SS_INCLUDE_KEYWORD;
          }
        case 67: break;
        case 11: 
          { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
          }
        case 68: break;
        case 15: 
          { yybegin(SS_BLOCK_VAR); return TokenType.WHITE_SPACE;
          }
        case 69: break;
        case 7: 
          { return SilverStripeTypes.SS_VAR;
          }
        case 70: break;
        case 13: 
          { yybegin(SS_BAD_BLOCK_STATEMENT); yypushback(1);
          }
        case 71: break;
        case 10: 
          { return TokenType.BAD_CHARACTER;
          }
        case 72: break;
        case 41: 
          { yypushstate(SS_CACHED_STATEMENT); return SilverStripeTypes.SS_CACHED_KEYWORD;
          }
        case 73: break;
        case 18: 
          { yybegin(SS_IF_STATEMENT); return SilverStripeTypes.SS_BLOCK_VAR; //checkBlockVariable(SilverStripeTypes.SS_BLOCK_VAR, SilverStripeTypes.SS_BAD_VAR);
          }
        case 74: break;
        case 27: 
          { yybegin(SS_BLOCK_START); return SilverStripeTypes.SS_BLOCK_START;
          }
        case 75: break;
        case 9: 
          { yypopstate(); return SilverStripeTypes.SS_VAR_END_DELIMITER;
          }
        case 76: break;
        case 20: 
          { yybegin(SS_INCLUDE_STATEMENT); return TokenType.WHITE_SPACE;
          }
        case 77: break;
        case 2: 
          { yypopstate(); yypushback(1);
          }
        case 78: break;
        case 19: 
          { yybegin(SS_IF_STATEMENT); return SilverStripeTypes.SS_COMPARISON_OPERATOR;
          }
        case 79: break;
        case 37: 
          { yybegin(SS_BLOCK_VAR); return SilverStripeTypes.SS_START_KEYWORD;
          }
        case 80: break;
        case 16: 
          { yybegin(SS_BLOCK_VAR); return SilverStripeTypes.SS_BLOCK_VAR; //checkBlockVariable(SilverStripeTypes.SS_BLOCK_VAR, SilverStripeTypes.SS_BAD_VAR);
          }
        case 81: break;
        case 1: 
          { if (yylength() > 0 && yytext().subSequence(yylength() - 1, yylength()).toString().equals("<")) {
            yypushback(1);
            yypushstate(SS_BLOCK_START);
        }
        if (yylength() > 0 && yytext().subSequence(yylength() - 1, yylength()).toString().equals("$") ||
            yylength() > 0 && yytext().subSequence(yylength() - 1, yylength()).toString().equals("{") ) {
            yypushback(1);
            yypushstate(SS_VAR);
        }

        // we stray from the Handlebars grammar a bit here since we need our WHITE_SPACE more clearly delineated
        //    and we need to avoid creating extra tokens for empty strings (makes the parser and formatter happier)
        if (!yytext().toString().equals("")) {
           if (yytext().toString().trim().length() == 0) {
               return TokenType.WHITE_SPACE;
           } else {
               return SilverStripeTypes.CONTENT;
           }
        }
          }
        case 82: break;
        case 45: 
          { yybegin(SS_BLOCK_VAR); return SilverStripeTypes.SS_SIMPLE_KEYWORD;
          }
        case 83: break;
        case 39: 
          { yybegin(YYINITIAL); return SilverStripeTypes.SS_COMMENT_END;
          }
        case 84: break;
        case 24: 
          { return SilverStripeTypes.NUMBER;
          }
        case 85: break;
        case 36: 
          { yybegin(SS_COMMENT); return SilverStripeTypes.SS_COMMENT_START;
          }
        case 86: break;
        case 22: 
          { return SilverStripeTypes.COMMA;
          }
        case 87: break;
        case 14: 
          { yybegin(SS_BLOCK_START); return TokenType.WHITE_SPACE;
          }
        case 88: break;
        case 29: 
          { yybegin(SS_IF_STATEMENT); return SilverStripeTypes.SS_IF_KEYWORD;
          }
        case 89: break;
        case 28: 
          { yybegin(YYINITIAL); return SilverStripeTypes.SS_BLOCK_END;
          }
        case 90: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
