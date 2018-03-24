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
    Manager manager
    TeamLeader teamleader
    Shift shift
    static belongsTo = [Team,Task]
    static hasMany=[task:Task]

    static constraints = {
        fullName nullable:false, blank:false
        dateOfBirth nullable:false, blank:false
        residence nullable:false, blank:false
        hourlyRate nullable:false, blank:false, min:0d, scale:2
        employeeID nullable:false, blank:false, unique:true
        dateEmployed nullable:false, blank:false
        taxCode nullable:false, blank:false
        contract nullable:false, blank:false
    }
}
