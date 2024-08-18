
// program game to ask about licencse 
// let runAgain = true;

// while(runAgain){
//     let age = prompt("Enter your age");
// age = Number.parseInt(age);  
//     const canDrive = (age) =>{
//         return age>=18 ? true : false
//     }
//     if(canDrive(age)){
//         alert("yes you can drive");
        
//     }
//     else{
//         alert("you cannot drive"); 
        
//     }
//     runAgain= confirm("Do you want to play again?");
// }

// const student = {
//     name : "herish",
//     id : "23DCE083",
//     tag: 83,
//     marks: 100
// }

// console.log(student.name);
const marks = {
    harry: 29,
    himpadma: 21,
    meet: 23,
    hemil: 28
}
for(let a in marks){
    console.log("marks of "+ a + " is "+marks[a]);
}


