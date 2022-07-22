package com.directbank.dbs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DirectBankServerApplication

fun main(args: Array<String>) {
	runApplication<DirectBankServerApplication>(*args)
}
