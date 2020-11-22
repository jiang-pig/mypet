package cn.rjxy.mypet.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * t_adopt
 * @author 
 */
public class Adopt implements Serializable {
    private Integer id;

    private String adoptCode;

    private Date adoptTime;

    /**
     * 是否同意被领养,0表示不同意,1是还在审核,2是同意
     */
    private Integer adoptState;

    private String petCode;

    private String userCode;

    private String adminCode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdoptCode() {
        return adoptCode;
    }

    public void setAdoptCode(String adoptCode) {
        this.adoptCode = adoptCode;
    }

    public Date getAdoptTime() {
        return adoptTime;
    }

    public void setAdoptTime(Date adoptTime) {
        this.adoptTime = adoptTime;
    }

    public Integer getAdoptState() {
        return adoptState;
    }

    public void setAdoptState(Integer adoptState) {
        this.adoptState = adoptState;
    }

    public String getPetCode() {
        return petCode;
    }

    public void setPetCode(String petCode) {
        this.petCode = petCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
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
        Adopt other = (Adopt) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAdoptCode() == null ? other.getAdoptCode() == null : this.getAdoptCode().equals(other.getAdoptCode()))
            && (this.getAdoptTime() == null ? other.getAdoptTime() == null : this.getAdoptTime().equals(other.getAdoptTime()))
            && (this.getAdoptState() == null ? other.getAdoptState() == null : this.getAdoptState().equals(other.getAdoptState()))
            && (this.getPetCode() == null ? other.getPetCode() == null : this.getPetCode().equals(other.getPetCode()))
            && (this.getUserCode() == null ? other.getUserCode() == null : this.getUserCode().equals(other.getUserCode()))
            && (this.getAdminCode() == null ? other.getAdminCode() == null : this.getAdminCode().equals(other.getAdminCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAdoptCode() == null) ? 0 : getAdoptCode().hashCode());
        result = prime * result + ((getAdoptTime() == null) ? 0 : getAdoptTime().hashCode());
        result = prime * result + ((getAdoptState() == null) ? 0 : getAdoptState().hashCode());
        result = prime * result + ((getPetCode() == null) ? 0 : getPetCode().hashCode());
        result = prime * result + ((getUserCode() == null) ? 0 : getUserCode().hashCode());
        result = prime * result + ((getAdminCode() == null) ? 0 : getAdminCode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adoptCode=").append(adoptCode);
        sb.append(", adoptTime=").append(adoptTime);
        sb.append(", adoptState=").append(adoptState);
        sb.append(", petCode=").append(petCode);
        sb.append(", userCode=").append(userCode);
        sb.append(", adminCode=").append(adminCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}