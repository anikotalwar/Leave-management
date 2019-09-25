
package com.example.shivani.sample.Leave1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Leave {

    @SerializedName("LeaveId")
    @Expose
    private Integer leaveId;
    @SerializedName("LeaveName")
    @Expose
    private String leaveName;
    @SerializedName("LeaveRule")
    @Expose
    private Object leaveRule;
    @SerializedName("NumberOfLeave")
    @Expose
    private Double numberOfLeave;
    @SerializedName("LeaveCode")
    @Expose
    private Object leaveCode;
    @SerializedName("MaxLeave")
    @Expose
    private Integer maxLeave;
    @SerializedName("MaxCarryForward")
    @Expose
    private Double maxCarryForward;
    @SerializedName("CompanyModel")
    @Expose
    private Object companyModel;
    @SerializedName("Assign")
    @Expose
    private Boolean assign;
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

    public Integer getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
    }

    public String getLeaveName() {
        return leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    public Object getLeaveRule() {
        return leaveRule;
    }

    public void setLeaveRule(Object leaveRule) {
        this.leaveRule = leaveRule;
    }

    public Double getNumberOfLeave() {
        return numberOfLeave;
    }

    public void setNumberOfLeave(Double numberOfLeave) {
        this.numberOfLeave = numberOfLeave;
    }

    public Object getLeaveCode() {
        return leaveCode;
    }

    public void setLeaveCode(Object leaveCode) {
        this.leaveCode = leaveCode;
    }

    public Integer getMaxLeave() {
        return maxLeave;
    }

    public void setMaxLeave(Integer maxLeave) {
        this.maxLeave = maxLeave;
    }

    public Double getMaxCarryForward() {
        return maxCarryForward;
    }

    public void setMaxCarryForward(Double maxCarryForward) {
        this.maxCarryForward = maxCarryForward;
    }

    public Object getCompanyModel() {
        return companyModel;
    }

    public void setCompanyModel(Object companyModel) {
        this.companyModel = companyModel;
    }

    public Boolean getAssign() {
        return assign;
    }

    public void setAssign(Boolean assign) {
        this.assign = assign;
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
