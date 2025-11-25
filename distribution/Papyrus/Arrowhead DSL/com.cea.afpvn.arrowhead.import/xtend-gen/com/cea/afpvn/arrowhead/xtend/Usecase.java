package com.cea.afpvn.arrowhead.xtend;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Usecase {
  public String createUsecase(final String elem1) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("use case def ");
    _builder.append(elem1);
    _builder.append(" ;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }
}
