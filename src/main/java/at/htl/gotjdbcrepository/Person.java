package at.htl.gotjdbcrepository;

public class Person {
    long id;
    String name, city, house;

    public Person(String name, String city, String house) {
        this.name = name;
        this.city = city;
        this.house = house;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person pobj = (Person) obj;
            return
                    pobj.city.equals(this.city) &&
                            pobj.name.equals(this.name) &&
                            pobj.house.equals(this.house)
                    ;
        }

        return false;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", name, city, house);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
}
