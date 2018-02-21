public class BadPupil extends Pupil {
    public BadPupil() {
    }

    @Override
    public void study() {
        super.study();
        System.out.println("Bad studying");
    }

    @Override
    public void read() {
        super.read();
        System.out.println("Bad reading");
    }

    @Override
    public void write() {
        super.write();
        System.out.println("Average writing");
    }

    @Override
    public void relax() {
        super.relax();
        System.out.println("Excellent relaxing");
    }
}
