// multiple arguments
// const add = function multipleArguments(params1,params2) {
//     return(params1+params2)
// }

// const result = add(10,20);
// console.log(result)

//deafult argument.

// const getScoreText = function gane(name, score = 0) {
//     console.log(name)
//     console.log(score)
// }

// getScoreText('Innocent', 200)

const waiterPayment = function(receipt, tipPecent){
    const tip = receipt*tipPecent
    const customerTotalPay = receipt +tip;
    return console.log('****'+ customerTotalPay)
  
}

const totalpayment = waiterPayment(200,0.3)

console.log(totalpayment)


