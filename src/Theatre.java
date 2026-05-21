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
        filmF1.addActorInList(actorBradPitt.name, actorBradPitt.surname, actorBradPitt.gender, actorBradPitt.height);
        filmF1.addActorInList(actressKerryCondon.name, actressKerryCondon.surname, actressKerryCondon.gender, actressKerryCondon.height);
        filmF1.printListOfActors();
        filmF1.replaceActorInList(actorJavierBardem, actressKerryCondon.surname);
        filmF1.printListOfActors();
        filmF1.printDirector();

        Ballet ballet = new Ballet("Пираты карибского моря", 2.00, directorGoreVerbinski, listOfActorsBallet,"Ханс Циммер", "Тед Эллиот", "Рудольф Нуреев");
        ballet.addActorInList(actorJavierBardem.name, actorJavierBardem.surname, actorJavierBardem.gender, actorJavierBardem.height);
        ballet.printListOfActors();
        ballet.replaceActorInList(actorBradPitt, actressKerryCondon.surname);
        ballet.printLibretto();

        Opera opera = new Opera("Гарри Поттер и проклятое дитя", 3.00, directorGoreVerbinski, listOfActorsOpera, "Джон Уильямс", "Дж.К. Роулинг", 100);
        opera.addActorInList(actressKerryCondon.name, actressKerryCondon.surname, actressKerryCondon.gender, actressKerryCondon.height);
        opera.printListOfActors();
        opera.printLibretto();
    }
}
