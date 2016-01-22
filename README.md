Captain J
=========

The Captain J project is just another user interface for docker-client.

船长是干嘛的？开船的呗！

使用方法
-------

在[Docker Quickstart Terminal][1]中运行：

1. `mvn clean package docker:build`
2. build成功后运行：
```
    docker run -v //~/.docker/machine/machines/default:/certs \
    -e DOCKER_TLS_VERIFY="1" \
    -e DOCKER_HOST="tcp://192.168.99.100:2376" \
    -e DOCKER_CERT_PATH="//certs" \
    -ti -p 8080:8080 --name="captain-j" \
    dewafer/captain-j
```
3. 浏览器访问：[http://192.168.99.100:8080][2]


Usage
-----

Run in your `Docker Quickstart Terminal`:

1.  `mvn clean package docker:build`
2.  After success build, run:

```
docker run -v //~/.docker/machine/machines/default:/certs \
-e DOCKER_TLS_VERIFY="1" \
-e DOCKER_HOST="tcp://192.168.99.100:2376" \
-e DOCKER_CERT_PATH="//certs" \
-ti -p 8080:8080 --name="captain-j" \
dewafer/captain-j
```

3.  Open in your browser: [http://192.168.99.100:8080][2]



[1]: https://docs.docker.com/mac/ "Get Started with Docker"
[2]: http://192.168.99.100:8080 "Open in your browser"