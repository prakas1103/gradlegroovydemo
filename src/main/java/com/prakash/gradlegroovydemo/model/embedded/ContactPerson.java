package com.prakash.gradlegroovydemo.model.embedded;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Embeddable
public class ContactPerson {
    @NonNull
    private String contactFirstName;
    @NonNull
    private int contactPhone;
}
