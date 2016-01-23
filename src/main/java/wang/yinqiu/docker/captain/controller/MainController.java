package wang.yinqiu.docker.captain.controller;

import com.spotify.docker.client.DockerClient;
import com.spotify.docker.client.DockerException;
import com.spotify.docker.client.messages.Container;
import com.spotify.docker.client.messages.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by dewafer on 16/1/22.
 */
@Controller
public class MainController {

    @Autowired
    private DockerClient dockerClient;

    @RequestMapping("/")
    public String homePage(Model model) throws DockerException, InterruptedException {
        // docker ps -a
        List<Container> containers = dockerClient.listContainers(DockerClient.ListContainersParam.allContainers());
        model.addAttribute("containers", containers);
        return "index";
    }

    @RequestMapping("images.html")
    public String listImagesPage(Model model) throws DockerException, InterruptedException {
        // docker images -a
        List<Image> images = dockerClient.listImages(DockerClient.ListImagesParam.allImages());
        model.addAttribute("images", images);
        return "images";
    }
}
