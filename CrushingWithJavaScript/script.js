// // String, numbers, Boolean, null, undefined

// const name = "John";
// const age = 30;
// const rating = 4.5;
// const isCool = true;
// const x = null;
// const y = undefined;
// let z;

// console.log(typeof x);

// // creating string template

// console.log(`my name is ${name} and I am ${age}`);

// const s = "computer, technology, it, code";
// console.log(s.split(","));

// // arrays

// const numbers = new Array(1, 2, 3, 4, 5);
// console.log(numbers);

// const fruits = ["apples", "Organges", "pinaple", "pears"];
// fruits[3] = "grapes";
// fruits.unshift("stroberries");
// console.log(Array.isArray(fruits));
// console.log(fruits);

// console.log(fruits[1]);

// //object littles

// const person = {
//   firstName: " John",
//   LastName: "Doe",
//   age: "30",
//   hobbies: ["Football", "music", "movies"],

//   addess: {
//     Street: "50 main strt",
//     city: "Columbus",
//     State: "OH",
//   },
// };
// const { firstName, LastName } = person;
// console.log(person.hobbies[2]);

// person.email = "innocent@gmail.com";
// console.log(person);

// //arrays of objects

// const todos = [
//   {
//     id: 1,
//     text: "taking trash-out",
//     isCompleted: "false",
//   },
//   {
//     id: 2,
//     text: "Walking a dog",
//     isCompleted: "false",
//   },
//   {
//     id: 3,
//     text: "Submitting assignment",
//     isCompleted: "false",
//   },
// ];

// console.log(todos[1].text);

// //for

// for(let i =1; i<=10; i++){
//     console.log('your number is '+ (i))
// }

// //while loop

// // let i =0;

// // while(i<10){
// //     console.log('your number is ' + (i))
// //     i++
// // }

// // for(let todo  of todos){
// //   console.log(todos)
// // }

// // todos.forEach(function(todo){
// //   console.log(todos.text)
// // })

// const todosText = todos.map((todo)=>{
//   return todo.text
// })

// console.log(todosText)

// const isCompleted = todos.filter((todo)=>{
//   return todo.isCompleted !=true;

// })

// console.log(isCompleted)

// //condingtions

// const innocent =10;

// if (innocent === 10){
//   console.log('x is 10')
// }