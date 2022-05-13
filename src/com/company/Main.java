package com.company;

public class Main {

    public static void main(String[] args) {

/** Animal деген класс тузунуз жана бир метод кошунуз.
 Анын 3 наследнигин тузунуз.
 Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
 Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин
 кошунуз.
 instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
 чыгарыныз.
 Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды
 болуп оз озунун массивине салыныз */

        Animal shark = new Shark();
        Animal eagle = new Eagle();
        Animal turtle = new Turtle();

        Animal[] animals = {turtle, eagle, shark};

        for (Animal s : animals) {
            if (s instanceof Shark) {
                ((Shark) s).attack();
            }
            if (s.getClass().getName().equals("work: Shark")) {
                ((Shark) s).attack();
            }

            if (s instanceof Turtle) {
                ((Turtle) s).swim();
            }
            if (s.getClass().getName().equals("work: Turtle")) {
                ((Turtle) s).swim();
            }
            if (s instanceof Eagle) {
                ((Eagle) s).fly();
            }
            if (s.getClass().getName().equals("work: Eagle")) {
                ((Eagle) s).fly();
            }
            System.out.println();
        }
        Animal[] reptile = {turtle};
        Animal[] fish = {shark};
        Animal[] bird = {eagle};
    }
}
