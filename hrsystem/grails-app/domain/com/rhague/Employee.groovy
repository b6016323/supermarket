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
        fullName nullable:flase, blank:false
        dateOfBirth nullable:flase, blank:false
        residence nullable:flase, blank:false
        hourlyRate nullable:flase, blank:false, min:0.00
        employeeID nullable:flase, blank:false, unique:true
        dateEmployed nullable:flase, blank:false
        taxCode fullName nullable:flase, blank:false
        contract fullName nullable:flase, blank:false
    }
}
