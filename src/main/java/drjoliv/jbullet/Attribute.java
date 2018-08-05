package drjoliv.jbullet;

import java.io.Serializable;
import java.util.List;
import java.util.function.Supplier;

/**
 * Attributes are values that can be stored in Nodes or Relationships.
 * @author Desonte 'drjoliv' Jolivet : drjoliv@gmail.com
 */
public abstract class Attribute implements Serializable {

  private static final long serialVersionUID = 3585007374989433553L;

  private Attribute(){}

  public final <B> B caseOf(Class<? extends Attribute> clazz, B b, Supplier<B> supplier) {
    return getClass().equals(clazz) ? b : supplier.get();
  }

  public final <B> B caseOf(Class<? extends Attribute> clazz, B b, String fail) {
    if(getClass().equals(clazz)) 
      return b;
    else {
      throw new RuntimeException(fail);
    }
  }

  /**
  * An Attribute containing an Integer.
  */
  public static class IntegerAttribute extends Attribute {

    private static final long serialVersionUID = 5423144990584593905L;

    public final Integer val;

    private IntegerAttribute (Integer val) {
      this.val = val;
    }
  }

  /**
   * Creates a IntegerAttribute.
   * @param val a Integer value transformed into
   * @return a IntegerAttribute.
   */
  public static IntegerAttribute intAttr (int val) {
    return new IntegerAttribute(val);
  }

  /**
  * An Attribute containing a List of Integer.
  */
  public static class ListIntegerAttribute extends Attribute {

    private static final long serialVersionUID = 4273190991199322353L;

    public final List<Integer> val;

    private ListIntegerAttribute (List<Integer> val) {
      this.val = val;
    }

  }

  /**
   * Creates a ListIntegerAttribute.
   * @param val a List of Integers to transform into a ListIntegerAttribute.
   * @return a ListIntegerAttribute.
   */
  public static ListIntegerAttribute listIntAttr (List<Integer> val) {
    return new ListIntegerAttribute(val);
  }


  /**
  * An Attribute containing a Long.
  */
  public static class LongAttribute extends Attribute {

    private static final long serialVersionUID = 454798378663113532L;

    public final Long val;

    private LongAttribute (Long val) {
      this.val = val;
    }
  }

  /**
   * Creates a LongAttribute.
   * @param val a Long value to transform into a LongAttribute.
   * @return a LongAttribute.
   */
  public static LongAttribute longAttr (long val) {
    return new LongAttribute(val);
  }

  /**
  * An Attribute containing a List of Longs
  */
  public static class ListLongAttribute extends Attribute {

    private static final long serialVersionUID = -8345261514123543166L;

    public final List<Long> val;

    private ListLongAttribute (List<Long> val) {
      this.val = val;
    }
  }

  /**
   * Creates a ListLongAttribute.
   * @param val a List of Long values to transform into a ListLongAttribute.
   * @return a ListLongAttribute.
   */
  public static ListLongAttribute listLngAttr (List<Long> val) {
    return new ListLongAttribute(val);
  }

  /**
  * An Attribute containing a String.
  */
  public static class StringAttribute extends Attribute {

    private static final long serialVersionUID = 7828404486080851111L;

    public final String val;

    private StringAttribute (String val) {
      this.val = val;
    }
  }

  /**
   * Creates a StringAttribute.
   * @param val the String to transform to a StringAttribute.
   * @return a StringAttribute.
   */
  public static StringAttribute strAttr (String val) {
   return new StringAttribute(val);
  }

  /**
  * An Attribute containing a List of Strings.
  */
  public static class ListStringAttribute extends Attribute {

    private static final long serialVersionUID = -8422099430626781092L;

    public final List<String> val;

    private ListStringAttribute (List<String> val) {
      this.val = val;
    }
  }

  /**
   * Creates a ListStringAttribute.
   * @param val a List of Strings to tranform into a ListStringAttribute.
   * @return a ListStringAttribute
   */
  public static ListStringAttribute listStrAttr (List<String> val) {
   return new ListStringAttribute(val);
  }

  /**
  * An Attribute containing a Double.
  */
  public static class DoubleAttribute extends Attribute {

    private static final long serialVersionUID = -392262839497060480L;

    public final Double val;

    public DoubleAttribute(Double val) {
      this.val = val;
    }

  }

  /**
   * Creates a DoubleAttribute.
   * @param val the Double to be transformed into a DoubleAttribute.
   * @return a DoubleAttribute.
   */
  public static DoubleAttribute dblAttr (double val) {
    return new DoubleAttribute(val);
  }

  /**
  * An Attribute containing a List of Doubles.
  */
  public static class ListDoubleAttribute extends Attribute {

    private static final long serialVersionUID = -9153957940308539378L;

    public final List<Double> val;

    public ListDoubleAttribute(List<Double> val) {
      this.val = val;
    }

  }

  /**
   * Creates a ListDoubleAttribute.
   * @param val the List of Doubles to transform into a ListDoubleAttribute.
   * @return a ListDoubleAttribute.
   */
  public static ListDoubleAttribute dblAttr (List<Double> val) {
    return new ListDoubleAttribute(val);
  }
}
