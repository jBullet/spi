package com.github.drjoliv.types;

import java.util.List;

public interface Task {

  @Property
  public Long due();

  @Property
  public String task();

  @Property
  public Integer prioriy();

  @Property
  public List<String> projects();
}
