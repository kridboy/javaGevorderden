package com.keisse.gevorderd.hoofdstuk17.opdracht4;

import com.keisse.gevorderd.hoofdstuk17.opdracht3Lambdas.streamsIntro.Person;
import com.keisse.gevorderd.hoofdstuk17.opdracht3Lambdas.streamsIntro.SexEnum;

import java.util.*;

public class CollectionsDemo {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Scanner kb = new Scanner(System.in);
    Random random = new Random();

    public static void main(String[] args) {
        CollectionsDemo demo = new CollectionsDemo();

        //demo.oef1();
        //demo.oef2();
        //demo.oef3();
        //demo.oef4();
        //demo.oef5();
        //demo.oef6();
        //demo.oef7();
        //demo.oef8();
        //demo.oef10();
        //demo.oef11();
        demo.oef12();

    }

    public void oef1() {
        numbers.forEach(System.out::println);
        System.out.println(
                numbers.stream()
                        .reduce(0, Integer::sum)
        );

        int median = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(median / numbers.size() - 1);


        System.out.print("\n====\tList van String(Builder)\t=====\n");
        System.out.print("geef begin van woorden: ");

        StringBuilder builder = new StringBuilder(kb.next());
        List<StringBuilder> list = new ArrayList<>();
        list.add(builder);

        while (list.get(list.size() - 1).lastIndexOf(".") != list.get(list.size() - 1).length() - 1)
            list.add(new StringBuilder(kb.next()));
        for (int i = 0; i < list.size(); i++) System.out.println(list.get(list.size() - 1 - i));

        System.out.printf("de lijst is: %d woorden groot\n", list.size());

        for (StringBuilder e : list) System.out.println(e);

    }

    public void oef2() {
        Set<Integer> numberList = new HashSet<>();
        Set<StringBuilder> wordList = new HashSet<>();
        Set<Person> people = new HashSet<>();

        numberList.add(random.nextInt(100));
        numberList.add(random.nextInt(100));
        numberList.add(random.nextInt(100));
        numberList.add(random.nextInt(100));
        numberList.add(random.nextInt(100));
        numberList.add(random.nextInt(100));

        numberList.forEach(System.out::println);

        Iterator<StringBuilder> iterator = wordList.iterator();
        System.out.print("geef woorden: ");
        String word = kb.next();
        while (!word.contains(".")) {
            word = kb.next();
            wordList.add(new StringBuilder(word));
        }

        //unieke elementen!
        numberList = new HashSet<>();

        while (numberList.size() < 7) {
            numberList.add(kb.nextInt());
        }
        numberList.forEach(System.out::println);

        numberList = new HashSet<>();
        Set<Integer> winningNumbers = new HashSet<>();

        while (winningNumbers.size() < 7) {
            winningNumbers.add(random.nextInt(10));
            numberList.add(random.nextInt(10));
        }

        System.out.print("\n====\twinnende nrs\t=====\n");
        numberList.retainAll(winningNumbers);
        numberList.forEach(System.out::println);

        System.out.print("\n====\tPeoplekes\t=====\n");
        Person p = new Person(SexEnum.MAN, 25, 50, 180, "Michiel", "Vanvyve");
        while (people.size() < 5) people.add(new Person());
        people.add(p);
        people.add(p);

        people.forEach(System.out::println);
    }

    public void oef3() {
        Set<Integer> numberList = new LinkedHashSet<>();
        Set<Integer> winningNumbers = new LinkedHashSet<>();

        while (winningNumbers.size() < 7) {
            winningNumbers.add(random.nextInt(10));
            numberList.add(random.nextInt(10));
        }

        System.out.print("\n====\twinnende nrs\t=====\n");
        numberList.retainAll(winningNumbers);
        numberList.forEach(System.out::println);
    }

    public void oef4() {
        Set<StringBuilder> strTree = new TreeSet<>();

        System.out.print("\n====\tTreeSet van String(Builder)\t=====\n");
        System.out.println("geef 5 woorden: ");
        while (strTree.size() < 5) strTree.add(new StringBuilder(kb.next()));
        strTree.forEach(System.out::println);

        Iterator<StringBuilder> iterator = strTree.iterator();
        StringBuilder x = iterator.next();
        System.out.println(x);
        while (iterator.hasNext()) x = iterator.next();
        System.out.println(x);

    }

