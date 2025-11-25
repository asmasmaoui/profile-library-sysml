package com.cea.afpvn.arrowhead.xtend;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PartdefProp {
  public String createPartDefProp(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("part ");
    _builder.append(name);
    _builder.append(" ;");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
