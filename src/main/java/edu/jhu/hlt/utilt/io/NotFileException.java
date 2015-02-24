/*
 * Copyright 2012-2015 Johns Hopkins University HLTCOE. All rights reserved.
 * See LICENSE in the project root directory.
 */

package edu.jhu.hlt.utilt.io;

import java.nio.file.Path;

/**
 * Checked exception that is thrown when a {@link Path} is expected to point to
 * an actual file (not directory).
 */
public class NotFileException extends Exception {

  private static final long serialVersionUID = -5489409078783490025L;

  /**
   * @param path the {@link Path} to the directory, where a non-directory file was expected.
   */
  public NotFileException(Path path) {
    super("Path: " + path.toString() + " must not be a directory.");
  }
}
