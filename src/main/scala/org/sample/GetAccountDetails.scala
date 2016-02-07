package org.sample

import org.salesforce.SObject
import com.google.gson.Gson

//case class Account(Id: String, Name: String)

object GetAccountDetails{
	def main(args: Array[String]): Unit = {
		val sObject = new SObject("Account")
		val id = "0012800000EvvnNAAR"
		val body = sObject.getSObjectDetails(id)
		val gson = new Gson
		val jsonObject = gson.fromJson(body, classOf[Account])
		println(jsonObject)
	}
}
