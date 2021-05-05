package ingjulianvega.ximic.msscasuvisittype.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VisitTypeDto implements Serializable {

    static final long serialVersionUID = -5725859149828859076L;

    private UUID id;
    private String name;

}