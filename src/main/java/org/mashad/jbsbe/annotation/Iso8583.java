package org.mashad.jbsbe.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation tells that the following POJO represents an ISO Message.
 * 
 * It is used with the combination with {@link AutoStan}.
 * 
 * In the following example, the POJO is annotated to be ISO message with type
 * of 0x200:
 * 
 * <pre>
 * <code>
 *     &#64;Iso8583(type = 0x200)
 *     &#64;AutoStan
 *     public class PurchaseRequest {
 * 	&#64;IsoField(index = 10)
 * 	public Date date;
 * 	&#64;IsoField(index = 4)
 * 	public Long amount;
 * 	&#64;IsoField(index = 35)
 * 	public String cardNumber;
 *     }
 * </code>
 * </pre>
 * 
 * @see AutoStan
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Iso8583 {

    /**
     * Defines type of the message
     * 
     * @return
     */
    int type();

    /**
     * Gets the header of the message
     * 
     * @return
     */
    String header() default "";

    /**
     * Defines the binary encoding mode
     * 
     * @return true if the message is encoding in binary format
     */
    boolean binary() default false;

}
