# Anti Patterns

### 1.God Objects
Class with many responsibility, can be solved using single responsibility principle.

### 2.Magic Number
Numbers which are used in the code, Can be solved using a constant.

### 3.Copy Paste
Functions being copied and pasted multiple times, can be solved by creating a super class and extending it.

### 4.Circular Dependency
Objects extending circularly, can be solved by a interface.

### 5.Lava Flow
Mixing Legacy code getting mixed with new flow, Solve by separating old flow.

### 6.String Concatenation
String concatenation will create new objects everytime, Instead use a stringBuilder

### 7.Memory Leaks
Memory Leaks will happens if cache memory is not removed, instead add a ttl for cache.

### 8.Catch and Ignore
Exception needs to be caught, logged once and through a service exception with proper error code.

