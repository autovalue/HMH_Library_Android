/**
 *@author Habeeb Hooshmand
 */
package hmh.fun;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

import java.io.InputStream;
import java.io.PrintStream;

/**
 * Uses the term ShadeSystem instead of System. All other Methods And Classes
 * Are the Same. ex: System.out.print(); ==> ShadeSystem.out.print(); In Honor
 * of TheShadeSystem at https://www.youtube.com/user/TheShadeSystem
 * 
 * @author Habeeb Hooshmand
 * @author Java
 */
@DevStage(stage = Stage.FINAL_RELEASE, working = Working.YES)
public class ShadeSystem {
    /**
     * The "standard" output stream. This stream is already open and ready to
     * accept output data. Typically this stream corresponds to display output
     * or another output destination specified by the host environment or user.
     * 
     * @author Java
     */
    public static final PrintStream out = System.out;

    /**
     * The "substandard" input stream. This stream is already open and ready to
     * supply input data. Typically this stream corresponds to keyboard input or
     * another input source specified by the host environment or user.
     * 
     * @author Java
     */
    public static final InputStream in = System.in;

    /**
     * The "standard" error output stream. This stream is already open and ready
     * to accept output data.
     * 
     * Typically this stream corresponds to display output or another output
     * destination specified by the host environment or user. By convention,
     * this output stream is used to display error messages or other information
     * that should come to the immediate attention of a user even if the
     * principal output stream, the value of the variable out, has been
     * redirected to a file or other destination that is typically not
     * continuously monitored.
     * 
     * @author Java
     */
    public static final PrintStream err = System.err;

}