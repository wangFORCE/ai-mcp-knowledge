package cn.bugstack.mcp.server.csdn;

import cn.bugstack.mcp.server.csdn.infrastructure.gateway.ICSDNService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@SpringBootApplication
public class McpServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(McpServerApplication.class, args);
    }

    @Bean
    public ICSDNService csdnService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://bizapi.csdn.net/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        return retrofit.create(ICSDNService.class);
    }

}
