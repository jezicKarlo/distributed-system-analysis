package hr.fer.rassus.pdqreview;

import com.perfdynamics.pdq.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class PDQReporter {

    private PDQ pdq;
    private List<String> nodes;

    public PDQReporter(double lambda) {
        nodes = new ArrayList<>();
        pdq = new PDQ();
        pdq.Init("report");
        pdq.CreateOpen("requests", lambda);
    }

    public void createNode(String nodeName, double visitCount, double serviceTime) {
        pdq.CreateNode(nodeName, Node.CEN, QDiscipline.FCFS);
        pdq.SetVisits(nodeName, "requests", visitCount, serviceTime);
        nodes.add(nodeName);
    }

    public String getResidenceTime() {
        pdq.Solve(Methods.CANON);
        double residenceTime = 0;
        for (String nodeName : nodes) {
            residenceTime += pdq.GetResidenceTime(nodeName, "requests", Job.TRANS);
        }
        NumberFormat formatter = new DecimalFormat("#0.000");
        return formatter.format(residenceTime);
    }
}
