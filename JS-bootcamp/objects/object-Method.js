

const restaurant={
name:'BJR',
gestCapacity:75,
gestCount: 0,

 checkAvailability: (customerInside)=>{

const availableSeat = this.gestCapacity - this. gestCount

return customerInside <= availableSeat

},

seatParty: (customerInside)=>{
    this.gestCount = this.gestCount + customerInside;
},

removeParty :(customerInside)=>{

    this.gestCount = this.gestCount-customerInside;

}
}



restaurant.seatParty(72)
console.log (restaurant.checkAvailability(4))
restaurant.removeParty(5)
console.log (restaurant.checkAvailability(4))



// console.log(status)