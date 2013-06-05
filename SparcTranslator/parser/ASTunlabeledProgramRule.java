/* Generated By:JJTree: Do not edit this line. ASTunlabeledProgramRule.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public class ASTunlabeledProgramRule extends SimpleNode {
	public ASTunlabeledProgramRule(int id) {
		super(id);
	}

	public ASTunlabeledProgramRule(SparcTranslator p, int id) {
		super(p, id);
	}

	/** Accept the visitor. **/
	public Object jjtAccept(SparcTranslatorVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	public String toString() {
		if(this.image.trim().equals(":~")) { //weak constraint
			ASTbody body=(ASTbody) this.jjtGetChild(0);
			if(this.jjtGetNumChildren()>1) {
				ASTconstraintParams params =(ASTconstraintParams) this.jjtGetChild(1);
				return ":~"+body.toString()+". "+params.toString();
			}
			else {
				return  ":~"+body.toString()+".";
			}
		}
		else if (jjtGetNumChildren() > 0
				&& ((SimpleNode) jjtGetChild(0)).getId() == SparcTranslatorTreeConstants.JJTPREDSYMBOL) {
			/*
			 * image contain the name of a predicate and range of integers from
			 * its argument, p(1..3) results into "p 1 3" image
			 */
			String[] image = this.image.split(" ");
			return image[0] + "(" + image[1] + ".." + image[2] + ").";
		} else {
			StringBuilder result = new StringBuilder();
			if (((SimpleNode) this.jjtGetChild(0)).getId() == SparcTranslatorTreeConstants.JJTHEAD) {
				result.append(((SimpleNode) this.jjtGetChild(0)).toString());
			}
			ASTbody body = null;
			if (this.jjtGetNumChildren() > 1) {
				body = (ASTbody) this.jjtGetChild(1);
			}
			if (((SimpleNode) this.jjtGetChild(0)).getId() == SparcTranslatorTreeConstants.JJTBODY) {
				body = ((ASTbody) this.jjtGetChild(0));
			}
			if (body != null) {
				result.append(":-");
				result.append(body.toString());
			}
			result.append(".");
			return result.toString();
		}
	}
}
/*
 * JavaCC - OriginalChecksum=7185494e69d54e3e6ad0f83d8a6e3bef (do not edit this
 * line)
 */
