/* Generated By:JJTree: Do not edit this line. ASTvar.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

/**
 * Class implements AST node for variables
 * 
 * @author iensen
 * 
 */
public class ASTvar extends SimpleNode {
	String originalImage;

	public ASTvar(int id) {
		super(id);
	}

	/**
	 * Keep image of the variable
	 * 
	 * @param originalImage
	 */
	public void setOriginalImage(String originalImage) {
		this.originalImage = originalImage;
	}

	/**
	 * Standard JAVACC constructor
	 * 
	 * @param p
	 * @param id
	 */
	public ASTvar(SparcTranslator p, int id) {
		super(p, id);
	}

	/** Accept the visitor. **/
	public Object jjtAccept(SparcTranslatorVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	/**
	 * Return the string representation of the term
	 * 
	 * @param useOriginalImage
	 *            must be set to true if the original strings (returned by
	 *            SparcTranslator) should be used
	 */

	public String toString(boolean useOriginalImage) {
		if (useOriginalImage) {
			return originalImage;
		} else
			return this.image;
	}

	/**
	 * String representation of the variable
	 */
	public String toString() {
		return toString(false);
	}
}
/*
 * JavaCC - OriginalChecksum=5a3de27798b9050730b612a5e32b6de8 (do not edit this
 * line)
 */
