

const lasDeposite =4
const isAccountlocked =lasDeposite<3;
const useRole = 'banker'
if(isAccountlocked){
    
} else{
    console.log(' Welcome! your account is still working')
}

if(isAccountlocked){
    console.log('your account is locked')
    
} else if(useRole === 'admin'){
    console.log('Welcome admin')

} else{
    console.log('welcome')
}

