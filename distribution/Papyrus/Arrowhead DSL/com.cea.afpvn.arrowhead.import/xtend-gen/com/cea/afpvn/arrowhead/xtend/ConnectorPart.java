package com.cea.afpvn.arrowhead.xtend;

@SuppressWarnings("all")
public class ConnectorPart {
  public String createConnector(final String elem1, final String elem2) {
    String _xblockexpression = null;
    {
      String str = (((("connect " + elem1) + " to ") + elem2) + ";");
      _xblockexpression = str;
    }
    return _xblockexpression;
  }
}
