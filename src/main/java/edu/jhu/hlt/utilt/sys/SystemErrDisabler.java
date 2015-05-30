/*
 * Copyright 2012-2015 Johns Hopkins University HLTCOE. All rights reserved.
 * See LICENSE in the project root directory.
 */
package edu.jhu.hlt.utilt.sys;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * Disable/enable System.err calls.
 * <br><br>
 * Mainly used to quiet the large amount of output from Stanford CoreNLP.
 */
public class SystemErrDisabler {

  private final PrintStream err;

  /**
   * Default ctor. Save a pointer to the current System.err so it can be enabled/disabled.
   */
  public SystemErrDisabler() {
    this.err = System.err;
  }

  /**
   * Disable writing to System.err.
   *
   * @throws UnsupportedEncodingException if the system does not support {@link StandardCharsets#UTF_8}.
   */
  public void disable() throws UnsupportedEncodingException {
    PrintStream ps = new PrintStream(new EmptyOutputStream(), false, StandardCharsets.UTF_8.toString());
    System.setErr(ps);
  }

  private static class EmptyOutputStream extends OutputStream {

    /* (non-Javadoc)
     * @see java.io.OutputStream#write(int)
     */
    @Override
    public void write(int b) throws IOException {

    }
  }

  /**
   * Enable writing to System.err.
   */
  public void enable() {
    System.setErr(this.err);
  }
}
