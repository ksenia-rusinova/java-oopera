import java.util.Objects;

public class Actor extends Person {
    Integer height;

    public Actor(String name, String surname, Gender gender, Integer height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "actorName='" + super.name + '\'' +
                ", actorSurname='" + super.surname + '\'' +
                ", actorHeight='" + height + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(super.name, actor.name) &&
                Objects.equals(super.surname, actor.surname) &&
                Objects.equals(height, actor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }
}
