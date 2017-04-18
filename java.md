# EXAM: Programming Basics

### Getting Started
 - Fork this repository under your own account
 - Clone the forked repository to your computer
 - Create a `.gitignore` file so generated files won't be committed
 - Commit your progress frequently and with descriptive commit messages
 - All your answers and solutions should go in this repository

### What can I use?
- You can use any resource online, but **please work individually**
- **Don't just copy-paste** your answers and solutions, use your own words instead.
- **Don't push your work** to GitHub until your mentor announces that the time is up


# Tasks
## 1-3. Complete the following tasks: (~90 mins)
- [Odd Average](oddavg/OddAvg.java)
- [Copy](copy/Copy.java)
- [BlackJack](blackjack/BlackJack.java)

### Acceptance criteria
The application is accepted if:
- The solution works according to specification [1p each]
- The solution follows [styleguide](https://github.com/greenfox-academy/teaching-materials/blob/master/styleguide/java.md) [1p]
- Has proper error handling where the specification says it [1p each]
- Has the correct loops, methods, filters [1p each]
- The code is clean, without unnecessary repetition, and with descriptive names [1p each]
- You commit frequently with descriptive commit messages [1p]

## 4. Question time! (~10 mins) [4p]

### Name each building block of a method! [2p]

![anatomy](anatomy/AnatomyJava.png)

#### Your answer:
[add your answer here]   
1: method declaration  
2: type of the method's return value 
3: method's name 
4: method's parameter type   
5: methods's parameter name 
6: method's return value declaration with its type and name (and it's initialized here)   
7: method's body  
8: the return value of the method, (using the "return" + name of the value, 
it should be the same type as we declared)
  

### What is the constructor? When it is used? [2p]
#### Your answer:
The constructor is a method without a return value, 
that is existing in all classes.
When we create an object (an instance of a class), the class constructor is called, 
and with it we can initialize its fields.
The constructor's form should be te following: public NameOfClass (parameters/void)).
We can have different constructors (with the same name but different parameters). For example:
If I have a class Human, and an int age field in it, I can set this value by default:
public Human(){
age = 0;
}
OR I can ask the user for the age as input:
1. In the main: Human human = new Human(35);
2. The constructor in the class:
public Human(int age) {
this.age = age
}
