//Lawyer Form Validation
const lawyerfname = document.getElementById('lawyerfname');
const lawyerlname = document.getElementById('lawyerlname');
const lawyeraddress = document.getElementById('lawyeraddress');
const lawyercity = document.getElementById('lawyercity');
const email = document.getElementById('email');
const phone = document.getElementById('phone');


btnSubmitlawyerform.addEventListener('submit', (e) => {
e.preventDefault();


checkLawyerInput();

});

function checkLawyerInput() {
    const lawyerfnameV = lawyerfname.value.trim();
    const lawyerlnameV = lawyerlname.value.trim();
    const lawyeraddV = lawyeraddress.value.trim();
    const lawyercityV = lawyercity.value.trim();
    const lawyeremailV = email.value.trim();
    const phoneV = email.value.trim();
    

    if (lawyerfnameV == '') {
       setErrorFor(lawyerfname,'Please enter your first name');
       return false;
    }
    else {
        setSuccessFor(lawyerfname);

    }
    if (lawyerlnameV == '') {
        setErrorFor(lawyerlname,'Please enter your last name');
        return false;

     }
     else {
         setSuccessFor(lawyerlname);
 
     }
     if (lawyeraddV == '') {
        setErrorFor(lawyeraddress,'Please enter your address');
        return false;

     }
     else {
         setSuccessFor(lawyeraddress);
 
     }
     if (lawyercityV == '') {
        setErrorFor(lawyercity,'Please enter your city');
        return false;

     }
     else {
         setSuccessFor(lawyercity);
 
     }
     if (lawyeremailV == '') {
        setErrorFor(email,'Please enter your email');
        return false;

     }
     else {
         setSuccessFor(email);
 
     }
     if (phoneV == '') {
        setErrorFor(phone,'Please enter your phone no');
        return false;

     }
     else {
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
