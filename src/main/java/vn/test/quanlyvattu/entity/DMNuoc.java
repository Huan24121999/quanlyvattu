package vn.test.quanlyvattu.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DM_NUOC")
public class DMNuoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaNuoc", nullable = false)
    private Integer MaNuoc;

    @Column(name = "TenNuoc", nullable = false)
    private String TenNuoc;
}
