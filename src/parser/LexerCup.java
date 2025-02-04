/* The following code was generated by JFlex 1.4.3 on 27/11/24, 8:48 a.m. */

package parser;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 27/11/24, 8:48 a.m. from the specification file
 * <tt>C:/Users/noefl/OneDrive/Documentos/NetBeansProjects/FlorianCompiler/src/parser/LexerCup.flex</tt>
 */
public class LexerCup implements java_cup.runtime.Scanner {

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
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  4,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 36,  6,  0,  0,  0, 34,  0, 38, 39, 33, 31,  0, 32, 46,  5, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 44, 45, 37, 30, 37,  0, 
     0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1, 22,  1,  1,  1,  1,  1,  1,  1, 42,  0, 43,  0,  1, 
     0, 13,  7, 11, 20, 10, 19, 18, 12, 23,  1, 25, 15, 28, 17, 16, 
    24,  1, 14, 26,  9, 21, 27, 29,  1,  8,  1, 40, 35, 41,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\20\2\1\10\1\11\1\12\1\13\2\1\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\13\2\1\31\3\2\1\32\7\2"+
    "\1\15\1\33\1\14\7\2\1\34\2\2\1\35\3\2"+
    "\1\36\7\2\1\37\1\40\1\2\1\41\6\2\1\42"+
    "\1\43\1\2\1\44\5\2\1\45\1\46\2\2\1\47"+
    "\1\50\1\51\1\52";

