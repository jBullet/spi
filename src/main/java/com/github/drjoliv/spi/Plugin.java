package com.github.drjoliv.spi;

import com.github.drjoliv.PlatformServices;

/**
 * A plugin adds behaviour to the jBullet application.
 * @author Desonte 'drjoliv' Jolivet : drjoliv@gmail.com
 */
public interface Plugin  {

  /**
   * Allows this Plugin to use services provided by the Platform.
   * @param services an interface that adds capabilities to this interface.
   */
  public void attach (PlatformServices services);

  /**
   * Runs this plugin.
   * @param args arguments
   */
  public void run (String[] args);
}
