package com.example.restservice.dto;

public class ServerInfo {
    private final long id;
    private final String appName;
    private final String hostName;
    private final String ipAddress;
    private final String os;
    private final String date;

    public ServerInfo(long id, String appName, String hostName, String ipAddress, String os, String date) {
        this.id = id;
        this.appName = appName;
        this.hostName = hostName;
        this.ipAddress = ipAddress;
        this.os = os;
        this.date = date;
    }

    public long getId() { return id; }

    public String getAppName() {
        return appName;
    }

    public String getHostName() {
        return hostName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getOs() {
        return os;
    }

    public String getDate() {
        return date;
    }
}
