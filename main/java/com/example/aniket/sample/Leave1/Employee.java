
package com.example.shivani.sample.Leave1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Employee {

    @SerializedName("EmployeeId")
    @Expose
    private Integer employeeId;
    @SerializedName("UserName")
    @Expose
    private Object userName;
    @SerializedName("Password")
    @Expose
    private Object password;
    @SerializedName("EmailId")
    @Expose
    private Object emailId;
    @SerializedName("Mobile")
    @Expose
    private Integer mobile;
    @SerializedName("StartDate")
    @Expose
    private String startDate;
    @SerializedName("EndDate")
    @Expose
    private Object endDate;
    @SerializedName("EmployeeCode")
    @Expose
    private Object employeeCode;
    @SerializedName("Title")
    @Expose
    private Object title;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("FName")
    @Expose
    private Object fName;
    @SerializedName("MName")
    @Expose
    private Object mName;
    @SerializedName("LName")
    @Expose
    private Object lName;
    @SerializedName("DOB")
    @Expose
    private String dOB;
    @SerializedName("Gender")
    @Expose
    private Object gender;
    @SerializedName("ParmanentAddress")
    @Expose
    private Object parmanentAddress;
    @SerializedName("CurrentAddress")
    @Expose
    private Object currentAddress;
    @SerializedName("ResidencePhone")
    @Expose
    private Object residencePhone;
    @SerializedName("PersonalEmail")
    @Expose
    private Object personalEmail;
    @SerializedName("EmploymentType")
    @Expose
    private Object employmentType;
    @SerializedName("EmployeeCategory")
    @Expose
    private Object employeeCategory;
    @SerializedName("BankName")
    @Expose
    private Object bankName;
    @SerializedName("BankBranchName")
    @Expose
    private Object bankBranchName;
    @SerializedName("AccountType")
    @Expose
    private Object accountType;
    @SerializedName("AccountNumber")
    @Expose
    private Integer accountNumber;
    @SerializedName("IFSCCode")
    @Expose
    private Object iFSCCode;
    @SerializedName("PanCard")
    @Expose
    private Object panCard;
    @SerializedName("AadharNo")
    @Expose
    private Integer aadharNo;
    @SerializedName("ESICNo")
    @Expose
    private Object eSICNo;
    @SerializedName("PFUAN")
    @Expose
    private Object pFUAN;
    @SerializedName("Remark")
    @Expose
    private Object remark;
    @SerializedName("CompanyId")
    @Expose
    private Integer companyId;
    @SerializedName("EmployeeDocId")
    @Expose
    private Integer employeeDocId;
    @SerializedName("DocName")
    @Expose
    private Object docName;
    @SerializedName("DocURL")
    @Expose
    private Object docURL;
    @SerializedName("Branch")
    @Expose
    private Object branch;
    @SerializedName("ManagerId")
    @Expose
    private Integer managerId;
    @SerializedName("IsManager")
    @Expose
    private Boolean isManager;
    @SerializedName("IsPFApplicable")
    @Expose
    private Boolean isPFApplicable;
    @SerializedName("IsESIApplicable")
    @Expose
    private Boolean isESIApplicable;
    @SerializedName("Department")
    @Expose
    private Object department;
    @SerializedName("Role")
    @Expose
    private Object role;
    @SerializedName("Shift")
    @Expose
    private Object shift;
    @SerializedName("DocType")
    @Expose
    private Object docType;
    @SerializedName("Grade")
    @Expose
    private Object grade;
    @SerializedName("Designation")
    @Expose
    private Object designation;
    @SerializedName("StateCode")
    @Expose
    private Object stateCode;
    @SerializedName("StateName")
    @Expose
    private Object stateName;
    @SerializedName("CostCenterModel")
    @Expose
    private Object costCenterModel;
    @SerializedName("IsSelfieApplicable")
    @Expose
    private Boolean isSelfieApplicable;
    @SerializedName("IsGeofence")
    @Expose
    private Integer isGeofence;
    @SerializedName("CreatedBy")
    @Expose
    private Integer createdBy;
    @SerializedName("UpdatedBy")
    @Expose
    private Integer updatedBy;
    @SerializedName("CreatedDate")
    @Expose
    private String createdDate;
    @SerializedName("UpdatedDate")
    @Expose
    private String updatedDate;
    @SerializedName("IsActive")
    @Expose
    private Boolean isActive;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Object getUserName() {
        return userName;
    }

    public void setUserName(Object userName) {
        this.userName = userName;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
    }

    public Object getEmailId() {
        return emailId;
    }

    public void setEmailId(Object emailId) {
        this.emailId = emailId;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Object getEndDate() {
        return endDate;
    }

    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    public Object getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(Object employeeCode) {
        this.employeeCode = employeeCode;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getFName() {
        return fName;
    }

    public void setFName(Object fName) {
        this.fName = fName;
    }

    public Object getMName() {
        return mName;
    }

    public void setMName(Object mName) {
        this.mName = mName;
    }

    public Object getLName() {
        return lName;
    }

    public void setLName(Object lName) {
        this.lName = lName;
    }

    public String getDOB() {
        return dOB;
    }

    public void setDOB(String dOB) {
        this.dOB = dOB;
    }

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public Object getParmanentAddress() {
        return parmanentAddress;
    }

    public void setParmanentAddress(Object parmanentAddress) {
        this.parmanentAddress = parmanentAddress;
    }

    public Object getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Object currentAddress) {
        this.currentAddress = currentAddress;
    }

    public Object getResidencePhone() {
        return residencePhone;
    }

    public void setResidencePhone(Object residencePhone) {
        this.residencePhone = residencePhone;
    }

    public Object getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(Object personalEmail) {
        this.personalEmail = personalEmail;
    }

    public Object getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(Object employmentType) {
        this.employmentType = employmentType;
    }

    public Object getEmployeeCategory() {
        return employeeCategory;
    }

    public void setEmployeeCategory(Object employeeCategory) {
        this.employeeCategory = employeeCategory;
    }

    public Object getBankName() {
        return bankName;
    }

    public void setBankName(Object bankName) {
        this.bankName = bankName;
    }

    public Object getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(Object bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public Object getAccountType() {
        return accountType;
    }

    public void setAccountType(Object accountType) {
        this.accountType = accountType;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Object getIFSCCode() {
        return iFSCCode;
    }

    public void setIFSCCode(Object iFSCCode) {
        this.iFSCCode = iFSCCode;
    }

    public Object getPanCard() {
        return panCard;
    }

    public void setPanCard(Object panCard) {
        this.panCard = panCard;
    }

    public Integer getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(Integer aadharNo) {
        this.aadharNo = aadharNo;
    }

    public Object getESICNo() {
        return eSICNo;
    }

    public void setESICNo(Object eSICNo) {
        this.eSICNo = eSICNo;
    }

    public Object getPFUAN() {
        return pFUAN;
    }

    public void setPFUAN(Object pFUAN) {
        this.pFUAN = pFUAN;
    }

    public Object getRemark() {
        return remark;
    }

    public void setRemark(Object remark) {
        this.remark = remark;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getEmployeeDocId() {
        return employeeDocId;
    }

    public void setEmployeeDocId(Integer employeeDocId) {
        this.employeeDocId = employeeDocId;
    }

    public Object getDocName() {
        return docName;
    }

    public void setDocName(Object docName) {
        this.docName = docName;
    }

    public Object getDocURL() {
        return docURL;
    }

    public void setDocURL(Object docURL) {
        this.docURL = docURL;
    }

    public Object getBranch() {
        return branch;
    }

    public void setBranch(Object branch) {
        this.branch = branch;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Boolean getIsManager() {
        return isManager;
    }

    public void setIsManager(Boolean isManager) {
        this.isManager = isManager;
    }

    public Boolean getIsPFApplicable() {
        return isPFApplicable;
    }

    public void setIsPFApplicable(Boolean isPFApplicable) {
        this.isPFApplicable = isPFApplicable;
    }

    public Boolean getIsESIApplicable() {
        return isESIApplicable;
    }

    public void setIsESIApplicable(Boolean isESIApplicable) {
        this.isESIApplicable = isESIApplicable;
    }

    public Object getDepartment() {
        return department;
    }

    public void setDepartment(Object department) {
        this.department = department;
    }

    public Object getRole() {
        return role;
    }

    public void setRole(Object role) {
        this.role = role;
    }

    public Object getShift() {
        return shift;
    }

    public void setShift(Object shift) {
        this.shift = shift;
    }

    public Object getDocType() {
        return docType;
    }

    public void setDocType(Object docType) {
        this.docType = docType;
    }

    public Object getGrade() {
        return grade;
    }

    public void setGrade(Object grade) {
        this.grade = grade;
    }

    public Object getDesignation() {
        return designation;
    }

    public void setDesignation(Object designation) {
        this.designation = designation;
    }

    public Object getStateCode() {
        return stateCode;
    }

    public void setStateCode(Object stateCode) {
        this.stateCode = stateCode;
    }

    public Object getStateName() {
        return stateName;
    }

    public void setStateName(Object stateName) {
        this.stateName = stateName;
    }

    public Object getCostCenterModel() {
        return costCenterModel;
    }

    public void setCostCenterModel(Object costCenterModel) {
        this.costCenterModel = costCenterModel;
    }

    public Boolean getIsSelfieApplicable() {
        return isSelfieApplicable;
    }

    public void setIsSelfieApplicable(Boolean isSelfieApplicable) {
        this.isSelfieApplicable = isSelfieApplicable;
    }

    public Integer getIsGeofence() {
        return isGeofence;
    }

    public void setIsGeofence(Integer isGeofence) {
        this.isGeofence = isGeofence;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
