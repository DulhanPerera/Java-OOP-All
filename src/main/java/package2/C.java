/**
 * 
 */
package package2;
import package1.*;
/**
 * 
 */
public class C {
	
	public String publicMessage = "This is a public message."; // This method can access form any package.
	String defaultMessage = "This is the default."; // This default method can't access by other packages, only within this package.
	protected String protectedMessage = "This is a protected message."; // This can access by different classes and different packages as long as it is a sub class contained this.
	
}
