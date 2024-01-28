// @Author:TAflouk
// @Date:25-03-22 18:08:00
// @LastModifiedBy: TAflouk
// @Last Modified time:30-03-22 02:24:00
// Js lettery game

/*--- CONST VARS --- */
const NUMBALLS = 5 , NUMLETTERS = 26, COST = 5;
/*--- GLOBAL VARS --- */
var userLettersCounter = 5,  chips = 50;
var allEnglishLetters = [], randLetters = "", userLetters = "";
/*--- GLOBAL VARS ---
 1. TO MAP VALUES INTO VARS */
var zero = 0, stBox = 1,  scndBox = 2;
var  thirdBox = 3, fourthBox = 4, fifthBox = 5;
var zeroBoxVal = 0, stBoxVal = 20 , scndBoxVal = 50;
var  thirdBoxVal = 350, fourthBoxVal = 650, fifthBoxVal = 2500;

/*Standard $ function to minimise the time typing document.getElementById (id)
*/
$ = function (id) {
    return document.getElementById(id);
};

/* GenerateRandLetters Function()
    This function does the following
	1. Generates all English alphabets if the user has money left in the wallet
	2. Generates 5 random numbers  dependind on the size of the Array and it stores them in a list
	3. Display how many entries left for the user
	4. Enable add char button and the letter box
*/
GenerateRandLetters = function (balls = NUMBALLS) {
    //var i = 97; //i<= 122
    $("lettersLeft").innerHTML = "Letters Left: "+ userLettersCounter;
    var gameCost = $("bet").value;
    if (chips >= gameCost)
    {
        if(gameCost > COST)
        {
            chips -= 10;
        }//
        else{
            chips -= COST;
        }
        console.log("it costs you " + (gameCost));
        console.log("& you have " + chips +" in your wallet.");
        for(var i = 97; i<= 122;i++)
        {
            //console.log(String.fromCharCode(i),i);
            allEnglishLetters.push(String.fromCharCode(i).toLowerCase());
        }
        console.log("English Alphabets: " + allEnglishLetters + " you have: "+ chips+ " chips ");
        while(randLetters.length < balls)
        {
            var randNum = Math.floor(Math.random() * 26) + 1;
            if(!(allEnglishLetters[randNum] == null))
            {
                randLetters +=allEnglishLetters.splice(randNum,1);
                console.log("This letter has been deleted from the alphabets "+allEnglishLetters[randNum]);
                console.log("this letter has been deleted from the (drum) Alphabets array "+ allEnglishLetters[randNum]);                
            }
        }
        allEnglishLetters.sort();
        money = $("bet").value;
        console.log("After you click Insert --> English Alphabets: " + allEnglishLetters + " \tCosts: " + money + " chips: " + chips);
        console.log("5 random balls are: "+ randLetters);
        $("GenerateRandLetrs").disabled = true;
        $("bet").disabled = true;
        $("addChar").disabled = false;
        $("letterBox").disabled = false;
    }
    else{
        alert("Sorry!. You DO NOT have enough money to play.");
        $("output1").innerHTML = "Refresh your page to play again" ;
    }
}

/* ResetTextField Function()
    This function does the following
	1. Reset all global to
	2. Reset the image back to the letters4.jpg
	3. Reset the default value for the letters counter to 5
	4. Enable the grnerate random letters.
    5. Clear the user guess input field and disable it so that no new entries are accepted
    6. Reset the innerHTML of for the table to map the number of ball matching with it is money value
*/
ResetTextFields = function () {
    userLettersCounter = 5;
    //randNum = 0;
    //chips = 50; 
    allEnglishLetters = [];
    userLetters = "";
    randLetters = "";
    $("GenerateRandLetrs").disabled = false;
    $("bet").disabled = false;
    $("letterBox").value = "";
    $("letterBox").disabled = true;
    $("addChar").disabled = true;
    $("bet").value = "5";
    $("output1").innerHTML = "You have "+chips+"\u20AC in your wallet" ;
    $("output2").innerHTML = "Random Balls: "+"<br>You Picked: "+"<br>You got:"+"<br>Balls: ";
    $("output3").innerHTML = "Insert money & pick your letters";
    $("lettersLeft").innerHTML = "Only English Alphabets";
    $("img").src = "images/letters4.jpg";
    $("a").innerHTML = zero; // 0
    $("b").innerHTML = zeroBoxVal; // 0
    $("c").innerHTML = stBox; // 1
    $("d").innerHTML = stBoxVal; //20
    $("e").innerHTML = scndBox; // 2
    $("f").innerHTML = scndBoxVal; // 50
    $("g").innerHTML = thirdBox; // 3
    $("h").innerHTML = thirdBoxVal; //350
    $("i").innerHTML = fourthBox // 4
    $("j").innerHTML = fourthBoxVal; // 650
    $("k").innerHTML = fifthBox; // 5
    $("l").innerHTML =  fifthBoxVal; // 2500
}

/*checkResults Function(ArrayList,ArrayList)
    This function does the following
	1. it compare two ArrayList to check if there is matching elements
    2. returns a new ArrayList of the matching elements
*/
function checkResults(arr_1, arr_2){
    if(arr_1.length == arr_2.length)
    {
        var matchLetters = arr_1.filter((data) => arr_2.includes(data));
    }
    return matchLetters;
}

