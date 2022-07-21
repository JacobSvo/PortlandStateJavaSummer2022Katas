package edu.pdx.cs410J.Room1;

import java.lang.*;
import java.util.*;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
  /*class Node{
    int a;
    int b;
    Node root;
    Node left;
    Node right;
    int value;
    public Node getRight(){
      return this.right;
    }
    public Node getLeft(){
      return this.left;
    }
    public Node insertLeft(Node left){
      this.left = left;
      return left;
    }
    public Node insertRight(Node right){
      this.right = right;
      return right;
    }
    Kata(int a, int b) {
      this.a = a;
      this.b = b;
    }
  }
  class Sub extends Node {
    int exec() {
      return this.a - this.b;
    }
  }
  class Add extends Node {
    int exec() {
      return this.a + this.b;
    }
  }
  class Mul extends Node {
    int exec(){
      return this.a * this.b;
    }
  }
  class Div extends Node {
    int exec() {
      return Math.floor(this.a / this.b);
    }
  }
  class Sqrt extends Node {

  }*/
    /**
     *        // int a;
     *        // int b;
     *        // int total = 0;
     * 3 5 8 * 7 + *
     *
     *
     * 3 5 8   *
     * stop
     *    // op = *
     *    // a = 8
     *    // b = 5
     *    // total += 5 * 8
     *    // push total back to stack
     * 3 40
     * 3 40 7
     * 3  40 7 +
     * stop
     *    // op = +
     *    // a = 7
     *    // b = 40
     *    // total += 7 + 40
     *    // push total back to stack
     * 3 47
     * *
     *  // op = *
     *  // a = 47
     *  // b = 3
     *  // total += 47 *3
     * no more on stack
     * end
     *
     * */
  public static void main(String[] args) {
    Stack stack = new Stack<Integer>();
    for (String value : args){
      if (value.equals("*")){
        // pop pop mult push
        Integer a = (Integer)stack.pop();
        Integer b = (Integer)stack.pop();
        Integer res = a * b;
        stack.push(res);
      } else if (value.equals("/")){
        // pop pop div push
        Integer a = (Integer)stack.pop();
        Integer b = (Integer)stack.pop();
        Integer res = a / b;
        stack.push(res);
      } else if (value.equals("+")){
        // pop pop plus push
        Integer a = (Integer)stack.pop();
        Integer b = (Integer)stack.pop();
        Integer res = a + b;
        stack.push(res);
      } else if (value.equals("-")){
        // pop pop minux push
        Integer a = (Integer)stack.pop();
        Integer b = (Integer)stack.pop();
        Integer res = a - b;
        stack.push(res);
      }else if("MAX"){
        Integer a = (Integer) stack.pop();
        Integer b = (Integer) stack.pop();
        Integer res = (a > b) ? a : b;
        stack.push(res);
      } else{
        stack.push(Integer.valueOf(value));
      }
    }
    // an empty stack
    System.out.println(stack.pop());
  }
}