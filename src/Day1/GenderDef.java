package Day1;

public enum GenderDef {
    Male("M"), Female("F");

    private String genderValue;

    GenderDef(String f) {
        this.genderValue = f;
    }

    public String getGenderValue() {
        return genderValue;
    }

    public void setGenderValue(String genderValue) {
        this.genderValue = genderValue;
    }
}
