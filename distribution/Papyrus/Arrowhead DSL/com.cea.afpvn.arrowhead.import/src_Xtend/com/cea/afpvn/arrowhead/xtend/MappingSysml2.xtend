package com.cea.afpvn.arrowhead.xtend

class Partdef{
 def String createPartDef(String name, String elem )
 '''
 part def «name» { «elem» }
 '''
    /*{
     var str= "part def " +name+" {" +elem+ "}" 
      str
     }*/
}
class PartdefProp {
 def String createPartDefProp(String name)
 '''
 part «name» ;
 '''
    /*{
     var str= "part  " +name+";" 
      str
     }*/
}

 class Attribute {
 def String createAttribute(String name, String type)'''
 attribute «name»«type» ;
 '''
   // {
     //var str= "attribute " +name +type+ ";"
    //  str
     //}
     }
     
     
 class InterfaceBlok {
 def String createInterfaceBlok(String name, String elem) '''
 	port def «name» { «elem» }
 '''
   /*  {
     var str= "port def " +name+" {" +elem+ "}"
      str
     }
     }
     */
     }
 class Port {
 def String createPort(String name, String type)'''
 port «name»«type»
 '''
    //{
    // var str= "port " +name+type
     // str
    // }
     }
     
class ConnectorPart {
 def String createConnector(String elem1,String elem2)'''
 connect «elem1» to «elem2» ;
 '''
    /*{
     var str= "connect " +elem1+ " to "+elem2+ ";"
      str
     }*/
     }
     
     class BindingConnectorPart {
 def String createBindingConnector(String elem1,String elem2,String elem3)'''
 binding «elem1» bind«elem2» = «elem3» ;
 '''
   
    /*{
    	
     var str= "binding " +elem1+ " bind "+elem2+" = "+elem3+ ";"
      str
     }*/
     }
     
class Usecase {
 def String createUsecase(String elem1)
 '''
 use case def «elem1» ;
 
 '''
    /*{
     var str= "use case def " +elem1+ ";"
      str
     }*/
     }
class Requirements {
 def String createRequirement(String elem1)
 '''
 requirement def «elem1»
 
 '''
    /*{
     var str= "requirement def " +elem1
      str
     }*/
     }  	
class Operations {
 def String createOperation(String name)
 '''
 action def «name»
 '''
    /*{
     var str= "action def " +name
      str
     }*/
     }