package com.ty.groovy.testaliases

def p = System.out.&println
p('hi') //-> hi
def doSomething(method) { method("dog") }
doSomething(p)
////-> dog
//def doIt = { println it.size() }
//def list = ['cat']
//[p, doIt, list.&add].each { doSomething(it) }