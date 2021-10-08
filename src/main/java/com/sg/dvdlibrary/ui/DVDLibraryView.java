package com.sg.dvdlibrary.ui;

import com.sg.dvdlibrary.dto.DVD;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DVDLibraryView {

    private UserIO io;

    public DVDLibraryView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. Add a DVD to library");
        io.print("2. Remove DVD from library");
        io.print("3. Edit a DVD in the library");
        io.print("4. List all DVDs in library");
        io.print("5. Display information for a particular DVD");
        io.print("6. Exit");

        return io.readInt("Please select from the above choices.", 1, 6);
    }

    public DVD getNewDVDInfo() {
        String title = io.readString("Please enter DVD title");
        String rating = io.readString("Please enter MPAA rating");
        String directorName = io.readString("Please enter director name");
        String studio = io.readString("Please enter studio");
        String userRating = io.readString("Please enter your personal rating/review");
        LocalDate date = io.readDate("Please enter release date");

        DVD currentDVD = new DVD(title);
        currentDVD.setRating(rating);
        currentDVD.setDirectorName(directorName);
        currentDVD.setStudio(studio);
        currentDVD.setUserRating(userRating);
        currentDVD.setReleaseDate(date);
        return currentDVD;
    }

    public void displayCreateDVDBanner() {
        io.print("=== Add DVD ===");
    }

    public void displayCreateSuccessBanner() {
        io.readString("DVD successfully added.  Please hit enter to continue");
    }

    public void displayDVDList(List<DVD> DVDList) {
        for (DVD currentDVD : DVDList) {
            String dvdInfo = String.format("Title: %s Release Date: %s Rating: %s  Director: %s Studio: %s  User rating: %s",
                    currentDVD.getTitle(),
                    currentDVD.getReleaseDate(),
                    currentDVD.getRating(),
                    currentDVD.getDirectorName(),
                    currentDVD.getStudio(),
                    currentDVD.getUserRating());
            io.print(dvdInfo);
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayDisplayAllBanner() {
        io.print("=== Display All DVDs ===");
    }

    public void displayDisplayDVDBanner() {
        io.print("=== Display DVD ===");
    }

    public String getTitleChoice() {
        return io.readString("Please enter the DVD title.");
    }

    public void displayDVD(DVD dvd) {
        if (dvd != null) {
            io.print(dvd.getTitle());
            io.print(dvd.getReleaseDate().toString());
            io.print(dvd.getRating());
            io.print(dvd.getDirectorName());
            io.print(dvd.getStudio());
            io.print(dvd.getUserRating());
            io.print("");
        } else {
            io.print("No such DVD.");
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayRemoveDVDBanner() {
        io.print("=== Remove DVD ===");
    }

    public void displayRemoveResult(DVD DVDRecord) {
        if (DVDRecord != null) {
            io.print("DVD successfully removed.");
        } else {
            io.print("No such DVD.");
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }

    public void displayEditDVDBanner() {
        io.print("=== Edit DVD ===");
    }

    public void displayEditResult(DVD dvd) {
        if (dvd != null) {
            io.print("DVD successfully edited.");
        } else {
            io.print("No such DVD.");
        }
        io.readString("Please hit enter to continue.");
    }

    public DVD changeDVDInfo(String title) {
        String rating = io.readString("Please enter MPAA rating");
        String directorName = io.readString("Please enter director name");
        String studio = io.readString("Please enter studio");
        String userRating = io.readString("Please enter your personal rating/review");
        LocalDate date = io.readDate("Please enter release data in DD/MM/YYYY format");

        DVD currentDVD = new DVD(title);
        currentDVD.setRating(rating);
        currentDVD.setDirectorName(directorName);
        currentDVD.setStudio(studio);
        currentDVD.setUserRating(userRating);
        currentDVD.setReleaseDate(date);
        return currentDVD;
    }

}

