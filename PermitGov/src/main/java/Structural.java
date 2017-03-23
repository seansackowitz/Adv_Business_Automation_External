package com.gov.services;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;

import com.gov.services.StructuralPermitStatus;

@RestController
public class Structural
{
    @RequestMapping(value="/structural", method=RequestMethod.GET)
    public StructuralPermitStatus GetStructural(@RequestParam(value="id", defaultValue="-1") int id)
    {
        return new StructuralPermitStatus(id);
    }

    @RequestMapping(value="/structural", method=RequestMethod.POST)
    public StructuralPermitStatus PutStructural()
    {
        return StructuralPermitStatus.CreatePermit();
    }

    @RequestMapping(value="/structural", method=RequestMethod.DELETE)
    public void DeleteStructural(@RequestParam(value="id", defaultValue="-1") int id)
    {
        StructuralPermitStatus.DeletePermit(id);
    }
}