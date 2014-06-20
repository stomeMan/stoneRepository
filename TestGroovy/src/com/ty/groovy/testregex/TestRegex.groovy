package com.ty.groovy.testregex

//class TestRegex {
//
//}
def reg = ~'abc\\d'
println null==~('abc\\d')
println "abc1".matches('abc\\d');