package com.example.clase1.demo.clase;

import com.example.clase1.demo.clase.dao.IProducto;
import java.util.List;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
@Autowired
private IProducto ipro;

	@Test
	void contextLoads() {
            List<Map<String,Object>> producto = ipro.readAll();
            
            assertThat(producto);
        
        }

}
