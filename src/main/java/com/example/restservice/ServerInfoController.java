package com.example.restservice;

import com.example.restservice.dto.ServerInfo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ServerInfoController {
    private final AtomicLong counter = new AtomicLong();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    @GetMapping("/serverinfo")
    @CrossOrigin("*")
    public List<ServerInfo> status(){
        // obtain a hostname. First try to get the host name from docker container (from the "HOSTNAME" environment variable)
        String hostName = System.getenv("HOSTNAME");
        // get the os name
        String os = System.getProperty("os.name");
        //get the IP address
        String ipAddress = "127.0.0.1"; //dummy value
        InetAddress ipUtils = null;
        try {
            ipUtils = InetAddress.getLocalHost();
            ipAddress = ipUtils.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        //get the access date
        Date date = new Date();
        if (hostName == null || hostName.isEmpty()) {
            try {
                ipUtils = InetAddress.getLocalHost();
                ipAddress = ipUtils.getHostAddress();
                hostName = ipUtils.getHostName();
            } catch (UnknownHostException e) {
                e.printStackTrace();
                hostName = "Unknown";
            }
        }
        List <ServerInfo> serverInfos = new ArrayList<>();
        serverInfos.add(new ServerInfo(counter.incrementAndGet(), "Google Kubernetes Engine", hostName, ipAddress, os, formatter.format(date)));
        return serverInfos;
    }
}
