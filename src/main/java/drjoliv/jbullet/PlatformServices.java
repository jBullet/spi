package drjoliv.jbullet;

import java.util.function.Consumer;

import drjoliv.jbullet.Event.GenericEvent;

/**
 * Provides services to Plugins.
 * @author Desonte 'drjoliv' Joliver : drjoliv@gmail.com
 */
public interface PlatformServices {

  /**
   * Attaches an event listener to the jBullet platform.
   * @param clazz the class of the event to listen for.
   * @param consumer a function that consumes an event.
   * @return true if the event listener was successfully attached.
   */
  public <T extends Event> boolean addEventListner(Class<T> clazz, Consumer<T> consumer);

  /**
   * Attaches an event listener to the jBullet platform.
   * @param clazz the class of the event to listen for.
   * @param consumera function that consumes an event.
   * @param consumerId the id of the attached function.
   * @return true if the event listener was successfully attached.
   */
  public <T extends Event> boolean addEventListner(Class<T> clazz, Consumer<T> consumer, String consumerId);

  /**
   * Attempts to attach an event listener to the jBullet platform and returns true if successful
   * or false otherwise.
   * @param eventName The name of the event the attached consume will listen for..
   * @param consumer the event listener.
   * @return true if the event listener was successfully attached.
   */
  public boolean addEventListener(String eventName, Consumer<GenericEvent> consumer);

  /**
   * Attempts to attach an event listener to the jBullet platform and returns true if successful
   * or false otherwise.
   * @param eventName The name of the event the attached consume will listen for..
   * @param consumera a function that consumes an event.
   * @param consumerId the id of the attached function.
   * @return true if the event listener was successfully attached.
   */
  public boolean addEventListener(String eventName, Consumer<GenericEvent> consumer, String consumerId);

  /**
   * Attempts to remove an event listener to the jBullet platform and returns true if successful
   * or false otherwise.
   * @param consumerId the ID of an event listener.
   * @return true if the event listener was successfully removed.
   */
  public boolean removeListener(String consumerId);

  /**
   * Attempts to emit an event to event listeners and returns true if successful and false otherwise.
   * @param event the event to be emitted.
   * @return true if the event was successfully emitted.
   */
  public boolean emit(Event event);

  /**
   * Returns Graph representing the items stored within the jBullet DB.
   * @return a Graph representing the items stored within the jBullet DB.
   */
  public Graph graph();

  /**
   * A NodeBuilder.
   * @return a NodeBuilder.
   */
  public NodeBuilder nBuilder();

  /**
   * A NodeBuilder.
   * @return a NodeBuilder.
   */
  public RelationshipBuilder rBuilder();

}
