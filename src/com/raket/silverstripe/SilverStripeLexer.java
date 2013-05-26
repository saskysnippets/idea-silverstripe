/* The following code was generated by JFlex 1.4.3 on 2013-05-26 21:22 */

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
 * on 2013-05-26 21:22 from the specification file
 * <tt>C:/IdeaProjects/idea-silverstripe/src/com/raket/silverstripe/SilverStripe.flex</tt>
 */
public class SilverStripeLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int SS_IF_STATEMENT = 14;
  public static final int SS_REQUIRE_CONTENT = 32;
  public static final int SS_INCLUDE_VARS = 24;
  public static final int SS_THEME_STRING = 36;
  public static final int SS_REQUIRE_STATEMENT = 18;
  public static final int SS_VAR = 2;
  public static final int SS_TRANSLATION = 12;
  public static final int SS_SINGLE = 30;
  public static final int SS_BAD_BLOCK_STATEMENT = 8;
  public static final int SS_DOUBLE = 28;
  public static final int SS_IDENTIFIER = 34;
  public static final int SS_STRING = 26;
  public static final int SS_INCLUDE_STATEMENT = 16;
  public static final int SS_METHOD_ARGUMENTS = 20;
  public static final int YYINITIAL = 0;
  public static final int SS_BLOCK_VAR = 6;
  public static final int SS_CACHED_STATEMENT = 22;
  public static final int SS_BLOCK_START = 4;
  public static final int SS_COMMENT = 10;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 
    16, 16, 17, 17, 18, 18
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\1\1\0\1\3\1\2\22\0\1\3\1\41\1\15"+
    "\1\0\1\11\1\21\1\42\1\14\1\5\1\6\2\0\1\4\1\51"+
    "\1\7\1\0\12\10\2\0\1\20\1\40\1\22\2\0\2\13\1\54"+
    "\1\61\16\13\1\55\1\60\6\13\4\0\1\12\1\0\1\45\1\44"+
    "\1\32\1\50\1\36\1\35\1\46\1\31\1\27\1\56\1\13\1\23"+
    "\1\53\1\33\1\24\1\25\1\52\1\34\1\37\1\30\1\47\1\57"+
    "\1\26\3\13\1\16\1\43\1\17\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\4\0\1\2\10\0\3\3\1\0\1\4\3\1"+
    "\1\5\1\6\2\5\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\5\2\15\1\16\12\15\1\17\1\6\1\17"+
    "\1\20\2\17\2\6\1\16\1\17\1\2\1\20\1\21"+
    "\1\22\2\23\1\24\1\17\1\25\2\17\1\20\2\17"+
    "\1\26\1\27\3\5\1\30\1\31\3\5\1\3\1\32"+
    "\1\33\1\3\1\34\1\3\1\35\1\4\1\36\1\12"+
    "\1\37\1\40\1\41\3\0\1\42\11\0\1\43\1\2"+
    "\1\0\1\40\1\23\1\0\1\3\1\0\1\20\1\44"+
    "\3\0\1\12\1\45\13\0\1\2\1\46\1\23\1\0"+
    "\1\47\1\0\1\12\1\50\1\51\4\0\1\52\2\0"+
    "\1\53\1\54\2\0\1\12\14\0\1\12\2\0\1\55"+
    "\4\0\1\56\5\0\1\12\1\57\1\60\1\61\7\0"+
    "\1\12\2\0\1\62\2\0\1\63\2\0\1\64\2\0"+
    "\1\65";

  private static int [] zzUnpackAction() {
    int [] result = new int[203];
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
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\u012c\0\u015e"+
    "\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc\0\u02ee"+
    "\0\u0320\0\u0352\0\u0384\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u044c"+
    "\0\u047e\0\u04b0\0\u044c\0\u044c\0\u04e2\0\u0514\0\u044c\0\u044c"+
    "\0\u0546\0\u044c\0\u047e\0\u04b0\0\u0578\0\u05aa\0\u05dc\0\u060e"+
    "\0\u0640\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a\0\u044c\0\u047e"+
    "\0\u076c\0\u079e\0\u0546\0\u07d0\0\u07d0\0\u0802\0\u0834\0\u0866"+
    "\0\u0898\0\u08ca\0\u044c\0\u044c\0\u08fc\0\u092e\0\u08ca\0\u092e"+
    "\0\u0960\0\u0992\0\u09c4\0\u09f6\0\u0a28\0\u0a5a\0\u0a8c\0\u044c"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u044c\0\u044c\0\u0b54\0\u0992\0\u09c4"+
    "\0\u0b86\0\u044c\0\u044c\0\u0bb8\0\u044c\0\u0bea\0\u0c1c\0\u0c4e"+
    "\0\u044c\0\u0c80\0\u044c\0\u0cb2\0\u044c\0\u0ce4\0\u0d16\0\u0d48"+
    "\0\u044c\0\u0d7a\0\u0dac\0\u0dde\0\u0e10\0\u0e42\0\u0e74\0\u0ea6"+
    "\0\u07d0\0\u0866\0\u044c\0\u0ed8\0\u0f0a\0\u044c\0\u044c\0\u0992"+
    "\0\u044c\0\u09c4\0\u0f3c\0\u044c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004"+
    "\0\u044c\0\u1036\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u1162"+
    "\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u125c\0\u0f0a\0\u079e\0\u128e"+
    "\0\u044c\0\u12c0\0\u12f2\0\u044c\0\u044c\0\u1324\0\u1356\0\u1388"+
    "\0\u13ba\0\u13ec\0\u141e\0\u1450\0\u044c\0\u044c\0\u1482\0\u14b4"+
    "\0\u14e6\0\u1518\0\u154a\0\u157c\0\u15ae\0\u15e0\0\u1612\0\u1644"+
    "\0\u1676\0\u16a8\0\u16da\0\u170c\0\u173e\0\u1770\0\u17a2\0\u17d4"+
    "\0\u044c\0\u1806\0\u1838\0\u186a\0\u189c\0\u044c\0\u18ce\0\u1900"+
    "\0\u1932\0\u1964\0\u1996\0\u19c8\0\u044c\0\u044c\0\u044c\0\u19fa"+
    "\0\u1a2c\0\u1a5e\0\u1a90\0\u1ac2\0\u1af4\0\u1b26\0\u1b58\0\u1b8a"+
    "\0\u1bbc\0\u044c\0\u1bee\0\u1c20\0\u0514\0\u1c52\0\u1c84\0\u044c"+
    "\0\u1cb6\0\u1ce8\0\u044c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[203];
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
    "\11\1\1\24\4\1\1\25\1\1\1\26\41\1\1\27"+
    "\1\30\1\31\1\32\1\27\1\33\1\27\1\34\1\27"+
    "\1\35\2\36\2\27\1\37\1\40\1\27\1\41\1\27"+
    "\15\36\4\27\5\36\1\27\10\36\1\42\1\30\1\43"+
    "\1\44\14\42\1\45\1\46\1\42\1\47\2\42\1\50"+
    "\1\51\2\42\1\52\1\42\1\53\1\42\1\54\5\42"+
    "\1\55\4\42\1\56\10\42\1\57\1\30\1\60\1\44"+
    "\5\57\1\61\2\62\5\57\1\63\1\57\15\62\4\57"+
    "\5\62\1\57\10\62\1\64\1\65\1\66\1\67\15\64"+
    "\1\70\40\64\51\6\1\71\10\6\1\57\1\30\1\60"+
    "\1\44\5\57\1\61\2\72\1\73\1\74\2\57\1\75"+
    "\1\63\1\76\5\72\1\77\7\72\1\76\1\100\2\57"+
    "\5\72\1\57\10\72\1\57\1\30\1\60\1\44\4\57"+
    "\1\101\1\61\2\62\1\102\1\103\2\57\1\76\1\63"+
    "\1\76\10\62\1\104\4\62\1\76\1\100\1\105\1\106"+
    "\5\62\1\57\10\62\1\27\1\30\1\31\1\44\6\27"+
    "\2\107\7\27\15\107\4\27\16\107\1\27\1\30\1\31"+
    "\1\44\1\27\1\110\22\27\1\111\1\27\1\112\23\27"+
    "\1\113\4\27\1\30\1\31\1\44\1\114\1\27\1\115"+
    "\1\34\1\101\1\116\2\36\1\117\1\120\5\27\15\36"+
    "\4\27\5\36\1\27\10\36\1\57\1\30\1\60\1\44"+
    "\1\114\4\57\1\61\2\62\1\102\1\103\3\57\1\63"+
    "\1\57\15\62\4\57\5\62\1\57\10\62\1\57\1\30"+
    "\1\60\1\44\1\114\4\57\1\61\2\62\4\57\1\76"+
    "\1\63\1\76\15\62\1\76\1\100\2\57\5\62\1\57"+
    "\10\62\1\57\1\30\1\60\1\44\56\57\15\121\1\122"+
    "\1\123\43\121\14\124\1\125\1\124\1\123\43\124\6\126"+
    "\1\115\5\126\1\73\1\74\44\126\1\27\1\30\1\31"+
    "\1\32\6\27\2\127\7\27\15\127\4\27\5\127\1\27"+
    "\10\127\6\130\1\27\5\130\2\27\44\130\11\1\1\24"+
    "\1\1\1\0\2\1\1\25\1\1\1\26\2\1\15\0"+
    "\4\1\5\0\1\1\10\0\11\1\1\0\4\1\1\25"+
    "\1\1\1\26\52\1\1\24\4\1\1\25\1\1\1\26"+
    "\1\131\40\1\63\0\1\30\63\0\1\44\70\0\2\36"+
    "\7\0\15\36\4\0\5\36\1\0\6\36\1\132\1\36"+
    "\10\0\1\36\1\0\2\36\7\0\15\36\4\0\5\36"+
    "\1\0\10\36\22\0\1\133\60\0\1\134\62\0\1\135"+
    "\63\0\1\136\64\0\1\137\65\0\1\140\1\0\1\141"+
    "\50\0\1\142\20\0\1\143\52\0\1\144\46\0\1\145"+
    "\7\0\1\146\73\0\1\147\65\0\1\150\22\0\2\62"+
    "\7\0\15\62\4\0\5\62\1\0\10\62\10\0\1\62"+
    "\1\0\2\62\7\0\15\62\4\0\5\62\1\0\10\62"+
    "\21\151\1\152\41\151\1\65\17\151\1\152\43\151\1\67"+
    "\15\151\1\152\61\151\1\152\1\153\37\151\51\6\1\154"+
    "\10\6\7\0\1\155\1\62\1\0\2\72\7\0\15\72"+
    "\4\0\5\72\1\0\10\72\21\0\1\156\16\0\1\157"+
    "\61\0\1\157\31\0\1\101\51\0\14\160\1\161\45\160"+
    "\15\162\1\161\44\162\10\0\1\62\1\0\2\62\7\0"+
    "\1\62\1\163\13\62\4\0\5\62\1\0\10\62\42\0"+
    "\1\164\62\0\1\164\30\0\2\107\7\0\15\107\4\0"+
    "\16\107\31\0\1\165\67\0\1\166\67\0\1\167\26\0"+
    "\2\36\7\0\15\36\4\0\5\36\1\0\10\36\15\121"+
    "\2\0\43\121\14\124\1\0\1\124\1\0\43\124\6\126"+
    "\1\0\5\126\2\0\44\126\10\0\1\127\1\0\2\127"+
    "\7\0\15\127\4\0\5\127\1\0\10\127\6\130\1\0"+
    "\5\130\2\0\44\130\10\0\1\36\1\0\2\36\7\0"+
    "\6\36\1\170\6\36\4\0\5\36\1\0\10\36\30\0"+
    "\1\171\20\0\1\172\34\0\1\173\65\0\1\174\63\0"+
    "\1\175\62\0\1\176\60\0\1\177\101\0\1\200\46\0"+
    "\1\201\72\0\1\202\50\0\1\203\43\0\1\204\40\0"+
    "\21\6\1\205\27\6\1\154\10\6\12\0\2\206\7\0"+
    "\15\206\4\0\5\206\1\0\10\206\10\0\1\62\1\0"+
    "\2\62\7\0\5\62\1\207\7\62\4\0\5\62\1\0"+
    "\10\62\36\0\1\210\62\0\1\211\101\0\1\212\12\0"+
    "\1\36\1\0\2\36\7\0\13\36\1\213\1\36\4\0"+
    "\5\36\1\0\10\36\51\0\1\214\35\0\1\215\65\0"+
    "\1\215\53\0\1\216\66\0\1\217\62\0\1\220\77\0"+
    "\1\221\50\0\1\222\35\0\1\223\105\0\1\224\45\0"+
    "\1\225\37\0\22\6\1\226\26\6\1\71\10\6\53\0"+
    "\1\227\53\0\1\230\24\0\1\36\1\0\2\36\7\0"+
    "\15\36\4\0\5\36\1\0\1\36\1\231\6\36\47\0"+
    "\1\232\46\0\1\233\63\0\1\234\52\0\1\235\44\0"+
    "\1\236\72\0\1\237\2\0\1\240\1\241\2\0\1\242"+
    "\41\0\1\243\105\0\1\244\62\0\1\245\32\0\1\36"+
    "\1\0\2\36\7\0\13\36\1\246\1\36\4\0\5\36"+
    "\1\0\10\36\50\0\1\247\35\0\1\250\105\0\1\251"+
    "\45\0\1\252\54\0\1\253\56\0\1\254\64\0\1\255"+
    "\67\0\1\256\50\0\1\257\20\0\1\260\44\0\1\261"+
    "\101\0\1\262\43\0\1\263\37\0\1\36\1\0\2\36"+
    "\7\0\15\36\4\0\5\36\1\0\7\36\1\264\36\0"+
    "\1\265\46\0\1\215\74\0\1\266\60\0\1\267\50\0"+
    "\1\270\65\0\1\271\64\0\1\272\60\0\1\273\74\0"+
    "\1\274\70\0\1\275\41\0\1\276\35\0\1\36\1\0"+
    "\2\36\7\0\4\36\1\277\10\36\4\0\5\36\1\0"+
    "\10\36\25\0\1\256\65\0\1\256\60\0\1\300\62\0"+
    "\1\301\76\0\1\302\70\0\1\303\33\0\1\304\42\0"+
    "\1\36\1\0\2\36\7\0\11\36\1\305\3\36\4\0"+
    "\5\36\1\0\10\36\34\0\1\306\63\0\1\307\100\0"+
    "\1\310\31\0\1\311\60\0\1\312\105\0\1\256\41\0"+
    "\1\313\54\0\1\256\36\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7450];
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
    "\1\1\4\0\1\1\10\0\3\1\1\0\4\1\2\11"+
    "\2\1\2\11\2\1\2\11\1\1\1\11\14\1\1\11"+
    "\13\1\2\11\13\1\1\11\3\1\2\11\4\1\2\11"+
    "\1\1\1\11\3\1\1\11\1\1\1\11\1\1\1\11"+
    "\3\0\1\11\11\0\1\11\1\1\1\0\2\11\1\0"+
    "\1\11\1\0\1\1\1\11\3\0\1\1\1\11\13\0"+
    "\3\1\1\0\1\11\1\0\1\1\2\11\4\0\1\1"+
    "\2\0\2\11\2\0\1\1\14\0\1\1\2\0\1\11"+
    "\4\0\1\11\5\0\1\1\3\11\7\0\1\1\2\0"+
    "\1\11\2\0\1\1\2\0\1\11\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[203];
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

    public void yycleanstates() {
       while(!stack.isEmpty()) {
          yybegin(stack.pop());
       }
    }

	public IElementType checkContent() {
        if (!yytext().toString().equals("")) {
           if (yytext().toString().trim().length() == 0) {
               return TokenType.WHITE_SPACE;
           } else {
               return SilverStripeTypes.CONTENT;
           }
        }
    	return null;
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
    while (i < 132) {
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
        case 16: 
          { yypushstate(SS_VAR); return SilverStripeTypes.SS_VAR;
          }
        case 54: break;
        case 46: 
          { return SilverStripeTypes.SS_END_KEYWORD;
          }
        case 55: break;
        case 3: 
          { return SilverStripeTypes.SS_STRING;
          }
        case 56: break;
        case 49: 
          { yypushstate(SS_IF_STATEMENT); return SilverStripeTypes.SS_ELSE_IF_KEYWORD;
          }
        case 57: break;
        case 48: 
          { yypushstate(SS_REQUIRE_STATEMENT); return SilverStripeTypes.SS_REQUIRE_KEYWORD;
          }
        case 58: break;
        case 27: 
          { yypushstate(SS_VAR); return SilverStripeTypes.SS_VAR_START_DELIMITER;
          }
        case 59: break;
        case 4: 
          { yypopstate(); return SilverStripeTypes.SS_STRING;
          }
        case 60: break;
        case 17: 
          { yypushstate(SS_SINGLE); return SilverStripeTypes.SS_SINGLE_LEFT;
          }
        case 61: break;
        case 50: 
          { yypushstate(SS_BLOCK_VAR); return SilverStripeTypes.SS_SIMPLE_KEYWORD;
          }
        case 62: break;
        case 23: 
          { yypushstate(SS_REQUIRE_CONTENT); return SilverStripeTypes.LEFT_PAREN;
          }
        case 63: break;
        case 19: 
          { return SilverStripeTypes.SS_COMPARISON_OPERATOR;
          }
        case 64: break;
        case 14: 
          { return TokenType.WHITE_SPACE;
          }
        case 65: break;
        case 29: 
          { yypopstate(); return SilverStripeTypes.SS_IDENTIFIER;
          }
        case 66: break;
        case 26: 
          { yypopstate(); return SilverStripeTypes.SS_DOUBLE_RIGHT;
          }
        case 67: break;
        case 6: 
          { if (!stack.isEmpty()) {
		   yypopstate(); yypushback(yylength());
		} else {
		return SilverStripeTypes.CRLF;
	}
          }
        case 68: break;
        case 7: 
          { yypushstate(SS_METHOD_ARGUMENTS); return SilverStripeTypes.LEFT_PAREN;
          }
        case 69: break;
        case 8: 
          { yypushstate(SS_IDENTIFIER); return SilverStripeTypes.DOT;
          }
        case 70: break;
        case 11: 
          { return SilverStripeTypes.SS_VAR_START_DELIMITER;
          }
        case 71: break;
        case 13: 
          { yypushstate(SS_BAD_BLOCK_STATEMENT); yypushback(yylength());
          }
        case 72: break;
        case 25: 
          { yypopstate(); return SilverStripeTypes.RIGHT_PAREN;
          }
        case 73: break;
        case 31: 
          { yycleanstates(); return SilverStripeTypes.SS_BLOCK_END;
          }
        case 74: break;
        case 40: 
          { yypushstate(SS_COMMENT); return SilverStripeTypes.SS_COMMENT_START;
          }
        case 75: break;
        case 9: 
          { return SilverStripeTypes.SS_VAR_START;
          }
        case 76: break;
        case 30: 
          { yypushback(2);
            yypushstate(SS_BLOCK_START);
            IElementType content = checkContent();
            if (content != null) return content;
          }
        case 77: break;
        case 51: 
          { if (stack.size() == 1) {
		yypushstate(SS_THEME_STRING); return SilverStripeTypes.SS_THEME_VAR;
	}
	else {
	   return SilverStripeTypes.SS_VAR;
	}
          }
        case 78: break;
        case 42: 
          { return SilverStripeTypes.SS_ELSE_KEYWORD;
          }
        case 79: break;
        case 33: 
          { yypopstate(); return SilverStripeTypes.SS_BLOCK_END;
          }
        case 80: break;
        case 2: 
          { return SilverStripeTypes.COMMENT;
          }
        case 81: break;
        case 38: 
          { return SilverStripeTypes.SS_TRANSLATION_IDENTIFIER;
          }
        case 82: break;
        case 28: 
          { yypopstate(); return SilverStripeTypes.SS_SINGLE_RIGHT;
          }
        case 83: break;
        case 35: 
          { yypopstate(); yypushback(2); return SilverStripeTypes.SS_BAD_BLOCK_STATEMENT;
          }
        case 84: break;
        case 20: 
          { return SilverStripeTypes.SS_TRANSLATION_KEYWORD;
          }
        case 85: break;
        case 37: 
          { yypushstate(SS_TRANSLATION);  yypushback(3); return SilverStripeTypes.SS_BLOCK_START;
          }
        case 86: break;
        case 22: 
          { yypushstate(SS_INCLUDE_VARS); return SilverStripeTypes.SS_INCLUDE_FILE;
          }
        case 87: break;
        case 10: 
          { return SilverStripeTypes.SS_VAR;
          }
        case 88: break;
        case 45: 
          { yypushstate(SS_CACHED_STATEMENT); return SilverStripeTypes.SS_CACHED_KEYWORD;
          }
        case 89: break;
        case 41: 
          { yypushstate(SS_BLOCK_VAR); return SilverStripeTypes.SS_START_KEYWORD;
          }
        case 90: break;
        case 12: 
          { yypopstate(); return SilverStripeTypes.SS_VAR_END_DELIMITER;
          }
        case 91: break;
        case 18: 
          { yypushstate(SS_DOUBLE); return SilverStripeTypes.SS_DOUBLE_LEFT;
          }
        case 92: break;
        case 5: 
          { yypopstate(); yypushback(yylength());
          }
        case 93: break;
        case 32: 
          { return SilverStripeTypes.SS_BLOCK_START;
          }
        case 94: break;
        case 15: 
          { return TokenType.BAD_CHARACTER;
/*	if (!stack.isEmpty()) {
	   yypopstate(); yypushback(yylength());
	} else {
		return TokenType.BAD_CHARACTER;
	}*/
          }
        case 95: break;
        case 44: 
          { yypopstate(); yypushback(4); return SilverStripeTypes.COMMENT;
          }
        case 96: break;
        case 47: 
          { yypushstate(SS_INCLUDE_STATEMENT); return SilverStripeTypes.SS_INCLUDE_KEYWORD;
          }
        case 97: break;
        case 34: 
          { yypushstate(SS_IF_STATEMENT); return SilverStripeTypes.SS_IF_KEYWORD;
          }
        case 98: break;
        case 1: 
          { if (yylength() > 0 && yytext().subSequence(yylength() - 1, yylength()).toString().equals("$") ||
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
        case 99: break;
        case 43: 
          { yypopstate(); return SilverStripeTypes.SS_COMMENT_END;
          }
        case 100: break;
        case 21: 
          { return SilverStripeTypes.NUMBER;
          }
        case 101: break;
        case 52: 
          { return SilverStripeTypes.SS_REQUIRE_THEME_CSS;
          }
        case 102: break;
        case 53: 
          { return SilverStripeTypes.SS_REQUIRE_JS;
          }
        case 103: break;
        case 36: 
          { return SilverStripeTypes.SS_AND_OR_OPERATOR;
          }
        case 104: break;
        case 24: 
          { return SilverStripeTypes.COMMA;
          }
        case 105: break;
        case 39: 
          { return SilverStripeTypes.SS_REQUIRE_CSS;
          }
        case 106: break;
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
