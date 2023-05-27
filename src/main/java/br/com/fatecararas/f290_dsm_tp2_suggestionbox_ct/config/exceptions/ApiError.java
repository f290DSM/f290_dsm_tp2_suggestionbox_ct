package br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.config.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiError {
    private Long timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
}
