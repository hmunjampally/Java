# Mini Project

## Project Objectives
This is a starting code repository for an in-class exercise. The purpose of the exercise is to:
1. Practice using git in a team setting
2. Apply spearation of concerns to a code example
3. Redesign code to reduce duplication
4. Apply dependency inversion principle

## Overview
Run the code with: ``gradle run``. Use left and right arrow keys to flip the shape that apears in the application window. This is a common shape used in the game of Tetris. Your goal is to add other shapes to this project that could be flipped with left and right arrows.

## Code Details
In the ``app/src/main/java/mini_project`` directory you will find App.java and model, view, and controller sub-directories. The model directory contains LShape.java, where LShape class is defined (that's the shape that's included in the project). There are 4 ways L shape could be positioned:

Position 1:
```
**
*
*
```
Position 2:
```
***
  *
```
Position 3:
```
 *
 *
**
```
Position 4:
```
*
***
```
These positions are hard-coded in the ``positions`` instance variables of the LShape class, using a 3 by 3 Grid of boolean values (true represents the presence of the shape at a given cell, false represents absence).

The view directory has Shape.java, that looks at LShape and draws it on the screen. The JFrame of the application is created in App.java, where we call addKeyListener on that JFrame passing our implementation of KeyListener (which is implemented in controller/ShapeController.java). This listener examines which key was pressed (once a key is pressed on the keyboard). If the pressed key was a right arrow, it calls LShape to rotate right. If the key pressed was left arrow, it calls LShape to rotate left. Note, that in order to tell LShape to rotate left or right, ShapeController has an instance of LShape (the same LShape object that view/Shape.java has).

Once LShape object is rotated, it notifies all registered observers about the change. In this case, the registered observer is ``mini_project.view.Shape`` object, which re-draws the shape when its update method is called.

## Your tasks
Add new shapes to this project, and make them show up on the main screen (all at the same time). When the user presses left or right arrow keys, all shapes should rotate in the left or right direction. Make sure to add your new shape to App.java file, to make sure it shows up in the main application window.

Have each team member add 1 new shape to this project. Remember to use ``git pull`` command to pull remote changes to your local repository (commits that your teammates pushed). Also, remember that you might have a merge conflict if several people are editing the same file. You'll need to resolve this merge conflict.
