
package com.example.shivani.sample.Leave1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("AvailableLeaveId")
    @Expose
    private Integer availableLeaveId;
    @SerializedName("Year")
    @Expose
    private Integer year;
    @SerializedName("BalancedLeaves")
    @Expose
    private Double balancedLeaves;
    @SerializedName("LeaveTaken")
    @Expose
    private Double leaveTaken;
    @SerializedName("Reimburse")
    @Expose
    private Integer reimburse;
    @SerializedName("TotalLeaves")
    @Expose
    private Double totalLeaves;
    @SerializedName("Employee")
    @Expose
    private Employee employee;
    @SerializedName("Leave")
    @Expose
    private Leave leave;
    @SerializedName("LeaveNameBalance")
    @Expose
    private String leaveNameBalance;
    @SerializedName("LeaveId")
    @Expose
    private Integer leaveId;
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

    public Integer getAvailableLeaveId() {
        return availableLeaveId;
    }

    public void setAvailableLeaveId(Integer availableLeaveId) {
        this.availableLeaveId = availableLeaveId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getBalancedLeaves() {
        return balancedLeaves;
    }

    public void setBalancedLeaves(Double balancedLeaves) {
        this.balancedLeaves = balancedLeaves;
    }

    public Double getLeaveTaken() {
        return leaveTaken;
    }

    public void setLeaveTaken(Double leaveTaken) {
        this.leaveTaken = leaveTaken;
    }

    public Integer getReimburse() {
        return reimburse;
    }

    public void setReimburse(Integer reimburse) {
        this.reimburse = reimburse;
    }

    public Double getTotalLeaves() {
        return totalLeaves;
    }

    public void setTotalLeaves(Double totalLeaves) {
        this.totalLeaves = totalLeaves;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Leave getLeave() {
        return leave;
    }

    public void setLeave(Leave leave) {
        this.leave = leave;
    }

    public String getLeaveNameBalance() {
        return leaveNameBalance;
    }

    public void setLeaveNameBalance(String leaveNameBalance) {
        this.leaveNameBalance = leaveNameBalance;
    }

    public Integer getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
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
