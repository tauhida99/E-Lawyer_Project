// Client Form Validation
const name = document.getElementById('fname');
const lname = document.getElementById('lname');
const address = document.getElementById('address');
const city = document.getElementById('city');
const email = document.getElementById('email');
const phone = document.getElementById('phone');


btnCustomerSubmit.addEventListener('submit', (e) => {
e.preventDefault();


checkInput();

});

function checkInput() {
    const nameValue = fname.value.trim();
    const lnameValue = lname.value.trim();
    const addValue = address.value.trim();
    const cityValue = city.value.trim();
    const emailValue = email.value.trim();
    const phoneValue = phone.value.trim();

    

    if (nameValue == '') {
       setErrorFor(fname,'Please enter your name');
       return false;
    }
    else {
        setSuccessFor(fname);

    }
    if(lnameValue == ''){
        setErrorFor(lname,'Please enter your last name' );
        return false;

    }else{
        setSuccessFor(lname);
    }
    if(addValue == ''){
        setErrorFor(address,'Please enter your address' );
        return false;
    }else{
        setSuccessFor(address);
    }
    if(cityValue == ''){
        setErrorFor(city,'Please enter your city' );
        return false;

    }else{
        setSuccessFor(city);
    }
    if(emailValue == ''){
        setErrorFor(email,'Please enter your email' );
        return false;

    }else{
        setSuccessFor(email);
    }
    if(phoneValue == ''){
        setErrorFor(phone,'Please enter your phone no' );
        return false;
    }else{
        setSuccessFor(phone);
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
