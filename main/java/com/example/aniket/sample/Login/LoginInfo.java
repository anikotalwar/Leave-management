package com.example.shivani.sample.Login;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginInfo {

    @SerializedName("MispunchApproveCount")
    @Expose
    private String mispunchApproveCount;
    @SerializedName("OutdoorDutyApproveCount")
    @Expose
    private String outdoorDutyApproveCount;
    @SerializedName("LeaveApproveCount")
    @Expose
    private String leaveApproveCount;
    @SerializedName("EmployeeMispunchCount")
    @Expose
    private String employeeMispunchCount;
    @SerializedName("TotalCount")
    @Expose
    private String totalCount;
    @SerializedName("IsManager")
    @Expose
    private String isManager;
    @SerializedName("RoleId")
    @Expose
    private String roleId;
    @SerializedName("EmpName")
    @Expose
    private String empName;
    @SerializedName("EmployeeCode")
    @Expose
    private String employeeCode;
    @SerializedName("IsSelfieApplicable")
    @Expose
    private String isSelfieApplicable;
    @SerializedName("EmailId")
    @Expose
    private String emailId;
    @SerializedName("Imagepath")
    @Expose
    private String imagepath;

    public String getMispunchApproveCount() {
        return mispunchApproveCount;
    }

    public void setMispunchApproveCount(String mispunchApproveCount) {
        this.mispunchApproveCount = mispunchApproveCount;
    }

    public String getOutdoorDutyApproveCount() {
        return outdoorDutyApproveCount;
    }

    public void setOutdoorDutyApproveCount(String outdoorDutyApproveCount) {
        this.outdoorDutyApproveCount = outdoorDutyApproveCount;
    }

    public String getLeaveApproveCount() {
        return leaveApproveCount;
    }

    public void setLeaveApproveCount(String leaveApproveCount) {
        this.leaveApproveCount = leaveApproveCount;
    }

    public String getEmployeeMispunchCount() {
        return employeeMispunchCount;
    }

    public void setEmployeeMispunchCount(String employeeMispunchCount) {
        this.employeeMispunchCount = employeeMispunchCount;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public String getIsManager() {
        return isManager;
    }

    public void setIsManager(String isManager) {
        this.isManager = isManager;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getIsSelfieApplicable() {
        return isSelfieApplicable;
    }

    public void setIsSelfieApplicable(String isSelfieApplicable) {
        this.isSelfieApplicable = isSelfieApplicable;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

}
