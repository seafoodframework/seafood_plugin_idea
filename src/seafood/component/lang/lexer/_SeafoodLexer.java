/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

/* It's an automatically generated code. Do not modify it. */
package seafood.component.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.xml.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>_SeafoodLexer.flex</tt>
 */
public class _SeafoodLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int DOC_TYPE = 2;
  public static final int COMMENT = 4;
  public static final int START_TAG_NAME = 6;
  public static final int END_TAG_NAME = 8;
  public static final int BEFORE_TAG_ATTRIBUTES = 10;
  public static final int TAG_ATTRIBUTES = 12;
  public static final int ATTRIBUTE_VALUE_EXPRESSION = 14;
  public static final int ATTRIBUTE_VALUE_START = 16;
  public static final int ATTRIBUTE_VALUE_DQ = 18;
  public static final int ATTRIBUTE_VALUE_SQ = 20;
  public static final int ATTRIBUTE_VALUE_BQ = 22;
  public static final int PROCESSING_INSTRUCTION = 24;
  public static final int TAG_CHARACTERS = 26;
  public static final int C_COMMENT_START = 28;
  public static final int C_COMMENT_END = 30;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 14112 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\11\1\12\1\13\6\14\1\15\23\14\1\16"+
    "\1\14\1\17\1\20\12\14\1\21\10\11\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
    "\32\1\33\1\34\1\35\2\11\1\14\1\36\3\11\1\37\10\11\1\40\1\41\5\14\1\42\1\43"+
    "\11\11\1\44\2\11\1\45\5\11\1\46\4\11\1\47\1\50\4\11\51\14\1\51\3\14\1\52\1"+
    "\53\4\14\1\54\12\11\1\55\u0381\11");

  /* The ZZ_CMAP_Y table has 2944 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1\1\11\1\12\1\13\1\14\1\13\1\14\34"+
    "\13\1\15\1\16\1\17\10\1\1\20\1\21\1\13\1\22\4\13\1\23\10\13\1\24\12\13\1\25"+
    "\1\13\1\26\1\25\1\13\1\27\4\1\1\13\1\30\1\31\2\1\2\13\1\30\1\1\1\32\1\25\5"+
    "\13\1\33\1\34\1\35\1\1\1\36\1\13\1\1\1\37\5\13\1\40\1\41\1\42\1\13\1\30\1"+
    "\43\1\13\1\44\1\45\1\1\1\13\1\46\4\1\1\13\1\47\4\1\1\50\2\13\1\51\1\1\1\52"+
    "\1\16\1\25\1\53\1\54\1\55\1\56\1\57\1\60\2\16\1\61\1\54\1\55\1\62\1\1\1\63"+
    "\1\1\1\64\1\65\1\22\1\55\1\66\1\1\1\67\1\16\1\70\1\71\1\54\1\55\1\66\1\1\1"+
    "\60\1\16\1\41\1\72\1\73\1\74\1\75\1\1\1\67\2\1\1\76\1\36\1\55\1\51\1\1\1\77"+
    "\1\16\1\1\1\100\1\36\1\55\1\101\1\1\1\57\1\16\1\102\1\76\1\36\1\13\1\103\1"+
    "\57\1\104\1\16\1\42\1\105\1\106\1\13\1\107\1\110\3\1\1\25\2\13\1\111\1\110"+
    "\3\1\1\112\1\113\1\114\1\115\1\116\1\117\2\1\1\67\3\1\1\120\1\13\1\121\1\1"+
    "\1\122\7\1\2\13\1\30\1\123\1\1\1\124\1\125\1\126\1\127\1\1\2\13\1\130\2\13"+
    "\1\131\24\13\1\132\1\133\2\13\1\132\2\13\1\134\1\135\1\14\3\13\1\135\3\13"+
    "\1\30\2\1\1\13\1\1\5\13\1\136\1\25\45\13\1\137\1\13\1\25\1\30\4\13\1\30\1"+
    "\140\1\141\1\16\1\13\1\16\1\13\1\16\1\141\1\67\3\13\1\142\1\1\1\143\4\1\5"+
    "\13\1\27\1\144\1\13\1\145\4\13\1\40\1\13\1\146\3\1\1\13\1\147\1\150\2\13\1"+
    "\151\1\13\1\75\3\1\1\13\1\110\3\13\1\150\4\1\1\152\5\1\1\105\2\13\1\142\1"+
    "\153\3\1\1\154\1\13\1\155\1\42\2\13\1\40\1\1\2\13\1\142\1\1\1\37\1\42\1\13"+
    "\1\147\1\46\5\1\1\156\1\157\14\13\4\1\21\13\1\136\2\13\1\136\1\160\1\13\1"+
    "\147\3\13\1\161\1\162\1\163\1\121\1\162\2\1\1\164\4\1\1\165\1\1\1\121\6\1"+
    "\1\166\1\167\1\170\1\171\1\172\3\1\1\173\147\1\2\13\1\146\2\13\1\146\10\13"+
    "\1\174\1\175\2\13\1\130\3\13\1\176\1\1\1\13\1\110\4\177\4\1\1\123\35\1\1\200"+
    "\2\1\1\201\1\25\4\13\1\202\1\25\4\13\1\131\1\105\1\13\1\147\1\25\4\13\1\146"+
    "\1\1\1\13\1\30\3\1\1\13\40\1\133\13\1\40\4\1\135\13\1\40\2\1\10\13\1\121\4"+
    "\1\2\13\1\147\20\13\1\121\1\13\1\203\1\1\2\13\1\146\1\123\1\13\1\147\4\13"+
    "\1\40\2\1\1\204\1\205\5\13\1\206\1\13\1\146\1\27\3\1\1\204\1\207\1\13\1\31"+
    "\1\1\3\13\1\142\1\205\2\13\1\142\3\1\1\210\1\42\1\13\1\40\1\13\1\110\1\1\1"+
    "\13\1\121\1\50\2\13\1\31\1\123\1\1\1\211\1\212\2\13\1\46\1\1\1\213\1\1\1\13"+
    "\1\214\3\13\1\215\1\216\1\217\1\30\1\64\1\220\1\221\1\177\2\13\1\131\1\40"+
    "\7\13\1\31\1\1\72\13\1\142\1\13\1\222\2\13\1\151\20\1\26\13\1\147\6\13\1\75"+
    "\2\1\1\110\1\223\1\55\1\224\1\225\6\13\1\16\1\1\1\154\25\13\1\147\1\1\4\13"+
    "\1\205\2\13\1\27\2\1\1\151\7\1\1\211\7\13\1\121\2\1\1\25\1\30\1\25\1\30\1"+
    "\226\4\13\1\146\1\227\1\230\2\1\1\231\1\13\1\14\1\232\2\147\2\1\7\13\1\30"+
    "\30\1\1\13\1\121\3\13\1\67\2\1\2\13\1\1\1\13\1\233\2\13\1\40\1\13\1\147\2"+
    "\13\1\234\3\1\11\13\1\147\1\1\2\13\1\234\1\13\1\151\2\13\1\27\3\13\1\142\11"+
    "\1\23\13\1\110\1\13\1\40\1\27\11\1\1\235\2\13\1\236\1\13\1\40\1\13\1\110\1"+
    "\13\1\146\4\1\1\13\1\237\1\13\1\40\1\13\1\75\4\1\3\13\1\240\4\1\1\67\1\241"+
    "\1\13\1\142\2\1\1\13\1\121\1\13\1\121\2\1\1\120\1\13\1\150\1\1\3\13\1\40\1"+
    "\13\1\40\1\13\1\31\1\13\1\16\6\1\4\13\1\46\3\1\3\13\1\31\3\13\1\31\60\1\1"+
    "\154\2\13\1\27\4\1\1\154\2\13\2\1\1\13\1\46\1\1\1\154\1\13\1\110\2\1\2\13"+
    "\1\242\1\154\2\13\1\31\1\243\1\244\2\1\1\13\1\22\1\151\5\1\1\245\1\246\1\46"+
    "\2\13\1\146\2\1\1\71\1\54\1\55\1\66\1\1\1\247\1\16\11\1\3\13\1\150\1\250\3"+
    "\1\3\13\1\1\1\251\13\1\2\13\1\146\2\1\1\252\2\1\3\13\1\1\1\253\3\1\2\13\1"+
    "\30\5\1\1\13\1\75\30\1\4\13\1\1\1\123\34\1\3\13\1\46\20\1\1\55\1\13\1\146"+
    "\1\1\1\67\2\1\1\205\1\13\67\1\71\13\1\75\16\1\14\13\1\142\53\1\2\13\1\146"+
    "\75\1\44\13\1\110\33\1\43\13\1\46\1\13\1\146\7\1\1\13\1\147\1\1\3\13\1\1\1"+
    "\142\1\1\1\154\1\254\1\13\67\1\4\13\1\150\1\67\3\1\1\154\4\1\1\67\1\1\76\13"+
    "\1\121\1\1\57\13\1\31\20\1\1\16\77\1\6\13\1\30\1\121\1\46\1\75\66\1\5\13\1"+
    "\211\3\13\1\141\1\255\1\256\1\257\3\13\1\260\1\261\1\13\1\262\1\263\1\36\24"+
    "\13\1\264\1\13\1\36\1\131\1\13\1\131\1\13\1\211\1\13\1\211\1\146\1\13\1\146"+
    "\1\13\1\55\1\13\1\55\1\13\1\213\3\1\14\13\1\150\3\1\4\13\1\142\113\1\1\257"+
    "\1\13\1\265\1\266\1\267\1\270\1\271\1\272\1\273\1\151\1\274\1\151\24\1\55"+
    "\13\1\110\2\1\103\13\1\150\15\13\1\147\150\13\1\16\25\1\41\13\1\147\36\1");

  /* The ZZ_CMAP_A table has 3024 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\2\10\1\0\2\10\22\0\1\10\1\14\1\11\1\62\1\51\1\0\1\43\1\12\2\42\3\0\1"+
    "\6\1\5\1\45\12\2\1\4\1\54\1\13\1\7\1\41\1\44\1\0\1\64\1\36\1\20\1\15\1\26"+
    "\1\64\1\1\1\27\1\40\2\1\1\32\1\30\1\1\1\16\1\24\3\1\1\21\1\34\2\1\1\63\1\23"+
    "\1\1\1\46\1\50\1\47\1\0\1\4\1\0\1\56\1\37\1\20\1\15\1\26\1\64\1\55\1\27\1"+
    "\40\2\1\1\33\1\31\1\61\1\17\1\25\1\60\1\1\1\57\1\22\1\35\2\1\1\63\1\23\1\1"+
    "\1\52\1\42\1\53\7\0\1\3\24\0\1\1\12\0\1\1\4\0\1\1\5\0\27\1\1\0\12\1\4\0\14"+
    "\1\16\0\5\1\7\0\1\1\1\0\1\1\1\0\5\1\1\0\2\1\2\0\4\1\1\0\1\1\6\0\1\1\1\0\3"+
    "\1\1\0\1\1\1\0\4\1\1\0\23\1\1\0\13\1\10\0\6\1\1\0\26\1\2\0\1\1\6\0\10\1\10"+
    "\0\13\1\5\0\3\1\33\0\6\1\1\0\1\1\17\0\2\1\7\0\2\1\12\0\3\1\2\0\2\1\1\0\16"+
    "\1\15\0\11\1\13\0\1\1\30\0\6\1\4\0\2\1\4\0\1\1\5\0\6\1\4\0\1\1\11\0\1\1\3"+
    "\0\1\1\7\0\11\1\7\0\5\1\1\0\10\1\6\0\26\1\3\0\1\1\2\0\1\1\7\0\11\1\4\0\10"+
    "\1\2\0\2\1\2\0\26\1\1\0\7\1\1\0\1\1\3\0\4\1\3\0\1\1\20\0\1\1\15\0\2\1\1\0"+
    "\1\1\5\0\6\1\4\0\2\1\1\0\2\1\1\0\2\1\1\0\2\1\17\0\4\1\1\0\1\1\3\0\3\1\20\0"+
    "\11\1\1\0\2\1\1\0\2\1\1\0\5\1\3\0\1\1\2\0\1\1\30\0\1\1\13\0\10\1\2\0\1\1\3"+
    "\0\1\1\1\0\6\1\3\0\3\1\1\0\4\1\3\0\2\1\1\0\1\1\1\0\2\1\3\0\2\1\3\0\3\1\3\0"+
    "\14\1\13\0\10\1\1\0\2\1\10\0\3\1\5\0\1\1\4\0\10\1\1\0\6\1\1\0\5\1\3\0\1\1"+
    "\3\0\2\1\15\0\13\1\2\0\1\1\6\0\3\1\10\0\1\1\5\0\22\1\3\0\10\1\1\0\11\1\1\0"+
    "\1\1\2\0\7\1\11\0\1\1\1\0\2\1\15\0\2\1\1\0\1\1\2\0\2\1\1\0\1\1\2\0\1\1\6\0"+
    "\4\1\1\0\7\1\1\0\3\1\1\0\1\1\1\0\1\1\2\0\2\1\1\0\4\1\1\0\2\1\11\0\1\1\2\0"+
    "\5\1\1\0\1\1\25\0\14\1\1\0\24\1\13\0\5\1\22\0\7\1\4\0\4\1\3\0\1\1\3\0\2\1"+
    "\7\0\3\1\4\0\15\1\14\0\1\1\1\0\6\1\1\0\1\1\5\0\1\1\2\0\13\1\1\0\15\1\1\0\4"+
    "\1\2\0\7\1\1\0\1\1\1\0\4\1\2\0\1\1\1\0\4\1\2\0\7\1\1\0\1\1\1\0\4\1\2\0\16"+
    "\1\2\0\6\1\2\0\15\1\2\0\1\1\1\0\10\1\7\0\15\1\1\0\6\1\23\0\1\1\4\0\1\1\3\0"+
    "\5\1\2\0\22\1\1\0\1\1\5\0\17\1\1\0\16\1\2\0\5\1\13\0\14\1\13\0\1\1\15\0\7"+
    "\1\7\0\16\1\15\0\2\1\11\0\4\1\1\0\4\1\3\0\2\1\11\0\10\1\1\0\1\1\1\0\1\1\1"+
    "\0\1\1\1\0\6\1\1\0\7\1\1\0\1\1\3\0\3\1\1\0\7\1\3\0\4\1\2\0\6\1\14\0\2\3\7"+
    "\0\1\1\15\0\1\1\2\0\1\1\4\0\1\1\2\0\12\1\1\0\1\1\3\0\5\1\6\0\1\1\1\0\1\1\1"+
    "\0\1\1\1\0\4\1\1\0\13\1\2\0\4\1\5\0\5\1\4\0\1\1\4\0\2\1\13\0\5\1\6\0\4\1\3"+
    "\0\2\1\14\0\10\1\7\0\10\1\1\0\7\1\6\0\2\1\12\0\5\1\5\0\2\1\3\0\7\1\6\0\3\1"+
    "\12\0\2\1\13\0\11\1\2\0\27\1\2\0\7\1\1\0\3\1\1\0\4\1\1\0\4\1\2\0\6\1\3\0\1"+
    "\1\1\0\1\1\2\0\5\1\1\0\12\1\12\0\5\1\1\0\3\1\1\0\10\1\4\0\7\1\3\0\1\1\3\0"+
    "\2\1\1\0\1\1\3\0\2\1\2\0\5\1\2\0\1\1\1\0\1\1\30\0\3\1\3\0\6\1\2\0\6\1\2\0"+
    "\6\1\11\0\7\1\4\0\5\1\3\0\5\1\5\0\1\1\1\0\10\1\1\0\5\1\1\0\1\1\1\0\2\1\1\0"+
    "\2\1\1\0\12\1\6\0\12\1\2\0\6\1\2\0\6\1\2\0\6\1\2\0\3\1\3\0\14\1\1\0\16\1\1"+
    "\0\2\1\1\0\2\1\1\0\10\1\6\0\4\1\4\0\16\1\2\0\1\1\1\0\14\1\1\0\2\1\3\0\1\1"+
    "\2\0\4\1\1\0\2\1\12\0\10\1\6\0\6\1\1\0\3\1\1\0\12\1\3\0\1\1\12\0\4\1\25\0"+
    "\1\1\1\0\1\1\3\0\7\1\1\0\1\1\1\0\4\1\1\0\17\1\1\0\2\1\14\0\3\1\7\0\4\1\11"+
    "\0\2\1\1\0\1\1\20\0\4\1\10\0\1\1\13\0\10\1\5\0\3\1\2\0\1\1\2\0\2\1\2\0\4\1"+
    "\1\0\14\1\1\0\1\1\1\0\7\1\1\0\21\1\1\0\4\1\2\0\10\1\1\0\7\1\1\0\14\1\1\0\4"+
    "\1\1\0\5\1\1\0\1\1\3\0\14\1\2\0\10\1\1\0\2\1\1\0\1\1\2\0\1\1\1\0\12\1\1\0"+
    "\4\1\1\0\1\1\1\0\1\1\6\0\1\1\4\0\1\1\1\0\1\1\1\0\1\1\1\0\3\1\1\0\2\1\1\0\1"+
    "\1\2\0\1\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0\2\1\1\0\1\1\2\0\4\1\1\0\7\1"+
    "\1\0\4\1\1\0\4\1\1\0\1\1\1\0\12\1\1\0\5\1\1\0\3\1\1\0\5\1\1\0\5\1");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\13\0\1\2\3\0\1\1\2\3\4\1\1\4"+
    "\1\5\4\4\1\6\1\4\3\7\1\10\1\7\1\11"+
    "\1\12\1\13\1\14\2\12\1\15\1\16\1\12\1\17"+
    "\1\5\1\20\1\21\1\5\1\22\1\23\1\21\1\24"+
    "\1\25\1\26\2\25\1\2\1\27\1\4\3\30\1\31"+
    "\1\7\3\31\1\32\1\33\1\0\1\34\1\35\14\0"+
    "\1\35\1\36\1\21\2\0\1\37\2\0\1\40\1\41"+
    "\12\0\1\42\1\0\1\43\1\44\1\0\1\45\3\0"+
    "\1\17\1\46\1\4\3\0\1\47\2\0\1\50";

  private static int [] zzUnpackAction() {
    int [] result = new int[125];
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
    "\0\0\0\65\0\152\0\237\0\324\0\u0109\0\u013e\0\u0173"+
    "\0\u01a8\0\u01dd\0\u0212\0\u0247\0\u027c\0\u02b1\0\u02e6\0\u031b"+
    "\0\u0350\0\u0385\0\u03ba\0\u03ef\0\u0424\0\u0459\0\u048e\0\u048e"+
    "\0\u04c3\0\u04f8\0\u052d\0\u0562\0\u0597\0\u048e\0\u0424\0\u048e"+
    "\0\u05cc\0\u0601\0\u048e\0\u0424\0\u048e\0\u048e\0\u0636\0\u048e"+
    "\0\u0424\0\u066b\0\u06a0\0\u048e\0\u06d5\0\u070a\0\u073f\0\u048e"+
    "\0\u0774\0\u07a9\0\u048e\0\u048e\0\u07de\0\u048e\0\u048e\0\u048e"+
    "\0\u0424\0\u0813\0\u0848\0\u048e\0\u087d\0\u048e\0\u0424\0\u06d5"+
    "\0\u048e\0\u08b2\0\u08e7\0\u0424\0\u091c\0\u048e\0\u0951\0\u0986"+
    "\0\u048e\0\u09bb\0\u09f0\0\u0a25\0\u0a5a\0\u0a8f\0\u0ac4\0\u0af9"+
    "\0\u04f8\0\u052d\0\u0b2e\0\u0b63\0\u0b98\0\u0bcd\0\u048e\0\u048e"+
    "\0\u0c02\0\u0c37\0\u0c6c\0\u048e\0\u0ca1\0\u0cd6\0\u0d0b\0\u048e"+
    "\0\u0d40\0\u0d75\0\u0daa\0\u0ddf\0\u0e14\0\u0e49\0\u0e7e\0\u0eb3"+
    "\0\u0ee8\0\u0f1d\0\u048e\0\u0f52\0\u048e\0\u048e\0\u0f87\0\u048e"+
    "\0\u0fbc\0\u0ff1\0\u1026\0\u048e\0\u048e\0\u105b\0\u1090\0\u10c5"+
    "\0\u10fa\0\u048e\0\u112f\0\u1164\0\u048e";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[125];
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
    "\3\21\1\22\4\21\1\23\2\21\1\24\27\21\1\25"+
    "\4\21\1\26\1\27\10\21\1\27\2\21\3\30\1\31"+
    "\4\30\1\31\1\32\1\33\11\30\2\34\1\30\1\35"+
    "\11\30\1\36\1\30\1\37\21\30\6\40\1\41\4\40"+
    "\1\42\25\40\1\43\1\40\1\44\2\40\1\45\16\40"+
    "\1\46\1\47\1\46\1\31\1\47\3\46\1\31\2\46"+
    "\1\50\1\46\24\47\2\46\1\51\11\46\5\47\1\46"+
    "\2\47\1\46\1\47\1\46\1\31\1\47\3\46\1\31"+
    "\2\46\1\52\1\46\24\47\2\46\1\51\11\46\5\47"+
    "\1\46\2\47\3\46\1\53\4\46\1\53\30\46\1\54"+
    "\1\46\1\51\1\46\1\55\17\46\3\56\1\57\3\56"+
    "\1\60\1\31\3\46\25\56\1\54\3\56\1\55\17\56"+
    "\43\30\1\37\21\30\3\61\1\62\4\61\1\31\1\63"+
    "\1\64\26\61\1\54\3\61\1\65\4\61\1\66\12\61"+
    "\11\67\1\70\31\67\1\71\4\67\1\72\26\67\1\70"+
    "\30\67\1\71\4\67\1\72\57\67\1\71\4\67\1\72"+
    "\2\67\1\70\11\67\41\73\1\74\2\73\1\75\20\73"+
    "\3\76\1\31\4\76\1\31\2\76\1\50\25\76\1\54"+
    "\1\76\1\77\1\76\1\100\17\76\1\101\1\102\4\101"+
    "\1\103\6\101\24\102\2\101\1\104\3\101\1\105\5\101"+
    "\5\102\1\101\2\102\1\101\1\102\4\101\1\103\6\101"+
    "\24\102\2\101\1\104\3\101\1\106\5\101\5\102\1\101"+
    "\2\102\10\21\1\0\2\21\1\0\27\21\1\0\4\21"+
    "\1\26\1\0\10\21\1\0\5\21\1\22\4\21\1\23"+
    "\2\21\1\0\27\21\1\0\4\21\1\26\1\0\10\21"+
    "\1\0\2\21\3\0\1\23\4\0\1\23\55\0\1\107"+
    "\2\0\1\107\7\0\1\110\24\107\3\0\1\111\1\112"+
    "\7\0\5\107\1\0\2\107\1\0\1\113\2\0\1\113"+
    "\10\0\16\113\1\114\5\113\14\0\1\114\1\115\1\113"+
    "\1\116\1\117\1\120\2\113\10\21\1\0\2\21\1\0"+
    "\27\21\1\0\4\21\1\26\14\21\70\0\1\31\4\0"+
    "\1\31\54\0\11\121\1\67\53\121\12\122\1\67\52\122"+
    "\34\0\2\123\50\0\2\124\50\0\1\125\72\0\1\126"+
    "\51\0\2\47\1\0\3\47\6\0\24\47\14\0\5\47"+
    "\1\0\2\47\45\0\1\127\22\0\1\53\4\0\1\53"+
    "\115\0\1\130\23\0\7\56\5\0\25\56\1\0\3\56"+
    "\1\0\22\56\1\57\3\56\1\0\1\31\3\0\25\56"+
    "\1\0\3\56\1\0\17\56\10\61\1\0\30\61\1\0"+
    "\3\61\1\131\22\61\1\62\4\61\1\31\30\61\1\0"+
    "\3\61\1\131\27\61\1\0\30\61\1\130\3\61\1\131"+
    "\17\61\51\0\1\67\13\0\41\73\1\0\2\73\1\132"+
    "\61\73\1\74\23\73\1\0\3\102\1\0\1\102\2\0"+
    "\1\102\3\0\25\102\1\0\2\102\11\0\5\102\1\0"+
    "\2\102\6\0\1\133\117\0\1\134\24\0\2\107\1\0"+
    "\3\107\6\0\24\107\14\0\5\107\1\0\2\107\6\0"+
    "\1\135\6\0\1\136\50\0\1\137\2\0\1\137\10\0"+
    "\24\137\14\0\5\137\1\0\2\137\1\0\2\113\1\0"+
    "\3\113\6\0\24\113\13\0\1\140\5\113\1\0\2\113"+
    "\1\0\2\113\1\0\3\113\6\0\5\113\1\141\16\113"+
    "\13\0\1\140\5\113\1\0\2\113\1\0\2\113\1\0"+
    "\3\113\6\0\10\113\1\142\3\113\1\143\7\113\13\0"+
    "\1\140\5\113\1\0\2\113\1\0\2\113\1\0\3\113"+
    "\6\0\20\113\1\144\3\113\13\0\1\140\5\113\1\0"+
    "\2\113\1\0\2\113\1\0\3\113\6\0\22\113\1\145"+
    "\1\113\13\0\1\140\5\113\1\0\2\113\2\0\1\146"+
    "\60\0\1\147\37\0\2\150\55\0\2\151\47\0\1\152"+
    "\24\0\1\153\31\0\1\154\37\0\1\155\16\0\41\61"+
    "\1\0\3\61\1\131\17\61\41\73\1\0\23\73\41\0"+
    "\1\153\31\0\1\156\74\0\2\157\46\0\2\137\1\0"+
    "\3\137\6\0\24\137\14\0\5\137\1\0\2\137\1\0"+
    "\2\113\1\0\3\113\6\0\24\113\13\0\1\160\5\113"+
    "\1\0\2\113\1\0\2\113\1\0\3\113\6\0\2\113"+
    "\1\161\21\113\13\0\1\140\5\113\1\0\2\113\1\0"+
    "\2\113\1\0\3\113\6\0\10\113\1\141\13\113\13\0"+
    "\1\140\5\113\1\0\2\113\1\0\2\113\1\0\3\113"+
    "\6\0\2\113\1\114\21\113\13\0\1\140\5\113\1\0"+
    "\2\113\1\0\2\113\1\0\3\113\6\0\24\113\13\0"+
    "\1\140\2\113\1\143\2\113\1\0\2\113\2\0\1\146"+
    "\51\0\1\160\12\0\1\162\12\0\1\162\2\0\1\162"+
    "\5\0\1\162\7\0\2\162\16\0\1\162\5\0\1\162"+
    "\32\0\2\163\63\0\2\164\72\0\1\165\31\0\1\166"+
    "\76\0\1\167\45\0\2\113\1\0\3\113\6\0\24\113"+
    "\13\0\1\140\2\113\1\141\2\113\1\0\2\113\2\0"+
    "\1\162\12\0\1\162\2\0\1\162\5\0\1\162\7\0"+
    "\2\162\14\0\1\160\1\0\1\162\5\0\1\162\40\0"+
    "\1\170\32\0\1\152\32\0\1\153\44\0\2\171\62\0"+
    "\1\172\67\0\1\173\65\0\2\174\65\0\1\175\36\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4505];
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

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\13\0\1\1\3\0\6\1\2\11\5\1\1\11"+
    "\1\1\1\11\2\1\1\11\1\1\2\11\1\1\1\11"+
    "\3\1\1\11\3\1\1\11\2\1\2\11\1\1\3\11"+
    "\3\1\1\11\1\1\1\11\2\1\1\11\4\1\1\11"+
    "\1\1\1\0\1\11\1\1\14\0\2\11\1\1\2\0"+
    "\1\11\2\0\1\1\1\11\12\0\1\11\1\0\2\11"+
    "\1\0\1\11\3\0\2\11\1\1\3\0\1\11\2\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[125];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

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
  public _SeafoodLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _SeafoodLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
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
    return zzBuffer.charAt(zzStartRead+pos);
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

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return XmlTokenType.XML_DATA_CHARACTERS;
            } 
            // fall through
          case 41: break;
          case 2: 
            { return XmlTokenType.XML_PI_TARGET;
            } 
            // fall through
          case 42: break;
          case 3: 
            { return XmlTokenType.XML_REAL_WHITE_SPACE;
            } 
            // fall through
          case 43: break;
          case 4: 
            { return XmlTokenType.XML_BAD_CHARACTER;
            } 
            // fall through
          case 44: break;
          case 5: 
            { return XmlTokenType.XML_WHITE_SPACE;
            } 
            // fall through
          case 45: break;
          case 6: 
            { yybegin(YYINITIAL); return XmlTokenType.XML_DOCTYPE_END;
            } 
            // fall through
          case 46: break;
          case 7: 
            { return XmlTokenType.XML_COMMENT_CHARACTERS;
            } 
            // fall through
          case 47: break;
          case 8: 
            { // according to HTML spec (http://www.w3.org/html/wg/drafts/html/master/syntax.html#comments)
  // comments should start with <!-- and end with -->. The comment <!--> is not valid, but should terminate
  // comment token. Please note that it's not true for XML (http://www.w3.org/TR/REC-xml/#sec-comments)
  int loc = getTokenStart();
  char prev = zzBuffer.charAt(loc - 1);
  char prevPrev = zzBuffer.charAt(loc - 2);
  if (prev == '-' && prevPrev == '-') {
    yybegin(YYINITIAL); return XmlTokenType.XML_BAD_CHARACTER;
  }
  return XmlTokenType.XML_COMMENT_CHARACTERS;
            } 
            // fall through
          case 48: break;
          case 9: 
            { yybegin(C_COMMENT_START); return XmlTokenType.XML_CONDITIONAL_COMMENT_START;
            } 
            // fall through
          case 49: break;
          case 10: 
            { yybegin(YYINITIAL); yypushback(1); break;
            } 
            // fall through
          case 50: break;
          case 11: 
            { yybegin(BEFORE_TAG_ATTRIBUTES); return XmlTokenType.XML_NAME;
            } 
            // fall through
          case 51: break;
          case 12: 
            { return XmlTokenType.XML_START_TAG_START;
            } 
            // fall through
          case 52: break;
          case 13: 
            { yybegin(TAG_ATTRIBUTES); return XmlTokenType.XML_WHITE_SPACE;
            } 
            // fall through
          case 53: break;
          case 14: 
            { yybegin(YYINITIAL); return XmlTokenType.XML_TAG_END;
            } 
            // fall through
          case 54: break;
          case 15: 
            { return XmlTokenType.XML_NAME;
            } 
            // fall through
          case 55: break;
          case 16: 
            { yybegin(ATTRIBUTE_VALUE_START); return XmlTokenType.XML_EQ;
            } 
            // fall through
          case 56: break;
          case 17: 
            { yybegin(TAG_ATTRIBUTES); return XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;
            } 
            // fall through
          case 57: break;
          case 18: 
            { yybegin(ATTRIBUTE_VALUE_DQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
            } 
            // fall through
          case 58: break;
          case 19: 
            { yybegin(ATTRIBUTE_VALUE_SQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
            } 
            // fall through
          case 59: break;
          case 20: 
            { yybegin(ATTRIBUTE_VALUE_BQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
            } 
            // fall through
          case 60: break;
          case 21: 
            { return XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;
            } 
            // fall through
          case 61: break;
          case 22: 
            { yybegin(TAG_ATTRIBUTES); return XmlTokenType.XML_ATTRIBUTE_VALUE_END_DELIMITER;
            } 
            // fall through
          case 62: break;
          case 23: 
            { yybegin(YYINITIAL); return XmlTokenType.XML_PI_END;
            } 
            // fall through
          case 63: break;
          case 24: 
            { return XmlTokenType.XML_TAG_CHARACTERS;
            } 
            // fall through
          case 64: break;
          case 25: 
            { yybegin(COMMENT); return XmlTokenType.XML_COMMENT_CHARACTERS;
            } 
            // fall through
          case 65: break;
          case 26: 
            { yybegin(COMMENT); return XmlTokenType.XML_CONDITIONAL_COMMENT_END;
            } 
            // fall through
          case 66: break;
          case 27: 
            { yybegin(START_TAG_NAME); yypushback(yylength());
            } 
            // fall through
          case 67: break;
          case 28: 
            { yybegin(PROCESSING_INSTRUCTION); return XmlTokenType.XML_PI_START;
            } 
            // fall through
          case 68: break;
          case 29: 
            { return XmlTokenType.XML_END_TAG_START;
            } 
            // fall through
          case 69: break;
          case 30: 
            { yybegin(YYINITIAL); return XmlTokenType.XML_EMPTY_ELEMENT_END;
            } 
            // fall through
          case 70: break;
          case 31: 
            { yybegin(COMMENT); return XmlTokenType.XML_CONDITIONAL_COMMENT_START_END;
            } 
            // fall through
          case 71: break;
          case 32: 
            { yybegin(END_TAG_NAME); yypushback(yylength());
            } 
            // fall through
          case 72: break;
          case 33: 
            { return XmlTokenType.XML_ENTITY_REF_TOKEN;
            } 
            // fall through
          case 73: break;
          case 34: 
            { yybegin(YYINITIAL); return XmlTokenType.XML_COMMENT_END;
            } 
            // fall through
          case 74: break;
          case 35: 
            { yybegin(C_COMMENT_END); return XmlTokenType.XML_CONDITIONAL_COMMENT_END_START;
            } 
            // fall through
          case 75: break;
          case 36: 
            { yybegin(COMMENT); return XmlTokenType.XML_COMMENT_START;
            } 
            // fall through
          case 76: break;
          case 37: 
            { return XmlTokenType.XML_CHAR_ENTITY_REF;
            } 
            // fall through
          case 77: break;
          case 38: 
            { yybegin(YYINITIAL); return XmlTokenType.XML_BAD_CHARACTER;
            } 
            // fall through
          case 78: break;
          case 39: 
            { return XmlTokenType.XML_DOCTYPE_PUBLIC;
            } 
            // fall through
          case 79: break;
          case 40: 
            { yybegin(DOC_TYPE); return XmlTokenType.XML_DOCTYPE_START;
            } 
            // fall through
          case 80: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
