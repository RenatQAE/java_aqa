package LearningJavaBook.Наследование;

public class FamilyDoctor extends Doctor{
    @Override
    void treatPatient() {
        // наследуемся от родительского класса
        super.treatPatient();
    }

    void giveAdvice(){
    // даем совет
    }
}
