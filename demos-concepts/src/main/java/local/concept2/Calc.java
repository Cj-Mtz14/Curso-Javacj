package local.concept2;

public class Calc {
    @Override
    public String toString() {
        String className = getClass().getSimpleName();
        String hash = Integer.toHexString(hashCode());
        return "%s [@%s]".formatted(className, hash);
    }
}