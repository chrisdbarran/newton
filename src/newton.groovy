
// Using a simple formula (function) like x squared minus 5

// The initial guess for x
def x = 3
// This is just a count of the number of iterations used - don't really need it
def n = 1

// Calculate the first value for myFunc from the initial guess using function myFunc defined below.
def ans = myFunc(x)


// Iterate until the ans calculated is less than 0.0001 or whatever level of accuracy you want.
while ( ans > 0.0001)
{
    // Calculate the next value of x using the newton-raphson method defined in function raphson.
    x = raphson(x)

    // Calculate the the value of myFunc for the new value of x
    ans = Math.abs(myFunc(x))

    // Print out the values in this iteration.
    println "Iteration: ${n}: new x :  ${x} for myFunc: ${root} "

    // Increment the count of the iteration.
    n++
}


// Newton raphson function.
def raphson (x) {
    return x - ((myFunc(x) / myFuncP(x)))
}

// The function for which roots are being calculated.
def myFunc (x) {

    return (x * x) - 5
}

// Calculates the derivative of the function.
def myFuncP (x) {
    return 2 * x
}