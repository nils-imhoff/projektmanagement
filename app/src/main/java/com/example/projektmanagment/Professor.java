package com.example.projektmanagment;

public class Professor {
    private String name;
    private String raumnummer;
    private String telefonnummer;
    private String faxnummer;
    private String email;
    private String link;


    public Professor(String name, String raumnummer, String telefonnummer, String faxnummer, String email, String link){
        this.name = name;
        this.raumnummer =raumnummer;
        this.telefonnummer = telefonnummer;
        this.faxnummer = faxnummer;
        this.email = email;
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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
}
