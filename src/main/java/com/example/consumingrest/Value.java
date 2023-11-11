package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * <pre>
 * User: clean_brain
 * Date: 2023-11-11
 * Comments: 
 * </pre>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Value(Long id, String quote) {
}
