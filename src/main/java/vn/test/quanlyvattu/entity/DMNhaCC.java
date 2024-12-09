package vn.test.quanlyvattu.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DM_NHACC")
public class DMNhaCC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaNCC", nullable = false)
    private Integer MaNCC;

    @Column(name = "TenNCC", nullable = false)
    private String TenNCC;
}
