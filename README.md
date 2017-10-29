#Basic Statistics

Basic Statistics is a Java-based implementation for computing statistics on a set of numbers.
This implementation is intended to be used in software engineering courses as
a subject software system.

Basic Statistics uses the Apache Ant build system. **Make sure that you have [Ant](https://ant.apache.org) installed.**

#### How to build Basic Statistics and run its tests from the terminal:

1. Change into the Basic Statistics root directory, which contains the *build.xml* build file.

2. Run `ant compile` to compile Basic Statistics. The compiled class files will be in the *bin* directory.

4. Run `ant test` to run all Basic Statistics unit tests.

5. Run `ant -lib lib/ test` to run all Basic Statistics unit tests.

#### How to run Basic Statistics from the terminal:

How to run Basic Statistics (from the terminal):

1. After building the project (i.e., running `ant`), cd into the `bin` directory and run: `java BasicStats`. The application's GUI will show up.

Program features:
* Displays a set of entered numbers.
* Computes the mean of the set of numbers.
* Computes the median of the set of numbers.
* Computes the mode of the set of numbers.
