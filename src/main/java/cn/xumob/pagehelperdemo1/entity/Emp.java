package cn.xumob.pagehelperdemo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {

    private Integer id;

    private String name;

    private BigDecimal salary;

    private Boolean gender;

    private LocalDate birthday;

    private Integer deptId;

}
