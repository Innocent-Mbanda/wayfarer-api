
const gradeCal = function(score, totalScore){
    const percentage = (score /totalScore)*100;
    if(percentage>=90){
    letterGrade =''
     letterGrade ='A'
    } else if(percentage >=80){
        letterGrade ='B'
    } else if(percentage >=70){
       letterGrade ='C'
    } else if(percentage >=50){
        letterGrade='F'
    }
    console.log(`You got a ${letterGrade} (${percentage}%)`)
} 

const result = gradeCal(15,20)
console.log(result)