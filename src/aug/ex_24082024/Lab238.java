package aug.ex_24082024;

import java.util.*;

public class Lab238 {
    public static void main(String[] args) {
        // Student - name, id
        Student s1 = new Student(4, "Supriya");
        Student s2 = new Student(2, "Thaku Amit Singh");
        Student s3 = new Student(3, "Muthu");
        Student s4 = new Student(1, "Darshan");

        List arrayList = new ArrayList();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        System.out.println(arrayList);
       // Collections.sort(arrayList); // Comparable
//        Collections.sort(arrayList, new SortByID());
//        Collections.sort(arrayList, new SortByName());
//        Collections.sort(arrayList, new SortByIDDesc());
        Collections.sort(arrayList, new SortByNameDesc());
        System.out.println(arrayList);


    }
}

class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByNameDesc implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

class SortByID implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

class SortByIDDesc implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}


//class Student implements Comparable<Student> {
class Student {
    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


//    @Override
//    public int compareTo(Student another) {
//        return Integer.compare(this.id, another.id);
//    }
//
//    @Override
//    public int compareTo(Student another) {
//        return CharSequence.compare(this.name, another.name);
//    }
}
