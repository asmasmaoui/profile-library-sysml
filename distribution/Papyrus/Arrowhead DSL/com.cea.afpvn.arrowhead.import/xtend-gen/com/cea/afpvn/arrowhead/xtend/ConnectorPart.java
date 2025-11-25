package com.cea.afpvn.arrowhead.xtend;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ConnectorPart {
  public String createConnector(final String elem1, final String elem2) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("connect ");
    _builder.append(elem1);
    _builder.append(" to ");
    _builder.append(elem2);
    _builder.append(" ;");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
