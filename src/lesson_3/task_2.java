package lesson_3;

public class task_2 {
    public static void main(String[] args) {
        Flat flat1 = new Flat("Казань",true,2,71.2,3);
        Flat flat2 = new Flat("Москва",false,1,34.2,1);
        Flat flat3 = new Flat("Зеленодольск", true,11,56.2,2 );

        System.out.println("Инфа по квартире :"+"Расположена в г."+flat1.flatLocation+" Общая площадь:"+flat1.flatArea+" этаж: "+flat1.flatFloor+" Количество комнат: "+flat1.flatRooms);
        System.out.println("Инфа по квартире :"+"Расположена в г."+flat2.flatLocation+" Общая площадь:"+flat2.flatArea+" этаж: "+flat2.flatFloor+" Количество комнат: "+flat2.flatRooms);
        System.out.println("Инфа по квартире :"+"Расположена в г."+flat3.flatLocation+" Общая площадь:"+flat3.flatArea+" этаж: "+flat3.flatFloor+" Количество комнат: "+flat3.flatRooms);

    }
}
