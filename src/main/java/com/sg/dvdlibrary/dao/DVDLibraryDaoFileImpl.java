package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.DVD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DVDLibraryDaoFileImpl implements DVDLibraryDao{
    public static final String LIBRARY_FILE = "library.txt";
    public static final String DELIMITER = "::";

    private Map<String, DVD> dvds = new HashMap<>();


    @Override
    public DVD addDVD(String title, DVD dvd)  {
        return dvds.put(title, dvd);
    }

    @Override
    public List<DVD> getAllDVDs()  {
        return new ArrayList(dvds.values());
    }

    @Override
    public DVD getDVD(String title)  {
        return dvds.get(title);
    }

    @Override
    public DVD removeDVD(String title)  {
        return dvds.remove(title);
    }

    public DVD editDVD(String title, DVD dvd) {
        return dvds.put(title, dvd);
    }


}