  private static int [] zzUnpackAction() {
    int [] result = new int[118];
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
    "\0\0\0\57\0\136\0\215\0\274\0\57\0\353\0\57"+
    "\0\u011a\0\u0149\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263"+
    "\0\u0292\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db"+
    "\0\u040a\0\u0439\0\u0468\0\u0497\0\u04c6\0\u04f5\0\u040a\0\u040a"+
    "\0\57\0\57\0\57\0\57\0\57\0\57\0\57\0\57"+
    "\0\57\0\u0524\0\57\0\u0553\0\u0582\0\u05b1\0\u05e0\0\u060f"+
    "\0\u063e\0\u066d\0\u069c\0\u06cb\0\u06fa\0\u0729\0\u0758\0\u0787"+
    "\0\u07b6\0\u07e5\0\136\0\u0814\0\u0843\0\u0872\0\u08a1\0\u08d0"+
    "\0\u08ff\0\u092e\0\57\0\57\0\57\0\u095d\0\u098c\0\u09bb"+
    "\0\u09ea\0\u0a19\0\u0a48\0\u0a77\0\136\0\u0aa6\0\u0ad5\0\136"+
    "\0\u0b04\0\u0b33\0\u0b62\0\136\0\u0b91\0\u0bc0\0\u0bef\0\u0c1e"+
    "\0\u0c4d\0\u0c7c\0\u0cab\0\136\0\136\0\u0cda\0\136\0\u0d09"+
    "\0\u0d38\0\u0d67\0\u0d96\0\u0dc5\0\u0df4\0\136\0\136\0\u0e23"+
    "\0\136\0\u0e52\0\u0e81\0\u0eb0\0\u0edf\0\u0f0e\0\136\0\136"+
    "\0\u0f3d\0\u0f6c\0\136\0\136\0\136\0\136";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[118];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\3\1\12\1\13\1\14\1\3\1\15\1\3\1\16"+
    "\1\17\2\3\1\20\1\21\1\3\1\22\1\23\1\24"+
    "\1\3\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\60\0\2\3"+
    "\4\0\27\3\23\0\1\4\57\0\1\5\60\0\1\52"+
    "\30\0\1\53\21\0\2\3\4\0\1\3\1\54\25\3"+
    "\22\0\2\3\4\0\7\3\1\55\17\3\22\0\2\3"+
    "\4\0\10\3\1\56\16\3\22\0\2\3\4\0\5\3"+
    "\1\57\2\3\1\60\16\3\22\0\2\3\4\0\7\3"+
    "\1\61\17\3\22\0\2\3\4\0\11\3\1\62\15\3"+
    "\22\0\2\3\4\0\16\3\1\63\10\3\22\0\2\3"+
    "\4\0\6\3\1\64\1\3\1\65\1\66\15\3\22\0"+
    "\2\3\4\0\11\3\1\67\15\3\22\0\2\3\4\0"+
    "\1\3\1\70\1\71\24\3\22\0\2\3\4\0\12\3"+
    "\1\72\1\3\1\73\12\3\22\0\2\3\4\0\6\3"+
    "\1\74\1\75\6\3\1\76\10\3\22\0\2\3\4\0"+
    "\2\3\1\77\24\3\22\0\2\3\4\0\11\3\1\100"+
    "\15\3\22\0\2\3\4\0\6\3\1\101\20\3\22\0"+
    "\2\3\4\0\5\3\1\102\21\3\57\0\1\103\56\0"+
    "\1\53\1\104\55\0\1\53\1\0\1\104\54\0\1\53"+
    "\62\0\1\105\57\0\1\105\13\0\4\52\1\0\52\52"+
    "\1\0\2\3\4\0\2\3\1\106\24\3\22\0\2\3"+
    "\4\0\16\3\1\107\10\3\22\0\2\3\4\0\23\3"+
    "\1\110\3\3\22\0\2\3\4\0\6\3\1\111\20\3"+
    "\22\0\2\3\4\0\6\3\1\112\20\3\22\0\2\3"+
    "\4\0\13\3\1\113\13\3\22\0\2\3\4\0\12\3"+
    "\1\114\14\3\22\0\2\3\4\0\2\3\1\115\24\3"+
    "\22\0\2\3\4\0\10\3\1\116\16\3\22\0\2\3"+
    "\4\0\11\3\1\117\15\3\22\0\2\3\4\0\7\3"+
    "\1\120\17\3\22\0\2\3\4\0\16\3\1\121\10\3"+
    "\22\0\2\3\4\0\23\3\1\122\3\3\22\0\2\3"+
    "\4\0\7\3\1\123\17\3\22\0\2\3\4\0\2\3"+
    "\1\124\24\3\22\0\2\3\4\0\4\3\1\125\22\3"+
    "\22\0\2\3\4\0\20\3\1\126\6\3\22\0\2\3"+
    "\4\0\1\127\26\3\22\0\2\3\4\0\6\3\1\130"+
    "\20\3\22\0\2\3\4\0\20\3\1\131\6\3\22\0"+
    "\2\3\4\0\20\3\1\132\6\3\22\0\2\3\4\0"+
    "\20\3\1\133\6\3\22\0\2\3\4\0\3\3\1\124"+
    "\23\3\22\0\2\3\4\0\3\3\1\134\23\3\22\0"+
    "\2\3\4\0\3\3\1\135\23\3\22\0\2\3\4\0"+
    "\7\3\1\124\17\3\22\0\2\3\4\0\23\3\1\136"+
    "\3\3\22\0\2\3\4\0\23\3\1\137\3\3\22\0"+
    "\2\3\4\0\13\3\1\124\13\3\22\0\2\3\4\0"+
    "\23\3\1\107\3\3\22\0\2\3\4\0\6\3\1\72"+
    "\20\3\22\0\2\3\4\0\1\140\26\3\22\0\2\3"+
    "\4\0\2\3\1\141\24\3\22\0\2\3\4\0\20\3"+
    "\1\62\6\3\22\0\2\3\4\0\22\3\1\142\4\3"+
    "\22\0\2\3\4\0\12\3\1\143\14\3\22\0\2\3"+
    "\4\0\10\3\1\144\16\3\22\0\2\3\4\0\2\3"+
    "\1\145\24\3\22\0\2\3\4\0\15\3\1\146\11\3"+
    "\22\0\2\3\4\0\12\3\1\147\14\3\22\0\2\3"+
    "\4\0\10\3\1\150\16\3\22\0\2\3\4\0\23\3"+
    "\1\151\3\3\22\0\2\3\4\0\10\3\1\106\16\3"+
    "\22\0\2\3\4\0\3\3\1\152\23\3\22\0\2\3"+
    "\4\0\6\3\1\153\20\3\22\0\2\3\4\0\2\3"+
    "\1\154\24\3\22\0\2\3\4\0\20\3\1\155\6\3"+
    "\22\0\2\3\4\0\20\3\1\156\6\3\22\0\2\3"+
    "\4\0\3\3\1\157\23\3\22\0\2\3\4\0\25\3"+
    "\1\160\1\3\22\0\2\3\4\0\13\3\1\161\13\3"+
    "\22\0\2\3\4\0\10\3\1\162\16\3\22\0\2\3"+
    "\4\0\4\3\1\163\22\3\22\0\2\3\4\0\4\3"+
    "\1\164\22\3\22\0\2\3\4\0\3\3\1\165\23\3"+
    "\22\0\2\3\4\0\12\3\1\166\14\3\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3995];
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
    "\1\0\1\11\3\1\1\11\1\1\1\11\30\1\11\11"+
    "\1\1\1\11\27\1\3\11\61\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[118];
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
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
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
        case 37: 
          { return new java_cup.runtime.Symbol(sym.While, yytext());
          }
        case 43: break;
        case 6: 
          { return new java_cup.runtime.Symbol(sym.Division, yytext());
          }
        case 44: break;
        case 27: 
          { return new java_cup.runtime.Symbol(sym.Op_incremento, yytext());
          }
        case 45: break;
        case 16: 
          { return new java_cup.runtime.Symbol(sym.Llave_a, yytext());
          }
        case 46: break;
        case 21: 
          { return new java_cup.runtime.Symbol(sym.P_coma, yytext());
          }
        case 47: break;
        case 9: 
          { return new java_cup.runtime.Symbol(sym.Suma, yytext());
          }
        case 48: break;
        case 26: 
          { return new java_cup.runtime.Symbol(sym.If, yytext());
          }
        case 49: break;
        case 8: 
          { return new java_cup.runtime.Symbol(sym.Igual, yytext());
          }
        case 50: break;
        case 33: 
          { return new java_cup.runtime.Symbol(sym.Args, yytext());
          }
        case 51: break;
        case 7: 
          { return new Symbol(sym.Comillas, yychar, yyline, yytext());
          }
        case 52: break;
        case 30: 
          { return new Symbol(sym.T_dato, yychar, yyline, yytext());
          }
        case 53: break;
        case 19: 
          { return new java_cup.runtime.Symbol(sym.Corchete_c, yytext());
          }
        case 54: break;
        case 36: 
          { return new java_cup.runtime.Symbol(sym.Clase, yytext());
          }
        case 55: break;
        case 35: 
          { return new java_cup.runtime.Symbol(sym.Main, yytext());
          }
        case 56: break;
        case 10: 
          { return new java_cup.runtime.Symbol(sym.Resta, yytext());
          }
        case 57: break;
        case 14: 
          { return new java_cup.runtime.Symbol(sym.Parentesis_a, yytext());
          }
        case 58: break;
        case 32: 
          { return new java_cup.runtime.Symbol(sym.Else, yytext());
          }
        case 59: break;
        case 31: 
          { return new java_cup.runtime.Symbol(sym.Op_booleano, yytext());
          }
        case 60: break;
        case 41: 
          { return new java_cup.runtime.Symbol(sym.Paquete, yytext());
          }
        case 61: break;
        case 29: 
          { return new java_cup.runtime.Symbol(sym.For, yytext());
          }
        case 62: break;
        case 12: 
          { return new java_cup.runtime.Symbol(sym.Op_logico, yytext());
          }
        case 63: break;
        case 34: 
          { return new java_cup.runtime.Symbol(sym.Void, yytext());
          }
        case 64: break;
        case 17: 
          { return new java_cup.runtime.Symbol(sym.Llave_c, yytext());
          }
        case 65: break;
        case 42: 
          { return new java_cup.runtime.Symbol(sym.Imprimir, yytext());
          }
        case 66: break;
        case 3: 
          { return new java_cup.runtime.Symbol(sym.Numero, yytext());
          }
        case 67: break;
        case 13: 
          { return new java_cup.runtime.Symbol(sym.Op_relacional, yytext());
          }
        case 68: break;
        case 40: 
          { return new java_cup.runtime.Symbol(sym.Static, yytext());
          }
        case 69: break;
        case 38: 
          { return new java_cup.runtime.Symbol(sym.SYSTEM, yytext());
          }
        case 70: break;
        case 1: 
          { System.err.println("Error léxico en línea " + (yyline + 1) + 
                        ", columna " + (yycolumn + 1) + 
                        ": " + yytext());
    return symbol(sym.ERROR, yytext());
          }
        case 71: break;
        case 15: 
          { return new java_cup.runtime.Symbol(sym.Parentesis_c, yytext());
          }
        case 72: break;
        case 24: 
          { return new java_cup.runtime.Symbol(sym.Op_atribucion, yytext());
          }
        case 73: break;
        case 28: 
          { return new java_cup.runtime.Symbol(sym.Out, yytext());
          }
        case 74: break;
        case 39: 
          { return new java_cup.runtime.Symbol(sym.Publico, yytext());
          }
        case 75: break;
        case 20: 
          { return new java_cup.runtime.Symbol(sym.P_dos, yytext());
          }
        case 76: break;
        case 2: 
          { return new java_cup.runtime.Symbol(sym.Identificador, yytext());
          }
        case 77: break;
        case 11: 
          { return new java_cup.runtime.Symbol(sym.Multiplicacion, yytext());
          }
        case 78: break;
        case 5: 
          { yyline++;
    yycolumn = 0; // Reiniciar columnas al iniciar una nueva línea
          }
        case 79: break;
        case 18: 
          { return new java_cup.runtime.Symbol(sym.Corchete_a, yytext());
          }
        case 80: break;
        case 23: 
          { /*Ignore*/
          }
        case 81: break;
        case 25: 
          { return new java_cup.runtime.Symbol(sym.Do, yytext());
          }
        case 82: break;
        case 22: 
          { return new java_cup.runtime.Symbol(sym.Signo_punto, yytext());
          }
        case 83: break;
        case 4: 
          { /* Ignorar espacios y tabulaciones */
          }
        case 84: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
