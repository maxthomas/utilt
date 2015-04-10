/*
 * Copyright 2012-2015 Johns Hopkins University HLTCOE. All rights reserved.
 * See LICENSE in the project root directory.
 */
package edu.jhu.hlt.utilt.uuid;

import java.util.UUID;

/**
 * Interface whose implementors have a {@link UUID} associated with them. 
 */
public interface UUIDable {
  /**
   * @return the {@link UUID}
   */
  public UUID getUuid();
}
