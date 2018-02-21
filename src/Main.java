public class Main {
    public static void main(String[] args) {

        ClassRoom room = new ClassRoom();

        room = new ClassRoom(new ExcelentPupil());
        room = new ClassRoom(new GoodPupil());
        room = new ClassRoom(new BadPupil());

    }

}


