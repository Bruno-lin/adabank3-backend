package model;

public class Customer {
    private Integer id;

    private String cardNumber;

    private String username;

    private Double balance;

    private String companyName;

    private String companyAddress;

    private String companyCreditCode;

    private String legalRepName;

    private String legalRepId;

    private String legalRepAddr;

    private String legalRepTel;

    private String createdAt;

    private String updatedAt;

    private String business;

    private Integer deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyCreditCode() {
        return companyCreditCode;
    }

    public void setCompanyCreditCode(String companyCreditCode) {
        this.companyCreditCode = companyCreditCode;
    }

    public String getLegalRepName() {
        return legalRepName;
    }

    public void setLegalRepName(String legalRepName) {
        this.legalRepName = legalRepName;
    }

    public String getLegalRepId() {
        return legalRepId;
    }

    public void setLegalRepId(String legalRepId) {
        this.legalRepId = legalRepId;
    }

    public String getLegalRepAddr() {
        return legalRepAddr;
    }

    public void setLegalRepAddr(String legalRepAddr) {
        this.legalRepAddr = legalRepAddr;
    }

    public String getLegalRepTel() {
        return legalRepTel;
    }

    public void setLegalRepTel(String legalRepTel) {
        this.legalRepTel = legalRepTel;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Customer other = (Customer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCardNumber() == null ? other.getCardNumber() == null : this.getCardNumber().equals(other.getCardNumber()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getCompanyAddress() == null ? other.getCompanyAddress() == null : this.getCompanyAddress().equals(other.getCompanyAddress()))
            && (this.getCompanyCreditCode() == null ? other.getCompanyCreditCode() == null : this.getCompanyCreditCode().equals(other.getCompanyCreditCode()))
            && (this.getLegalRepName() == null ? other.getLegalRepName() == null : this.getLegalRepName().equals(other.getLegalRepName()))
            && (this.getLegalRepId() == null ? other.getLegalRepId() == null : this.getLegalRepId().equals(other.getLegalRepId()))
            && (this.getLegalRepAddr() == null ? other.getLegalRepAddr() == null : this.getLegalRepAddr().equals(other.getLegalRepAddr()))
            && (this.getLegalRepTel() == null ? other.getLegalRepTel() == null : this.getLegalRepTel().equals(other.getLegalRepTel()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()))
            && (this.getBusiness() == null ? other.getBusiness() == null : this.getBusiness().equals(other.getBusiness()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCardNumber() == null) ? 0 : getCardNumber().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getCompanyAddress() == null) ? 0 : getCompanyAddress().hashCode());
        result = prime * result + ((getCompanyCreditCode() == null) ? 0 : getCompanyCreditCode().hashCode());
        result = prime * result + ((getLegalRepName() == null) ? 0 : getLegalRepName().hashCode());
        result = prime * result + ((getLegalRepId() == null) ? 0 : getLegalRepId().hashCode());
        result = prime * result + ((getLegalRepAddr() == null) ? 0 : getLegalRepAddr().hashCode());
        result = prime * result + ((getLegalRepTel() == null) ? 0 : getLegalRepTel().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        result = prime * result + ((getBusiness() == null) ? 0 : getBusiness().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }
}