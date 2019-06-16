package com.example.projektmanagment;

public class Sekretaer {
    private String name;
    private String raumnummer;
    private String telefonnummer;
    private String faxnummer;
    private String email;
    private String oeffnung;

    public Sekretaer(String name, String raumnummer, String telefonnummer, String faxnummer, String email, String oeffnung) {
        this.name = name;
        this.raumnummer = raumnummer;
        this.telefonnummer = telefonnummer;
        this.faxnummer = faxnummer;
        this.email = email;
        this.oeffnung = oeffnung;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaumnummer() {
        return raumnummer;
    }

    public void setRaumnummer(String raumnummer) {
        this.raumnummer = raumnummer;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String getFaxnummer() {
        return faxnummer;
    }

    public void setFaxnummer(String faxnummer) {
        this.faxnummer = faxnummer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOeffnung() {
        return oeffnung;
    }

    public void setOeffnung(String oeffnung) {
        this.oeffnung = oeffnung;
    }
}
