
// const myAccount ={
//     name:'Innocent',
//     expenses:0,
//     income:0
// }
// const otherAcount = myAccount
// otherAcount.income =1000;
// const Addexpenses =( account, amount)=>{
    
//     account.expenses = account.expenses +amount
//     // account.income = account.income +amount

// }

// Addexpenses (myAccount, 2.50)
// console.log(myAccount)


const myIncome ={
    name:'Andrew Mea',
    expenses: 0,
    income : 0
}


const Addexpenses =( account, amount)=>{
    
    account.expenses = account.expenses +amount
}


const addIncome =(account, income)=>{
account.income = account.income +income

}

const resetAccout=( account)=>{
account.expenses =0;
account.income=0;

}

const getAccountSummary=(account)=>{
    const balance = account.income - account.expenses

    return `account of ${myIncome.name} has $${balance} and $${account.income} 
   income and also $${account.expenses} in expenses`


}

console.log(getAccountSummary(myIncome))

addIncome(myIncome,200)
Addexpenses(myIncome,250)
Addexpenses(myIncome, 100)
