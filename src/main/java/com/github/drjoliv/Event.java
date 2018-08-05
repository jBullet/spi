package com.github.drjoliv;

/**
 * An Event is emitted by the Platform Service to all attached listeners.
 * @author Desonte 'drjoliv' Jolivet : drjoliv@gmail.com
 */
public abstract class Event {

  private final Object source;

  public Event(Object source) {
    this.source = source;
  }

  /**
  * Returns the source of this event.
  * @return the source
  */
  public Object getSource() {
    return source;
  }

  /**
  * A generic event only containing the source object.
  */
  public final class GenericEvent extends Event {
    public GenericEvent(Object source) {
      super(source);
    }
  }

  /**
  * An event emitted whenever a node is added to the jBullet database.
  */
  public final class CreateEvent extends Event {

    private final Node node;

    public CreateEvent ( Object source, Node node ) {
      super(source);
      this.node = node;
    }

    /**
     * Returns a node that has been recently inserted into jBullet database.
     * @return the node
     */
    public Node getNode() {
      return node;
    }
  }

  /**
  * An event emitted whenever a node is updated within the jBullet database.
  */
  public final class UpdateEvent extends Event{

    private final Node node;

    private UpdateEvent (Object source, Node node) {
      super(source);
      this.node = node;
    }

    /**
     * Returns a node that has been recently updated within jBullet database.
     * @return the node
     */
    public Node getNode() {
      return node;
    }
  }

  /**
  * An event emitted whenever a node is removed from the jBullet database.
  */
  public final class DeleteEvent extends Event {

    private final Node node;

    private DeleteEvent (Object source, Node node) {
      super(source);
      this.node = node;
    }

    /**
     * Returns a node that has recently been removed from the jBullet database.
     * @return the node
     */
    public Node getNode() {
      return node;
    }
  }
}
