package co.develhope.interceptorsmiddleware2.entities;

public class Month {

    private int number;
    private String englishName;
    private String germanName;

    public Month (){}

    public Month(int number, String englishName, String germanName) {
        this.number = number;
        this.englishName = englishName;
        this.germanName = germanName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getGermanName() {
        return germanName;
    }

    public void setGermanName(String germanName) {
        this.germanName = germanName;
    }
}
