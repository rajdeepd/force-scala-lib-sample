package org.sample
import org.salesforce.SObject


object CreateAccount{
	def main(args: Array[String]): Unit = {
	    val sObject = new SObject("Account")
	    val json = """{"name":"test_manpreet"}"""
	    sObject.createSObject(json)

	}
}
