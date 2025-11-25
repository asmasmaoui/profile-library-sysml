package com.cea.afpvn.arrowhead.xtend;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Requirements {
  public String createRequirement(final String elem1) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("requirement def ");
    _builder.append(elem1);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }
}
