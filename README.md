<details>
  <summary><h2>Arrays - ArrayList</h2></summary>
  <p>Informally, an array is a list of elements. These elements can be of any type: numbers, words, objects, or even other arrays. Each element in an array is accessed by its index, which starts from 0. Arrays are typically enclosed in square brackets with elements separated by commas, like this: [1, 2, 3]. In this example, the elements of the array are 1, 2, and 3.</p>
  <h3>Static Size Property</h3>
  <p>Arrays in many programming languages, including Java, have a fixed size. This means that once an array is created, its size cannot be changed. This static size property can be a limitation when the number of elements is not known in advance or if the size of the array needs to change dynamically.</p>
  
  ```java
  int[] numbers = new int[3]; // An array of fixed size 3
  numbers[0] = 1;
  numbers[1] = 2;
  numbers[2] = 3;
  ```
  <h3>Solution with ArrayList</h3>
  <p>To overcome the limitation of fixed size arrays, Java provides the ArrayList class, which is part of the java.util package. ArrayList is a resizable array implementation of the List interface. It can grow and shrink as needed, providing more flexibility.</p>

  ```java
  import java.util.ArrayList;
  ArrayList<Integer> numbers = new ArrayList<>();
  numbers.add(1);
  numbers.add(2);
  numbers.add(3);
  ```
  <h3>Memory Allocation of an Array</h3>
  <p>When an array is created, a contiguous block of memory is allocated to hold its elements. The size of this memory block is determined by the number of elements and the type of each element. For example, an array of integers (int[]) in Java will allocate memory for the integer values based on their data type size.</p>

  ```java
  int[] array = new int[5]; // Allocates memory for 5 integers
  ```
  <p>Each element in the array is stored in a contiguous memory location, which allows for efficient access using the index. However, this also means that resizing the array (increasing or decreasing its size) is not straightforward and typically requires creating a new array and copying the elements, which is why using an ArrayList can be more convenient for dynamic data structures.</p>
  <h3>Helpful Resources</h3>
  <a href="https://www.youtube.com/watch?v=pmN9ExDf3yQ">An Overview of Arrays and Memory (Data Structures & Algorithms #2)</a><br>
  <a href="https://www.youtube.com/watch?v=NptnmWvkbTw">What is an Array? - Processing Tutorial</a><br>
  <a href="https://www.youtube.com/watch?v=47JBVxCWXJA">Declare, Initialize, and Use an Array - Processing Tutorial</a>
</details>
