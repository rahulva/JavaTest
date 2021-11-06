2. What is a lambda expression?
   The lambda expression was added into Java 8 to provide users with an anonymous function that can be called without using the function name but has a functional set of parameters with a lambda entity.

The following is the structure of a lambda expression:

(Argument List) ->{expression;} or
(Argument List) ->{statements;}

4. Describe the syntax of a lambda expression.
   Lambda expressions can be divided into three parts as shown in the below syntax:

//Lambda expression

(int a, int b) -> { System.out.println(a+b); return a+b;}
Arguments: A lambda expression can have zero or more arguments at any point in time.
Array token: It is used to point to the body of the expression.
Body: The body consists of expressions and statements. Braces are not required if it has only a single statement.