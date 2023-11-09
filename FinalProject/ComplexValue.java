package homework.FinalProject;

public class ComplexValue {
    private int userValueReal;
    private int userValueImaginary;

    public ComplexValue(int userValueReal, int userValueImaginary) {
        this.userValueReal = userValueReal;
        this.userValueImaginary = userValueImaginary;
    }

    @Override
    public String toString() {
        return String.format("%d+%di", userValueReal, userValueImaginary);
    }

    public void setUserValueReal(int userValueReal) {
        this.userValueReal = userValueReal;
    }

    public void setUserValueImaginary(int userValueImaginary) {
        this.userValueImaginary = userValueImaginary;
    }

    public int getUserValueReal() {
        return userValueReal;
    }

    public int getUserValueImaginary() {
        return userValueImaginary;
    }

}
