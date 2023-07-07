package com.reihaneh.bakeryshop.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Vat extends BaseEntity{

    private Integer vatPercent;
    private Integer vatYear;

    @OneToMany(mappedBy = "vat", cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<Invoice> invoices = new ArrayList<>();

}
