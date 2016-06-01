package org.sample

import org.salesforce.{Util, SObject}

object ExecuteSOQLQuery{
	def main(args: Array[String]): Unit = {
		val util = new Util()
		val baseUrl = util.getBaseUrl();
		val sObject = new SObject("Account", baseUrl )
		val json = """{"name":"Account1"}"""
		val soql  = """SELECT+name+from+Account"""
		val response = sObject.executeSOQL(soql)
		println("response:" + response)
	}
}
