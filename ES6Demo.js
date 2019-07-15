window.onload = function(){
   
    console.log("fib: " + fibonacci(10));
    console.log(sort([2,4,5,1,3,1]));
    console.log(factorial(5));
    console.log(rotateLeft([1,2,3,4,5], 1));
    console.log(0.1+0.2 === 0.3);
}

function fibonacci(n){
    if(n<=0){
        return 0;
    }else if(n==1){
        return 1;
     }else if(n==2){
         return 1;
    }
    else{
        return (fibonacci(n-1) + fibonacci(n-2));
    }

};


/*
 2. Sort array of integers

 f([2,4,5,1,3,1]) = [1,1,2,3,4,5]

 Don't use the Array sort() method... that would be lame.
*/

function sort(array){
    let x = 0;

    for(i=0; i<array.length; i++){
       for(j=0; j<array.length-i;j++){
           if(array[j-1] > array[j]){
               x = array[j-1];
               array[j-1] = array[j];
               array[j] = x;
           }
       }

    }

    return array;
};

/*
 3. Return the factorial of n

 f(0) = 1
 f(1) = 1
 f(3) = 6
*/
function factorial(n){

    if(n<=0){
        return 0;
    }else if(n==1){
        return 1;
    }else{
        return n * factorial(n-1);
    }
};


//4. Rotate left

//Given array, rotate left n times and return array

//f([1,2,3,4,5], 1) = [2,3,4,5,1]
//f([1,2,3,4,5], 6) = [2,3,4,5,1]
//f([1,2,3,4,5], 3) = [4,5,1,2,3]


function rotateLeft(array, n) {

    let x = 0;
    let l = array.length;

    for(i=0; i<n; i++){
        x = array[0];
    }for (j=0; j<l-1; j++){
        array[j] = array[j+1];
        array[array.length-1] = x;
    }

    return array;

};










