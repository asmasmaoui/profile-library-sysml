package com.cea.afpvn.arrowhead.xtend;

@SuppressWarnings("all")
public class Connector {
  public String createConnector(final String name1, final String name2) {
    String _xblockexpression = null;
    {
      String str = (((("connect " + name1) + " to ") + name2) + ";");
      _xblockexpression = str;
    }
    return _xblockexpression;
  }
}
