package com.thandb.hibernate.tutorial.dao;

import java.util.List;

import com.thandb.hibernate.tutorial.domain.Person;

public interface PersonDAO {
	public void addPerson(Person p);
    public void updatePerson(Person p);
    public List<Person> listPersons();
    public Person getPersonById(int id);
    public void removePerson(int id);
}
