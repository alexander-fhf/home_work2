package home_work2;

public class test3 {
    public static void main(String[] args) {
        boolean chicken = true;
        boolean vegetables = false;
        boolean cour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;
        if (chicken&&vegetables&&cour&&toast){
            System.out.print("Цезарь");
        }else if (vegetables&&(sausage||chicken)&&eggs){
            System.out.print("Оливье");
        }else if (vegetables){
            System.out.print("Овощной салат");
        }else {
            System.out.print("У меня ничего нет");
        }

    }
}
