# JunitCore - Run Test Classes in Parallel with Parameters. #

## Background ##
JunitCore enables running test classes in parallel but it doesn't allow to pass parameters.

## Context ##
This code snippet was born out of the need to run several instances of the same test class in parallel, but with different parameters for each instance.
The only option I could find was to set parameters in the test class itself, but that meant that the number of instances would be the number of test classes
I chose to run in parallel times the number of parameters I set in the test class.


## Solution ##
What I did was the following:
1. In the test class, I created an ArrayList that holds items which will be used as parameters.
2. I also set a static int that is incremented in the test method. This way, whenever a new instance
of the test class spawns, it raises the value of this int by 1, which then allows traversing the
ArrayList item by item, passing it in the test method (or before or after methods for that matter)