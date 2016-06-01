package org.sample
import org.salesforce.{Util, SObject}

object DeleteAccount{
	    def main(args: Array[String]): Unit = {
				val util = new Util()
				val baseUrl = util.getBaseUrl();
	    	val sObject = new SObject("Account", baseUrl)
	    	val objectId = "0012800000DR2Ko"
	    	sObject.deleteSObject(objectId)
	    }
}
