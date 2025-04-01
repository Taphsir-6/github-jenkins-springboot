package sn.uasz.jenkinsProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsProjectApplication {

	@GetMapping("/welcom")
	public String welcom(){
		return "Welcome to Jenkins!";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsProjectApplication.class, args);
	}

}

//echo "# github-jenkins-springboot" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin git@github.com:Taphsir-6/github-jenkins-springboot.git
//git push -u origin main