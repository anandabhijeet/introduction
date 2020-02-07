package javaTraining;

public class Location {
    public static void main(String[] args) {
        String s = "java";
        String s1 = "Training";
        String s2 = new String("java");

        if(s == s2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        System.out.println("location of s: "+ s.hashCode());
        System.out.println("location of s1: "+ s.hashCode());

        System.out.println(s.concat(" training"));
        System.out.println(s.startsWith("j"));

        System.out.println(s.substring(0, 4));

        System.out.println(s.equals("Java"));


    }
}
