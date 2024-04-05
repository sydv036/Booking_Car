package com.example.back_end_booking.entity;

import com.example.back_end_booking.constan.DefaultId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "diadiemden")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DiaDiemDen extends DefaultId<String> {

    private String diemDiemDen;
    private Integer trangThai;
}
