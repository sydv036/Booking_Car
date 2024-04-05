package com.example.back_end_booking.entity;

import com.example.back_end_booking.constan.DefaultId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "loaixe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoaiXe extends DefaultId<String> {
    private Integer loaiXe;
    @Column(columnDefinition = "longtext")
    private String moTa;
    private Integer SoGhe;
    private Integer trangThai;
}
