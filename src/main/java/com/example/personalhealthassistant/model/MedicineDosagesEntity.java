package com.example.personalhealthassistant.model;

import javax.persistence.*;

@Entity
@Table(name = "MedicineDosages", schema = "dbo", catalog = "apersonalhealth")
public class MedicineDosagesEntity {
    @Basic
    @Column(name = "UserId")
    private Long userId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DosagesId")
    private long dosagesId;
    @Basic
    @Column(name = "MedicineId")
    private Long medicineId;
    @Basic
    @Column(name = "TimesInADay")
    private String timesInADay;
    @Basic
    @Column(name = "TimesPerWeek")
    private String timesPerWeek;
    @Basic
    @Column(name = "DosageQuantity")
    private String dosageQuantity;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public long getDosagesId() {
        return dosagesId;
    }

    public void setDosagesId(long dosagesId) {
        this.dosagesId = dosagesId;
    }

    public Long getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Long medicineId) {
        this.medicineId = medicineId;
    }

    public String getTimesInADay() {
        return timesInADay;
    }

    public void setTimesInADay(String timesInADay) {
        this.timesInADay = timesInADay;
    }

    public String getTimesPerWeek() {
        return timesPerWeek;
    }

    public void setTimesPerWeek(String timesPerWeek) {
        this.timesPerWeek = timesPerWeek;
    }

    public String getDosageQuantity() {
        return dosageQuantity;
    }

    public void setDosageQuantity(String dosageQuantity) {
        this.dosageQuantity = dosageQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MedicineDosagesEntity that = (MedicineDosagesEntity) o;

        if (dosagesId != that.dosagesId) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (medicineId != null ? !medicineId.equals(that.medicineId) : that.medicineId != null) return false;
        if (timesInADay != null ? !timesInADay.equals(that.timesInADay) : that.timesInADay != null) return false;
        if (timesPerWeek != null ? !timesPerWeek.equals(that.timesPerWeek) : that.timesPerWeek != null) return false;
        if (dosageQuantity != null ? !dosageQuantity.equals(that.dosageQuantity) : that.dosageQuantity != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (int) (dosagesId ^ (dosagesId >>> 32));
        result = 31 * result + (medicineId != null ? medicineId.hashCode() : 0);
        result = 31 * result + (timesInADay != null ? timesInADay.hashCode() : 0);
        result = 31 * result + (timesPerWeek != null ? timesPerWeek.hashCode() : 0);
        result = 31 * result + (dosageQuantity != null ? dosageQuantity.hashCode() : 0);
        return result;
    }
}
