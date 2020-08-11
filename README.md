# CSX42: Assignment 4
## Name: Shrijeet Rupnar
## B-00808280

-------------------------------------------------------------------------

Due Date:  July 22, 2020 
Submitted date : July 24, 2020 
Author(s): Shrijeet Rupnar 
e-mail(s): srupnar1@binghamton.edu

PERCENT COMPLETE: I believe I have completed 100% of this project.

BUGS: No bugs.

Note :

I am using Slack days.Kindly make a note of it.


---------------------------------------------------------------------------

Following are the commands and the instructions to run ANT on your project.


Note: build.xml is present in [arrayvisitors/src](./arrayvisitors/src/) folder.

## Instruction to clean:

```commandline
ant -buildfile arrayvisitors/src/build.xml clean
```

Description: It cleans up all the .class files that were generated when you
compiled your code.

## Instructions to compile:

```commandline
ant -buildfile arrayvisitors/src/build.xml all
```
The above command compiles your code and generates .class files inside the BUILD folder.

## Instructions to run:

```commandline
ant -buildfile arrayvisitors/src/build.xml run -Dinput1="input1.txt" -Dinput2="input2.txt" -Dcommonintsout="output1.txt" -Dmissingintsout="output2.txt" -Ddebug="2"
```
Note: Arguments accept the absolute path of the files.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Description:

Program with visitors to determine features in two input files that have integers :


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Provide justification for Data Structures used in this assignment in term of Big O complexity (time and/or space):

1.Internal Array :
To insert a data into internalArray I have create one array named inernalArray with initial size 10. once Array reach to size 10 then it will increase size by 50%.
not for this requirement I have created one more array temporaryArray with increased size and copied all the elements from inernalArray  to temporaryArray. and at last assigned 
temporaryArray to inernalArray. Complexity is O(n).

2.Result 
I have used list data structure in result class to store the final result. Complexity to add element is O(n).

3. MyArrayList
I have used set data structure to inset element and to perfrom check for missing element on that set.
Complexity to search element is O(n).


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Academic Honesty statement:

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating an official form will be
submitted to the Academic Honesty Committee of the Watson School to
determine the action that needs to be taken. "

Date: [07/24/2020]

citation:

https://stackoverflow.com/questions/13597373/writing-a-list-to-a-file




