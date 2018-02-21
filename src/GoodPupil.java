public class GoodPupil extends Pupil {
    public GoodPupil() {
    }

    @Override
    public void study() {
        super.study();
        System.out.println("Good studying");
    }

    @Override
    public void read() {
        super.read();
        System.out.println("Excellent reading");
    }

    @Override
    public void write() {
        super.write();
        System.out.println("Average writing" + "\n");
    }

    @Override
    public void relax() {
        super.relax();
        System.out.println("Bad relaxing");
    }
}
