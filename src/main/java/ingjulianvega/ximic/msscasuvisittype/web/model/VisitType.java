package ingjulianvega.ximic.msscasuvisittype.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VisitType implements Serializable {

    static final long serialVersionUID = -2008846582050563347L;

    private String name;

}
