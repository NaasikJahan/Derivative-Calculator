public class MultiplicationByConstant
{
    //Returns coefficient of a term if it does not contain an exponent
    public String multiplicationByConstant(String term)
    {
        term = term.replaceAll("x", "");

        return term;
    }
}
