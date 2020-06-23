public class StringFormatter {

    public static String Format(String format, String ... R)
    {
        StringBuffer buf = new StringBuffer();
        int index = format.indexOf("$");
        format.charAt(index);
        return buf.toString();
    }
}
