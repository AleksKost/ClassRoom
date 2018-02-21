public class ExcelentPupil extends Pupil {


    @Override
    public void study() {
        super.study();
        System.out.println("Excellent studying");
    }

    @Override
    public void read() {
        super.read();
        System.out.println("Good reading");
    }

    @Override
    public void write() {
        super.write();
        System.out.println("Bad writing" + "\n");
    }

    @Override
    public void relax() {
        super.relax();
        System.out.println("Average relaxing");
    }
}
