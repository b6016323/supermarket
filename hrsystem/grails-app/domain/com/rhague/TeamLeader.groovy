package com.rhague

class TeamLeader {
    String fullName
    String department
    String employeeID
    String sectionName
    long officePhone
    String leaderEmail
    String password
    static constraints = {
        fullName nullable:false, blank:false
        department nullable:false, blank:false
        employeedID nullable:false, blank:false,unique:true
        sectionName nullable:false, blank:false
        officePhone nullable:false, blank:false
        leaderEmail nullable:false, blank:false,email:true
        password nullable:false, blank:false
    }
}
