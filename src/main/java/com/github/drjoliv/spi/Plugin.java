package com.github.drjoliv.spi;

import com.github.drjoliv.PlatformObserver;
import com.github.drjoliv.PlatformServices;

public interface Plugin extends PlatformObserver {
  public void attach ( PlatformServices services );
  public void run ( String[] args );
}
