package com.github.drjoliv;

import java.util.List;

public interface PlatformServices {

  public void attach(PlatformObserver observer);

  public void detach(PlatformObserver observer);

  public List<Object> create(List<Object> items);

  public List<Object> read(List<String> ids);

  public List<Object> update(List<Object> items);

  public List<Object> all(String type);

  public List<Object> delete(List<Object> items);
}
