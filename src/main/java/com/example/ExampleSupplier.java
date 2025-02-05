package com.example;


import dev.sixpack.generator.Supplier;
import dev.sixpack.generator.annotation.SupplierMetadata;

@SupplierMetadata(
    name = ExampleSupplier.NAME,
    description = "This is an example supplier",
    reportIssueUrl = "https://www.sixpack.dev/supplier"
)
public class ExampleSupplier extends Supplier {

    public static final String NAME = "Example";

    public static void main(String... args) {
        new ExampleSupplier()
            .withGenerators(
                new HelloWorldGenerator()
            ).bootstrap();
    }
}
