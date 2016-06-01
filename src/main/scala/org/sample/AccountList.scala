package org.sample
import org.salesforce.{Util, SObject}
import play.api.libs.json._

object AccountList{
	def main(args: Array[String]): Unit = {
		val util = new Util()
		val baseUrl = util.getBaseUrl();
		val sObject = new SObject("Account", baseUrl)
    val body = sObject.getList()
    val bodyJson = Json.parse(body)
    val recentItems = (bodyJson \ "recentItems").get
    val readableString: String = Json.prettyPrint(recentItems)
		println(readableString)
	}
}
