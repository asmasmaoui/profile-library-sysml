package com.cea.afpvn.arrowhead.xtend;

@SuppressWarnings("all")
public class Port {
  public String createPort(final String name, final String type) {
    String _xblockexpression = null;
    {
      String str = (((("port " + name) + ":") + type) + ";");
      _xblockexpression = str;
    }
    return _xblockexpression;
  }
}
