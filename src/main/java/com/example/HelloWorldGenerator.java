package com.example;

import dev.sixpack.api.data.Context;
import dev.sixpack.api.data.Visibility;
import dev.sixpack.generator.Generator;
import dev.sixpack.generator.annotation.InputField;
import dev.sixpack.generator.annotation.ItemMetadata;

@ItemMetadata(
        name = HelloWorldGenerator.NAME,
        description = "Says hello world",
        maintainer = "Sixpack Samples Team",
        reportIssueUrl = "https://www.sixpack.dev/supplier",
        reportIssueEmail = "support@sixpack.dev",
        alertEmails = {"support@sixpack.dev"},
        visibility = Visibility.VISIBLE
)
public class HelloWorldGenerator extends Generator {

    public static final String NAME = "Hello";

    public record Input(
            @InputField(description = "Name of who to greet", nullDescription = "John")
            String name
    ) {
    }

    public record Output(String greeting, Integer number) {

    }

    public Output generate(Input input, Context context) {
        var name = input.name;
        if (name == null) {
            name = "John";
        }

        var greeting = "Hello " + name;
        var number = 42;
        System.out.println(greeting);
        return new Output(greeting, number);
    }
}
