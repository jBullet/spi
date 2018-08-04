package com.github.drjoliv;

import java.util.List;
import java.util.Map;

/**
 * A Node within the jBullet graph database.
 * @author Desonte 'drjoliv' Jolivet
 */
public interface Node {

  /**
   * Returns the unique ID of this node.
   * @return the unique ID of this node.
   */
  public long uuid();

  /**
   * Returns map of attribures of this node.
   * @return a map of attribures of this node.
   */
  public Map<String,Attribute> attributes();

  /**
   * Returns a list of the labels of this node
   * @return a list of the labels of this node.
   */
  public List<NodeLabel> labels();

  /**
   * Returns a list of the relationships of this node.
   * @return a list of the relationships of this node.
   */
  public List<Relationship> relationships();

}
