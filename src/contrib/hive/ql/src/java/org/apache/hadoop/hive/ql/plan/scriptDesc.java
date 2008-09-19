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

package org.apache.hadoop.hive.ql.plan;

import java.io.Serializable;

@explain(displayName="Transform Operator")
public class scriptDesc implements Serializable {
  private static final long serialVersionUID = 1L;
  private String scriptCmd;
  private tableDesc scriptOutputInfo;

  public scriptDesc() { }
  public scriptDesc(
    final String scriptCmd,
    final tableDesc scriptOutputInfo) {

    this.scriptCmd = scriptCmd;
    this.scriptOutputInfo = scriptOutputInfo;
  }
  
  @explain(displayName="command")
  public String getScriptCmd() {
    return this.scriptCmd;
  }
  public void setScriptCmd(final String scriptCmd) {
    this.scriptCmd=scriptCmd;
  }
  
  @explain(displayName="output info")
  public tableDesc getScriptOutputInfo() {
    return this.scriptOutputInfo;
  }
  public void setScriptOutputInfo(final tableDesc scriptOutputInfo) {
    this.scriptOutputInfo = scriptOutputInfo;
  }
}