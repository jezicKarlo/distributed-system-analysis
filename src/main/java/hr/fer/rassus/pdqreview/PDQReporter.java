package hr.fer.rassus.pdqreview;

import com.perfdynamics.pdq.*;

public class PDQReporter {

    private PDQ pdq;

    public PDQReporter(double lambda) {
        pdq = new PDQ();
        pdq.Init("report");
        pdq.CreateOpen("requests", lambda);
    }

    public void createNode(String name) {
        pdq.CreateNode(name, Node.CEN, QDiscipline.FCFS);
    }

    public void setVisits(String nodeName, double visitCount, double serviceTime) {
        pdq.SetVisits(nodeName, "requests", visitCount, serviceTime);
    }

    public void solve() {
        pdq.Solve(Methods.CANON);
    }

    public double getResidenceTime(String nodeName) {
        return pdq.GetResidenceTime(nodeName, "requests", Job.TRANS);
    }
}
