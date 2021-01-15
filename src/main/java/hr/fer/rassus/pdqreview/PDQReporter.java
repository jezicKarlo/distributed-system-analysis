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

    public void setVisits(String nodeName, String requestName, double visitCount, double serviceTime) {
        pdq.SetVisits(nodeName, requestName, visitCount, serviceTime);
    }

    public void solve() {
        pdq.Solve(Methods.CANON);
    }

    public double getResidenceTime(String nodeName, String requestName) {
        return pdq.GetResidenceTime(nodeName, requestName, Job.TRANS);
    }
}
