package drjoliv.jbullet;

import java.util.Map;

/**
 * A RelationShip between two nodes within
 * @author Desonte  'drjoliv' Jolivet : drjoliv@gmail.com
 */
public interface Relationship {

  /**
   * Returns the unique ID of this node.
   * @return the unique ID of this node.
   */
  long uuid();

  /**
   * Returns a relationship label describing this relationship.
   * @return a relationship label describing this relationship.
   */
  public RelationshipLabel label();

  /**
   * Returns map of attributes of this node.
   * @return a map of attributes of this node.
   */
  public Map<String,Attribute> attributes();

  /**
   * Returns the source node of this relationship.
   * @return the source node of this relationship.
   */
  public Node from();

  /**
   * Returns the sink node of this relationship.
   * @return the sink node of this relationship.
   */
  public Node to();
}
