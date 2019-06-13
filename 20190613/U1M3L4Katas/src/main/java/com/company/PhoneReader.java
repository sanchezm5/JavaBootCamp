package com.company;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;
import java.util.List;

public class PhoneReader {
    public static void main(String[] args) {

        // Read the xml file and print contents to the console
        try {
            ObjectMapper mapper = new XmlMapper();
            List<Phone> phonesFromXml;

            phonesFromXml = mapper.readValue(new File("phones.xml"), new TypeReference<List<Phone>>(){});

            // Iterate through the phones list and print to console
            for (Phone phone : phonesFromXml) {
                System.out.println("=========================================");
                System.out.println(phone.getBrand());
                System.out.println(phone.getModel());
                System.out.println(phone.getProcessor());
                System.out.println(phone.getStorage());
                System.out.println(phone.getPrice());
            }
            System.out.println("=========================================");
        } catch (Exception e) {
            System.out.println("An error has occurred: " + e);
        }
    }
}
