import Abstraction.Employee;
import Abstraction.Salary;
import AccessModifiers.Dog;
import Enums.Mobile;
import FileClass.FileDemo;
import Generics.Box;
import Interface.MammalInt;
import Multithreading.RunnableDemo;
import Networking.URLConnectionDemo;
import Networking.URLDemo;
import Overloading.Calculator;
import Serialize.EmployeeS;
import Singleton.ClassicSingleton;
import aggrgation.Speed;
import aggrgation.Van;
import encapsulation.EncapTest;
import polymorph.Animal;
import polymorph.Deer;
import polymorph.Vegetarian;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static CollectionInterFace.StackDemo.showpop;
import static CollectionInterFace.StackDemo.showpush;
import static Generics.GenericMethodTest.printArray;
import static Generics.MaximumTest.maximum;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) throws IOException {
// ------------- Serialize --------------------------
//        EmployeeS e = new EmployeeS();
//        e.name = "Reyan Ali";
//        e.address = "Phokka Kuan, Ambehta Peer";
//        e.SSN = 11122333;
//        e.number = 101;
//
//        try {
//            FileOutputStream fileOut = new FileOutputStream("employee.ser");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            out.writeObject(e);
//            out.close();
//            fileOut.close();
//            System.out.printf("Serialized data is saved in /tmp/employee.ser");
//        } catch (IOException i) {
//            i.printStackTrace();
//        }
//
//        System.out.println("\n\n");
//
//
//
//        //----------- DeSerialize
//        Employee e = null;
//        try {
//            FileInputStream fileIn = new FileInputStream("employee.ser");
//            ObjectInputStream in = new ObjectInputStream(fileIn);
//            e = (Employee) in.readObject();
//            in.close();
//            fileIn.close();
//        } catch (IOException i) {
//            i.printStackTrace();
//            return;
//        } catch (ClassNotFoundException c) {
//            System.out.println("Employee class not found");
//            c.printStackTrace();
//            return;
//        }
//
//        System.out.println("Deserialized Employee...");
//        System.out.println("Name: " + e.getName());
//        System.out.println("Address: " + e.getAddress());
//        //System.out.println("SSN: " + e.SSN);
//        System.out.println("Number: " + e.getNumber());
//    }

// ------------- RegexMatcher --------------------------

        // String to be scanned to find the pattern.
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
        }else {
            System.out.println("NO MATCH");
        }
// -------------- Iterators ----------------------
        // Create an array list
        List<String> al = new ArrayList<>();

        // add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // Use iterator to display contents of al
        System.out.print("Original contents of al: ");
        Iterator itr = al.iterator();

        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

// -------------- Dictionary /Enum/HashTable ----------------------
        // create a new hashtable
        Dictionary<Integer, Integer> dictionary = new Hashtable<>();

        // add 2 elements
        dictionary.put(1, 1);
        dictionary.put(2, 2);

        Enumeration<Integer> enumeration = dictionary.keys();

        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement() + "\n");
        }




// -------------- Stacks ----------------------
//        Stack st = new Stack();
//        System.out.println("stack: " + st);
//        showpush(st, 42);
//        showpush(st, 66);
//        showpush(st, 99);
//        showpop(st);
//        showpop(st);
//        showpop(st);
//        try {
//            showpop(st);
//        } catch (EmptyStackException e) {
//            System.out.println("empty stack \n\n");
//        }


// ---------------- Sorted Map Interface ---------------

        // Create a hash map
        SortedMap<String, Double> map = new TreeMap<>();

        // Put elements to the map
        map.put("Zara", Double.valueOf(3434.34));
        map.put("Mahnaz", Double.valueOf(123.22));
        map.put("Ayan", Double.valueOf(1378.00));
        map.put("Daisy", Double.valueOf(99.22));
        map.put("Qadir", Double.valueOf(-19.08));

        // Get a set of the entries
        Set<Map.Entry<String, Double>> set = map.entrySet();

        // Get an iterator
        Iterator<Map.Entry<String, Double>> i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry<String, Double> me = i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println("End of Sorted Map Interface \n\n");


// ---------------- Queue Interface ---------------
        Queue<Integer> q = new LinkedList<>();
        q.add(6);
        q.add(1);
        q.add(8);
        q.add(4);
        q.add(7);
        System.out.println("The queue is: " + q);
        int num1 = q.remove();
        System.out.println("The element deleted from the head is: " + num1);
        System.out.println("The queue after deletion is: " + q);
        int head = q.peek();
        System.out.println("The head of the queue is: " + head);
        int size = q.size();
        System.out.println("The size of the queue is: " + size);

