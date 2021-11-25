package Main;

public class Main {


        public static void main (String[]args){

        int a1 = 0;                                             //для первого задания
        int b1 = 10;
        boolean c1 = firstTask(a1, b1);
        System.out.println("Первое задание: ");
        System.out.println(c1);

        int a2 = 12;                                           //для второго задания
        secondTask(a2);

        int a3 = 5;                                            //для третьего задания
        boolean bool = thirdTask(a3);
        System.out.println("Третье задание: ");
        System.out.println(bool);

        String a4 = "Привет, друг!";                           //для четвертого задания
        int b4 = 5;
        System.out.println("Четвертое задание: ");
        fourthTask(a4, b4);

        int a5 = 2012;
        System.out.println("Пятое задание: ");                 //для пятого задания
        System.out.println(fifthTask(a5));

    }


        public static boolean firstTask ( int a, int b){       //метод для первого задания
        boolean answer = false;
        if ((a + b) >= 10 && (a + b) <= 20) {
            answer = true;
        }
        return answer;
    }

        public static void secondTask(int a){                 //метод для второго задания
            System.out.println("Второе задание: ");
            if (a >=0){
                System.out.println("Число положительное");
            } else
                System.out.println("Число отрицательное");
    }

        public static boolean thirdTask(int a){               //метод для третьего задания
            boolean answer;
            if (a>=0)
                answer = false;
            else answer = true;
            return answer;
        }

        public static void fourthTask(String a, int b) {      //метод для четвертого задания
            for (int i=0; i<b; i++)
                System.out.println(a);
        }

        public static boolean fifthTask(int a){               //метод для пятого задания
            boolean bool=false;
            if (a%4==0)
                bool=true;
            if(a%100==0)
                bool=false;
            if(a%400==0)
                bool=true;
            return bool;
    }


}