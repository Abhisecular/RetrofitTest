package com.example.abhi.retrofittest;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Abhi on 16-01-2018.
 */

public class Contact {

    @SerializedName("name")
   private String Name;

    @SerializedName("email")
   private String Email;

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }
}
