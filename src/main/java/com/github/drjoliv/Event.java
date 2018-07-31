package com.github.drjoliv;

public interface Event {

  public final class CreateEvent implements Event{
    public CreateEvent ( Object i ) {
      throw new UnsupportedOperationException("CreateEvent::CreateEvent is unsupported");
    }
  }

  public final class UpdateEvent implements Event{
    public UpdateEvent ( Object i ) {
      throw new UnsupportedOperationException("CreateEvent::CreateEvent is unsupported");
    }
  }

  public final class DeleteEvent implements Event{
    public DeleteEvent ( Object i ) {
      throw new UnsupportedOperationException("CreateEvent::CreateEvent is unsupported");
    }
  }
}
