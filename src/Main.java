public class Main {
    public static void main(String[] args) {
        //Пример
        //    System.out.println("Пример условного оператора");
        //    int age = 9;
        //   if (age>=18) {
        //        System.out.println("Ты можешь водить");
        //    } else  {
        //        System.out.println("ты не можешь водить");
        //    }
        //Задача №1
        System.out.println("Задача №1");
        int youngPeople = 5;
        if (youngPeople >= 18) {
            System.out.println("Вам " + youngPeople + ", вы совершеннолетний");
        } else {
            System.out.println("Вам " + youngPeople + ", вы еще не совершеннолетний, вам надо подрасти");
        }
        //Задача №2
        System.out.println("Задача №2");
        int temperature = 20;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градуса(ов), нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градуса(ов), можно идти без шапки.");
        }
        //Задача № 3
        System.out.println("Задача №3");
        int speed = 45;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то вам придется заплатать штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        //Операции сравнения.
        //    System.out.println("Операции сравнения");
        //    int age1 = 22;
        //    if (age1>=18 && age1<21) {
        //        System.out.println("Ты може водить, но употреблять спиртное нельзя");
        //    }else {
        //        System.out.println("Ты  можешь водить и употреблять алкоголь");
        //   }
        //    int age2 = 19;
        //    if (age2 < 7 || age2 > 18) {
        //        System.out.println("Я думаю ты не ходишь в школу");
        //    } else {
        //        System.out.println("Я думаю ты школьник");
        //    }
        //    boolean skyIsClean = true;
        //    if (skyIsClean) {
        //        System.out.println("Небо чистое");
        //    }
        //    int ageSchool = 8;
        //    boolean canNotGoToSchool = ageSchool < 5 || ageSchool > 18;
        //    if (canNotGoToSchool) {
        //        System.out.println("Я думаю, ты не ходишь в школу");
        //    } else {
        //        System.out.println("Ты ходишь в школу");
        //    }
        // Задача №4
        System.out.println("Задача №4");
        int agePeople1 = 23;
        boolean canGoToKindergarten = agePeople1 >= 2 && agePeople1 <= 6;
        if (canGoToKindergarten) {
            System.out.println("Если возраст человека равен " + agePeople1 + ", то ему нужно ходить в детский сад");
        } else if (canGoToKindergarten = agePeople1 >= 7 && agePeople1 <= 18) {
            System.out.println("Если возраст человека равен " + agePeople1 + ", то ему нужно ходить в школу");
        } else if (canGoToKindergarten = agePeople1 >= 18 && agePeople1 <= 24) {
            System.out.println("Если возраст человека равен " + agePeople1 + ", то ему нужно ходить в университет");
        } else if (canGoToKindergarten = agePeople1 >= 24) {
            System.out.println("Если возраст человека равен " + agePeople1 + ", то ему нужно ходить на работу");
        }
        //Задача № 5
        System.out.println("Задача №5 ");
        int ageKid = 11;
        boolean canKidGoAttraction = ageKid > 14;
        if (canKidGoAttraction) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то ему можно кататься на аттракционе без сопровождения взростлого");
        } else if (canGoToKindergarten = ageKid < 5) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то ему нельзя кататься на аттракционе");
        } else if (canGoToKindergarten = ageKid >= 5 && ageKid <= 14) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то он может кататься на аттракционе в сопровождении взрослого");
        }
        //Здача №6;
        System.out.println("Задача №6");
        int passenger = 66;
        boolean sittingPlace = passenger <= 60;
        if (sittingPlace) {
            System.out.println("В вагоне есть сидячие места");
        } else if (passenger > 60 && passenger <= 102) {
            System.out.println("В вагоне остались только стоячие места");
        } else if (passenger > 102) {
            System.out.println("Мест в вагоне нет");
        }
        //Задача №7
        System.out.println("Задача №7");
        int one = 1;
        int two = 2;
        int three = 3;
        boolean number = one < two && two < three;
        if (number) {
            System.out.println("one меньше, чем  two, а two, меньше, чем three");
        } else {
            System.out.println("Error: условия не выполняются");
        }
    }
}




