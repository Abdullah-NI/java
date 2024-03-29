package _07_String;

public class _095_containsAndstartsWithMethod {
    public static void main(String[] args) {
        String s="Physics wallah skills";
        System.out.println(s.contains("skills"));
        System.out.println(s.contains("i"));
        System.out.println(s.contains("skillsss"));

        System.out.println(s.startsWith("Phy"));
        System.out.println(s.startsWith("P"));
        System.out.println(s.startsWith("hys"));
    }
}
