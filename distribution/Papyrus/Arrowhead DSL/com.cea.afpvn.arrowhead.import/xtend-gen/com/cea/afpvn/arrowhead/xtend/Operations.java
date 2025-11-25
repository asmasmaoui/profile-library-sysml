package com.cea.afpvn.arrowhead.xtend;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Operations {
  public String createOperation(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("action def ");
    _builder.append(name);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
