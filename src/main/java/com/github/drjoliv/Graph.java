package com.github.drjoliv;

import java.util.List;

/**
 * A Graph containing information within the jBullet database. 
 * @author Desonte 'drjoliv' Jolivet : drjoliv@dgmail.com
 */
public interface Graph {

  /**
   * Returns a relationship of the given primary key.
   * @param uuid the unique ID.
   * @return a relationship having the given unique ID.
   */
  public Relationship getRelationship(long uuid);

  /**
   *
   * Returns a node containing the given unique ID.
   * @param uuid a unique ID.
   * @return a node containing the given unique ID.
   */
  public Node getNode(long uuid);

  /**
   * Returns a list of Nodes containing all of the labels given.
   * @param labels a list of labels.
   * @return a list of Nodes containing all of the labels given.
   */
  public List<Node> getNodesWithLabelsAnd(List<NodeLabel> labels);

  /**
   * Returns a list of Nodes containing any of the labels given.
   * @param labels a list of labels.
   * @return  a list of Nodes containing any of the labels given.
   */
  public List<Node> getNodesWithLabelsOr(List<NodeLabel> labels);

  /**
   * Returns a list of Relationships containing any of the labels given.
   * @param labels a list of labels.
   * @return  a list of Relationships containing any of the labels given.
   */
  public List<Relationship> getRelationshipsWithAnyLabels(List<RelationshipLabel> labels);

  /**
   * Returns a list of Relationships containing any of the labels given.
   * @param labels a list of labels.
   * @return  a list of Relationships containing any of the labels given.
   */
  public List<Relationship> getRelationshipsWithAllLabels(List<RelationshipLabel> labels);

  /**
   * Returns a node that has been inserted or updated in this graph. If the node builder was constructed from a node that already exist within the graph then that node will be updated other wise a new node will be inserted into this graph.
   * @param nBuiler a NodeBuilder containing information need to build a Node.
   * @return a node.
   */
  public Node putNode(NodeBuilder nBuiler);

  /**
   * Returns a relationship that has been inserted or updated in this graph. If the relationship builder was created from a relationship that already exist with the graph the that relationship will be updated other wise a new relationship will be inserted into this graph.
   * @param rBuilder a RelationshipBuilder containing information need to build a Relationship.
   * @return a Relationship
   */
  public Relationship putRelationship(RelationshipBuilder rBuilder);

  /**
   * Returns a node that has bind removed from this graph.
   * @param uuid the ID of a node that will be remove from the database.
   * @return the removed node.
   */
  public Node removeNode(long uuid);

  /**
   * Returns a relationship that had been removed from this graph.
   * @param uuid the ID of a relationship that will be remove from the graph.
   * @return the removed relationship.
   */
  public Relationship removeRelationship(long uuid);

}
