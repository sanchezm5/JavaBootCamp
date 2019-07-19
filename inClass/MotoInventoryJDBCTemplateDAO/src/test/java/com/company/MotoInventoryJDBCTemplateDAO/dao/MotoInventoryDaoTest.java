package com.company.MotoInventoryJDBCTemplateDAO.dao;

import com.company.MotoInventoryJDBCTemplateDAO.model.Motorcycle;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MotoInventoryDaoTest {

    @Autowired
    protected MotoInventoryDao dao;

    @Before
    public void setUp() throws Exception {
        // clean out the test db
        List<Motorcycle> mList = dao.getAllMotorcycles();

        mList.stream()
                .forEach(motorcycle -> dao.deleteMotorcycle(motorcycle.getId())) ;
    }

    @Test
    public void getMotorcycle() {
    }

    @Test
    public void addGetDeleteMotorcycle() {

        Motorcycle moto = new Motorcycle();
        moto.setVin("12345");
        moto.setMake("Honda");
        moto.setModel("Africa Twin");
        moto.setYear("2019");
        moto.setColor("black");

        moto = dao.addMotorcycle(moto);

        Motorcycle moto2 = dao.getMotorcycle(moto.getId());

        assertEquals(moto, moto2);

        dao.deleteMotorcycle(moto.getId());

        moto2 = dao.getMotorcycle(moto.getId());

        assertNull(moto2);
    }

    @Test
    public void getAllMotorcycles() {

        // Instantiate a motorcycle and add each one to the db
        Motorcycle moto = new Motorcycle();
        moto.setVin("12345");
        moto.setMake("Honda");
        moto.setModel("Africa Twin");
        moto.setYear("2019");
        moto.setColor("black");

        moto = dao.addMotorcycle(moto);

        moto = new Motorcycle();
        moto.setVin("1234");
        moto.setMake("Honda");
        moto.setModel("Africa Twin");
        moto.setYear("2018");
        moto.setColor("blue");

        moto = dao.addMotorcycle(moto);

        moto = new Motorcycle();
        moto.setVin("123");
        moto.setMake("Honda");
        moto.setModel("Africa Twin");
        moto.setYear("2017");
        moto.setColor("red");

        moto = dao.addMotorcycle(moto);

        List<Motorcycle> motoList = dao.getAllMotorcycles();

        // assertEquals will compare
        assertEquals(motoList.size(), 3);
    }

    @Test
    public void getAllMotorcyclesByMake(String make) {

        // Instantiate a motorcycle and add each one to the db
        Motorcycle moto = new Motorcycle();
        moto.setVin("12345");
        moto.setMake("Toyota");
        moto.setModel("Camry");
        moto.setYear("2019");
        moto.setColor("black");

        moto = dao.addMotorcycle(moto);

        moto = new Motorcycle();
        moto.setVin("2345");
        moto.setMake("Toyota");
        moto.setModel("Corolla");
        moto.setYear("2019");
        moto.setColor("black");

        moto = dao.addMotorcycle(moto);

        moto = new Motorcycle();
        moto.setVin("123");
        moto.setMake("Honda");
        moto.setModel("Civic");
        moto.setYear("2018");
        moto.setColor("blue");

        moto = dao.addMotorcycle(moto);

        List<Motorcycle> mList = dao.getMotorcyclesByMake("Toyota");
        assertEquals(mList.size(), 2);

        mList = dao.getMotorcyclesByMake("Honda");
        assertEquals(mList.size(), 1);

        mList = dao.getMotorcyclesByMake("Ducati");
        assertEquals(mList.size(), 0);

    }
}