/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.nemo.common.ir.edge.executionproperty;

import org.apache.nemo.common.ir.executionproperty.EdgeExecutionProperty;

// TODO #492: modularizing runtime components for data communication pattern.
/**
 * DataCommunicationPattern ExecutionProperty.
 */
public final class CommunicationPatternProperty
    extends EdgeExecutionProperty<CommunicationPatternProperty.Value> {
  /**
   * Constructor.
   * @param value value of the execution property.
   */
  private CommunicationPatternProperty(final Value value) {
    super(value);
  }

  /**
   * Static method exposing the constructor.
   * @param value value of the new execution property.
   * @return the newly created execution property.
   */
  public static CommunicationPatternProperty of(final Value value) {
    return new CommunicationPatternProperty(value);
  }

  /**
   * Possible values of DataCommunicationPattern ExecutionProperty.
   */
  public enum Value {
    OneToOne,
    BroadCast,
    Shuffle
  }
}
