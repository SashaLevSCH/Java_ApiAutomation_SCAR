package com.sidecarhealth.microservice.doctor.specialty.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
public class SpecialtyRequest {
    @Builder.Default
    public int page = -1;
    @Builder.Default
    public int size = -1;
}
