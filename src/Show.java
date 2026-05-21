import java.util.ArrayList;

public class Show {
    protected String title;
    protected double duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

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

    public void printDirector(){
        System.out.println("Информация о режиссёре: " + director);
    }

    public void addActorInList(String name, String surname, Gender gender, Integer height){
        if (listOfActors.contains(new Actor(name, surname, gender, height))) {
            System.out.println("Актер с таким именем: " + name + ", фамилией: " + surname + " и ростом: " + height + " уже есть в списке.");
        } else {
            listOfActors.add(new Actor(name, surname, gender, height));
        }
    }

    public void replaceActorInList(Actor newActor, String oldSurname){
        int count = 0;
        int index = -1;

        for(int i = 0; i < listOfActors.size(); i++){
            if(listOfActors.get(i).surname.equals(oldSurname)){
                count++;
                index = i;
            }
        }

        switch (count) {
            case 0:
                System.out.println("Актёр с фамилией " + oldSurname + " не найден в списке.");
                break;
            case 1:
                listOfActors.set(index, newActor);
                break;
            default:
                System.out.println("В списке несколько актёров с фамилией " + oldSurname + ". Актер не заменен.");
        }
    }
}
