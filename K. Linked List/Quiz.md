Quiz - Linked List
==============================

### 1. Which of the following sorting algorithms can be used to sort a random linked list with minimum time complexity?

```
    int fun(int arr[], int n)

    {

        int x = arr[0];

        for (int i = 1; i < n; i++)

            x = x ^ arr[i];

        return x;

    }
```
        A. Insertion Sort
        B. Quick Sort
        C. Heap Sort
        D. Merge Sort

Ans: D
#### Explanation
Both Merge sort and Insertion sort can be used for linked lists.

The slow random-access performance of a linked list makes other algorithms (such as quicksort) perform poorly, and others (such as heapsort) completely impossible.

Since worst case time complexity of Merge Sort is O(nLogn) and Insertion sort is O(n^2), merge sort is preferred.

See following for implementation of merge sort using Linked List.

http://www.geeksforgeeks.org/merge-sort-for-linked-list/


### 2. What is the output of following function for start pointing to first node of following linked list?

1->2->3->4->5->6

``` 
    void fun(struct node* start) 
    {

      if(start == NULL)

        return;

      printf("%d  ", start->data); 

      if(start->next != NULL )

        fun(start->next->next);

      printf("%d  ", start->data);

    }
``` 

        A. 1 4 6 6 4 1
        B. 1 3 5 1 3 5
        C. 1 2 3 5
        D. 1 3 5 5 3 1

Ans: D
#### Explanation
fun() prints alternate nodes of the given Linked List, first from head to end, and then from end to head. If Linked List has even number of nodes, then skips the last node.


### 3. The following C function takes a single-linked list of integers as a parameter and rearranges the elements of the list. The function is called with the list containing the integers 1, 2, 3, 4, 5, 6, 7 in the given order. What will be the contents of the list after the function completes execution?

``` 
    struct node 

    {

      int value;

      struct node *next;

    };

    void rearrange(struct node *list)

    {

      struct node *p, * q;

      int temp;

      if ((!list) || !list->next) 

          return;

      p = list;

      q = list->next;

      while(q) 

      {

         temp = p->value;

         p->value = q->value;

         q->value = temp;

         p = q->next;

         q = p?p->next:0;

      }

    }
``` 

        A. 1,2,3,4,5,6,7
        B. 2,1,4,3,6,5,7
        C. 1,3,2,5,4,7,6
        D. 2,3,4,5,6,7,1

Ans: B
#### Explanation
The function rearrange() exchanges data of every node with its next node. It starts exchanging data from the first node itself.


### 4. In the worst case, the number of comparisons needed to search a singly linked list of length n for a given element is (GATE CS 2002)
        A. log 2 n
        B. n/2
        C. log 2 n – 1
        D. n

Ans: d
#### Explanation
In the worst case, the element to be searched has to be compared with all elements of linked list.


### 5. Suppose each set is represented as a linked list with elements in arbitrary order. Which of the operations among union, intersection, membership, cardinality will be the slowest? (GATE CS 2004)

        A. union only
        B. intersection, membership
        C. membership, cardinality
        D. union, intersection

Ans: D
#### Explanation
For getting intersection of L1 and L2, search for each element of L1 in L2 and print the elements we find in L2.

There can be many ways for getting union of L1 and L2. One of them is as follows
a) Print all the nodes of L1 and print only those which are not present in L2.
b) Print nodes of L2.
All of these methods will require more operations than intersection as we have to process intersection node plus other nodes.


### 6. Consider the function f defined below.

```
    struct item 

    { 

      int data; 

      struct item * next; 

    }; 



    int f(struct item *p) 

    { 

      return (

              (p == NULL) || 

              (p->next == NULL) || 

              (( P->data <= p->next->data) && f(p->next))

             ); 

    }
```
For a given linked list p, the function f returns 1 if and only if (GATE CS 2003)

        A. not all elements in the list have the same data value.
        B. the elements in the list are sorted in non-decreasing order of data value
        C. the elements in the list are sorted in non-increasing order of data value
        D. None of them

Ans: B
#### Explanation
The function f() works as follows
1) If linked list is empty return 1
2) Else If linked list has only one element return 1
3) Else if node->data is smaller than equal to node->next->data and same thing holds for rest of the list then return 1
4) Else return 0


### 7. What are the time complexities of finding 8th element from beginning and 8th element from end in a singly linked list?

        A. O(1) and O(n)
        B. O(1) and O(1)
        C. O(n) and O(1)
        D. O(n) and O(n)

Ans: A
#### Explanation
Finding 8th element from beginning requires 8 nodes to be traversed which takes constant time.

Finding 8th from end requires the complete list to be traversed.


### 8. Is it possible to create a doubly linked list using only one pointer with every node.

        A. Not Possible
        B. Yes, possible by storing XOR of addresses of previous and next nodes.
        C. Yes, possible by storing XOR of current node and next node
        D. Yes, possible by storing XOR of current node and previous node

Ans: B
#### Explanation
XOR Linked List – A Memory Efficient Doubly Linked List | Set 1
http://www.geeksforgeeks.org/xor-linked-list-a-memory-efficient-doubly-linked-list-set-1/


### 9. Given pointer to a node X in a singly linked list. Only one pointer is given, pointer to head node is not given, can we delete the node X from given linked list?
        A. Possible if X is not last node. Use following two steps (a) Copy the data of next of X to X. (b) Delete next of X.
        B. Possible if size of linked list is even.
        C. Possible if size of linked list is odd
        D. Possible if X is not first node. Use following two steps (a) Copy the data of next of X to X. (b) Delete next of X.

Ans: A
#### Explanation
Following are simple steps.
```
    struct node *temp  = X->next;

    X->data  = temp->data;

    X->next  = temp->next;

    free(temp); 
```


### 10. You are given pointers to first and last nodes of a singly linked list, which of the following operations are dependent on the length of the linked list?

        A. Delete the first element
        B. Insert a new element as a first element
        C. Delete the last element of the list
        D. Add a new element at the end of the list

Ans: C
#### Explanation
a) Can be done in O(1) time by deleting memory and changing the first pointer.
b) Can be done in O(1) time, see push() here
c) Delete the last element requires pointer to previous of last, which can only be obtained by traversing the list.
d) Can be done in O(1) by changing next of last and then last.
