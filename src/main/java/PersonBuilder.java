public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public Person build() {
        StringBuilder error = new StringBuilder();
        if (age < 0 || age > 200)
            error.append(" Возраст");
        if (name == null)
            error.append(" Имя");
        if (surname == null)
            error.append(" Фамилия");
        if (error.length() != 0)
            throw new IllegalStateException("Не заданы или не верны:" + error);
        if (age != 0)
            return new Person(name, surname, age, address);
        else
            return new Person(name, surname, address);
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
}
