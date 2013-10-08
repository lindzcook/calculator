REPORT.md
========
Comparison of Iterative and Recursive implementations of the Math interface
---------------------------------------------------------------------------

# inc(n) and dec(n)

### Iterative
 
 * T(n) = 1

 * T(n)  = O(1)
 
 * Constant Time

### Recursive

 * T(n) = 1

 * T(n) = O(1)

 * Constant Time

### Comparison

 * No difference whatsoever.

# add(lhs, rhs)

### Iterative

 * T(n) = 5n + 2

 * T(n) = O(n)

 * Linear Time

### Recursive

 * T(n) = 5n + 2

 * T(n) = O(n)

 * Linear Time
 
### Comparison

 * The iterative and recursive implementations of add have the same time complxity.
   The recursive implementation is easier to read. The two implementations have identical growth
   functions.  
   
# sub(lhs, rhs)

### Iterative

 * T(n) = 5n + 2

 * T(n) = O(n)

 * Linear Time

### Recursive

   * T(n) = 5n + 2

   * t(n) = O(n)

   * Linear Time

### Comparison

* The iterative and recursive implementations of subtract have the same time complexity.
  The recursive implementation is easier to read. The two implementations have identical growth 
  functions.

# mul(lhs, rhs)

### Iterative

 * T(n) = 5n^2 + 6n + 2

 * T(n) = O(n^2)

 * Quadratic Time

### Recursive
 
 * T(n) = 5n^2 + 3n - 8

 * T(n) = O(n^2)

 * Quadratic Time

### Comparison

 * Both implementations have a quadratic time complexity.
   The recursive approach results in a smaller growth function.
   The recursive approach is less code but is harder to understand.  

# div(lhs, rhs)

### Iterative

 * T(n) = 5n^2 + n - 4

 * T(n) = O(n^2)

 * Quadratic Time

### Recursive

 * T(n) = 5n^2 + 6n + 3

 * T(n) = O(n^2)

 * Quadratic Time

### Comparison
 
 * Both implementations of div(lhs, rhs) have quadratic time complexity.
   The iterative approach has a smaller growth function. The recursive
   implementation is less code but is harder to understand.

# fac(int num)

### Iterative

 * T(n) = 5n^3 + 6n^2 + 6n + 2

 * T(n) = O(n^3)
 
 * Cubic Time

### Recursive

 * T(n) = 5n^3 + 8n^2 - 4n + 2

 * T(n) = O(n^3)

 * Cubic Time

### Comparison

 * Both implementations have a cubic time complexity. The iterative implementation
   takes fewer actions. The recursive implementation is fewer lines of code and is easier
   to understand than the iterative implementation.

# pow(lhs, rhs) 

### Interative

 * T(n) = 5n^3 + 6n^2 + 6n + 2

 * T(n) = O(n^3)

 * Cubic Time

### Recursive

 * T(n) = 5n^3 + 3n^2 - 5n + 3

 * T(n) = O(n^3)

 * T(n) = Cubic Time

### Comparison

 * Both implementations have a cubic time complexity. The recursive approach
   performs fewer actions. The recursive approach has fewer lines of code but
   is more difficult to read and understand.

# lshift(lhs, rhs)

### Iterative

 * T(n) = 5n^3 + 11n^2 + 12n +4

 * T(n) = O(n^3)

 * Cubic Time

### Recursive

 * T(n) = 5n^3 + 3n^2 - 5n + 2

 * T(n) = O(n^3)

 * Cubic Time

### Comparison

 * Both implementations take cubic time to execute. The iterative implementation
   performs many more actions than the recursive implementation. The recursive 
   implementation is fewer lines of code and is easier to read. 

# rshift(lhs, rhs)

### Iterative

 * T(n) = 5n^3 + 6n^2 + n - 2

 * T(n) = O(n^3)

 * Cubic Time

### Recursive

 * T(n) = 5n^3 + 6n^2 + 4n + 2

 * T(n) = O(n^3)

 * Cubic Time

### Comparison

 * Both implementation of rshift have a cubic time complexity. The recursive
   implementation should perform 3n + 4 more actions than the iterative approach.
   The recursive approach has fewer lines of code and is easier to read.  