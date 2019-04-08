package com.microservices.service

import com.microservices.data.Customer

interface CustomerService {
    fun getCustomer(id: Int) : Customer?
    fun searchCustomers(nameFilter: String): List<Customer>
}