public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19.0;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var oneWeight = 78.2;
        var secondWeight = 82.7;
        var totalWeight = oneWeight + secondWeight;
        System.out.println("Общий вес " + totalWeight + " кг!");
        var differenceBetweenWeights = secondWeight - oneWeight;
        System.out.println("Разница между весами " + differenceBetweenWeights +" кг!");

        var differenceWeight = secondWeight - oneWeight;
        System.out.println("Разница веса " + differenceWeight + " кг!");
        var Weight = (secondWeight / oneWeight) % totalWeight;
        System.out.println("Остаток от деления " + Weight + " кг!");

        var openHours = 640;
        var employeeHours = 8;
        var totalEmployee = openHours / employeeHours;
        System.out.println("Всего работников в компании " + totalEmployee + " человек");
        var moreEmployee = 94;
        var openingHours = moreEmployee + totalEmployee;
        System.out.println("В компании работает " + openingHours + " человек");
        var allHours = openingHours * employeeHours;
        System.out.println("Если в компании работает " + openingHours + " человек, то всего " + allHours + " часов работы может быть поделено между сотрудниками");















    }
}