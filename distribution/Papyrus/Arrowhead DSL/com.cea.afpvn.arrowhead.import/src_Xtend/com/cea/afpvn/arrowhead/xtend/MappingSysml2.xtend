package com.cea.afpvn.arrowhead.xtend

class Partdef{
 def String createPartDef(String name, String elem )
    {
     var str= "part def " +name+" {" +elem+ "}" 
      str
     }
}
class PartdefProp {
 def String createPartDefProp(String name)
    {
     var str= "part  " +name+";" 
      str
     }
}

 class Attribute {
 def String createAttribute(String name, String type)
    {
     var str= "attribute " +name+":" +type+ ";"
      str
     }
     }
     
     
 class InterfaceBlok {
 def String createInterfaceBlok(String name, String elem)
    {
     var str= "port def " +name+" {" +elem+ "}"
      str
     }
     }
     
     
 class Port {
 def String createPort(String name, String type)
    {
     var str= "port " +name+":" +type+ ";"
      str
     }
     }
class ConnectorPart {
 def String createConnector(String elem1,String elem2)
    {
     var str= "connect " +elem1+ " to "+elem2+ ";"
      str
     }
     }
	  	
	