public class Specialdie extends Die {

    public Specialdie(int sides) {
        super(sides);
    }

    @Override
    public int throwDie() {
        int results = super.throwDie();
        return results * super.getSides();
    }



}
