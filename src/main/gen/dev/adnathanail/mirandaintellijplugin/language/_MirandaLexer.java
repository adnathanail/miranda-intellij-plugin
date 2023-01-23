/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package dev.adnathanail.mirandaintellijplugin.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static dev.adnathanail.mirandaintellijplugin.language.psi.MirandaTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>_MirandaLexer.flex</tt>
 */
public class _MirandaLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\4\1\2\2\1\1\2\22\0\1\4\1\26\1\10\1\34\1\0\1\65\1\25\1\7\1\42\1\43"+
    "\1\24\1\23\1\35\1\21\1\27\1\31\12\11\1\20\1\5\1\15\1\17\1\16\1\22\1\0\5\14"+
    "\1\73\15\14\1\72\6\14\1\40\1\30\1\41\1\33\1\13\1\0\1\55\1\56\1\67\1\61\1\51"+
    "\1\45\1\12\1\50\1\44\2\12\1\64\1\63\1\66\1\46\1\60\1\12\1\52\1\54\1\47\1\70"+
    "\1\62\1\53\1\71\1\57\1\12\1\36\1\6\1\37\1\32\6\0\1\1\32\0\1\3\337\0\1\3\177"+
    "\0\13\3\35\0\2\1\5\0\1\3\57\0\1\3\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\2\1\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\1\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\10\7\1\1\2\10\1\37\2\0\1\40\1\0"+
    "\1\41\1\0\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
    "\1\60\10\7\3\0\2\10\1\37\1\0\1\61\1\62"+
    "\6\7\1\63\1\64\3\0\2\10\2\7\1\65\1\7"+
    "\1\66\1\7\3\0\1\67\1\10\2\7\1\70\1\7"+
    "\1\0\1\71\1\0\1\72\3\7\2\0\2\7\1\73"+
    "\1\0\1\74\1\7\1\75\1\76\1\77";

  private static int [] zzUnpackAction() {
    int [] result = new int[130];
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
    "\0\0\0\74\0\170\0\264\0\170\0\360\0\u012c\0\u0168"+
    "\0\u01a4\0\u01e0\0\u021c\0\u0258\0\u0294\0\u02d0\0\u030c\0\u0348"+
    "\0\74\0\u0384\0\74\0\74\0\74\0\u03c0\0\u03fc\0\u0438"+
    "\0\u0474\0\74\0\74\0\74\0\74\0\74\0\74\0\74"+
    "\0\74\0\74\0\u04b0\0\u04ec\0\u0528\0\u0564\0\u05a0\0\u05dc"+
    "\0\u0618\0\u0654\0\u0690\0\u06cc\0\u0708\0\u0744\0\u0780\0\u07bc"+
    "\0\74\0\u0168\0\74\0\u07f8\0\u07f8\0\u07f8\0\u07f8\0\74"+
    "\0\74\0\74\0\u0834\0\74\0\74\0\74\0\74\0\74"+
    "\0\74\0\74\0\u01e0\0\u0870\0\u08ac\0\u08e8\0\u0924\0\u0960"+
    "\0\u099c\0\u09d8\0\u0a14\0\u0a50\0\u0a8c\0\u0ac8\0\u0b04\0\u0b40"+
    "\0\u0b7c\0\u0bb8\0\74\0\74\0\u0bf4\0\u0c30\0\u0c6c\0\u0ca8"+
    "\0\u0ce4\0\u0d20\0\u01e0\0\u01e0\0\u0d5c\0\u0d98\0\u0dd4\0\u0e10"+
    "\0\u0e4c\0\u0e88\0\u0ec4\0\u01e0\0\u0f00\0\u01e0\0\u0f3c\0\u0f78"+
    "\0\u0fb4\0\u0ff0\0\u021c\0\u102c\0\u1068\0\u10a4\0\u01e0\0\u10e0"+
    "\0\u111c\0\74\0\u1158\0\u021c\0\u1194\0\u11d0\0\u120c\0\u1248"+
    "\0\u1284\0\u12c0\0\u12fc\0\u01e0\0\u1338\0\74\0\u1374\0\u01e0"+
    "\0\74\0\u01e0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[130];
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
    "\2\2\1\3\1\2\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\2\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\12\1\44\3\12\1\45"+
    "\1\46\1\47\1\50\3\12\1\51\1\12\1\52\1\12"+
    "\1\53\4\12\1\54\1\55\76\0\1\3\2\0\1\3"+
    "\72\0\1\4\75\0\1\56\65\0\1\57\4\60\2\57"+
    "\1\61\64\57\10\62\1\63\63\62\11\0\1\11\73\0"+
    "\4\12\27\0\21\12\1\0\6\12\11\0\4\13\27\0"+
    "\21\13\1\0\6\13\1\64\4\0\10\64\1\65\1\0"+
    "\1\66\1\64\1\67\52\64\16\0\1\70\1\71\73\0"+
    "\1\72\74\0\1\73\71\0\1\74\2\0\1\75\75\0"+
    "\1\76\77\0\1\77\75\0\1\100\73\0\1\101\65\0"+
    "\1\102\61\0\4\12\27\0\1\12\1\103\17\12\1\0"+
    "\6\12\11\0\4\12\27\0\3\12\1\104\15\12\1\0"+
    "\6\12\11\0\4\12\27\0\5\12\1\105\13\12\1\0"+
    "\6\12\11\0\4\12\27\0\1\106\3\12\1\107\14\12"+
    "\1\0\6\12\11\0\4\12\27\0\4\12\1\110\14\12"+
    "\1\0\6\12\11\0\4\12\27\0\12\12\1\111\6\12"+
    "\1\0\6\12\11\0\4\12\27\0\1\112\20\12\1\0"+
    "\6\12\11\0\4\12\27\0\2\12\1\113\16\12\1\0"+
    "\6\12\44\0\1\114\1\115\3\0\1\116\33\0\4\13"+
    "\27\0\6\13\1\117\12\13\1\0\6\13\11\0\4\13"+
    "\27\0\11\13\1\120\7\13\1\0\6\13\1\56\1\0"+
    "\1\121\71\56\1\122\4\0\2\122\1\61\64\122\7\0"+
    "\1\61\64\0\1\64\4\0\11\64\1\123\55\64\17\0"+
    "\1\124\65\0\4\12\27\0\4\12\1\125\14\12\1\0"+
    "\6\12\11\0\4\12\27\0\11\12\1\126\7\12\1\0"+
    "\6\12\11\0\4\12\27\0\3\12\1\127\15\12\1\0"+
    "\6\12\11\0\4\12\27\0\5\12\1\130\13\12\1\0"+
    "\6\12\11\0\4\12\27\0\2\12\1\131\16\12\1\0"+
    "\6\12\11\0\4\12\27\0\10\12\1\132\10\12\1\0"+
    "\6\12\11\0\4\12\27\0\16\12\1\133\2\12\1\0"+
    "\6\12\11\0\4\12\27\0\15\12\1\134\3\12\1\0"+
    "\6\12\66\0\1\135\57\0\1\136\112\0\1\137\13\0"+
    "\4\13\27\0\21\13\1\0\2\13\1\140\3\13\11\0"+
    "\4\13\27\0\20\13\1\141\1\0\6\13\2\0\1\121"+
    "\71\0\1\122\4\0\2\122\1\123\64\122\11\0\4\12"+
    "\27\0\5\12\1\142\13\12\1\0\6\12\11\0\4\12"+
    "\27\0\15\12\1\143\3\12\1\0\6\12\11\0\4\12"+
    "\27\0\4\12\1\144\14\12\1\0\6\12\11\0\4\12"+
    "\27\0\6\12\1\145\12\12\1\0\6\12\11\0\4\12"+
    "\27\0\7\12\1\146\11\12\1\0\6\12\11\0\4\12"+
    "\27\0\3\12\1\147\15\12\1\0\6\12\67\0\1\150"+
    "\55\0\1\151\102\0\1\152\24\0\4\13\27\0\5\13"+
    "\1\153\13\13\1\0\6\13\11\0\4\13\27\0\10\13"+
    "\1\154\10\13\1\0\6\13\11\0\4\12\27\0\6\12"+
    "\1\155\12\12\1\0\6\12\11\0\4\12\27\0\16\12"+
    "\1\156\2\12\1\0\6\12\11\0\4\12\27\0\5\12"+
    "\1\157\13\12\1\0\6\12\11\0\4\12\27\0\13\12"+
    "\1\160\5\12\1\0\6\12\64\0\1\161\60\0\1\162"+
    "\70\0\1\163\36\0\4\13\27\0\5\13\1\164\13\13"+
    "\1\0\6\13\11\0\4\12\27\0\7\12\1\165\11\12"+
    "\1\0\6\12\11\0\4\12\27\0\11\12\1\166\7\12"+
    "\1\0\6\12\11\0\4\12\27\0\14\12\1\167\4\12"+
    "\1\0\6\12\70\0\1\170\55\0\1\171\32\0\4\12"+
    "\27\0\1\172\20\12\1\0\6\12\11\0\4\12\27\0"+
    "\20\12\1\173\1\0\6\12\11\0\4\12\27\0\5\12"+
    "\1\174\13\12\1\0\6\12\61\0\1\175\61\0\1\176"+
    "\35\0\4\12\27\0\10\12\1\177\10\12\1\0\6\12"+
    "\11\0\4\12\27\0\10\12\1\200\10\12\1\0\6\12"+
    "\51\0\1\201\33\0\4\12\27\0\5\12\1\202\13\12"+
    "\1\0\6\12";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5040];
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
    "\1\0\1\11\16\1\1\11\1\1\3\11\4\1\11\11"+
    "\14\1\2\0\1\11\1\0\1\11\1\0\3\1\3\11"+
    "\1\1\7\11\11\1\3\0\3\1\1\0\2\11\10\1"+
    "\3\0\10\1\3\0\6\1\1\0\1\11\1\0\4\1"+
    "\2\0\3\1\1\0\1\11\2\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[130];
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
  public _MirandaLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _MirandaLexer(java.io.Reader in) {
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
   * @return      {@code false}, iff there was new input.
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
   * Returns the character at position {@code pos} from the
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
   * Reports an error that occurred while scanning.
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
            { return BAD_CHARACTER;
            } 
            // fall through
          case 64: break;
          case 2: 
            { return LINE_ENDING;
            } 
            // fall through
          case 65: break;
          case 3: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 66: break;
          case 4: 
            { return SEMICOLON;
            } 
            // fall through
          case 67: break;
          case 5: 
            { return OP_OR;
            } 
            // fall through
          case 68: break;
          case 6: 
            { return NUMBER;
            } 
            // fall through
          case 69: break;
          case 7: 
            { return IDENTIFIER_LOWER;
            } 
            // fall through
          case 70: break;
          case 8: 
            { return IDENTIFIER_UPPER;
            } 
            // fall through
          case 71: break;
          case 9: 
            { return OP_SMALLER;
            } 
            // fall through
          case 72: break;
          case 10: 
            { return OP_GREATER;
            } 
            // fall through
          case 73: break;
          case 11: 
            { return OP_EQ;
            } 
            // fall through
          case 74: break;
          case 12: 
            { return COLON;
            } 
            // fall through
          case 75: break;
          case 13: 
            { return OP_MINUS;
            } 
            // fall through
          case 76: break;
          case 14: 
            { return OP_OPT;
            } 
            // fall through
          case 77: break;
          case 15: 
            { return OP_ONEMORE;
            } 
            // fall through
          case 78: break;
          case 16: 
            { return OP_ZEROMORE;
            } 
            // fall through
          case 79: break;
          case 17: 
            { return OP_AND;
            } 
            // fall through
          case 80: break;
          case 18: 
            { return OP_NOT;
            } 
            // fall through
          case 81: break;
          case 19: 
            { return OP_DOT;
            } 
            // fall through
          case 82: break;
          case 20: 
            { return SLASH;
            } 
            // fall through
          case 83: break;
          case 21: 
            { return OP_SIMILAR;
            } 
            // fall through
          case 84: break;
          case 22: 
            { return OP_EXPONENT;
            } 
            // fall through
          case 85: break;
          case 23: 
            { return OP_HASH;
            } 
            // fall through
          case 86: break;
          case 24: 
            { return SEP_COMMA;
            } 
            // fall through
          case 87: break;
          case 25: 
            { return LEFT_BRACE;
            } 
            // fall through
          case 88: break;
          case 26: 
            { return RIGHT_BRACE;
            } 
            // fall through
          case 89: break;
          case 27: 
            { return LEFT_BRACKET;
            } 
            // fall through
          case 90: break;
          case 28: 
            { return RIGHT_BRACKET;
            } 
            // fall through
          case 91: break;
          case 29: 
            { return LEFT_PAREN;
            } 
            // fall through
          case 92: break;
          case 30: 
            { return RIGHT_PAREN;
            } 
            // fall through
          case 93: break;
          case 31: 
            { return COMMENT;
            } 
            // fall through
          case 94: break;
          case 32: 
            { return CHAR;
            } 
            // fall through
          case 95: break;
          case 33: 
            { return STRING;
            } 
            // fall through
          case 96: break;
          case 34: 
            { return EXTERNAL_START;
            } 
            // fall through
          case 97: break;
          case 35: 
            { return OP_SMALLER_EQUAL;
            } 
            // fall through
          case 98: break;
          case 36: 
            { return OP_GENERATE;
            } 
            // fall through
          case 99: break;
          case 37: 
            { return EXTERNAL_END;
            } 
            // fall through
          case 100: break;
          case 38: 
            { return OP_GREATER_EQUAL;
            } 
            // fall through
          case 101: break;
          case 39: 
            { return OP_DOUBLE_EQ;
            } 
            // fall through
          case 102: break;
          case 40: 
            { return OP_SPEC;
            } 
            // fall through
          case 103: break;
          case 41: 
            { return OP_ARG;
            } 
            // fall through
          case 104: break;
          case 42: 
            { return OP_DOUBLE_MINUS;
            } 
            // fall through
          case 105: break;
          case 43: 
            { return OP_DOUBLE_ADD;
            } 
            // fall through
          case 106: break;
          case 44: 
            { return OP_DOTS;
            } 
            // fall through
          case 107: break;
          case 45: 
            { return OP_BACK_FWD_SLASH;
            } 
            // fall through
          case 108: break;
          case 46: 
            { return DOUBLE_SLASH;
            } 
            // fall through
          case 109: break;
          case 47: 
            { return OP_SNAKE_ADD;
            } 
            // fall through
          case 110: break;
          case 48: 
            { return IF;
            } 
            // fall through
          case 111: break;
          case 49: 
            { return PATHNAME;
            } 
            // fall through
          case 112: break;
          case 50: 
            { return OP_IS;
            } 
            // fall through
          case 113: break;
          case 51: 
            { return DIV;
            } 
            // fall through
          case 114: break;
          case 52: 
            { return MOD;
            } 
            // fall through
          case 115: break;
          case 53: 
            { return WITH;
            } 
            // fall through
          case 116: break;
          case 54: 
            { return SHOW;
            } 
            // fall through
          case 117: break;
          case 55: 
            { return TRUE;
            } 
            // fall through
          case 118: break;
          case 56: 
            { return WHERE;
            } 
            // fall through
          case 119: break;
          case 57: 
            { return FREE;
            } 
            // fall through
          case 120: break;
          case 58: 
            { return FALSE;
            } 
            // fall through
          case 121: break;
          case 59: 
            { return ABSTYPE;
            } 
            // fall through
          case 122: break;
          case 60: 
            { return EXPORT;
            } 
            // fall through
          case 123: break;
          case 61: 
            { return READVALS;
            } 
            // fall through
          case 124: break;
          case 62: 
            { return INCLUDE;
            } 
            // fall through
          case 125: break;
          case 63: 
            { return OTHERWISE;
            } 
            // fall through
          case 126: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
