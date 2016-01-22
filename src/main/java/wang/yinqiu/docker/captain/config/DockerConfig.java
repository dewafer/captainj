package wang.yinqiu.docker.captain.config;

import com.spotify.docker.client.DefaultDockerClient;
import com.spotify.docker.client.DockerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dewafer on 16/1/22.
 */
@Configuration
public class DockerConfig {

    @Bean
    DockerClient defaultDockerClient() throws Exception {
        return DefaultDockerClient.fromEnv().build();
    }
}
