public class Main {
    public static void main(String[] args) {
        String str = "Hello ${0}, I am ${1} - ${2}";
        String name = "Igor";
        String lastName = "Jarvis";
        String description = "AI from some movie";
        String result= StringFormatter.Format(str, name, lastName, description);
        System.out.println(result);
    }
}