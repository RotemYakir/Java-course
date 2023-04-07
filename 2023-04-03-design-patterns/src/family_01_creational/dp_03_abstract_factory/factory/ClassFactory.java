package family_01_creational.dp_03_abstract_factory.factory;

import family_01_creational.dp_03_abstract_factory.admin.Admin;
import family_01_creational.dp_03_abstract_factory.teachers.Teacher;

public abstract class ClassFactory {

    public abstract Teacher getTeacher();
    public abstract Admin getAdmin();
}
