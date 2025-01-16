package com.cea.afpvn.arrowhead.xtend

class ScalarValues {
	def String createString(String elem)
    {
     var str= elem 
      str
     }
     def String createInteger(String elem)
    {
     var str= elem+"°C"
      str
     }
     def String createFloat(String elem)
    {
     var str= elem+"°C"
      str
     }
     
     }
     
    //  Pour convertir en degrés Celsius une température donnée en degrés Fahrenheit,
    //  il suffit de soustraire 32 et de diviser par 1,8 (9/5 = 1,8) 
    //  le nombre ainsi obtenu. Pour 50 °F , on obtient : 50 - 32 = 18, puis 18/1,8 = 10 ; donc 50 °F = 10 °C .