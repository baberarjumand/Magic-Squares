A Java program to generate Magic Squares with a focus on Test-Driven Development techniques.

Tuples are used to create multidimensional hypercubes.<br>
Length of tuple determines the dimensions of generated hypercubes.<br>
Order (number of rows/cols) of the magic cube is equal to the base for the order.<br>
The tuples are converted from base-n to base-10 using an adjacency matrix.

For example, to generate a 7x7x7 magic cube, base-7 numbers would be used and each tuple would have a length of 3.<br>
Magic cube of 7x7x7 : Tuple would look like: (3, 4, 1)  where 341 is in base-7 which is equivalent to 176 in base-10.<br>
Magic cube of 3x3   : Tuple would look like: (2, 0)     where 20 is in base-3 which is equivalent to  6   in base-10.
