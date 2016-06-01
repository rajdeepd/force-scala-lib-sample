package org.sample
import org.salesforce.{Util, SObject}

object UpdateAccount{
	case class Account(id: String, name: String)
	def main(args: Array[String]): Unit = {
		val util = new Util()
		val baseUrl = util.getBaseUrl();
    val sObject = new SObject("Account", baseUrl)
    val objectId = "0012800000EuoVB"
    val jsonData = """{"name":"Account1.1"}"""
    sObject.patchSObject(objectId, jsonData)
	}
}
 