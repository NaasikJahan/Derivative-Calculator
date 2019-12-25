public class PowerRule
{
    public String powerRule(String term)
    {
        double exponent = Double.parseDouble(term.substring(term.indexOf("^") + 1));
        try
        {
            double base = Double.parseDouble(term.substring(0, term.indexOf("x")));
            base *= exponent;
            exponent--;
            term = base + "x^" + exponent;

            return term;
        }
        catch (NumberFormatException e)
        {
            double base = 1;
            base *= exponent;
            exponent--;
            term = base + "x^" + exponent;

            return term;
        }
    }
}
