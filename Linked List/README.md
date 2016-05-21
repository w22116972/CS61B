# Linked List

https://www.cs.berkeley.edu/~jrs/61b/lec/07.pdf
https://www.cs.berkeley.edu/~jrs/61b/lec/08.pdf

### Interface
: set of prototype for *public* methods

### Abstract Data Type
: well-defined Interface, implementation details hidden from other classes

### Invariant
: data structure is always *true*, no matter what methods called by external classes

### Single Linked List -> Invariant
1. size is always *true*
2. there is always a tail node whose **next** is *NULL* i.e. never circularly linked
- solution
1. fields are declared *private*
2. no methods return SListNode
**prevent evil tamperer from changing items, truncating list, or creating cycle in list, thus violate.**
