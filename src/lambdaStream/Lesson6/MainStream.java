package lambdaStream.Lesson6;

import string.MainStringDemoMethods;

import java.util.*;

public class MainStream {

    public static void main(String[] args) {
        Random random = new Random();
        List<Users> users = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            users.add(new Users(i,
                    i * random.nextInt(1000),
                    "user-" + i,
                    /*17 + */random.nextInt(80),
                    random.nextInt(10) % 2 == 1 ? Sex.FEMALE : Sex.MALE));
        }

//        получить средний возраст для мужчин
        List<Users> male = new ArrayList<>();
        double sum = 0;
        for (Users u : users) {
            if (u.getSex().equals(Sex.MALE)) {
                male.add(u);
                sum += u.getAge();
            }
        }
        System.out.println(
                sum / male.size()
        );

        System.out.println(
                users.stream()
                .filter(u -> u.getSex().equals(Sex.MALE))
                .mapToInt(Users::getAge)
                .average()
                .orElse(0)
        );





//  выбрать всех работоспособных людей (учитывая пол и возраст для работы)
//  вернуть количество
/*
        int count = 0;
        for (Users employee : users) {
            if (employee.getSex().equals(Sex.FEMALE) && employee.getAge() >= 18 && employee.getAge() < 60 ||
                    employee.getSex().equals(Sex.MALE) && employee.getAge() >= 18 && employee.getAge() < 65)
                count++;
        }
        System.out.println("всех работоспособных людей = " + count);

        System.out.println(
                users.stream()
                .filter(e -> e.getSex().equals(Sex.FEMALE) && e.getAge() >= 18 && e.getAge() < 60 ||
                        e.getSex().equals(Sex.MALE) && e.getAge() >= 18 && e.getAge() < 65 ).count()

        );

*/


//        получить 5й элемент коллекции или null
/*
        if (users.size() > 5) {
            System.out.println(users.get(5));
        } else {
            System.out.println("null");
        }


        System.out.println(
                users.stream().skip(5).findFirst().orElse(null)
        );
*/



//        проверить всем ли больше 18
  /*      boolean correct = true;
        for (Users user : users) {
            if (user.getAge() < 18) {
                correct = false;
                break;
            }
        }
        System.out.println(correct);

        System.out.println(
                users.stream().allMatch(u -> u.getAge() >= 18)
        );
        */


    }

}
