package cn.rjxy.mypet.pojo;

import java.io.Serializable;

/**
 * t_pet_image
 * @author 
 */
public class PetImage implements Serializable {
    private Integer id;

    private String petCode;

    private String petImage;

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

    public String getPetImage() {
        return petImage;
    }

    public void setPetImage(String petImage) {
        this.petImage = petImage;
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
        PetImage other = (PetImage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPetCode() == null ? other.getPetCode() == null : this.getPetCode().equals(other.getPetCode()))
            && (this.getPetImage() == null ? other.getPetImage() == null : this.getPetImage().equals(other.getPetImage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPetCode() == null) ? 0 : getPetCode().hashCode());
        result = prime * result + ((getPetImage() == null) ? 0 : getPetImage().hashCode());
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
        sb.append(", petImage=").append(petImage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}