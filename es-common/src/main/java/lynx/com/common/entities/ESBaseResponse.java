package lynx.com.common.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ESBaseResponse<T> {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;

    private T data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer errorCode;
}
