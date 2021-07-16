

const todos = ['todo1','todo2','todo3','todo4','todo5']

console.log(todos)

console.log(`You have the following list of {${todos}} todos today.
 Your first task on your todo list is ${todos[0]} 
and your second item on your todo list is ${todos[1]}`
)


todos.splice(1,3,'this is second item')

console.log(todos)