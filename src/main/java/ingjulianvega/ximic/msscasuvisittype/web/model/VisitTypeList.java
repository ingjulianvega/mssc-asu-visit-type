package ingjulianvega.ximic.msscasuvisittype.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VisitTypeList implements Serializable {

    static final long serialVersionUID = 7008588441977725320L;

    public ArrayList<VisitTypeDto> visitTypeDtoList;
}
