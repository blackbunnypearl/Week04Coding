
    package week04Coding;

    public class Week04CodingAssignment {

        public static void main(String[] args) {
            // 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
            // a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
            // b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).
            // i. Make sure that there are 9 elements of type int in this new array.
            // ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2).
            // iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
            // c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
            int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

            int result = ages[ages.length - 1] - ages[0];
            System.out.println("Difference between last and first age: " + result);

            int[] ages2 = new int[9];
            for (int i = 0; i < ages2.length; i++) {
                ages2[i] = i * 10;
            }

            int result2 = ages2[ages2.length - 1] - ages2[0];
            System.out.println("Difference between last and first age in ages2: " + result2);

            int sum = 0;
            for (int age : ages) {
                sum += age;
            }
            double average = (double) sum / ages.length;
            System.out.println("Average age: " + average);

            // 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
            // a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
            // b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
            String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

            int totalLetters = 0;
            for (String name : names) {
                totalLetters += name.length();
            }

            double averageLetters = (double) totalLetters / names.length;
            System.out.println("Average number of letters per name: " + averageLetters);

            StringBuilder concatenatedNames = new StringBuilder();
            for (String name : names) {
                concatenatedNames.append(name).append(" ");
            }
            System.out.println("Concatenated names: " + concatenatedNames.toString().trim());

            // 3. How do you access the last element of any array?
            // 4. How do you access the first element of any array?
            int[] array = {1, 2, 3, 4, 5};
            int firstElement = array[0];
            int lastElement = array[array.length - 1];
            System.out.println("First element: " + firstElement);
            System.out.println("Last element: " + lastElement);

            // 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
            int[] nameLengths = new int[names.length];
            for (int i = 0; i < names.length; i++) {
                nameLengths[i] = names[i].length();
            }

            int sumOfLengths = 0;
            for (int length : nameLengths) {
                sumOfLengths += length;
            }

            System.out.println("Sum of name lengths: " + sumOfLengths);

            // 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
            String inputWord = "Hello";
            int repetitionCount = 3;

            String concatenatedWord = concatenateWord(inputWord, repetitionCount);
            System.out.println("Concatenated word: " + concatenatedWord);

            // 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
            String firstName = "Mirella";
            String lastName = "Alvarez";
            String fullName = generateFullName(firstName, lastName);
            System.out.println("Full name: " + fullName);

            // 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
            int[] myArray = {10, 20, 30, 40};
            boolean resultIsSumGreaterThan100 = isSumGreaterThan100(myArray);
            System.out.println("Is sum greater than 100: " + resultIsSumGreaterThan100);

            // 10. Write a method that takes an array of double and returns the average of all the elements in the array.
            double[] myArray1 = {10.5, 20.3, 15.7, 18.2}; // Example array
            double average1 = calculateAverage(myArray1);
            System.out.println("Average of array: " + average1);

            // 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
            double[] array1 = {10.5, 20.3, 15.7, 18.2}; // Example first array
            double[] array2 = {8.9, 12.4, 14.6, 19.8}; // Example second array

            boolean resultCompareAverages = compareAverages(array1, array2);
            System.out.println("Is average of array1 greater than array2: " + resultCompareAverages);

            // 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
            boolean isHotOutside = true; // Example: Set to true if it's hot outside
            double moneyInPocket = 13.35; // Example: Adjust the amount of money in your pocket

            boolean shouldBuyDrink = willBuyDrink(isHotOutside, moneyInPocket);
            System.out.println("Should I buy a drink: " + shouldBuyDrink);

            // 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
            double originalPrice = 50.0;
            double discountPercentage = 20.0;
            double discountedPrice = calculateDiscount(originalPrice, discountPercentage);

            System.out.println("Discounted price (20% off): $" + discountedPrice);
        }

        public static String concatenateWord(String word, int n) {
            StringBuilder result = new StringBuilder(word.length() * n);
            for (int i = 0; i < n; i++) {
                result.append(word);
            }
            return result.toString();
        }

        public static String generateFullName(String firstName, String lastName) {
            return firstName + " " + lastName;
        }

        public static boolean isSumGreaterThan100(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum > 100;
        }

        public static double calculateAverage(double[] arr) {
            double sum = 0.0;
            for (double num : arr) {
                sum += num;
            }
            return sum / arr.length;
        }

        public static boolean compareAverages(double[] arr1, double[] arr2) {
            double sum1 = 0.0;
            for (double num : arr1) {
                sum1 += num;
            }
            double average1 = sum1 / arr1.length;

            double sum2 = 0.0;
            for (double num : arr2) {
                sum2 += num;
            }
            double average2 = sum2 / arr2.length;

            return average1 > average2;
        }

        public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
            return isHotOutside && moneyInPocket > 10.50;
        }

        public static double calculateDiscount(double originalPrice, double discountPercentage) {
            if (originalPrice < 0 || discountPercentage < 0 || discountPercentage > 100) {
                throw new IllegalArgumentException("Invalid input: Price and discount must be non-negative.");
            }
            double discountAmount = originalPrice * (discountPercentage / 100);
            return originalPrice - discountAmount;
        }
    }
   