/*
 * Copyright 2016 The LmdbJava Project, http://lmdbjava.org/
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lmdbjava;

/**
 * Environment information.
 */
public class EnvInfo {

  /**
   * ID of the last used page.
   */
  public final long lastPageNumber;

  /**
   * ID of the last committed transaction.
   */
  public final long lastTransactionId;

  /**
   * Address of map, if fixed.
   */
  public final long mapAddress;

  /**
   * Size of the data memory map.
   */
  public final long mapSize;

  /**
   * Max reader slots in the environment.
   */
  public final int maxReaders;

  /**
   * Max reader slots used in the environment.
   */
  public final int numReaders;

  EnvInfo(long mapAddress, long mapSize, long lastPageNumber,
          long lastTransactionId, int maxReaders, int numReaders) {
    this.mapAddress = mapAddress;
    this.mapSize = mapSize;
    this.lastPageNumber = lastPageNumber;
    this.lastTransactionId = lastTransactionId;
    this.maxReaders = maxReaders;
    this.numReaders = numReaders;
  }

}