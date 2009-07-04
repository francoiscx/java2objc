/*
 * Copyright (C) 2009 Inderjeet Singh
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
package com.googlecode.java2objc.objc;

import japa.parser.ast.stmt.Statement;

public class ObjcStatement extends ObjcNode {

  private final String stmt;

  public ObjcStatement() {
    this((String) null);
  }

  public ObjcStatement(Statement stmt) {
    this.stmt = stmt.toString();
  }

  public ObjcStatement(String stmt) {
    this.stmt = stmt;
  }

  @Override
  public void append(SourceCodeWriter writer) {
    writer.appendLine(stmt);
  }
}
