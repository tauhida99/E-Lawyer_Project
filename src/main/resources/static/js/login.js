const login = document.getElementById('login');
const user = document.getElementById('user');
const cpass = document.getElementById('cpass');
const pass = document.getElementById('pass');


login.addEventListener('submit', (e) => {
e.preventDefault();


checkInput();

});

function checkInput() {
    const userValue = user.value.trim();
    const passValue = pass.value.trim();
    const cpassValue = cpass.value.trim();
   

    if (userValue == '') {
       setErrorFor(user,'Please enter your user name');
    }
    else {
        setSuccessFor(user);

    }
    if (passValue == '') {
        setErrorFor(pass,'Please enter your password');
     }
     else {
         setSuccessFor(pass);
 
     }
     if (cpassValue == '') {
        setErrorFor(cpass,'Password is invalid');
     }
     else {
         setSuccessFor(cpass);
 
     }
     



}


function setErrorFor(input,msg){
    const fmGroup = input.parentElement;
    const small = fmGroup.querySelector('small');


    fmGroup.className = 'form-group error';
    small.innerText = msg;

}


function setSuccessFor(input) {
    const fmGroup = input.parentElement;

    fmGroup.className = 'form-group success';
}
