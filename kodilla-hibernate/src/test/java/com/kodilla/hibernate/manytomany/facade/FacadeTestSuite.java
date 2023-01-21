package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private ManyToManyFacade manyToManyFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFindEmployeeFacade() throws ManyToManyException {
        //Given
        Employee employee = new Employee("Tomasz", "Nowak");
        employeeDao.save(employee);

        //When
        List<Employee> employeeList = manyToManyFacade.findEmployeeByAnyLettersOfLastName("ak");

        //Then
        assertEquals(1, employeeList.size());

        //CleanUp
        employeeDao.delete(employee);
    }

    @Test
    public void testFindCompanyFacade() throws ManyToManyException {
        //Given
        Company company = new Company("Morszczuk");
        companyDao.save(company);

        //When
        List<Company> companyList = manyToManyFacade.findCompanyByAnyString("ors");

        //Then
        assertEquals(1, companyList.size());

        //CleanUp
        companyDao.delete(company);
    }
}
