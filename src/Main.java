public class Main {
    public static void main(String[] args) {
//Задание №1
        System.out.println(" ");
        System.out.println("Задание №1");

        int one= 72800;
        byte two= 73;
        short three= 28199;
        long four= 4294967295L;
        float five= 3.14f;
        double six= 3.14;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);

//Задание №2
        System.out.println(" ");
        System.out.println("Задание №2");

        float melon= 27.12F;
        long millions= 987678965549L;
        float watermelon= 2.786F;
        short ball= 569;
        short grade= -159;
        short grape= 27897;
        byte green= 67;
        System.out.println(melon);
        System.out.println(millions);
        System.out.println(watermelon);
        System.out.println(ball);
        System.out.println(grade);
        System.out.println(grape);
        System.out.println(green);

//Задание №3
        System.out.println(" ");
        System.out.println("Задание №3");
        byte classLyudmila= 23;
        byte classAnne= 27;
        byte classEkaterina= 30;
        short allPaper= 480;
        int students= classLyudmila + classAnne + classEkaterina;
        int paperForStudent= allPaper / students;
        System.out.println(paperForStudent);

//Задание №4
        System.out.println(" ");
        System.out.println("Задание №4");
        byte bottlesTwoMinutes= 16;
        byte minutes= 20;
        int day= 1440;
        int day3= day * 3;
        int month= day * 30;
        int bottlesOneMinutes= bottlesTwoMinutes / 2; //8 бутылок за 1 минуту
        int bottlesTwentyMinutes= bottlesOneMinutes * minutes; // количество бутылок за 20 минут
        int bottlesOneDay= bottlesOneMinutes * day; // количество бутылок за сутки
        int bottlesThreeDay= bottlesOneDay * day3; // количество бутылок за 3 дня
        int bottlesOneMonth= bottlesOneDay * month; // количество бутылок за месяц
        System.out.println("За " + minutes + " минут машина произвела " + bottlesTwentyMinutes + " бутылок" );
        System.out.println("За сутки машина произвела " + bottlesOneDay + " бутылок");
        System.out.println( "За 3 дня машина произвела " + bottlesThreeDay + " бутылок" );
        System.out.println("За месяц минут машина произвела " + bottlesOneMonth + " бутылок" );
//Задание №5
        System.out.println(" ");
        System.out.println("Задание №5");
        byte allPotPaint= 120;
        byte whitePaintOneClass= 2; // 2 банки белой краски на один класс
        byte brownPaintOneClass= 4; // 4 банки коричневой краски на один класс
        int allPotOneClass= whitePaintOneClass + brownPaintOneClass;
        int numbersOfClass= allPotPaint / allPotOneClass; // 20 классов
        int whitePaint= numbersOfClass * whitePaintOneClass;
        int brownPaint= numbersOfClass * brownPaintOneClass;
        System.out.println("В школе, где " + numbersOfClass + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");
//Задание №6
        System.out.println(" ");
        System.out.println("Задание №6");
        byte quantityBananas= 5; // количество бананов
        byte weightOneBananas= 80; // вес одного банана
        int quantityMilk= 200; // количство молока в мл
        int weightOneMilk= 105; // вес 100 мл молока
        byte quantityIceCream= 2; // 2 брикета мороженого
        byte weightOneIceCream= 100; // вес одного брикета мороженого
        byte quantityEggs= 4; // количество яиц
        byte weightOneEggs= 70; //вес одного яйца
        int weightBananas= weightOneBananas * quantityBananas; // общий вес бананов 400
        int weightMilk= (quantityMilk / 100) * weightOneMilk; // общий вес молока 210
        int weightIceCream= quantityIceCream * weightOneIceCream; // общий вес мороженого
        int weightEggs= quantityEggs * weightOneEggs; // общий вес яиц
        float weightBreakfast= weightBananas + weightMilk + weightIceCream + weightEggs; //общий вес завтрака 1090 грамм
        System.out.println("Общий вес завтрака " +  weightBreakfast + " грамм");
        weightBreakfast= weightBreakfast / 1000;
        System.out.println("Общий вес завтрака " +  weightBreakfast + " килограмм");
//Задание №7
        System.out.println(" ");
        System.out.println("Задание №7");
        int weight1= 250; // 250 грамм в день
        int weight2= 500; // 500 грамм в день
        int needWeight= 7; // 7 килограмм нужно сбросить
        int needDay1= (needWeight * 1000) / weight1;
        int needDay2= (needWeight * 1000) / weight2;
        System.out.println("При потери веса " + weight1 + " грамм за день, то понадобиться " + needDay1 + " дней");
        System.out.println("При потери веса " + weight2 + " грамм за день, то понадобиться " + needDay2 + " дней");
//Задание №8
        System.out.println(" ");
        System.out.println("Задание №8");
        int pay1Masha= 67760; // зарпала до повышения
        int pay1Denis= 83690; // зарпала до повышения
        int pay1Kristina= 76230; // зарпала до повышения
        double pay2Masha= pay1Masha * 0.1 + pay1Masha; // зарплата после повышения
        double pay2Denis= pay1Denis * 0.1 + pay1Denis; // зарплата после повышения
        double pay2Kristina= pay1Kristina * 0.1 + pay1Kristina; // зарпалат после повышения
        int years1Masha= pay1Masha * 12; // годовая зарпла до повышения
        int years1Denis= pay1Denis *12; // годовая зарпла до повышения
        int years1Kristina= pay1Kristina *12; // годовая зарпла до повышения
        double years2Masha= pay2Masha * 12; // годовая зарплата после повышения
        double years2Denis= pay2Denis * 12; // годовая зарплата после повышения
        double years2Kristina= pay2Kristina * 12; // годовая зарплата после повышения
        double diffMasha= years2Masha - years1Masha; // разница годового дохода после повышения
        double diffDenis= years2Denis - years1Denis; // разница годового дохода после повышения
        double diffKristina= years2Kristina - years1Kristina; // разница годового дохода после повышения
        System.out.println("Маша теперь получает " + pay2Masha + " рублей. Годовой доход вырос на " + diffMasha + " рублей");
        System.out.println("Денис теперь получает " + pay2Denis + " рублей. Годовой доход вырос на " + diffDenis + " рублей");
        System.out.println("Кристина теперь получает " + pay2Kristina + " рублей. Годовой доход вырос на " + diffKristina + " рублей");
    }
}