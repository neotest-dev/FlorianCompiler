
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Nov 27 08:48:30 PET 2024
//----------------------------------------------------

package parser;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Nov 27 08:48:30 PET 2024
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\053\000\002\002\004\000\002\002\006\000\002\002" +
    "\016\000\002\003\010\000\002\004\017\000\002\005\004" +
    "\000\002\005\003\000\002\005\004\000\002\005\003\000" +
    "\002\005\004\000\002\005\003\000\002\005\004\000\002" +
    "\005\003\000\002\005\005\000\002\005\004\000\002\005" +
    "\003\000\002\006\005\000\002\006\007\000\002\006\007" +
    "\000\002\006\006\000\002\006\006\000\002\006\011\000" +
    "\002\006\011\000\002\006\011\000\002\006\011\000\002" +
    "\006\011\000\002\006\013\000\002\010\011\000\002\015" +
    "\003\000\002\015\005\000\002\015\005\000\002\015\005" +
    "\000\002\015\006\000\002\015\007\000\002\011\015\000" +
    "\002\012\011\000\002\013\013\000\002\014\011\000\002" +
    "\016\012\000\002\016\011\000\002\007\005\000\002\007" +
    "\004\000\002\007\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\240\000\006\007\005\015\004\001\002\000\004\004" +
    "\230\001\002\000\004\052\010\001\002\000\004\002\007" +
    "\001\002\000\004\002\001\001\002\000\004\051\011\001" +
    "\002\000\004\010\012\001\002\000\004\011\014\001\002" +
    "\000\004\002\000\001\002\000\004\052\015\001\002\000" +
    "\004\044\016\001\002\000\004\010\020\001\002\000\004" +
    "\045\227\001\002\000\004\012\021\001\002\000\004\013" +
    "\022\001\002\000\004\050\023\001\002\000\004\042\024" +
    "\001\002\000\004\021\025\001\002\000\004\046\026\001" +
    "\002\000\004\047\027\001\002\000\004\014\030\001\002" +
    "\000\004\043\031\001\002\000\004\044\032\001\002\000" +
    "\016\015\033\021\042\022\041\023\035\026\037\027\046" +
    "\001\002\000\004\004\217\001\002\000\022\015\ufff5\021" +
    "\ufff5\022\ufff5\023\ufff5\025\ufff5\026\ufff5\027\ufff5\045\ufff5" +
    "\001\002\000\004\042\205\001\002\000\022\015\ufff2\021" +
    "\ufff2\022\ufff2\023\ufff2\025\ufff2\026\ufff2\027\ufff2\045\ufff2" +
    "\001\002\000\004\042\177\001\002\000\022\015\ufffb\021" +
    "\ufffb\022\ufffb\023\ufffb\025\ufffb\026\ufffb\027\ufffb\045\ufffb" +
    "\001\002\000\004\052\156\001\002\000\006\036\135\052" +
    "\136\001\002\000\022\015\ufff7\021\ufff7\022\ufff7\023\ufff7" +
    "\025\ufff7\026\ufff7\027\ufff7\045\ufff7\001\002\000\022\015" +
    "\ufff9\021\ufff9\022\ufff9\023\ufff9\025\ufff9\026\ufff9\027\ufff9" +
    "\045\ufff9\001\002\000\022\015\033\021\042\022\041\023" +
    "\035\025\117\026\037\027\046\045\134\001\002\000\004" +
    "\042\047\001\002\000\006\021\052\052\051\001\002\000" +
    "\004\043\110\001\002\000\004\030\102\001\002\000\004" +
    "\052\053\001\002\000\004\030\054\001\002\000\004\053" +
    "\055\001\002\000\004\051\056\001\002\000\006\041\060" +
    "\052\061\001\002\000\004\051\072\001\002\000\006\043" +
    "\uffe5\051\uffe5\001\002\000\004\037\062\001\002\000\012" +
    "\006\064\041\065\052\066\053\063\001\002\000\006\043" +
    "\uffe3\051\uffe3\001\002\000\006\006\067\052\070\001\002" +
    "\000\006\043\uffe4\051\uffe4\001\002\000\006\043\uffe2\051" +
    "\uffe2\001\002\000\006\043\uffe1\051\uffe1\001\002\000\004" +
    "\006\071\001\002\000\006\043\uffe0\051\uffe0\001\002\000" +
    "\006\036\074\052\075\001\002\000\004\043\uffdb\001\002" +
    "\000\004\052\101\001\002\000\006\036\077\040\076\001" +
    "\002\000\004\053\100\001\002\000\004\043\uffd8\001\002" +
    "\000\004\043\uffd9\001\002\000\004\043\uffd7\001\002\000" +
    "\004\053\103\001\002\000\004\051\104\001\002\000\006" +
    "\041\060\052\061\001\002\000\004\051\106\001\002\000" +
    "\006\036\074\052\075\001\002\000\004\043\uffda\001\002" +
    "\000\004\044\111\001\002\000\016\015\033\021\042\022" +
    "\041\023\035\026\037\027\046\001\002\000\022\015\033" +
    "\021\042\022\041\023\035\025\117\026\037\027\046\045" +
    "\121\001\002\000\022\015\ufff6\021\ufff6\022\ufff6\023\ufff6" +
    "\025\ufff6\026\ufff6\027\ufff6\045\ufff6\001\002\000\022\015" +
    "\ufff3\021\ufff3\022\ufff3\023\ufff3\025\ufff3\026\ufff3\027\ufff3" +
    "\045\ufff3\001\002\000\022\015\ufffc\021\ufffc\022\ufffc\023" +
    "\ufffc\025\ufffc\026\ufffc\027\ufffc\045\ufffc\001\002\000\022" +
    "\015\ufff8\021\ufff8\022\ufff8\023\ufff8\025\ufff8\026\ufff8\027" +
    "\ufff8\045\ufff8\001\002\000\004\044\124\001\002\000\022" +
    "\015\ufffa\021\ufffa\022\ufffa\023\ufffa\025\ufffa\026\ufffa\027" +
    "\ufffa\045\ufffa\001\002\000\022\015\uffdc\021\uffdc\022\uffdc" +
    "\023\uffdc\025\uffdc\026\uffdc\027\uffdc\045\uffdc\001\002\000" +
    "\004\025\117\001\002\000\022\015\ufff4\021\ufff4\022\ufff4" +
    "\023\ufff4\025\ufff4\026\ufff4\027\ufff4\045\ufff4\001\002\000" +
    "\016\015\033\021\042\022\041\023\035\026\037\027\046" +
    "\001\002\000\022\015\033\021\042\022\041\023\035\025" +
    "\117\026\037\027\046\045\126\001\002\000\004\026\127" +
    "\001\002\000\004\042\130\001\002\000\006\041\060\052" +
    "\061\001\002\000\004\043\132\001\002\000\004\051\133" +
    "\001\002\000\022\015\uffdd\021\uffdd\022\uffdd\023\uffdd\025" +
    "\uffdd\026\uffdd\027\uffdd\045\uffdd\001\002\000\004\045\ufffd" +
    "\001\002\000\004\052\154\001\002\000\012\030\142\036" +
    "\141\040\137\051\140\001\002\000\004\053\152\001\002" +
    "\000\022\015\ufff1\021\ufff1\022\ufff1\023\ufff1\025\ufff1\026" +
    "\ufff1\027\ufff1\045\ufff1\001\002\000\004\051\151\001\002" +
    "\000\006\052\144\053\143\001\002\000\004\051\150\001" +
    "\002\000\004\031\145\001\002\000\004\052\146\001\002" +
    "\000\004\051\147\001\002\000\022\015\uffec\021\uffec\022" +
    "\uffec\023\uffec\025\uffec\026\uffec\027\uffec\045\uffec\001\002" +
    "\000\022\015\uffef\021\uffef\022\uffef\023\uffef\025\uffef\026" +
    "\uffef\027\uffef\045\uffef\001\002\000\022\015\uffee\021\uffee" +
    "\022\uffee\023\uffee\025\uffee\026\uffee\027\uffee\045\uffee\001" +
    "\002\000\004\051\153\001\002\000\022\015\ufff0\021\ufff0" +
    "\022\ufff0\023\ufff0\025\ufff0\026\ufff0\027\ufff0\045\ufff0\001" +
    "\002\000\004\051\155\001\002\000\022\015\uffed\021\uffed" +
    "\022\uffed\023\uffed\025\uffed\026\uffed\027\uffed\045\uffed\001" +
    "\002\000\006\030\160\040\157\001\002\000\004\006\170" +
    "\001\002\000\004\006\161\001\002\000\006\022\163\052" +
    "\162\001\002\000\004\006\166\001\002\000\004\006\164" +
    "\001\002\000\004\051\165\001\002\000\022\015\uffea\021" +
    "\uffea\022\uffea\023\uffea\025\uffea\026\uffea\027\uffea\045\uffea" +
    "\001\002\000\004\051\167\001\002\000\022\015\uffe8\021" +
    "\uffe8\022\uffe8\023\uffe8\025\uffe8\026\uffe8\027\uffe8\045\uffe8" +
    "\001\002\000\006\022\172\052\171\001\002\000\004\006" +
    "\175\001\002\000\004\006\173\001\002\000\004\051\174" +
    "\001\002\000\022\015\uffeb\021\uffeb\022\uffeb\023\uffeb\025" +
    "\uffeb\026\uffeb\027\uffeb\045\uffeb\001\002\000\004\051\176" +
    "\001\002\000\022\015\uffe9\021\uffe9\022\uffe9\023\uffe9\025" +
    "\uffe9\026\uffe9\027\uffe9\045\uffe9\001\002\000\006\041\060" +
    "\052\061\001\002\000\004\043\201\001\002\000\004\044" +
    "\202\001\002\000\016\015\033\021\042\022\041\023\035" +
    "\026\037\027\046\001\002\000\022\015\033\021\042\022" +
    "\041\023\035\025\117\026\037\027\046\045\204\001\002" +
    "\000\022\015\uffde\021\uffde\022\uffde\023\uffde\025\uffde\026" +
    "\uffde\027\uffde\045\uffde\001\002\000\006\041\060\052\061" +
    "\001\002\000\004\043\207\001\002\000\004\044\210\001" +
    "\002\000\016\015\033\021\042\022\041\023\035\026\037" +
    "\027\046\001\002\000\022\015\033\021\042\022\041\023" +
    "\035\025\117\026\037\027\046\045\212\001\002\000\024" +
    "\015\uffe6\021\uffe6\022\uffe6\023\uffe6\024\213\025\uffe6\026" +
    "\uffe6\027\uffe6\045\uffe6\001\002\000\004\044\214\001\002" +
    "\000\016\015\033\021\042\022\041\023\035\026\037\027" +
    "\046\001\002\000\022\015\033\021\042\022\041\023\035" +
    "\025\117\026\037\027\046\045\216\001\002\000\022\015" +
    "\uffdf\021\uffdf\022\uffdf\023\uffdf\025\uffdf\026\uffdf\027\uffdf" +
    "\045\uffdf\001\002\000\004\016\220\001\002\000\004\004" +
    "\221\001\002\000\004\017\222\001\002\000\004\042\223" +
    "\001\002\000\004\052\224\001\002\000\004\043\225\001" +
    "\002\000\004\051\226\001\002\000\022\015\uffe7\021\uffe7" +
    "\022\uffe7\023\uffe7\025\uffe7\026\uffe7\027\uffe7\045\uffe7\001" +
    "\002\000\004\002\ufffe\001\002\000\004\016\231\001\002" +
    "\000\004\004\232\001\002\000\004\017\233\001\002\000" +
    "\004\042\234\001\002\000\004\006\235\001\002\000\004" +
    "\052\236\001\002\000\004\052\237\001\002\000\004\006" +
    "\240\001\002\000\004\043\241\001\002\000\004\051\242" +
    "\001\002\000\004\002\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\240\000\004\002\005\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\003\012\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\004\016\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\016\005\044" +
    "\006\037\010\043\011\042\012\033\014\035\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\016\006\114\010\117\011\115\012\112\013\121\014" +
    "\113\001\001\000\002\001\001\000\004\016\047\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\015\056\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\007\072" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\015\104\001\001\000\002\001\001\000\004\007\106" +
    "\001\001\000\002\001\001\000\002\001\001\000\016\005" +
    "\111\006\037\010\043\011\042\012\033\014\035\001\001" +
    "\000\016\006\114\010\117\011\115\012\112\013\121\014" +
    "\113\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\013\122\001\001\000\002" +
    "\001\001\000\016\005\124\006\037\010\043\011\042\012" +
    "\033\014\035\001\001\000\016\006\114\010\117\011\115" +
    "\012\112\013\121\014\113\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\015\130\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\015\177\001\001\000\002" +
    "\001\001\000\002\001\001\000\016\005\202\006\037\010" +
    "\043\011\042\012\033\014\035\001\001\000\016\006\114" +
    "\010\117\011\115\012\112\013\121\014\113\001\001\000" +
    "\002\001\001\000\004\015\205\001\001\000\002\001\001" +
    "\000\002\001\001\000\016\005\210\006\037\010\043\011" +
    "\042\012\033\014\035\001\001\000\016\006\114\010\117" +
    "\011\115\012\112\013\121\014\113\001\001\000\002\001" +
    "\001\000\002\001\001\000\016\005\214\006\037\010\043" +
    "\011\042\012\033\014\035\001\001\000\016\006\114\010" +
    "\117\011\115\012\112\013\121\014\113\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // DECLARACION_FOR ::= Op_incremento Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // DECLARACION_FOR ::= Identificador Op_incremento 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // DECLARACION_FOR ::= Identificador Op_atribucion Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // SENTENCIA_FOR ::= Identificador Igual Numero P_coma SENTENCIA_BOOLEANA P_coma DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // SENTENCIA_FOR ::= T_dato Identificador Igual Numero P_coma SENTENCIA_BOOLEANA P_coma DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // FOR ::= For Parentesis_a SENTENCIA_FOR Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FOR",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // DO_WHILE ::= Do Llave_a SENTENCIA Llave_c While Parentesis_a SENTENCIA_BOOLEANA Parentesis_c P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DO_WHILE",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // WHILE ::= While Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("WHILE",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // IF_ELSE ::= If Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c Else Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IF_ELSE",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-10)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Identificador Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // SENTENCIA_BOOLEANA ::= Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // IF ::= If Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IF",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // DECLARACION ::= SYSTEM Signo_punto Out Signo_punto Imprimir Parentesis_a Identificador Parentesis_c P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // DECLARACION ::= Cadena Identificador Igual Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // DECLARACION ::= Cadena Identificador Igual Comillas Cadena Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Cadena Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // DECLARACION ::= T_dato Identificador Igual Identificador Suma Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // DECLARACION ::= T_dato Op_incremento Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // DECLARACION ::= T_dato Identificador Op_incremento P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // DECLARACION ::= T_dato Identificador Igual Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // DECLARACION ::= T_dato Identificador Op_atribucion Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // DECLARACION ::= T_dato Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // SENTENCIA ::= FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // SENTENCIA ::= SENTENCIA FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // SENTENCIA ::= SENTENCIA DO_WHILE DO_WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // SENTENCIA ::= WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SENTENCIA ::= SENTENCIA WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SENTENCIA ::= IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SENTENCIA ::= SENTENCIA IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SENTENCIA ::= IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENTENCIA ::= SENTENCIA IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTENCIA ::= DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTENCIA ::= SENTENCIA DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // MAIN ::= Publico Static Void Main Parentesis_a T_dato Corchete_a Corchete_c Args Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("MAIN",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-12)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // CLASE ::= Publico Clase Identificador Llave_a MAIN Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CLASE",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= SYSTEM Signo_punto Out Signo_punto Imprimir Parentesis_a Comillas Identificador Identificador Comillas Parentesis_c P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-11)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= Paquete Identificador P_coma CLASE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

