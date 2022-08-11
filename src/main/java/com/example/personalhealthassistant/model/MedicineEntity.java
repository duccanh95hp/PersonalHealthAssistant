package com.example.personalhealthassistant.model;

import javax.persistence.*;

@Entity
@Table(name = "Medicine", schema = "dbo", catalog = "apersonalhealth")
public class MedicineEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private long id;
    @Basic
    @Column(name = "MedicineName")
    private String medicineName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MedicineEntity that = (MedicineEntity) o;

        if (id != that.id) return false;
        if (medicineName != null ? !medicineName.equals(that.medicineName) : that.medicineName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (medicineName != null ? medicineName.hashCode() : 0);
        return result;
    }
}
