# Concordion Google Calculator demo

This project contains a number of branches showing different methods for handling scope using Concordion.

The following specs currently require the merge_field_scope branch of [nigelcharman/concordion](https://github.com/nigelcharman/concordion). (Checkout the branch and run `gradlew -b publish.gradle pTML` to publish to maven local).

* [Global scope using the default serial spec runner](../../blob/global_serial/src/test/java/org/concordion/google/calculator/GoogleBaseFixture.java)
* [Global scope using a parallel spec runner](../../blob/global_parallel/src/test/java/org/concordion/google/calculator/GoogleBaseFixture.java)
* [Per spec scope using the default serial spec runner with a static variable](../../blob/per_spec_serial_static/src/test/java/org/concordion/google/calculator/GoogleBaseFixture.java)
* [Per spec scope using the default serial spec runner with a specification scoped variable](../../blob/per_spec_serial_specification_scoped/src/test/java/org/concordion/google/calculator/GoogleBaseFixture.java)
* [Per spec scope using a parallel spec runner](../../blob/per_spec_parallel/src/test/java/org/concordion/google/calculator/GoogleBaseFixture.java)
* [Per example scope using the default serial spec runner ](../../blob/per_example_serial/src/test/java/org/concordion/google/calculator/GoogleBaseFixture.java)
* [Per example scope using the parallel spec runner ](../../blob/per_example_parallel/src/test/java/org/concordion/google/calculator/GoogleBaseFixture.java)

## Alternate implementation
The following specs currently require the alternate-specification-scoped branch of [nigelcharman/concordion](https://github.com/nigelcharman/concordion). (Checkout the branch and run `gradlew -b publish.gradle pTML` to publish to maven local).
* [Per spec scope using the default serial spec runner](../../blob/per_spec_serial_alternate/src/test/java/org/concordion/google/calculator/GoogleBaseFixture.java)
* [Per spec scope using the parallel spec runner](../../blob/per_spec_parallel_alternate/src/test/java/org/concordion/google/calculator/GoogleBaseFixture.java)
* [Per example scope using the default serial spec runner ](../../blob/per_example_serial_alternate/src/test/java/org/concordion/google/calculator/GoogleBaseFixture.java)
* [Per example scope using the parallel spec runner ](../../blob/per_example_parallel_alternate/src/test/java/org/concordion/google/calculator/GoogleBaseFixture.java)


