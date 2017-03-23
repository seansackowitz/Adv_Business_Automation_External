package com.gov.services;

import java.util.Hashtable;
import java.util.Random;

public class StructuralPermitStatus
{
    private static Random rand = new Random();
    private static Hashtable<Integer, Integer> database = new Hashtable<Integer, Integer>();
    private static int lastID = 0;
    private int id;
    private int status;
    private String content;

    public static StructuralPermitStatus CreatePermit()
    {
        lastID++;
        database.put((Integer)lastID, 0);
        return new StructuralPermitStatus(lastID, false);
    }

    public static void DeletePermit(int id)
    {
        database.remove(id);
    }

    public StructuralPermitStatus(int id)
    {
        this.id = id;
        if (id > -1)
        {
            Integer status = database.get(id);
            if (status != null)
            {
                if (status == 0)
                {
                    status = rand.nextInt(3);
                    database.replace(id, status);
                }

                switch (status)
                {
                    case 0: // STATUS IN_PROGRESS
                        content = "IN_PROGRESS";
                        break;
                    case 1: // STATUS DENIED
                        content = "DENIED";
                        break;
                    case 2: // STATUS APPROVED
                        content = "APPROVED";
                        break;
                }
            }
        }
        else
        {
            content = "";
        }
    }

    public StructuralPermitStatus(int id, boolean update)
    {
        this.id = id;
        if (id > -1)
        {
            Integer status = database.get(id);
            if (status != null)
            {
                switch (status)
                {
                    case 0: // STATUS IN_PROGRESS
                        content = "IN_PROGRESS";
                        break;
                    case 1: // STATUS DENIED
                        content = "DENIED";
                        break;
                    case 2: // STATUS APPROVED
                        content = "APPROVED";
                        break;
                }
            }
        }
        else
        {
            content = "";
        }
    }

    public long getId()
    {
        return id;
    }

    public String getContent()
    {
        return content;
    }
}