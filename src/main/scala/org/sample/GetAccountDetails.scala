package org.sample

import org.salesforce.{Util, SObject}
import com.google.gson.Gson

//case class Account(Id: String, Name: String)

object GetAccountDetails{
	def main(args: Array[String]): Unit = {
		val util = new Util()
		val baseUrl = util.getBaseUrl();
		val sObject = new SObject("Account", baseUrl)
		val id = "0012800000EvvnNAAR"
		val body = sObject.getSObjectDetails(id)
		val gson = new Gson
		val jsonObject = gson.fromJson(body, classOf[Account])
		println(jsonObject)
	}
}
