## Exercise: MontyHallParadox (12 Points)

The project name of this exercise is **MontyHallParadox** 

The purpose of this assignment is to learn how to do comparisons using the if statement and passing arguments into main() through the command line. Additionally, you get more practice on how to write all of your own code and Javadoc comments.

### Problem Description

The detailed description of this problem comes from the Programming Exercise P4.24 on page 192 of the Late Objects book (E6.19 on pages 300 & 301 in Early Objects).

You are writing a program that runs experiments to test the Monty Hall Paradox. You will get two numbers on the command line (as strings in `args` of the `main` function). The first number is for the seed of the random number generator. You should use `java.util.Random` for this assignment. Not using this random number generator could result in different findings than in the unit tester. For example, you should create the random number generator thusly:

```java
Random generator = new Random(Integer.parseInt(args[0]));
```

You will then run experiments to see whether sticking with your original choice or switching your choice results in more wins. The number of experiments will be passed as the second argument on the command line.

All of your code for simulating the Monty Hall Paradox will go in a static method with the signature `public static int simulateMontyHallParadox(int experiments, int seed)`. This method will run the experiments, count how many times the contestant would have won if they switched doors and return that count. The inputs to the function are `int experiments` which is the number of times the experiment should be run and `int seed` which is the seed to the random number generator. The reason we use a specified seed for the random number generator is so that I can exactly control the outcomes which makes grading the same for all students.

Once you run all the experiments, you simply return the results which can be printed out in `main`. The results could look like this:

```
Winners by switching: 635
```

Hints:

1. All rejoice! This program does not require using the Scanner object.
2. The logic for these experiments are actually quite simple. You only need to generate a pick and the door the car is behind each iteration of the loop.

### Getting Started

Like all of our exercises, so far, we are going to do this exercise by writing the source code that solves the problem first in **MontyHallParadox.java**. Using the techniques shown on the web page titled [How to Start Every Project in this Class](http://209.129.49.15:7990/projects/CS105F2016/repos/allan.knight/browse/HowToStartEveryProject.md) create a source file called **MontyHallParadox.java**. This is where your code will go. 

Starting this week we don't have any code to copy for the assignment. You get to do it all! Don't forget to provide proper Javadoc documentation

Now go through MontyHallParadox.java, add the proper headers as in past assignments and then change the [CHANGE THIS TO YOUR INFORMATION] text to the proper items. There are two items to be changed.

Once you've written your code run it by single clicking on **MontyHallParadox.java** in the package explorer and selecting **Run->Run** from the menu or using the keyboard shortcut. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

### Running the Unit Tests

Next you'll want to run these unit tests. Start by right-clicking on the `unittest.cs105` package and selecting **Run As -> JUnit Test**. 

To go back to the project view, select the **Package Explorer** tab.

### How to turn in this exercise

The first step of turning in your code is to commit and push your code to GitHub. Once you've completed this step your code will be on GitHub in your repository, not the repository for the class. This will allow you to use all your projects later as a portfolio.

To start the process write click your project and select **Team -> Commit...** and follow the usual procedures.

####Completing the turn-in process

Now to complete the turn-in process, once you confirmed that your code is on BitBucket, you need to create a **build plan** on Bamboo. This action will create a Bamboo build plan that will build and test your code every time you push code to your project. You can also run builds manually

Follow the directions in [How to Turn in Every Project in This Class](http://crowd.cs.sbcc.edu:7990/projects/CS105F2016/repos/allan.knight/browse/HowToTurnInEveryProjectInThisClass.md)

**NOTE** You do not need to anything on Canvas to turn-in your assignment, but your grade will be posted on there so that you may track your progress throughout the term.