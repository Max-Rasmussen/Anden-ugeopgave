/* opg 1
double totalPrice = 1200;
double finalPrice;

void main(){

if(totalPrice > 1000){

    finalPrice = totalPrice * 0.8;
    System.out.println("You are elligeble for 20% discount, price: " + totalPrice + " > " + finalPrice);
}
} */

/* opg 2
double height = 1.87;
double weight = 91.0;
double bmi = weight /(height * height);
void main(){
    System.out.println("BMI: " + bmi);
    if(bmi >= 25){
        System.out.println("Your bmi indicates you are overweight");
    }
    else {
        System.out.println("You have a fine weight");
    }
} */

/* opg 3
int timeOfDay = 21;
void main() {

    if (timeOfDay >= 5 && timeOfDay <= 11){
        System.out.println("Good morning!");

    } else if (timeOfDay >= 12 && timeOfDay <= 17){
        System.out.println("Good afternoon ");

    }else if (timeOfDay >= 18 && timeOfDay <= 21){
        System.out.println("Good evening");

    }else{
        System.out.println("Currently night time");
    }
}*/


/* Opgave 4
int score = 88;
char grade;
String comment;
String status;
void main() {


    if(score >= 90){
        grade = 'A';
        comment = "Doing incredible!";

    } else if(score >= 80){
        grade = 'B';
        comment = "Doing very good!";

    }else if(score >= 70){
        grade = 'C';
        comment = "Doing fine/average!";

    }else if(score >= 60){
        grade = 'D';
        comment = "Doing poorly, gotta try harder!";
    }else {
        grade = 'F';
        comment = "Failing, course correct quickly!";
    }

    if(grade >= 60){
        status = "passing";
    }else {
        status = "failing";
    }

    System.out.println("*=== STUDENT REPORT CARD ===*");
    System.out.println("Score: " + score);
    System.out.println("Grade: " + grade);
    System.out.println("Comment: " + comment);
    System.out.println("Status: " + status);

}*/


/*Opgave 5
double totalprice = 350;
boolean isMember = true;
double shippingCost;

void main() {
if (totalprice > 500 || isMember && totalprice > 200){
    shippingCost = 0;
}else{
    shippingCost = 50;
}

double finalPrice = totalprice + shippingCost;
    System.out.println("This is the final cost: " + finalPrice);
    System.out.println("Price of shipping: " + shippingCost);


} */


/*Opgave 6
int ageLimit = 15;
int guestAge = 14;
boolean hasParentalConsent = true;

void main() {
    if (guestAge > ageLimit || guestAge >=13 && hasParentalConsent){
        System.out.println("You are allowed to see the movie");
    }else{
        System.out.println("You are NOT allowed to see the movie");
    }

}*/

/* Opgave 7

int partySize = 4;
int availableSeats = 6;
boolean hasReservation = false;
int waitTime = 20;
boolean resturantFull = false;
void main() {

    if (partySize < availableSeats && hasReservation && !resturantFull|| partySize < availableSeats && waitTime < 30 && !resturantFull){
        System.out.println("There is room for your party");
        System.out.println("Estimated wait: " + waitTime);
    }else if(partySize < availableSeats && waitTime >= 30 && !resturantFull){
        System.out.println("There is room available in 30 minutes");
    }else {
        System.out.println("There is no table available");
    }
}*/


/*Opgave 8

int basicPayOut = 5000;
int highRiskPayOut = 2000;

int age = 22;
boolean riskZone = false;
boolean hasAccidents = false;
int accidents = 0;
void main() {

    if((age <25 || age > 75) || hasAccidents && accidents < 2 || riskZone){
        System.out.println("Higher risk = higher payout: " + (basicPayOut + highRiskPayOut));
    }else{
        System.out.println("Regular risk = higher payout: " + basicPayOut);
    }

}*/

/* opgave 10
String item = "pizza";
int price;
int quantity  = 2;
void main() {

    switch (item) {

        case "burger":
    price = 89;
        break;

        case "pizza":
            price = 95;
            break;

        case "salad":
            price = 65;
            break;

        case "pasta":
            price = 79;
            break;

        case "steak":
            price = 145;
            break;
    }


    int totalPrice = price * quantity;
    System.out.println("Menu item: " + item);
    System.out.println("Price: " + price);
    System.out.println("Quantity: " + quantity);
    System.out.println("Total Price = " + totalPrice);
}*/

/*Opgave 19
String correctPassword = "123secret";
int amountOfTries = 3;
String passwordAttempt;
void main() {
    Scanner scan = new Scanner(System.in);


    while(amountOfTries > 0){
        System.out.println(" ");
        System.out.println("Input password");

        String passwordAttempt = scan.nextLine();
        if(passwordAttempt.equals(correctPassword)){
            System.out.println("Correct password!");
            amountOfTries = -1;

        }else{
            amountOfTries--;
            System.out.println("Wrong password, try again. ");
            System.out.println("You have: " + amountOfTries + " tries remaining");
        }

        if (amountOfTries <= 0 && !passwordAttempt.equals(correctPassword)){
            System.out.println("Account locked!");
        }

    }
} */

/*Opgave 20

int savedEachMonth = 1000;
int totalSavings = 0;
void main() {

    for (int i = 1 ; i <=12 ; i++){
        totalSavings += savedEachMonth;
        System.out.println("month number: " + i + " totalsavings: " + totalSavings + "kr");
    }
}
*/

/* opgave 23
int number = 29;
boolean isPrimeNumber = true;

void main() {

    for (int i = 2 ; i <= 28 ; i++){
        if(number % i == 0){
            isPrimeNumber = false;
        }
    }

    if (isPrimeNumber = true){
        System.out.println(number + " is a prime number!");

    }else{
        System.out.println(number + " is not a prime number");
    }

}*/

/*Opgave 24
int sum; //for average
double average;
int[] scores = {85, 92, 78, 88, 95, 73, 90};
int highestScore = scores[0];
int lowestScore = scores[0];
int over80Count = 0;

void main() {

    for(int i = 0; i < scores.length ; i++){
        sum += scores[i];

        if (highestScore < scores[i]){
            highestScore = scores[i];
        }
        if (lowestScore < scores[i]){
            lowestScore = scores[i];
        }
        if(scores[i] > 80){
            over80Count++;
        }
    }

    average = (double) sum/scores.length;

    System.out.println("The average score in the class is: " + average);
    System.out.println("The highest score in the class is: " + highestScore);
    System.out.println("The lowest score in the class is: " + lowestScore);
    System.out.println("The amount of scores over 80 is: " + over80Count);
}*/

/*opgave 27

double[] prices = {299.0, 149.0, 899.0, 49.0};
double totalPrice;
void main() {

    for(double price : prices){
totalPrice += price;
    }
    System.out.println("Total price: " + totalPrice);
} */


/* opgave 28
String[] names = {"Emma", "Liam", "Olivia", "Noah", "Ava"};
int fourLetterCounter = 0;
String longestName = names[0];
void main() {

    for (String name : names){
        System.out.println("Hello: " + name);

        if(name.length() == 4){
            fourLetterCounter++;
        }

        if(longestName.length() < name.length()){
            longestName = name;
        }

    }

    System.out.println("===ALL THE INFO===");
    System.out.println("This many names has more then 4 letters: " + fourLetterCounter);
    System.out.println("This is the longest name " + longestName);
}*/