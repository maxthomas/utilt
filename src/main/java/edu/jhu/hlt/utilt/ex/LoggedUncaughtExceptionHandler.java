/*
 * Copyright 2012-2015 Johns Hopkins University HLTCOE. All rights reserved.
 * See LICENSE in the project root directory.
 */
package edu.jhu.hlt.utilt.ex;

import java.lang.Thread.UncaughtExceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class that logs uncaught exceptions to an SLFJ logger.
 */
public class LoggedUncaughtExceptionHandler implements UncaughtExceptionHandler {
  
  private static final Logger LOGGER = LoggerFactory.getLogger(LoggedUncaughtExceptionHandler.class);
  
  /**
   * 
   */
  public LoggedUncaughtExceptionHandler() {
    // TODO Auto-generated constructor stub
  }

  /* (non-Javadoc)
   * @see java.lang.Thread.UncaughtExceptionHandler#uncaughtException(java.lang.Thread, java.lang.Throwable)
   */
  @Override
  public void uncaughtException(Thread t, Throwable e) {
    LOGGER.error("Caught unhandled exception (or throwable) in thread: {}", t.getName());
    LOGGER.error("Exception follows.", e);
  }
}
