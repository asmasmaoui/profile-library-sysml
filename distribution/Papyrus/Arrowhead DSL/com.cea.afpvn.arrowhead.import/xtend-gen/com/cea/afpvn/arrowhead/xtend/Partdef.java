package com.cea.afpvn.arrowhead.xtend;

@SuppressWarnings("all")
public class Partdef {
  public String createPartDef(final String name, final String attr) {
    String _xblockexpression = null;
    {
      String str = (((("part def \'" + name) + "\' {") + attr) + "};");
      _xblockexpression = str;
    }
    return _xblockexpression;
  }
}
