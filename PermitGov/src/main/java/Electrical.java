package com.gov.services;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;

import com.gov.services.ElectricalPermitStatus;

@RestController
public class Electrical
{
    @RequestMapping(value="/electrical", method=RequestMethod.GET)
    public ElectricalPermitStatus GetElectrical(@RequestParam(value="id", defaultValue="-1") int id)
    {
        return new ElectricalPermitStatus(id);
    }

    @RequestMapping(value="/electrical", method=RequestMethod.POST)
    public ElectricalPermitStatus PutElectrical()
    {
        return ElectricalPermitStatus.CreatePermit();
    }

    @RequestMapping(value="/electrical", method=RequestMethod.DELETE)
    public void DeleteStructural(@RequestParam(value="id", defaultValue="-1") int id)
    {
        ElectricalPermitStatus.DeletePermit(id);
    }
}