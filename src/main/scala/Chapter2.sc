//2.4.0.1 Arithmetic
//Write an expression using integer literals, addition, and subtraction that evaluates to 42.
42 + 1 - 1

//2.4.0.2 Appending Strings
//Join together two strings (known as appending strings) using the ++ method.Write equivalent expressions using both the normal method call style and operator style.
"peanut"++"butter"
"peanut".++("butter")

//2.4.0.3 Precedence
//In mathematics we learned that some operators take precedence over others.
// For example, in the expression 1 + 2 * 3 we should do the multiplication before the addition.
// Do the same rules hold in Scala?
1 + 2 * 3
//yes

//2.4.0.4 Types and Values
//Which of the following expressions will not compile? Of the expressions that will compile, what is their type?
//Which expressions fail at run-time?

1 + 2

"3".toInt

//"Electric blue".toInt

"Electric blue".take(1)

//"Electric blue".take("blue")


1 + ("Moonage daydream".indexOf("N"))

1 / 1 + ("Moonage daydream".indexOf("N"))

// 1 / (1 + ("Moonage daydream".indexOf("N")))
// fails because "Moonage daydream".indexOf("N") is -1 and causes division by zero