// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.apache.doris.manager.agent.exceptions;

public class InstanceNotInstallException extends Exception {

    private final String moduleName;
    private final String installDir;

    public InstanceNotInstallException(String moduleName, String installDir) {
        super(String.format("instance %s is not installed at %s", moduleName, installDir));

        this.moduleName = moduleName;
        this.installDir = installDir;
    }
}

