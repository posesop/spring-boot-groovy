import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@EnableAutoConfiguration
@RestController
class Index {
	
	@RequestMapping("/")
	String home(){
		"Hello World"
	}

}
  