// what is a function: a function are codes we can run over and over.
// function declaration: function-input-code-output



const greeting = function(){
    console.log('welcome')
}

greeting();

 function numbers (number) {
     return console.log(number*number)
    
    
}

numbers(10)
numbers(10)
numbers(10)

//challenge.
//convert farhenheitToCelsiums.

function convertFarhenheitToCelsius(fr) {
    
   const celsius = (fr-32)*5/9;
    return celsius;
}

let tempOne = convertFarhenheitToCelsius(32)
let temp2= convertFarhenheitToCelsius(60)
console.log(tempOne)
console.log(temp2)