/*checkChars Function(ArrayList,ArrayList)
    This function does the following
	1. it compare two ArrayList to check if there is matching elements
    2. returns a new ArrayList of the matching elements
*/
function checkChars(str1, str2){
    newstr = "";
    if(str1.length == str2.length){
        for(i of str1)
        {
            for(e of str2)
            {
                if(e==i){
                newstr +=e;}
            }
        }
    }
    return newstr;
    }

/*isCharacterALetter Function(char)
    This function does the following
	1. checks if the argument is a letter of the English Alphabets
    2. returns boolean
*/
isCharacterALetter = function(char) {
    return (/[a-zA-Z]/).test(char);
  }

/* addChar Function()
    This Function does the following
    no arguments for this function
    Checks if the user enters 5 english alphabet
    then it pass the letters to checkResults function to see if there is matching balls
    then pass it to checkResults function to calculate the results
*/
addChar = function () {
    $("lettersLeft").innerHTML = "Letters Left: " + userLettersCounter;
    var userChar = $("letterBox").value.toLowerCase();  //.toUpperCase()
    //randLetters.sort();
    //userLetters.sort();
    if(userLettersCounter <= 0) // check the len here
    {
        console.log("user letters " + userLetters);
        console.log("rand letter: " + randLetters);
        $("addChar").disabled = true;

        //var matchesBalls = checkResults(randLetters, userLetters);
        //matchesBalls.sort();
        //console.log(matchesBalls);
        console.log("------");
        win_GameOver(checkChars(randLetters,userLetters));
    }
    else {
        flag = false;
        for(let i of userLetters)
        {
            if (i == userChar){
                flag = true;
            }
        }
        if((isCharacterALetter(userChar.toLowerCase())) && userChar.length == 1 && (!(flag)))
        {
            
            //userChar.toLowerCase();
            userLettersCounter --;
            userLetters+=userChar;
            console.log("added successfully " + userChar);
            //console.log("user letters " + userLetters);
            
        }
        if (!(isCharacterALetter(userChar)) || userChar.length > 1 )
            {
                alert("Enter a single letter...");
            }
        if(flag)
        {
            alert("Sorry! You have entered this '"+userChar.toUpperCase()+"' already.");
        }


    }
}

/* win_GameOver Function(list)
    this function does the following
    1. it checks if the list has matching balls
    2. calculate the wining balls depending on the length of the list 
    3.& if the user insert 10Euro muluplie the (result x3)
    2. Displays an img and the money in the result box
*/
win_GameOver = function(str) {
    alert("Calculating balls...");
    var val;
    console.log("You have match "+ str);
    if(str.length > 0)
    {
        $("img").src = "images/moneyIMG.jpg";
        var len = str.length;
        console.log("You Have Match "+ len +" Balls");
        var total = 0;
        outcome = $("output2").innerHTML;
        var gameCost = $("bet").value;
        bet = $("bet").value;
        console.log("you got "+len+ " points");
        if (len == fifthBox)
        {
                if(bet > COST)
                {
                    total += (fifthBoxVal*3);
                    chips += total;
                }
                else{
                    total += fifthBoxVal;
                    chips += total;
                }
            }
        if(len == fourthBox )
            {
                if(bet > COST)
                {
                    total += (fourthBoxVal*3);
                    chips += total;
                }
                else{
                    total += fourthBoxVal;
                    chips += total;
                }
            }
        if(len == thirdBox )
            {
                if(bet > COST)
                {
                    total += (thirdBoxVal*3);
                    chips += total;
                }
                else{
                    total += thirdBoxVal;
                    chips += total;
                }
            }
        if(len == scndBox)
            {
                if(bet > COST)
                {
                    total += (scndBoxVal*3);
                    chips += total;
                }
                else{
                    total += scndBoxVal;
                    chips += total;
                }
            }
        if(len == stBox )
            {
                if(bet > COST)
                {
                    total += (stBoxVal*3);
                    chips += total;
                }
                else{
                    total += stBoxVal;
                    chips += total;
                }
            }
    }
    else{
        len = 0;
        console.log("oops!.");
        $("img").src = "images/looseMoney.jpg";
        total = chips;
    }
    console.log("chips " + chips);
    $("output1").innerHTML = "You have "+ total + "&euro; in your wallet";
    $("output2").innerHTML = "Random Balls: "+ randLetters.toUpperCase()+"<br>You Picked: "+userLetters.toUpperCase() +"<br>You got:"+ len + "<br>Balls are: "+str.toUpperCase();
    $("output3").innerHTML = "Click Restart if you want to get more ticket.";
}

slide = function(){
    const tl = gsap.timeline({ defaults: { ease: "power1.out" } });
    tl.to(".text", { y: "0%", duration: 1, stagger: 0.25 });
    tl.to(".slider", { y: "-100%", duration: 1.5, delay: 0.1 });
    tl.to(".intro", { y: "-100%", duration: 2 }, "-=1");
}

/* window.onload Function()
    In this function the following must be coded
    1. When the GenerateRandLetrs button is clicked it calls the GenerateRandLetters function
    2. When the reset button is clicked it calls the ResetTextFields function
    3. When the addChar button is clicked it calls the addChar function
*/
window.onload = function () {
    slide();
    $("GenerateRandLetrs").onclick = function () { GenerateRandLetters(); }
    $("reset").onclick = function () { ResetTextFields(); }
    
    //console.log(win_GameOver(checkResults(['w','h','s','r','x'],['s','q','r','l','x'])));
    $("addChar").onclick = function () { addChar(); }
};