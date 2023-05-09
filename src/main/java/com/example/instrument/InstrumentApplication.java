import javax.sound.midi.Instrument;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.instrument.service.InstrumentService;


@SpringBootApplication
public class InstrumentApplication {

	@Autowired
	Instrument InstrumentServices;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	
	public static void main(String[] args) {
		SpringApplication.run(InstrumentApplication.class, args);
	}
	
	
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Doctor.class);
	}
	
	
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
}
