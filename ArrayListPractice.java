//ArrayListPractice.java
// Akhmatkulov Islam ID:250104026

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class ArrayListPractice {

    public static void main(String[] args) {

        // 1. Merge Unique Elements
        ArrayList<String> books1 = new ArrayList<>(Arrays.asList("Broken sword", "White nights", "War & peace"));
        ArrayList<String> books2 = new ArrayList<>(Arrays.asList("White nights", "Jamilya", "Oppenheimer"));
        ArrayList<String> mergedBooks = new ArrayList<>(books1);
        mergedBooks.addAll(books2);
        LinkedHashSet<String> uniqueBooks = new LinkedHashSet<>(mergedBooks);
        System.out.println("Merged Unique Books: " + uniqueBooks);

        // 2. Find Maximum Element
        ArrayList<String> Movie = new ArrayList<>(Arrays.asList("Titanic", "Avatar", "The Lord of the Rings"));
        String longestMovie = "";
        for (String movie : Movie) {
            if (movie.length() > longestMovie.length()) {
                longestMovie = movie;
            }
        }
        System.out.println("Longest Movie: " + longestMovie);

        // 3. Count Occurrences
        ArrayList<String> foods = new ArrayList<>(Arrays.asList("Pizza", "Burger", "Pizza", "Sushi", "Pizza"));
        int countPizza = Collections.frequency(foods, "Pizza");
        System.out.println("Pizza occurs: " + countPizza + " times");

        // 4. Remove All Matching Elements
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Banana"));
        fruits.removeIf(fruit -> fruit.equals("Banana"));
        System.out.println("Fruits after removing Banana: " + fruits);

        // 5. Replace All Elements
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Green"));
        Collections.fill(colors, "Black");
        System.out.println("Colors replaced: " + colors);

        // 6. Check Sublist Presence
        ArrayList<String> sports = new ArrayList<>(Arrays.asList("Football", "Basketball", "Tennis"));
        ArrayList<String> subSports = new ArrayList<>(Arrays.asList("Football", "Tennis"));
        boolean containsSublist = sports.containsAll(subSports);
        System.out.println("Sports contains sublist: " + containsSublist);

        // 7. Find Index of Element
        ArrayList<String> flowers = new ArrayList<>(Arrays.asList("Rose", "Tulip", "Rose", "Lily"));
        int firstIndex = flowers.indexOf("Rose");
        int lastIndex = flowers.lastIndexOf("Rose");
        System.out.println("First index of Rose: " + firstIndex + ", Last index of Rose: " + lastIndex);

        // 8. Remove Duplicates
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("Cat", "Dog", "Cat", "Elephant"));
        ArrayList<String> uniqueAnimals = new ArrayList<>(new LinkedHashSet<>(animals));
        System.out.println("Unique animals: " + uniqueAnimals);

        // 9. Convert ArrayList to Array
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Paris", "London", "Tokyo"));
        String[] citiesArray = cities.toArray(new String[0]);
        System.out.println("Cities Array: " + Arrays.toString(citiesArray));

        // 10. Convert Array to ArrayList
        Integer[] numbersArray = {1, 2, 3, 4, 5};
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(numbersArray));
        System.out.println("Numbers ArrayList: " + numbersList);

        // 11. Find Common Elements
        ArrayList<String> countries1 = new ArrayList<>(Arrays.asList("USA", "Canada", "Mexico"));
        ArrayList<String> countries2 = new ArrayList<>(Arrays.asList("Brazil", "Canada", "USA"));
        ArrayList<String> commonCountries = new ArrayList<>(countries1);
        commonCountries.retainAll(countries2);
        System.out.println("Common countries: " + commonCountries);

        // 12. Remove Even-Length Strings
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Emir", "Dariya", "Arsen", "Daud"));
        names.removeIf(name -> name.length() % 2 == 0);
        System.out.println("Names with odd length: " + names);

        // 13. Find Smallest Element
        ArrayList<String> songs = new ArrayList<>(Arrays.asList("Hello", "Hey", "Goodbye"));
        String shortestSong = songs.get(0);
        for (String song : songs) {
            if (song.length() < shortestSong.length()) {
                shortestSong = song;
            }
        }
        System.out.println("Shortest song: " + shortestSong);

        // 14. Replace All Vowels
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Hello", "World", "Java"));
        ArrayList<String> replacedVowels = new ArrayList<>();
        for (String word : words) {
            replacedVowels.add(word.replaceAll("[AEIOUaeiou]", "*"));
        }
        System.out.println("Words with vowels replaced: " + replacedVowels);

        // 15. Partition ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int n : numbers) {
            if (n % 2 == 0) even.add(n);
            else odd.add(n);
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

        // 16. Rotate Elements
        ArrayList<String> days = new ArrayList<>(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri"));
        Collections.rotate(days, 2);
        System.out.println("Rotated days: " + days);

        // 17. Remove Null Values
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Alice", null, "Bob", null, "Charlie"));
        students.removeIf(s -> s == null);
        System.out.println("Students without nulls: " + students);

        // 18. Find Second Largest Element
        ArrayList<String> movies = new ArrayList<>(Arrays.asList("Titanic", "Avatar", "The Lord of the Rings"));
        String largest = "", secondLargest = "";
        for (String m : movies) {
            if (m.length() > largest.length()) {
                secondLargest = largest;
                largest = m;
            } else if (m.length() > secondLargest.length() && m.length() != largest.length()) {
                secondLargest = m;
            }
        }
        System.out.println("Second longest movie: " + secondLargest);

        // 19. Replace Elements with Lengths
        fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        ArrayList<Integer> fruitLengths = new ArrayList<>();
        for (String fruit : fruits) {
            fruitLengths.add(fruit.length());
        }
        System.out.println("Fruit lengths: " + fruitLengths);

        // 20. Create Nested ArrayList
        ArrayList<ArrayList<String>> departments = new ArrayList<>();
        ArrayList<String> sales = new ArrayList<>(Arrays.asList("Azamat", "Eren"));
        ArrayList<String> hr = new ArrayList<>(Arrays.asList("Akim", "Bekzat"));
        departments.add(sales);
        departments.add(hr);
        System.out.println("Departments: " + departments);
    }
}
