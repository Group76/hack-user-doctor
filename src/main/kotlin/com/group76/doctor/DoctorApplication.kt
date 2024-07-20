package com.group76.doctor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DoctorApplication

fun main(args: Array<String>) {
	runApplication<DoctorApplication>(*args)
}
