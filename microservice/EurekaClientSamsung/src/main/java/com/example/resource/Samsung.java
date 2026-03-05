package com.example.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Device;
import com.example.model.Devices;

@RestController
@RequestMapping("/samsung")
public class Samsung{
    @RequestMapping("/devices")
    public Devices getDevices()
    {
        List<Device> devices=new ArrayList<>();
        devices.add(new Device("samsung","Just a smart phone with a good camera and very pricy"));
        devices.add(new Device("ipod","Best device to play music"));
        Devices list=new Devices("samsung",devices);
        return list;
    }

    @RequestMapping("/something")
    public void getSomething()
    {

    }
}
