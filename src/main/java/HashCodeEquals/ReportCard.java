package main.java.HashCodeEquals;

class ReportCard {

    private Integer marks;

    private Integer percentage;

    public ReportCard(Integer marks, Integer percentage) {
        this.marks = marks;
        this.percentage = percentage;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "marks=" + marks +
                ", percentage=" + percentage +
                '}';
    }
}
