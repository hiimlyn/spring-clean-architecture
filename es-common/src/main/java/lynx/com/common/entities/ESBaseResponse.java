package lynx.com.common.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(content = JsonInclude.Include.NON_NULL)
public class ESBaseResponse {
    private String message;
    private Object data;
    private Integer errorCode;
}
