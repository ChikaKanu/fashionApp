package com.example.codeclan.fashion.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bookings")
public class Booking implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    @JsonIgnoreProperties("userDetails")
    @ManyToOne
    @JoinColumn(name = "userDetail_id")
    private UserDetail userDetail;

    @JsonIgnoreProperties("userDetails")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "booking", fetch = FetchType.LAZY)
    private List<SelectedStyle> selectedStyles;

    @Column(name = "status")
    private String status;

    @Column(name = "remarks")
    private String remarks;

    public Booking(UserDetail userDetail, String status, String remarks) {
        this.createDateTime = createDateTime;
        this.updateDateTime = updateDateTime;
        this.userDetail = userDetail;
        this.status = status;
        this.remarks = remarks;
        this.selectedStyles = new ArrayList<>();
    }

    public Booking(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBookingCost() {
        double bookingCost = 0.00;
        for (SelectedStyle selectedStyle : this.selectedStyles) {
            bookingCost += selectedStyle.getTotalStyleCost();
        }
        return bookingCost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public List<SelectedStyle> getSelectedStyles() {
        return selectedStyles;
    }

    public void setSelectedStyles(List<SelectedStyle> selectedStyles) {
        this.selectedStyles = selectedStyles;
    }

    public void addSelectedStyle(SelectedStyle selectedStyle){
        this.selectedStyles.add(selectedStyle);
    }

    public void removeSelectedStyle(SelectedStyle selectedStyle){
        this.selectedStyles.remove(selectedStyle);
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    public LocalDateTime getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(LocalDateTime updateDateTime) {
        this.updateDateTime = updateDateTime;
    }
}
