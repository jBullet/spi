package drjoliv.jbullet;

/**
 * NodeBuilder presents a fluent API for building Nodes.
 * @author Desonte 'drjoliv' Jolivet : drjoliv@gmail.com
 */
public interface NodeBuilder {

  /**
   * Adds a relationship to this builder.
   * @param rBuilder a builder that yields a relationship.
   * @return this NodeBuilder.
   */
  public NodeBuilder addRealationship(RelationshipBuilder rBuilder);

  /**
   * Set the fileds of this NodeBuilder with the given node.
   * @param node a node used to set this node builder.
   * @return this NodeeBuilder.
   */
  public NodeBuilder withNode(Node node);

  /**
   * Adds a label to this node builder.
   * @param label a NodeLabel.
   * @return this NodeBuilder.
   */
  public NodeBuilder addLabel(NodeLabel label);

  /**
   * Adds an attribute to this node builder.
   * @param name the name of the attribute to add to this node builder.
   * @param value the value of the attribute to add to this node builder.
   * @return this NodeBuilder.
   */
  public NodeBuilder addAttribute(String name, Long value);

  /**
   * Adds an attribute to this node builder.
   * @param name the name of the attribute to add to this node builder.
   * @param value the value of the attribute to add to this node builder.
   * @return this NodeBuilder.
   */
  public NodeBuilder addAttribute(String name, Integer value);

  /**
   * Adds an attribute to this node builder.
   * @param name the name of the attribute to add to this node builder.
   * @param value the value of the attribute to add to this node builder.
   * @return this NodeBuilder.
   */
  public NodeBuilder addAttribute(String name, String value);

  /**
   * Adds an attribute to this node builder.
   * @param name the name of the attribute to add to this node builder.
   * @param value the value of the attribute to add to this node builder.
   * @return this NodeBuilder.
   */
  public NodeBuilder addAttribute(String name, Double value);

  /**
   * Adds an attribute to this node builder.
   * @param name the name of the attribute to add to this node builder.
   * @param value the value of the attribute to add to this node builder.
   * @return this NodeBuilder.
   */
  public NodeBuilder removeAttribute(String name);

  /**
   * Adds an attribute to this node builder.
   * @param name the name of the attribute to add to this node builder.
   * @param value the value of the attribute to add to this node builder.
   * @return this NodeBuilder.
   */
  public NodeBuilder addAttribute(String name, Long... values);

  /**
   * Adds an attribute to this node builder.
   * @param name the name of the attribute to add to this node builder.
   * @param value the value of the attribute to add to this node builder.
   * @return this NodeBuilder.
   */
  public NodeBuilder addAttribute(String name, Integer... values);

  /**
   * Adds an attribute to this node builder.
   * @param name the name of the attribute to add to this node builder.
   * @param value the value of the attribute to add to this node builder.
   * @return this NodeBuilder.
   */
  public NodeBuilder addAttribute(String name, String... values);

  /**
   * Adds an attribute to this node builder.
   * @param name the name of the attribute to add to this node builder.
   * @param value the value of the attribute to add to this node builder.
   * @return this NodeBuilder.
   */
  public NodeBuilder addAttribute(String name, Double... values);
}
