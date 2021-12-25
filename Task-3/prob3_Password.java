package ieee;

public class prob3_Password{
    public static void main(String[] args) {
        int length = 10;
        //Create a variable to store the random password
	String randomPassword = "";
	//Randomly generate a character for the password length number of times
	for(int j = 0; j < length-3; j++) {
            //Add a random lowercase or UPPERCASE character to our randomPassword String
            randomPassword += randomCharacter();
	}
        randomPassword += (char)(64);
        randomPassword += (char)((int)(Math.random()*10) + 48);
        randomPassword += (char)((int)(Math.random()*4) + 35);
        System.out.println(randomPassword);
    }
    /*Create a function that randomly generates a letter (lowercase or uppercase) 
    , number (0-9) or [@, #, $, %, &] using ASCII
    "#,$,%,&" => 35-38
    '0' - '9' => 48-57 in ASCII
    '@'       => 64 in ASCII
    'A' - 'Z' => 65-90 in ASCII
    'a' - 'z' => 97-122 in ASCII*/
    
    public static char randomCharacter() {
	int rand1 = (int)(Math.random()*52);     //there are 26 lowercase letters, 26 uppercase letters

	//0-9 inclusive = 10 possible numbers/digits
	//10-35 inclusive = 26 possible uppercase letters
	//36-61 inclusive = 26 possible lowercase letters
        //62-65 inclusive = 4 possible special char
        //66 => '@'
        
	//If rand is between 0 (inclusive) and 9 (inclusive), we can say it's a number/digit
	//If rand is between 10 (inclusive) and 35 (inclusive), we can say it's an uppercase letter
	//If rand is between 36 (inclusive) and 61 (inclusive), we can say it's a lowercase letter
        //If rand is between 62 (inclusive) and 65 (inclusive), we can say it's a special char of "#,$,%,&"
        //If rand is 66, we can say it's '@'

        if(rand1 <= 25) {
            //Uppercase letter (65-90 in ASCII),    add 65 to rand
            int uppercase = rand1 + 65;
            return (char)(uppercase);
	} else{
            //Lowercase letter (97-122 in ASCII),   add 71 to rand
            int lowercase = rand1 + 71;
            return (char)(lowercase);
	}

    }
    /*
    int rand2 = (int)(Math.random()*10);     //there are 10 numbers
    int rand3 = (int)(Math.random()*5);     //there are 5 special char
    
        if(rand3 <= 3){
            // special char of "#,$,%,&" (35-38 in ASCII), add 35 to rand
            int special = rand3 + 35;
            return (char)(special);
	} else if(rand3 == 4){
            // '@' (64 in ASCII), add 60 to rand
            int at = rand3 + 60;
            return (char)(at);
        }

        int number = rand2 + 48;     //Number (48-57 in ASCII), add 48 to rand to convert
        return (char)(number);      //cast to char
    
    
    */
}