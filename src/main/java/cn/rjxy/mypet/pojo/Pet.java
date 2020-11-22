package cn.rjxy.mypet.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * t_pet
 * @author 
 */
public class Pet implements Serializable {
    private Integer id;

    /**
     * 宠物编号
     */
    private String petCode;

    private String petName;

    /**
     * 宠物生日
     */
    private Date petBirthday;

    /**
     * 宠物年龄
     */
    private String petAge;

    /**
     * 宠物性别
     */
    private Integer petSex;

    /**
     * 宠物描述
     */
    private String petDescribe;

    /**
     * 宠物是否被领养
     */
    private Integer petState;

    /**
     * 宠物类别编号
     */
    private String categoryCode;

    /**
     * 管理员编号
     */
    private String adminCode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPetCode() {
        return petCode;
    }

    public void setPetCode(String petCode) {
        this.petCode = petCode;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Date getPetBirthday() {
        return petBirthday;
    }

    public void setPetBirthday(Date petBirthday) {
        this.petBirthday = petBirthday;
    }

    public String getPetAge() {
        return petAge;
    }

    public void setPetAge(String petAge) {
        this.petAge = petAge;
    }

    public Integer getPetSex() {
        return petSex;
    }

    public void setPetSex(Integer petSex) {
        this.petSex = petSex;
    }

    public String getPetDescribe() {
        return petDescribe;
    }

    public void setPetDescribe(String petDescribe) {
        this.petDescribe = petDescribe;
    }

    public Integer getPetState() {
        return petState;
    }

    public void setPetState(Integer petState) {
        this.petState = petState;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
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
        Pet other = (Pet) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPetCode() == null ? other.getPetCode() == null : this.getPetCode().equals(other.getPetCode()))
            && (this.getPetName() == null ? other.getPetName() == null : this.getPetName().equals(other.getPetName()))
            && (this.getPetBirthday() == null ? other.getPetBirthday() == null : this.getPetBirthday().equals(other.getPetBirthday()))
            && (this.getPetAge() == null ? other.getPetAge() == null : this.getPetAge().equals(other.getPetAge()))
            && (this.getPetSex() == null ? other.getPetSex() == null : this.getPetSex().equals(other.getPetSex()))
            && (this.getPetDescribe() == null ? other.getPetDescribe() == null : this.getPetDescribe().equals(other.getPetDescribe()))
            && (this.getPetState() == null ? other.getPetState() == null : this.getPetState().equals(other.getPetState()))
            && (this.getCategoryCode() == null ? other.getCategoryCode() == null : this.getCategoryCode().equals(other.getCategoryCode()))
            && (this.getAdminCode() == null ? other.getAdminCode() == null : this.getAdminCode().equals(other.getAdminCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPetCode() == null) ? 0 : getPetCode().hashCode());
        result = prime * result + ((getPetName() == null) ? 0 : getPetName().hashCode());
        result = prime * result + ((getPetBirthday() == null) ? 0 : getPetBirthday().hashCode());
        result = prime * result + ((getPetAge() == null) ? 0 : getPetAge().hashCode());
        result = prime * result + ((getPetSex() == null) ? 0 : getPetSex().hashCode());
        result = prime * result + ((getPetDescribe() == null) ? 0 : getPetDescribe().hashCode());
        result = prime * result + ((getPetState() == null) ? 0 : getPetState().hashCode());
        result = prime * result + ((getCategoryCode() == null) ? 0 : getCategoryCode().hashCode());
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
        sb.append(", petCode=").append(petCode);
        sb.append(", petName=").append(petName);
        sb.append(", petBirthday=").append(petBirthday);
        sb.append(", petAge=").append(petAge);
        sb.append(", petSex=").append(petSex);
        sb.append(", petDescribe=").append(petDescribe);
        sb.append(", petState=").append(petState);
        sb.append(", categoryCode=").append(categoryCode);
        sb.append(", adminCode=").append(adminCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}