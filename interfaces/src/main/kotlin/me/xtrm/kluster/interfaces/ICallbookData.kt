package me.xtrm.kluster.interfaces

interface ICallbookData {

    fun getCall(): String
    fun setCall(call: String)

    fun getFirstName(): String
    fun setFirstName(firstName: String)

    fun getMiddleName(): String
    fun setMiddleName(middleName: String)

    fun getLastName(): String
    fun setLastName(lastName: String)

    fun getAddress(): String
    fun setAddress(address: String)

    fun getCity(): String
    fun setCity(city: String)

    fun getState(): String
    fun setState(state: String)

    fun getZip(): String
    fun setZip(zip: String)

    fun getLicenseClass(): String
    fun setLicenseClass(licenseClass: String)

    fun getLicenseIssueDate(): String
    fun setLicenseIssueDate(licenseIssueDate: String)

    fun getLicenseExpirationDate(): String
    fun setLicenseExpirationDate(licenseExpirationDate: String)

}