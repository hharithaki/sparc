/* Generated By:JJTree: Do not edit this line. ASTatomSequence.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTatomSequence extends SimpleNode {
  public ASTatomSequence(int id) {
    super(id);
  }

  public ASTatomSequence(SparcTranslator p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SparcTranslatorVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=13494f8105f78fa1d62c1b69b3bb3431 (do not edit this line) */
