public class Human {


    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {

        if (name == null || name == "") {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null || town == "") {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle == "") {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }

        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else this.yearOfBirth = yearOfBirth;
    }


    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isBlank() || town.isEmpty()) {
            this.town = "информация не указана";
        } else {
            this.town = town;
        }
    }

    public void humanInfo() {
        System.out.println("Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". Я родился в " + this.yearOfBirth + " году. Я работаю на должности " + this.jobTitle + ". Будем знакомы!");
    }
}
