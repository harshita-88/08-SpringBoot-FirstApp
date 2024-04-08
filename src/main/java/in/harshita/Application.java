package in.harshita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cctx = 
				SpringApplication.run(Application.class, args);
		ReportDao dao = cctx.getBean(ReportDao.class);
		dao.reportData();
	}
	@GetMapping("/")
	public String Welcome() {
		return "Welcome to Harshita Projects";
	}
	
}
