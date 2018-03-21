package com.rhague

class Manager {
    String fullName
    String userName
    String password
    String managerEmail
    string office
    String department
    static constraints = {
        fullName nullable:flase, blank:false
        userName nullable:flase, blank:false, unique:true
        password nullable:flase, blank:false
        managerEmail nullable:flase, blank:false, email:true
        office nullable:flase, blank:false
        department nullable:flase, blank:false
    }
}
