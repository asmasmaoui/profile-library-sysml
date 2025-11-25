package com.cea.afpvn.arrowhead.xtend;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class BindingConnectorPart {
  public String createBindingConnector(final String elem1, final String elem2, final String elem3) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("binding ");
    _builder.append(elem1);
    _builder.append(" bind");
    _builder.append(elem2);
    _builder.append(" = ");
    _builder.append(elem3);
    _builder.append(" ;");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
