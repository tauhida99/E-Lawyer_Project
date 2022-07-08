//Case Validation form
const csname = document.getElementById('csName');
const cstype = document.getElementById('csType');
const cslocation = document.getElementById('csLocation');
const csevent = document.getElementById('csEvent');
const cssource = document.getElementById('csSource');
const csdate = document.getElementById('csDate');


btnCaseSubmit.addEventListener('submit', (e) => {
e.preventDefault();


;

});

function checkCaseInput() {
    const csnameValue = csName.value.trim();
    const cstypeValue = csType.value.trim();
    const cslocationValue = csLocation.value.trim();
    const cseventValue = csEvent.value.trim();
    const cssourceValue = csSource.value.trim();
    const csdateValue = csDate.value.trim();
    

    if (csnameValue == '') {
       setErrorFor(csName,'Please enter your case name');
       return false;
    }
    else {
        setSuccessFor(csName);

    }
    if (cstypeValue == '') {
        setErrorFor(csType,'This form must be filled');
        return false;
     }
     else {
         setSuccessFor(csType);
 
     }
     if (cslocationValue == '') {
        setErrorFor(csLocation,'Please enter location');
        return false;
     }
     else {
         setSuccessFor(csLocation);
 
     }
     if (cseventValue == '') {
        setErrorFor(csEvent,'This filled must be filled');
        return false;
     }
     else {
         setSuccessFor(csEvent);
 
     }
     if (cssourceValue == '') {
        setErrorFor(csSource,'source must be filled');
        return false;
     }
     else {
         setSuccessFor(csSource);
 
     }
     if (csdateValue == '') {
        setErrorFor(csDate,'date must be filled');
        return false;
     }
     else {
         setSuccessFor(csDate);
 
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
