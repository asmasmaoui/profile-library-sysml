package com.cea.afpvn.arrowhead.xtend;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class InterfaceBlok {
  public String createInterfaceBlok(final String name, final String elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("port def ");
    _builder.append(name);
    _builder.append(" { ");
    _builder.append(elem);
    _builder.append(" }");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
