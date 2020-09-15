# jaxrs-object-mapper project

Demostrates problem with `ObjectMapper` configured when using JAX-RS REST client rather than MicroProfile REST client. See class `ExampleResource` and unit tests in `ExampleResourceTest`. The `testHelloMp()` case succeeds while `testHelloJaxrs()` fails.

```shell script
./mvnw clean verify
```
