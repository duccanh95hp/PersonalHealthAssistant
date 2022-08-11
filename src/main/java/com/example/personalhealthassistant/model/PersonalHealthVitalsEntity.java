package com.example.personalhealthassistant.model;

import javax.persistence.*;

@Entity
@Table(name = "PersonalHealthVitals", schema = "dbo", catalog = "apersonalhealth")
public class PersonalHealthVitalsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private long id;
    @Basic
    @Column(name = "User_id")
    private Long userId;
    @Basic
    @Column(name = "Weight")
    private String weight;
    @Basic
    @Column(name = "Height")
    private String height;
    @Basic
    @Column(name = "BloodPressure")
    private String bloodPressure;
    @Basic
    @Column(name = "BloodGlucose")
    private String bloodGlucose;
    @Basic
    @Column(name = "BloodOxygen")
    private String bloodOxygen;
    @Basic
    @Column(name = "BodyTemperature")
    private String bodyTemperature;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getBloodGlucose() {
        return bloodGlucose;
    }

    public void setBloodGlucose(String bloodGlucose) {
        this.bloodGlucose = bloodGlucose;
    }

    public String getBloodOxygen() {
        return bloodOxygen;
    }

    public void setBloodOxygen(String bloodOxygen) {
        this.bloodOxygen = bloodOxygen;
    }

    public String getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(String bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonalHealthVitalsEntity that = (PersonalHealthVitalsEntity) o;

        if (id != that.id) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (height != null ? !height.equals(that.height) : that.height != null) return false;
        if (bloodPressure != null ? !bloodPressure.equals(that.bloodPressure) : that.bloodPressure != null)
            return false;
        if (bloodGlucose != null ? !bloodGlucose.equals(that.bloodGlucose) : that.bloodGlucose != null) return false;
        if (bloodOxygen != null ? !bloodOxygen.equals(that.bloodOxygen) : that.bloodOxygen != null) return false;
        if (bodyTemperature != null ? !bodyTemperature.equals(that.bodyTemperature) : that.bodyTemperature != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (bloodPressure != null ? bloodPressure.hashCode() : 0);
        result = 31 * result + (bloodGlucose != null ? bloodGlucose.hashCode() : 0);
        result = 31 * result + (bloodOxygen != null ? bloodOxygen.hashCode() : 0);
        result = 31 * result + (bodyTemperature != null ? bodyTemperature.hashCode() : 0);
        return result;
    }
}
