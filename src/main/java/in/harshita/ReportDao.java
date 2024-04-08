package in.harshita;

import org.springframework.stereotype.Service;

@Service
public class ReportDao {

	public ReportDao() {
		System.out.println("Report Object");
	}
	public void reportData() {
		System.out.println("Incoming Data");
	}

}
