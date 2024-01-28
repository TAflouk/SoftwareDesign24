/*These are your global variables*/
var guess = 0, randNum = 0, attempts = 0;
/*Standard $ function to return document.getElementById (id)*/
$ = function (id) {
    //Enter your code here
    return document.getElementById(id);
};

/* GenerateNewNumber Function()
    In this function the following must be coded
	1. Generate a random number between 1 and 100 and store it in the global variable called randNum
	2. Create a varibble called attempts that will go to the doucment a get the value from the attempts field
	3. Print out the random number and attempts to the log so you can use this for testing
	4. Set the innerHTML of the guess left to let the user know how many attempts are left.  Use the screenshots on the instruction document as a guide
    5. Disable the generate random button
    6. Disable the select field for the number of attempts selected by the user
    7. Enable the Submit Guess button and the guess imput field.
*/
GenerateNewNumber = function () {
    //Enter your code here
    var randNum = Math.floor(Math.random() * 100) + 1;
    attempts = $("attempts").innerHTML;
    console.log(randNum);
    console.log(attempts);
    

}

/* ResetTextField Function()
    In this function the following must be coded
	1. Reset all global variable to 0
	2. Reset the image back to the guess.png
	3. Reset the default value for the attempts back to 5
	4. Enable the grnerate random button and attempts allowed select field.
    5. Clear the user guess input field and disable it so that no new entries are accepted
    6. Reset the innerHTML of guessLeft field to be "Attempts left"
*/
ResetTextFields = function () {
    //Enter your code here
    $("guess").innerHTML = 0;
    $("randNum").innerHTML = 0;
    $("attempts").innerHTML = 5;
    $("image").innerHTML = "guess.png";
    
    $("generteRandom").innerHTML.disabled = true;


}

/* win_GameOver Function()
    In this function the following must be coded
    1. Set the global variable attempts back to 0
    2. Call the ResetTextFields() function
*/
win_GameOver = function () {
    //Enter your code here
    var attemps = 0;
    ResetTextFields();
}

/* guessNumber Function()
    In this function the following must be coded
    1. Check to see if the number of attempts are less than 1, if so then alert the user that the game is over
    2. Otherwise:
        a. Check to see that the user entry is NaN, if true then alert the user that ust enter a numerical value
        b. Otherwise:
            - Convert the userGuess to an int ans store it in the global variable called guess
            - Check to see if the guess is lower than the random number, if so then change the image to be low.png, decrement the attempts by 1 and update  guessLeft with the number of attempts left.
            - Check to see if the guess is higher than the random number, if so then change the image to be high.png, decrement the attempts by 1 and update  guessLeft with the number of attempts left.
            - Otherwise change the image to be happy_Grog.jpg and call the win_GameOver function..
*/
guessNumber = function () {
    //Enter your code here
    if(attempts <= 1)
    {
        alert("Game Over...")
    }
}

/* window.onload Function()
    In this function the following must be coded
    1. When the generateRandom button is clicked it calls the GenerateNewNumber function
    2. When the reset button is clicked it calls the ResetTextFields function
    3. When the guess button is clicked it calls the guessNumber function
*/
window.onload = function () {
    //Enter your code here
};