// ---------------- Collection Interface ---------------
        List a1 = new ArrayList();
        a1.add("Zara");
        a1.add("Mahnaz");
        a1.add("Ayan");
        System.out.println(" ArrayList Elements");
        System.out.print("\t" + a1);

        // LinkedList
        List l1 = new LinkedList();
        l1.add("Zara");
        l1.add("Mahnaz");
        l1.add("Ayan");
        System.out.println();
        System.out.println(" LinkedList Elements");
        System.out.print("\t" + l1);

        // HashSet
        Set s1 = new HashSet();
        s1.add("Zara");
        s1.add("Mahnaz");
        s1.add("Ayan");
        System.out.println();
        System.out.println(" Set Elements");
        System.out.print("\t" + s1);

        // HashMap
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);



// ----------------Generics Class ---------------
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        //integerBox.add(new Integer(10)); /// Deprecated
        integerBox.add(Integer.valueOf(20));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
// ----------------Generics Method ---------------

        System.out.printf("Max of %d, %d and %d is %d\n\n",
                3, 4, 5, maximum( 3, 4, 5 ));

        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
                6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));

        System.out.printf("Max of %s, %s and %s is %s\n","pear",
                "apple", "orange", maximum("pear", "apple", "orange"));
// ----------------Generics Method ---------------
// Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        printArray(intArray);   // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);   // pass a Double array

        System.out.println("\nArray characterArray contains:");
        printArray(charArray);   // pass a Character array

// ----------------Networking - URL HTTP Processing Connection HTML Content output ---------------
//        URLConnectionDemo urlConnectionDemo = new URLConnectionDemo();
//        urlConnectionDemo.URLConnectionD();


// ----------------Networking - URL Processing -------------------
//        URLDemo urlDemo = new URLDemo();
//        urlDemo.demo();


 //-------------- Multi Threading Runable------------
        //RunnableDemo R1 = new RunnableDemo( "Thread-1");
        //R1.start();

//        RunnableDemo R2 = new RunnableDemo( "Thread-2");
//        R2.start();

// --------------- File Reader ---------------

//        try(FileReader fr = new FileReader("/Users/HCRP/development/spring-refresh/rest-consumer/BasicJavaPractice/src/FileClass/fileReader.txt")) {
//            char [] a = new char[50];
//            fr.read(a);   // reads the contentto the array
//            for(char c : a)
//                System.out.print(c);   // prints the characters one by one
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


// --------------- Streams ---------------
//        FileDemo fileDemo = new FileDemo();
//        fileDemo.Streams();



// --------------- CopyFile ---------------
//        FileInputStream in = null;
//        FileOutputStream out = null;
//
//        try {
//            in = new FileInputStream("/Users/HCRP/development/spring-refresh/rest-consumer/BasicJavaPractice/src/FileClass/input.txt");
//            out = new FileOutputStream("/Users/HCRP/development/spring-refresh/rest-consumer/BasicJavaPractice/src/FileClass/output.txt");
//
//            int c;
//            while ((c = in.read()) != -1) {
//                out.write(c);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (in != null) {
//                in.close();
//            }
//            if (out != null) {
//                out.close();
//            }
//        }

// --------------- Files ---------------

//        FileDemo fileDemo2 = new FileDemo();
//        fileDemo2.Demo();

// --------------- java.lang.Math ---------------
// get two double numbers
//        double x = 60984.1;
//        double y = -497.99;
//
//        // get the natural logarithm for x
//        System.out.println("Math.log(" + x + ")=" + Math.log(x));
//
//        // get the natural logarithm for y
//        System.out.println("Math.log(" + y + ")=" + Math.log(y));
//
//        // get the max value
//        System.out.println("Math.max(" + x + ", y" + ")=" + Math.max(x,y));
//
//        // get the min value
//        System.out.println("Math.min(" + x + ", y" + ")=" + Math.min(x,y));

// --------------- Booleans ---------------
//        // create 2 Boolean objects b1, b2
//        Boolean b1, b2;
//
//        // assign values to b1, b2
//        b1 = Boolean.valueOf(true);
//        b2 = Boolean.valueOf(false);
//
//        // create an int res
//        int res;
//
//        // compare b1 with b2
//        res = b1.compareTo(b2);
//
//        String str1 = "Both values are equal ";
//        String str2 = "Object value is true";
//        String str3 = "Argument value is true";
//        if( res == 0 ) {
//            System.out.println( str1 );
//        } else if( res > 0 ) {
//            System.out.println( str2 );
//        } else if( res < 0 ) {
//            System.out.println( str3 );
//        }

