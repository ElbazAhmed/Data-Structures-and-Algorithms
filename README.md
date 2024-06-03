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

<details>
  <summary><h2>Boyer-Moore Majority Voting Algorithm</h2></summary>
  <p>The Boyer-Moore voting algorithm is one of the popular optimal algorithms which is used to find the majority element among the given elements that have more than N/ 2 occurrences. This works perfectly fine for finding the majority element which takes 2 traversals over the given elements, which works in O(N) time complexity and O(1) space complexity.</p>
  <h3>1. Counting Phase:</h3>
    <ul>
        <li>This phase identifies a potential candidate for the majority element.</li>
        <li>Initialize a variable <code>candidate</code> to <code>0</code> and a counter <code>count</code> to 0.</li>
        <li>Traverse the array, and for each element:
            <ul>
                <li>If <code>count</code> is 0, update <code>candidate</code> with the current element and set <code>count</code> to 1.</li>
                <li>If the current element equals <code>candidate</code>, increment <code>count</code>.</li>
                <li>Otherwise, decrement <code>count</code>.</li>
            </ul>
        </li>
    </ul>
    <h3>2. Verification Phase:</h3>
    <ul>
        <li>This phase verifies if the identified <code>candidate</code> is indeed the majority element.</li>
        <li>Reset the <code>count</code> to 0 and traverse the array again to count the occurrences of <code>candidate</code>.</li>
        <li>If <code>candidate</code> appears more than <code>&#189;</code> times (where <code>n</code> is the length of the array), it is the majority element.</li>
        <li>Else return <code>-1</code>.</li>
    </ul>
      <h2>Java Implementation</h2> 
  
  ```java
  public class BoyerMooreVoting {
    public static int findMajorityElement(int[] nums) {
        // Counting Phase
        int candidate = 0;
        int count = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        
        // Verification Phase
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        
        return count > nums.length / 2 ? candidate : -1;
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int majorityElement = findMajorityElement(nums);
        System.out.println(majorityElement);  // Output: 2
    }
  ```
<h2>Complexity Analysis</h2>
    <ul>
        <li><strong>Time Complexity:</strong> <code>O(n)</code> — Each phase traverses the array once.</li>
        <li><strong>Space Complexity:</strong> <code>O(1)</code> — The algorithm uses only a few additional variables regardless of the array size.</li>
    </ul>

</details>
