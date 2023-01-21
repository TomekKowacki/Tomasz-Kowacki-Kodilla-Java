package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManyToManyFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(ManyToManyFacade.class);

    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    @Autowired
    public ManyToManyFacade(EmployeeDao employeeDao, CompanyDao companyDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> findCompanyByAnyString(String anyLettersOfCompanyName) throws ManyToManyException {

        LOGGER.info("Searching for company with phrase \"" + anyLettersOfCompanyName + "\" in its name...");
        List<Company> companies = companyDao.findNameOfCompanyByAnyLetters("%" + anyLettersOfCompanyName + "%");
        if (companies.size() == 0) {
            LOGGER.error(ManyToManyException.ERR_COMPANY_NOT_FOUND);
            throw new ManyToManyException(ManyToManyException.ERR_COMPANY_NOT_FOUND);
        }
        return companies;
    }

    public List<Employee> findEmployeeByAnyLettersOfLastName(String anyLettersOfLastName) throws ManyToManyException {

        LOGGER.info("Searching for employee with pharse \"" + anyLettersOfLastName + "\" in last name");
        List<Employee> employees = employeeDao.findEmployeeByAnyLettersOfLastName("%" + anyLettersOfLastName + "%");
        if (employees.size() == 0) {
            LOGGER.error(ManyToManyException.ERR_EMPLOYEE_NOT_FOUND);
            throw new ManyToManyException(ManyToManyException.ERR_EMPLOYEE_NOT_FOUND);
        }
        return employees;
    }
}
