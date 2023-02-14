/*
         Question : Get the user's gender and age,
         Women aged 60 and over, men aged 65 and over can retire.
         “You can retire” taking into account gender and age
         or print “You have to work .. more years to retire”.
*/

Scanner scan = new Scanner(System.in);

System.out.println("Please enter your age : ");
int age = scan.nextInt();

System.out.println("Please enter your gender with M/W : ");
char gend = scan.next().charAt(0);

if (gend == 'W' || gend == 'w'){
    if (age < 16 || age > 90) {
        System.out.println("Invalid value for age. Please try again.");
    } else if (age < 60) {
        System.out.println("You have to work " + (60 - yas) + " years more.");
    } else {
        System.out.println("You can be retired.");

} else if (gend == 'M' || gend == 'm') {
    if (age < 16 || age > 90) {
        System.out.println("Invalid value for age. Please try again.");
    } else if (age < 65) {
        System.out.println("You have to work " + (65 - yas) + " years more.");
    } else {
        System.out.println("You can be retired.");

} else {
    System.out.println("You've entered invalid gender value, please try again.");