    public void oef5() {
        Queue<BurgerOrder> burgerOrders = new LinkedList<>();
        burgerOrders.offer(new BurgerOrder("gert"));
        burgerOrders.offer(new BurgerOrder("samson"));
        burgerOrders.offer(new BurgerOrder("David Copperfield"));
        burgerOrders.offer(new BurgerOrder("De boeman"));

        System.out.print("\n=========QUEUES========\n");
        BurgerOrder order = burgerOrders.peek();
        while (order != null) {
            System.out.println("about to handle: " + order.getName());
            order = burgerOrders.poll();
            System.out.println("Handling: " + order.getName());
            order = burgerOrders.peek();
        }
        System.out.println("All Handled");
    }

    public void oef6() {
        Deque<Person> people = new ArrayDeque<>();
        people.offerFirst(new Person(SexEnum.MAN));
        people.offerFirst(new Person(SexEnum.MAN));
        people.offerFirst(new Person(SexEnum.MAN));

        people.offerLast(new Person(SexEnum.VROUW));
        people.offerLast(new Person(SexEnum.VROUW));
        people.offerLast(new Person(SexEnum.VROUW));

        List<String> couples = new ArrayList<String>();
        Person nextMan = people.pollFirst();
        Person nextVrouw = people.pollLast();
        while (nextMan != null) {
            System.out.println(nextMan.toString() + "<--->" + nextVrouw.toString());
            nextMan = people.pollFirst();
            nextVrouw = people.pollLast();
        }
    }

    public void oef7() {
        Set<Person> people = new TreeSet<>(new AgeComperator());
        Set<Person> otherpeople = new TreeSet<>(Person::compareTo);

        System.out.print("\n====\tPeoplekes\t=====\n");
        Person p = new Person(SexEnum.MAN, 25, 50, 180, "Michiel", "Vanvyve");
        while (people.size() < 5) people.add(new Person());
        people.add(p);
        people.add(p);

        //people.stream().forEach(otherpeople::add);
        otherpeople.addAll(people);

        people.forEach(System.out::println);
        System.out.println("------------");
        otherpeople.forEach(System.out::println);

    }

    public void oef8() {
        List<Person> people = new ArrayList<>();
        Set<Person> sortedPeople = new TreeSet<>(Person::compareTo);

        System.out.print("\n====\tPeoplekes\t=====\n");
        Person p = new Person(SexEnum.MAN, 25, 50, 180, "Michiel", "Vanvyve");
        while (people.size() < 5) people.add(new Person());
        people.add(p);
        people.add(p);

        people.sort(new AgeComperator());
        sortedPeople.addAll(people);

        sortedPeople.forEach(System.out::println);
    }

    public void oef10() {
        List<Person> people = new ArrayList<>();

        System.out.print("\n====\tPeoplekes\t=====\n");
        Person p = new Person(SexEnum.MAN, 25, 50, 180, "Michiel", "Vanvyve");
        while (people.size() < 5) people.add(new Person());
        people.add(p);
        people.add(p);

        people.stream()
                .filter(e -> e.getGeslacht() == SexEnum.MAN && e.getAge() > 20)
                .sorted(new AgeComperator())
                .forEach(System.out::println);
    }

    public void oef11() {
        Map<Coin, Integer> wallet = new LinkedHashMap<>();
        wallet.put(Coin.ONE_CENT, 5);
        wallet.put(Coin.ONE_EURO, 5);
        wallet.put(Coin.FIVE_CENT, 10);

        wallet.forEach(((coin, integer) -> System.out.printf("%s: %s stuks\n", coin, integer)));
        Iterator<Map.Entry<Coin, Integer>> walletIterator = wallet.entrySet().iterator();

        Double total = 0d;
        //walletIterator.forEachRemaining();

        while (walletIterator.hasNext()) {
            Map.Entry<Coin,Integer> entry = walletIterator.next();
            total+=entry.getKey().getValue() * entry.getValue();
        }
        System.out.printf("Totaal: %.2f€",total);
    }

    public void oef12(){
        SortedMap<String,Person> people = new TreeMap<>();
        people.put("domme gast",new Person());
        people.put("domme wijf",new Person());
        people.put("domme kut",new Person());
        people.put("domme domme gast",new Person());

        for (Map.Entry<String, Person> entry : people.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
        }
    }
}

