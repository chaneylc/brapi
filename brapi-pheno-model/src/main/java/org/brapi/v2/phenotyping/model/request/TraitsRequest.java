package org.brapi.v2.phenotyping.model.request;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent=true)
public class TraitsRequest extends ObservationVariablesRequest {

    private String traitDbId;

    public Map<String, String> constructParameters() {

        Map<String, String> params = new HashMap<>();

        params.putAll(super.constructParameters());
        if (traitDbId != null) params.put("traitDbId", traitDbId);

        return params;

    }
}
