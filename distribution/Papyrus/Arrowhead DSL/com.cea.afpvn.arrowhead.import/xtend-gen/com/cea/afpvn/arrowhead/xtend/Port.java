package com.cea.afpvn.arrowhead.xtend;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Port {
  public String createPort(final String name, final String type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("port ");
    _builder.append(name);
    _builder.append(type);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
