package utils;

import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {

    @DataProvider
    public Iterator<Object[]> usingFile() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                DataProviders.class.getResourceAsStream("/data.csv")
        ));
        List<Object[]> userData = new ArrayList<Object[]>();
        String line = reader.readLine();

        while (line != null) {
            userData.add(line.split(","));
            line = reader.readLine();
        }
        reader.close();
        return userData.iterator();
    }

    @DataProvider
    public Iterator<Object[]> usingFile1() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                DataProviders.class.getResourceAsStream("/dataWrongPassword.csv")
        ));
        List<Object[]> userData = new ArrayList<Object[]>();
        String line = reader.readLine();

        while (line != null) {
            userData.add(line.split(","));
            line = reader.readLine();
        }
        reader.close();
        return userData.iterator();
    }


    @DataProvider
    public Iterator<Object[]> usingFile2() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                DataProviders.class.getResourceAsStream("/dataWrongEmail.csv")
        ));
        List<Object[]> userData = new ArrayList<Object[]>();
        String line = reader.readLine();

        while (line != null) {
            userData.add(line.split(","));
            line = reader.readLine();
        }
        reader.close();
        return userData.iterator();
    }

    @DataProvider
    public Iterator<Object[]> usingFile3() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                DataProviders.class.getResourceAsStream("/dataLogin.csv")
        ));
        List<Object[]> userData = new ArrayList<Object[]>();
        String line = reader.readLine();

        while (line != null) {
            userData.add(line.split(","));
            line = reader.readLine();
        }
        reader.close();
        return userData.iterator();
    }

    @DataProvider
    public Iterator<Object[]> usingFile4() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                DataProviders.class.getResourceAsStream("/dataLoginInvPwd.csv")
        ));
        List<Object[]> userData = new ArrayList<Object[]>();
        String line = reader.readLine();

        while (line != null) {
            userData.add(line.split(","));
            line = reader.readLine();
        }
        reader.close();
        return userData.iterator();
    }

}
