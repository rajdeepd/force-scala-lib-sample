package org.sample
import org.salesforce.SObject
import org.salesforce.Util


object CreateAccount{
	def main(args: Array[String]): Unit = {
			val util = new Util()
		  val baseUrl = util.getBaseUrl();
	    val sObject = new SObject("Account", baseUrl)
	    val json = """{"name":"test_1"}"""
	    val response = sObject.createSObject(json)

	}
}
