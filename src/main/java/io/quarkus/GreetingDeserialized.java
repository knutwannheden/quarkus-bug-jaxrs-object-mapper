package io.quarkus;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GreetingDeserialized {
    @JsonProperty
    String name;
}
