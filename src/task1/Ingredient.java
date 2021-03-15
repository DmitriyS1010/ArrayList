package task1;

public class Ingredient {



    private String title;
    private  Measurements measurements;
    private String shortDisc;

    public Ingredient(String title, Measurements measurements, String shortDisc) {
        this.setTitle(title);
        this.setMeasurements(measurements);
        this.setShortDisc(shortDisc);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Measurements getMeasurements() {
        return measurements;
    }

    public void setMeasurements(Measurements measurements) {
        this.measurements = measurements;
    }

    public String getShortDisc() {
        return shortDisc;
    }

    public void setShortDisc(String shortDisc) {
        this.shortDisc = shortDisc;
    }

    @Override
    public String toString() {
        return "Ingredient { " +
                " title= '" + title + '\'' +
                ", measurements= " + measurements +
                ", shortDisc= '" + shortDisc + '\'' +
                '}';
    }
}
