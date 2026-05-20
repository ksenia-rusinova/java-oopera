import java.util.ArrayList;

public class Show {
    private String title;
    private double duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, double duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printListOfActors(){
        System.out.println("Список актеров:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActorInList(String name, String surname, Gender gender, int height){
        for (Actor actor : listOfActors) {
            if (actor.getName().equals(name) &&
                    actor.getSurname().equals(surname) &&
                    actor.getHeight() == height) {
                System.out.println("Актер с таким именем: " + name + ", фамилией: " + surname + " и ростом: " + height + " уже есть в списке.");
                return;
            }
        }
        listOfActors.add(new Actor(name, surname, gender, height));
    }

    public void replaceActorInList(Actor newActor, String oldSurname){
        boolean found = false;

        for(int i = 0; i < listOfActors.size(); i++){
            if(listOfActors.get(i).getSurname().equals(oldSurname)){
                listOfActors.set(i, newActor);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Актёр с фамилией " + oldSurname + " не найден в списке.");
        }
    }
}
