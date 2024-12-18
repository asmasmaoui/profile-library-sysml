package com.cea.afpvn.arrowhead.xtend
import static extension com.google.common.io.Files.*
import com.google.common.base.Charsets
import java.io.File
import java.nio.file.Path
import java.nio.file.Paths
import java.io.BufferedWriter
import java.nio.charset.StandardCharsets
import java.io.IOException
import java.io.FileWriter
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import java.nio.file.Files



 class Partdef {
 def String createPartDef(String name, String attr )
    {
     var str= "part def '" +name+"' {" +attr+ "};" 
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
	  	
	