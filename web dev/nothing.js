

let runAgain = true;

while(runAgain){
    let age = prompt("Enter your age");
age = Number.parseInt(age);  
    const canDrive = (age) =>{
        return age>=18 ? true : false
    }
    if(canDrive(age)){
        alert("yes you can drive");
        
    }
    else{
        alert("you cannot drive"); 
        
    }
    runAgain= confirm("Do you want to play again?");
}


