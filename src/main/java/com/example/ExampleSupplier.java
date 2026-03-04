package com.example;


import dev.sixpack.generator.Supplier;
import dev.sixpack.generator.annotation.SupplierMetadata;

@SupplierMetadata(
        name = ExampleSupplier.NAME,
        description = "This is an example supplier",
        maintainer = "Sixpack Samples Team",
        reportIssueUrl = "https://www.sixpack.dev/supplier",
        reportIssueEmail = "support@sixpack.dev",
        alertEmails = {"support@sixpack.dev"}
)
public class ExampleSupplier extends Supplier {

    public static final String NAME = "Example";

    public static void main(String... args) {
        new ExampleSupplier()
                .withClientCertificatePath("config/generator.pem")
                .withClientKeyPath("config/generator.key")
                .withGenerators(
                        new HelloWorldGenerator()
                ).bootstrap();
    }
}
