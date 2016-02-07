package org.sample

/**
  * Created by ubuntu on 4/2/16.
  */
class Account(Idx: String, Namex: String) {
  var Id: String = Idx
  var Name: String = Namex

  override def toString(): String = "( Id : " + Id + ", Name : " + Name + ")";

}
