package az.azerenerji.erppro.mssql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class MssqlApplication {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(MssqlApplication.class, args);
	}



//
//	@Override
//	public void run(String... args) throws Exception {
//		String sql = "SELECT * FROM Userinfo";
//
//		List<Userinfo> userinfos = jdbcTemplate.query(sql,
//				BeanPropertyRowMapper.newInstance(Userinfo.class));
//
//
//		userinfos.forEach(System.out :: println);
//	}

}
