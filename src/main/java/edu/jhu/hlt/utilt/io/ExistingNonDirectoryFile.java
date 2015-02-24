/*
 * Copyright 2012-2015 Johns Hopkins University HLTCOE. All rights reserved.
 * See LICENSE in the project root directory.
 */

package edu.jhu.hlt.utilt.io;

import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

/**
 * This class represents a file that, upon time of object creation, exists and is
 * not a directory. Useful for avoiding pollution of calls to the {@link Files} API to
 * check if a file exists, or is a directory.
 */
public class ExistingNonDirectoryFile {

  private final Path p;

  /**
   * @param p a {@link Path} to a file that exists and is not a directory.
   * @throws NoSuchFileException if the {@link Path} does not exist
   * @throws NotFileException if the {@link Path} is a directory
   */
  public ExistingNonDirectoryFile(Path p) throws NoSuchFileException, NotFileException {
    if (!Files.exists(p))
      throw new NoSuchFileException(p.toString());
    else if (Files.isDirectory(p))
      // this use of InvalidPathException isn't really
      // appropriate. oh well.
      throw new NotFileException(p);
    else
      this.p = p;
  }

  /**
   * @return the {@link Path}, which is not a directory and exists,
   * at the time this object was created.
   */
  public Path getPath() {
    return p;
  }

  /**
   * @return the name of the file, including extension if present.
   */
  public String getName() {
    final int nPaths = this.p.getNameCount();
    return this.p.getName(nPaths - 1).toString();
  }
}
