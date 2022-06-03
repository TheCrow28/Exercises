package co.develhope.First.Api4.Controllers;


import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetSocketAddress;

@RestController
public class HeaderController {

    @GetMapping("/header")
    public String getHeaders(@RequestHeader HttpHeaders headers) {
        InetSocketAddress host = headers.getHost();
        return host.getHostName() + " " + host.getPort();

    }

}
