package com.cea.afpvn.arrowhead.xtend;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ScalarValues {
  public String createFahrenheit(final String elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(elem);
    _builder.append("Fahrenheit");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }

  /**
   * {
   * var str= elem+"Fahrenheit"
   * str
   * }
   */
  public String createCelsius(final String elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(elem);
    _builder.append("Celsius");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }

  /**
   * {
   * var str= elem+"Celsius"
   * str
   * }
   */
  public String createRankine(final String elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(elem);
    _builder.append("Rankine");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }
}
