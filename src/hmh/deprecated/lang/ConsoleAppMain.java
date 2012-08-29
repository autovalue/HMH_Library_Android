/**
 * 
 */
package hmh.deprecated.lang;

import hmh.deprecated.Number;
import hmh.io.StaticPrintStream;
import hmh.lang.ExpandoObject;

/**
 * @author Habeeb Hooshmand
 * 
 */
@Deprecated
public abstract class ConsoleAppMain extends StaticPrintStream {
    public static ExpandoObject<String> str = new ExpandoObject<String>();

    public static ExpandoObject<Number> num = new ExpandoObject<Number>();

}
