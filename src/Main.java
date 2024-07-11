public class Main {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.setRollno(1);
        s1.setName("bhakti");
        s1.setCollegeName("JSPM");

        Teacher t1 = new Teacher();
        t1.setId(101);
        t1.setName("deepika");
        t1.setCollegeName("JSPM");

        System.out.println("Name= " + s1.getName() + " " + "RollName =" + s1.getRollno() + " collegeName= " + s1.getCollegeName());
        System.out.println("id= " + t1.getId() + " " + "name =" + t1.getName() + " collegeName= " + s1.getCollegeName());
    }
}