package pl.urbanlab.patterns.behavioral.visitor;

public class Report implements Document {

    private String name;
    private int reportNo;

    public Report(String name, int reportNo) {

        this.name = name;
        this.reportNo = reportNo;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitReport(this);
    }

    public String getName() {
        return name;
    }

    public int getReportNo() {
        return reportNo;
    }
}
