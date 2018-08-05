package drjoliv.jbullet;

/**
 * Builds relationships between nodes.
 * @author Desonte 'drjoliv' Jolivet : drjoliv@gmail.com
 */
public interface RelationshipBuilder {

  /**
   * Adds a destination node to this relationship builder.
   * @param node the node this relationship points to.
   * @return a relationship builder.
   */
  default RelationshipBuilder to(Node node) {
    return to(node.uuid());
  }

  /**
   * Adds an origin node to this relationship builder.
   * @param node the node this relationship comes from.
   * @return a relationship builder.
   */
  default RelationshipBuilder from(Node node) {
    return from(node.uuid());
  }

  /**
   * Adds an origin node to this relationship builder.
   * @param uuid the id of the node the relationship comes from.
   * @return a relationship builder.
   */
  RelationshipBuilder to(long uuid);

  /**
   * Adds a destination node to this relationship builder.
   * @param uuid the id of the node the relationship points to.
   * @return a relationship builder.
   */
  RelationshipBuilder from(long uuid);

  /**
   * Adds a label to this relationship builder.
   * @param label a relationship label.
   * @return a relationship builder.
   */
  RelationshipBuilder addLabel(RelationshipLabel label);

  /**
   * Adds an attribute to this relationship builder.
   * @param name the name of the attribute.
   * @param value the value within the attribute.
   * @return a relationship builder.
   */
  RelationshipBuilder addAttribute(String name, Long value);

  /**
   * Adds an attribute to this relationship builder.
   * @param name the name of the attribute.
   * @param value the value within the attribute.
   * @return a relationship builder.
   */
  RelationshipBuilder addAttribute(String name, Integer value);

  /**
   * Adds an attribute to this relationship builder.
   * @param name the name of the attribute.
   * @param value the value within the attribute.
   * @return a relationship builder.
   */
  RelationshipBuilder addAttribute(String name, String value);

  /**
   * Adds an attribute to this relationship builder.
   * @param name the name of the attribute.
   * @param value the value within the attribute.
   * @return a relationship builder.
   */
  RelationshipBuilder addAttribute(String name, Double value);

  /**
   * Adds an attribute to this relationship builder.
   * @param name the name of the attribute.
   * @param value the value within the attribute.
   * @return a relationship builder.
   */
  RelationshipBuilder addAttribute(String name, Long... value);

  /**
   * Adds an attribute to this relationship builder.
   * @param name the name of the attribute.
   * @param value the value within the attribute.
   * @return a relationship builder.
   */
  RelationshipBuilder addAttribute(String name, Integer... value);

  /**
   * Adds an attribute to this relationship builder.
   * @param name the name of the attribute.
   * @param value the value within the attribute.
   * @return a relationship builder.
   */
  RelationshipBuilder addAttribute(String name, String... value);

  /**
   * Adds a List attribute to this relationship builder.
   * @param name
   * @param value
   * @return a relationship builder.
   */
  RelationshipBuilder addAttribute(String name, Double... value);
}
