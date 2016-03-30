/*
 * Copyright 2012-2016 Johns Hopkins University HLTCOE. All rights reserved.
 * See LICENSE in the project root directory.
 */
package edu.jhu.hlt.utilt.uuid;

import java.util.UUID;

/**
 * Interface whose implemententations have a {@link UUID} associated with them.
 */
public interface UUIDable {
  /**
   * @return the {@link UUID}
   */
  public UUID getUUID();
}
