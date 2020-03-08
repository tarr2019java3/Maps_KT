package pl.sda.mapy;

        import org.w3c.dom.ls.LSOutput;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

public class Main {
    public static void main(String[] args) {




   /* Generics<String> generics = new Generics<String>("test");
        System.out.println(generics.getField());
    Generics<Integer> generics1 = new Generics<Integer>(1);
        System.out.println(generics1.getField());

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Georg");
        map.put(2, "John");
        map.put(3,"Anna");
        map.put(4,"Nataly");

        System.out.println(map);

        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());

    */

        School school1 = new School("1lo", "Torun");
        School school2 = new School("5lo", "Bydgoszcz");
        School school3 = new School("1lo", "Zgierz");
        School school = new School("5lo", "Zgierz");


        Student student1 = new Student("Kamil", "K");
        Student student2 = new Student("Anna", "T");
        Student student3 = new Student("Bartek", "R");
        Student student4 = new Student("Wojtek", "G");
        Student student5 = new Student("Basia", "C");
        Student student6 = new Student("Stanisław", "N");
        Student student7 = new Student("Rafał", "M");
        Student student8 = new Student("Magda", "C");
        Student student9 = new Student("Kamila", "S");
        Student student10 = new Student("Maria", "L");
        Student student11 = new Student("Grzegorz", "S");
        Student student12 = new Student("Natalia", "W");
        Student student13 = new Student("Adam", "Z");

        List<Student> list1 = new ArrayList<Student>();
        list1.add(student2);
        list1.add(student1);
        list1.add(student3);

        List<Student> list2 = new ArrayList<Student>();
        list2.add(student4);
        list2.add(student5);
        list2.add(student6);

        List<Student> list3 = new ArrayList<Student>();
        list3.add(student7);
        list3.add(student8);
        list3.add(student9);

        List<Student> list4 = new ArrayList<Student>();
        list4.add(student10);
        list4.add(student11);
        list4.add(student12);
        list4.add(student13);


        Map<School, List<Student>> schoolMap = new HashMap<School, List<Student>>();

        schoolMap.put(school, list1);
        schoolMap.put(school1, list2);
        schoolMap.put(school2, list3);
        schoolMap.put(school3, list4);


        for (Map.Entry<School, List<Student>> entry : schoolMap.entrySet()) {
            System.out.println("School " + entry.getKey().getName() + " " + entry.getKey().getCity() + entry.getValue().toString());

        }
    }
}
