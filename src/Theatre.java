import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        ArrayList<Actor> listOfActorsFilm = new ArrayList<>();
        ArrayList<Actor> listOfActorsBallet = new ArrayList<>();
        ArrayList<Actor> listOfActorsOpera = new ArrayList<>();

        Actor actorBradPitt = new Actor("Бред", "Питт", Gender.MALE, 180);
        Actor actressKerryCondon = new Actor("Керри", "Кондон", Gender.FEMALE, 160);
        Actor actorJavierBardem = new Actor("Хавьер", "Бардем", Gender.MALE, 181);

        Director directorJosephKosinski = new Director("Джозеф", "Косински", Gender.MALE,14);
        Director directorGoreVerbinski = new Director("Гор", "Вербински", Gender.MALE,22);

        MusicalShow filmF1 = new MusicalShow("F1", 2.35, directorJosephKosinski, listOfActorsFilm, "Ханс Циммер", "Джозеф Косински");
        filmF1.addActorInList(actorBradPitt.getName(), actorBradPitt.getSurname(), actorBradPitt.getGender(), actorBradPitt.getHeight());
        filmF1.addActorInList(actressKerryCondon.getName(), actressKerryCondon.getSurname(), actressKerryCondon.getGender(), actressKerryCondon.getHeight());
        filmF1.printListOfActors();
        filmF1.replaceActorInList(actorJavierBardem, actressKerryCondon.getSurname());
        filmF1.printListOfActors();

        Ballet ballet = new Ballet("Пираты карибского моря", 2.00, directorGoreVerbinski, listOfActorsBallet,"Ханс Циммер", "Тед Эллиот", "Рудольф Нуреев");
        ballet.addActorInList(actorJavierBardem.getName(), actorJavierBardem.getSurname(), actorJavierBardem.getGender(), actorJavierBardem.getHeight());
        ballet.printListOfActors();
        ballet.replaceActorInList(actorBradPitt, actressKerryCondon.getSurname());
        ballet.printLibretto();

        Opera opera = new Opera("Гарри Поттер и проклятое дитя", 3.00, directorGoreVerbinski, listOfActorsOpera, "Джон Уильямс", "Дж.К. Роулинг", 100);
        opera.addActorInList(actressKerryCondon.getName(), actressKerryCondon.getSurname(), actressKerryCondon.getGender(), actressKerryCondon.getHeight());
        opera.printListOfActors();
        opera.printLibretto();
    }
}
