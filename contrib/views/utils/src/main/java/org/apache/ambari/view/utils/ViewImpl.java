/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ambari.view.utils;

import org.apache.ambari.view.View;
import org.apache.ambari.view.ViewDefinition;
import org.apache.ambari.view.ViewInstanceDefinition;

/**
 * Default implementation that drop cached objects onUpdate
 *
 */
public class ViewImpl implements View {
  @Override
  public void onDeploy(ViewDefinition definition) {

  }

  @Override
  public void onCreate(ViewInstanceDefinition definition) {

  }

  @Override
  public void onDestroy(ViewInstanceDefinition definition) {

  }

  @Override
  public void onUpdate(ViewInstanceDefinition definition) {
    //refresh all cached connection
    UserLocal.dropInstanceConnection(definition.getInstanceName());
  }
}