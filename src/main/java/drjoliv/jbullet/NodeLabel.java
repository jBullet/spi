package drjoliv.jbullet;

import java.io.Serializable;

/**
 * A label that marks a Node.
 * @author Desonte 'drjoliv' Jolivet : drjoliv@gmail.com
 */
public class NodeLabel implements Serializable {

  private static final long serialVersionUID = -3837211545764131722L;

  public final String label;

  /**
   * Creates a NodeLabel.
   * @param label the string describing this label.
   * @return a node label.
   */
  public static final NodeLabel label(String label) {
    return new NodeLabel(label);
  }

  private NodeLabel(String s) {
    this.label = s;
  }

  /**
   * Returns the string describing this label.
   * @return the string describing this label.
   */
  public String getLabel() {
    return label;
  }
}
