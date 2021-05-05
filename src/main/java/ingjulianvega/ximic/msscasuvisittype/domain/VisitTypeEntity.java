package ingjulianvega.ximic.msscasuvisittype.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class VisitTypeEntity extends BaseEntity {

    @Column(length = 500, columnDefinition = "varchar(500)")
    private String name;

}
