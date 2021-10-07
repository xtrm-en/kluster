package me.xtrm.kluster.interfaces

import java.util.regex.Pattern

class CallbookData: ICallbookData {

    private var call: String
    private var firstName: String
    private var middleName: String
    private var lastName: String
    private var address: String
    private var city: String
    private var state: String
    private var zip: String
    private var licenseClass: String
    private var licenseIssueDate: String
    private var licenseExpirationDate: String
    private var arrlSection: String
    private var county: String
    private var grid: String = ""
    private var lat: Float = 0f
    private var lon: Float = 0f

    constructor(
        call: String,
        firstName: String,
        middleName: String,
        lastName: String,
        address: String,
        city: String,
        state: String,
        zip: String,
        licenseClass: String,
        licenseIssueDate: String,
        licenseExpirationDate: String
    ) {
        this.call = call
        this.firstName = this.scrubLine(firstName)
        this.middleName = middleName
        this.lastName = this.scrubLine(lastName)
        this.address = this.scrubLine(address)
        this.address = this.address.replace("Po Box", "PO Box")
        this.city = this.scrubLine(city)
        this.state = state
        this.zip = zip
        this.licenseClass = licenseClass
        this.licenseIssueDate = licenseIssueDate
        this.licenseExpirationDate = licenseExpirationDate
        this.arrlSection = ""
        this.county = ""
    }

    constructor(
        call: String,
        firstName: String,
        lastName: String,
        address: String,
        city: String,
        state: String,
        zip: String
    ) {
        this.call = call
        this.firstName = firstName
        this.lastName = lastName
        this.address = address
        this.city = city
        this.state = state
        this.zip = zip
        this.middleName = ""
        this.licenseClass = ""
        this.licenseIssueDate = ""
        this.licenseExpirationDate = ""
        this.arrlSection = ""
        this.county = ""
    }

    private fun scrubLine(str: String): String {
        var value = ""
        var string = str

        string = string.replace("  ", " ")

        for(@Suppress("NAME_SHADOWING") str in string.split(Pattern.quote(" "))) {
            value = value + this.forceCase(str) + " "
        }
        return value.trim()
    }

    private fun forceCase(string: String) = if (string.length > 1) (string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase()) else string.toUpperCase()

    override fun getCall(): String = call

    override fun setCall(call: String) {
        this.call = call
    }

    override fun getFirstName(): String = firstName

    override fun setFirstName(firstName: String) {
        this.firstName = firstName
    }

    override fun getMiddleName(): String = middleName

    override fun setMiddleName(middleName: String) {
        this.middleName = middleName
    }

    override fun getLastName(): String = lastName

    override fun setLastName(lastName: String) {
        this.lastName = lastName
    }

    override fun getAddress(): String = address

    override fun setAddress(address: String) {
        this.address = address
    }

    override fun getCity(): String = city

    override fun setCity(city: String) {
        this.city = city
    }

    override fun getState(): String = state

    override fun setState(state: String) {
        this.state = state
    }

    override fun getZip(): String = zip

    override fun setZip(zip: String) {
        this.zip = zip
    }

    override fun getLicenseClass(): String = licenseClass

    override fun setLicenseClass(licenseClass: String) {
        this.licenseClass = licenseClass
    }

    override fun getLicenseIssueDate(): String = licenseIssueDate

    override fun setLicenseIssueDate(licenseIssueDate: String) {
        this.licenseIssueDate = licenseIssueDate
    }

    override fun getLicenseExpirationDate(): String = licenseExpirationDate

    override fun setLicenseExpirationDate(licenseExpirationDate: String) {
        this.licenseExpirationDate = licenseExpirationDate
    }


}