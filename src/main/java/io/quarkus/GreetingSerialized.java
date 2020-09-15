package io.quarkus;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GreetingSerialized {
    @JsonProperty
    String salutation;
    @JsonProperty
    String name;
}
