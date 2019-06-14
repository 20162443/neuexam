package neuedu.neuexam.publicController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class connectController {

	@RequestMapping("/towebcam")
	public String towebcam() {
		return "webcam";
	}
	
	@RequestMapping("/toupload")
	public String toupload() {
		return "upload";
	}
	
	@RequestMapping("/topaypage")
	public String topaypage() {
		return "paypage";
	}
}
