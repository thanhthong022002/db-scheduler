/*
 * Copyright (C) Gustav Karlsson
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.kagkarlsson.scheduler.task;

import com.github.kagkarlsson.scheduler.SchedulerClient;
import com.github.kagkarlsson.scheduler.SchedulerState;

public class ExecutionContext {

  private final SchedulerState schedulerState;
  private final Execution execution;
  private final SchedulerClient schedulerClient;

  public ExecutionContext(
      SchedulerState schedulerState, Execution execution, SchedulerClient schedulerClient) {
    this.schedulerState = schedulerState;
    this.execution = execution;
    this.schedulerClient = schedulerClient;
  }

  public SchedulerState getSchedulerState() {
    return schedulerState;
  }

  /**
   * Primarily enables ExecutionHandlers to schedule new tasks. Can not be used to modify the
   * "current" execution.
   */
  public SchedulerClient getSchedulerClient() {
    return schedulerClient;
  }

  public Execution getExecution() {
    return execution;
  }
}
