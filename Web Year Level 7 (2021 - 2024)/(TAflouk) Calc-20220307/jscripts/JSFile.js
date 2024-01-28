/*These are my global variables.  The res variables will store the result of the calculations.  the ans variables will store the data coming in from the user.  These must be compared to generate the users score and feedback.  Every question correctly answered by the will see the score variable being incremented by 1.
*/
var res1=0, res2=0, res3=0, ans1=0, ans2=0, ans3=0, score=0, htmlOut = "", rand1 = 0,rand2 = 0,rand3 = 0,rand4 = 0,rand5 = 0;
/*Standard $ function to return an element by its id*/
$ = function(id){
	return document.getElementById(id);
	// Enter your code here
};

/* ResetTextFields Function
	Standard function to reset fields and nodes with the id's in quotes.  Make sure to check the HTML to ensure that they match
*/
ResetTextFields = function(){
	// Enter your code here
	$("input1").innerHTML = "";
	$("input2").innerHTML = "";
	$("input3").innerHTML = "";
	$("ans1").innerHTML = "";
	$("ans2").innerHTML = "";
	$("ans3").innerHTML = "";
	$("calc").innerHTML = "";
	$("theImage").innerHTML = src='images/goodluck.PNG';
	
}

/* GenerateQuestion Function
	When this function is called the fields within the HTML are reset.
	Then random questions and their corresponding answers are generated.
	The Questions are constructed and the DOM is updated.  Their answers are
	stored in the global variables so that they can be checked later in another function.  This is repeated for three types of questions, the first is a multiplication, the second is a additiona and the third is a subtraction
*/
GenerateQuestion = function(){
	// Enter your code here
	ResetTextFields();
	// multiplication
	rand1 = Math.floor(Math.random() * 10) + 1
	rand2 = Math.floor(Math.random() * 10) + 1
	// addition
	rand3 = Math.floor(Math.random() * 15) + 1
	rand4 = Math.floor(Math.random() * 15) + 1
	// subtraction
	rand5 = Math.floor(Math.random() * 100) + 1
	rand6 = Math.floor(Math.random() * 100) + 1
	$("input1").innerHTML = "<span>"+rand1 +"<span> x </span>"+ "<span>"+rand2+"</span>";
	$("input2").innerHTML = "<span>"+rand1 +"<span> + </span>"+ "<span>"+rand2+"</span>";
	$("input3").innerHTML = "<span>"+rand1 +"<span> - </span>"+ "<span>"+rand2+"</span>";
}

/* calculate Function
	This calculate() function gets the users answers and stores them in 
	ans# variables.  Then using if and else statements we check to see if the 
	answers correspond to the ones generated in the GenerateQuestion() function. If the answers are correct then their score is updated and feedback is given for each question.  Note that the span tag is used to color code correct and incorrect answers.  At the very end they are given an overall score and a precentage
*/
calculate = function(){
	// Enter your code here
	ans1 = parseInt($("ans1").value);
	ans2 = parseInt($("ans2").value);
	ans3 = parseInt($("ans3").value);

	if (isNaN(ans1) || isNaN(ans1) || isNaN(ans1))
	{
		alert("Please enter a numerical values..")
	}
	else{
		if((rand1 * rand2) == ans1){
			score += 1;
			$("Feedback1").innerHTML = "<span style='color:green;'>Correct</span>";
		}
		if(ans2 == (rand1 + rand2)){
			score += 1;
			$("Feedback2").innerHTML = "<span style='color:green;'>Correct</span>";
		}
		if(ans3 == (rand1 - rand2)){
			score += 1;
			$("Feedback3").innerHTML = "<span style='color:green;'>Correct</span>";
		}
		else
		$("FeedBack1").innerHTML = "<span style='color:red;'> Incorrect</span>";
		$("FeedBack2").innerHTML = "<span style='color:red;'> Incorrect</span>";
		$("FeedBack3").innerHTML = "<span style='color:red;'> Incorrect</span>";
			
		}
	
};

/*window.onload Function 
	When the page is loaded call the GenerateQuestion() function to generate new questions which are then displayed on the DOM.  Then wait until the buttons are clicked. If the Calculate Score button is clicked call the calculate function. if the Test Me Again button is clicked then call the GenerateQuestion function.
*/
window.onload = function(){
	GenerateQuestion();
	$("calc").onclick = function(){calculate();}
	$("reset").onclick = function(){GenerateQuestion();}
};