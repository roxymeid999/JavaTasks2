package practice;

public class Batch26_Girls {

    private String name;
    private int age;
    private boolean hasKids;

//    public void studying(){
//        System.out.println(name + " is " + age + " years old." + "Has kids: " + hasKids + "\n Is studying at Cydeo.");

        public void setName(String name){
            this.name = name;
    }

        public String getName(){
            return name;
        }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getHasKids() {
        return hasKids;
    }

    public void setHasKids(boolean hasKids) {
        this.hasKids = hasKids;
    }
}
