package com.microservices.resource

import com.microservices.data.Customer
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController {

    companion object {
        private val log = LoggerFactory.getLogger(CustomerController::class.java)
    }

    @GetMapping("/customer/{id}")
    fun getCustomer(@PathVariable id: Int): ResponseEntity<Customer> {
        return ResponseEntity.ok(Customer(id, "customer $id"))
    }
}