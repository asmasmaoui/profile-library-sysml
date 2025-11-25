package com.cea.afpvn.arrowhead.xtend;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Attribute {
  public String createAttribute(final String name, final String type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("attribute ");
    _builder.append(name);
    _builder.append(type);
    _builder.append(" ;");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
