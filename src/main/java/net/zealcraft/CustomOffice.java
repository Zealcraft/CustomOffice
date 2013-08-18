package net.zealcraft;


public class CustomOffice  {

    private static CustomOffice customOffice = new CustomOffice();

    public static CustomOffice getInstance(){
        return customOffice;
    }

    private CustomOffice() {


    }




}
