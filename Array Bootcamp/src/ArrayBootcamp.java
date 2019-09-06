import java.util.Scanner;

public class ArrayBootcamp
	{

		static Scanner userInput = new Scanner(System.in);

		public static void main(String[] args)
			{
				displayUsersFavoriteCandy();
				totalUpEvenAndOddNumbers();
				generateAndPrintFiveRandomNumbers();

			}

		public static void displayUsersFavoriteCandy()
		{
				System.out.println("How many favorite candies do you have?");
				int numberOfFavoriteCandies = userInput.nextInt() + 1;
				System.out.println("Sweet! You have " + (numberOfFavoriteCandies - 1)
						+ " favorite candies. Please name them down below on separate lines.");

				String[] usersFavoriteCandies = new String[numberOfFavoriteCandies];

				for (int i = 0; i < numberOfFavoriteCandies; i++)
					{

						usersFavoriteCandies[i] = userInput.nextLine();

					}

				System.out.println("Okay! Your favorite candies are:");

				for (String s : usersFavoriteCandies)
					{
						System.out.println(s);
					}

			}

		public static void totalUpEvenAndOddNumbers()
			{

				System.out.println("Please insert 8 numbers for me to add the even and odd numbers.");

				int[] usersEightNumbers = new int[8];

				for (int i = 0; i < 8; i++)
					{
						usersEightNumbers[i] = userInput.nextInt();
					}

				int sumOfOddNumbers = 0;
				int sumOfEvenNumbers = 0;

				for (int s : usersEightNumbers)
					{
						if (s % 2 == 0)
						{
							sumOfEvenNumbers += s;
						} 
						else
						{
							sumOfOddNumbers += s;
						}

					}
				
				System.out.println("The sum of the even numbers is " + sumOfEvenNumbers
						+ ", and the sum of the odd numbers is " + sumOfOddNumbers);

			}

		public static void generateAndPrintFiveRandomNumbers()
			{
				System.out.println("The five random two digit numbers are:");

				int[] randomTwoDigitNumbers = new int[5];
				for (int i = 0; i < 5; i++)
					{
						randomTwoDigitNumbers[i] = (int) (Math.random() * 90 + 10);
					}

				for (int s : randomTwoDigitNumbers)
					{
						System.out.println(s);
					}
				
				System.out.println("Backwards they are:");
				for (int i = 4; i >= 0; i--)
					{
						System.out.println(randomTwoDigitNumbers[i]);
					}

			}

	}