// --------------- Enums ---------------
//        //print an Enum
//        System.out.println(Mobile.Motorola);
//
//        Mobile mobile = Mobile.Samsung;
//        //Usage in IF statement
//        if(mobile == Mobile.Samsung) {
//            System.out.println("Matched");
//        }
//        //Usage in Switch statement
//        switch (mobile) {
//            case Samsung -> System.out.println("Samsung");
//            case Nokia -> System.out.println("Nokia");
//            case Motorola -> System.out.println("Motorola");
//        }
//

// --------------- Wrapper Classes / Boxing, Unboxing ---------------
        /* All the wrapper classes (Integer, Long, Byte, Double, Float, Short)
        are subclasses of the abstract class Number.
        */
//        Integer x = 5; // boxes int to an Integer object
//        x =  x + 10;   // unboxes the Integer to a int
//        System.out.println(x);

// ---------------Singleton------------------------------------------------
//        ClassicSingleton tmp = ClassicSingleton.getInstance( );
//        tmp.demoMethod( );

//----------------InterFace-------------------------------------------------
//        MammalInt m = new MammalInt();
//        m.eat();
//        m.travel();
//-------------------Encapsulation----------------------------------------------
//        EncapTest encap = new EncapTest();
//        encap.setName("James");
//        encap.setAge(20);
//        encap.setIdNum("12343ms");
//
//        System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());

//-----------------------------------------------------------------
//        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
//        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
//        System.out.println("Call mailCheck using Salary reference --");
//        s.mailCheck();
//        System.out.println("\n Call mailCheck using Employee reference--");
//        e.mailCheck();
//-----------------------------------------------------------------
//        int result = Calculator.add(1,2);
//        System.out.println(result);// returns 3;
//        result = Calculator.add(1,2,3);
//        System.out.println(result);
//
//        Deer d = new Deer();
//        Animal a = d;
//        Vegetarian v = d;
//        Object o = d;
//
//        System.out.println(d instanceof Deer);
//        System.out.println(a instanceof Deer);
//        System.out.println(v instanceof Deer);
//        System.out.println(o instanceof Deer);
//
//        Speed speed = new Speed();
//        speed.setMax(120);
//        Van van = new Van();
//
//        van.setVin("abcd1233");
//        van.setSpeed(speed);
//        van.print();
//
//
//        Dog dog = new Dog();
//        dog.setAge(4);
//        System.out.println("Age is " + dog.getAge());
//        dog.setBreed("BullDog");
//
//        System.out.println("Bread = " + dog.getBreed() );
//        MyClass myClass = new MyClass(10);
//        MyClass myClass2 = new MyClass(20);
//        myClass.setX(30);
//        System.out.println(myClass.getX() + " " + myClass2.getX());

        //int a = 20, b = 10;
        //Sub subClassDemo = new Sub();
        //subClassDemo.addition(a,b);
        //subClassDemo.Subtraction(a,b);
        //subClassDemo.multiplication(a,b);
//        System.out.println("--OOP AccessModifiers.Dog --");
//        AccessModifiers.Dog dog1 = new AccessModifiers.Dog("Lab",4, "Red");
//        //System.out.println(dog1.breed.toString());
//        dog1.barking();
//        System.out.println("--OOP AccessModifiers.Dog End --\n");
//
//
//        NumberPrinter numberPrinter = new NumberPrinter();
//        /// NumberList
//        System.out.println("--Numbers List as String--");
//        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
//        String numbersString = numberPrinter.printNumbersListAsString(numbers);
//        System.out.println(numbersString);
//        System.out.println("--Numbers List as String End --\n");
//
//
//
//
//
//
//        /// TertiaryNumbers a and B functions
//        System.out.println("--TertiaryNumbers a and B functions --");
//        int numbersTeriA = numberPrinter.printNumbersTeriA(10);
//        int numbersTeriB = numberPrinter.printNumbersTeriB(10);
//        System.out.println("numbersTeri A = "+numbersTeriA);
//        System.out.println("numbersTeri B = "+numbersTeriB);
//        System.out.println("--TertiaryNumbers a and B functions end --\n");
//
//        /// min Function method
//        System.out.println("--min Function Method --");
//        int minFunctionResult = numberPrinter.minFunction(10,2);
//        System.out.println(minFunctionResult);
//        System.out.println("--min Function Method End --\n");


//        List<String> strings = Arrays.asList("one", "two", "Three", "Four");
//        numFunction(numbers);


//        for (String s : strings) {
//            System.out.print(s);
//            System.out.print(",");
//        }

//        int result = minFunction(10,2);
//        System.out.println("Result = " + result);
    }

}
