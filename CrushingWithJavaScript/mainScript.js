

const form = document.getElementById('form')
const username = document.getElementById('username')
const email = document.getElementById('email')
const oassword = document.getElementById('password')
const password2= document.getElementById('password2')

function showError (input, message){
    const formControl = input.parentElement;
    formControl.className ='form-control error'
}

function showSuccess (input, message){
    const formControl = input.parentElement;
    formControl.className ='form-control success'
}

form.addEventListener('submit', function(e){
    e.preventDefault();

    if(username.value ===''){
        showError(username, 'username is required');
    } else{
        showSuccess(username)
    }

})
