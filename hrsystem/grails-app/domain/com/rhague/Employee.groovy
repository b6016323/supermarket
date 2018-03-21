package com.rhague

class Employee {
    String fullName
    Date dateOfBirth
    String residence
    double hourlyRate
    String employeeID
    Date dateEmployed
    String taxCode
    String contract
    static constraints = {
        fullName nullable:false, blank:false
        dateOfBirth nullable:false, blank:false
        residence nullable:false, blank:false
        hourlyRate nullable:false, blank:false, min:0.00
        employeeID nullable:false, blank:false, unique:true
        dateEmployed nullable:false, blank:false
        taxCode fullName nullable:false, blank:false
        contract fullName nullable:false, blank:false
    }
}
