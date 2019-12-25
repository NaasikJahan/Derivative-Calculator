import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        //Instantiates needed classes
        Scanner scanner = new Scanner(System.in);
        MultiplicationByConstant multiplicationByConstant = new MultiplicationByConstant();

        //Introduction text
        System.out.println("This application takes the derivative of composite functions\n");
        System.out.println("Please enter a function (Insert a blank space between each variable and operation, for" +
                " example 5x^2 + 3x + 2, also please use x as your variable)");

        //Takes in a user inputted function
        String function = scanner.nextLine();
        System.out.println();

        //Splits function into separate terms and places each term in an array
        String[] terms = function.split(" ");

        //Instantiates an index and the differentiated function
        int i = 0;
        String differentiatedFunction = "";

        //Takes the derivative of each term
        for (String term : terms)
        {
            //Checks to see if the term is a constant, if not it will move on to a different differentiation rule
            try
            {
                double constant = Double.parseDouble(term);
                terms[i] = "0";
            }
            catch (NumberFormatException e)
            {
                if (contains(function, '^') && contains(function, 'x'))
                {
                    continue;
                } else if (contains(function, 'x'))
                    {
                        terms[i] = multiplicationByConstant.multiplicationByConstant(terms[i]);
                    }
            }
            differentiatedFunction = differentiatedFunction + terms[i];
            i++;
        }

        //Displays differentiated function
        System.out.println(differentiatedFunction);
    }


    public static boolean contains(String function, char character)
    {
        for (int i = 0; i < function.length(); i++)
        {
            if (function.charAt(i) == character)
            {
                return true;
            }
        }
        return false;
    }
}
