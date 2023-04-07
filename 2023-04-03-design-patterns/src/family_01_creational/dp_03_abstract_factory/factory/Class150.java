package family_01_creational.dp_03_abstract_factory.factory;

import family_01_creational.dp_03_abstract_factory.admin.Admin;
import family_01_creational.dp_03_abstract_factory.admin.Mazal;
import family_01_creational.dp_03_abstract_factory.teachers.Eldar;
import family_01_creational.dp_03_abstract_factory.teachers.Teacher;

public class Class150 extends ClassFactory{
    @Override
    public Teacher getTeacher() {
        return new Eldar();
    }

    @Override
    public Admin getAdmin() {
        return new Mazal();
    }
}