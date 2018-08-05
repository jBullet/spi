package drjoliv.jbullet;

import java.io.Serializable;

/**
 * A label that marks a Relationship.
 * @author Desonte 'drjoliv' Jolivet : drjoliv@gmail.com
 */
public class RelationshipLabel implements Serializable {

  private static final long serialVersionUID = 338107193894233891L;

  public final String label;

  /**
   * Creates a RelationshipLabel
   * @param label the string describing this label.
   * @return a relationship label.
   */
  public static final RelationshipLabel label(String label) {
    return new RelationshipLabel(label);
  }

  private RelationshipLabel(String s) {
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
