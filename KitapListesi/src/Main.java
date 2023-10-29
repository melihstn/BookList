import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("aşkı memnu",448,"Halid Ziya",1900));
        books.add(new Book("ateşten gömlek",224,"Halide Edip",1924));
        books.add(new Book("İnce Memed",436,"Yaşar Kemal",1955));
        books.add(new Book("Kürk Mantolu Madonna",160,"Sabahattin Ali",1943));
        books.add(new Book("Kuyucanlı Yusuf",222,"Sabahattin Ali",1945));
        books.add(new Book("Bir Apaçi Masalı",385,"Angutyus",2003));
        books.add(new Book("Gün Olur Asra Bedel",402,"Cengiz Aytmatov",2000));
        books.add(new Book("Şeker portakalı",227,"Jose Mauro De Vasconcelos",1979));
        books.add(new Book("Uçurtma Avcısı",505,"Khaled Hosseini",2001));
        books.add(new Book("Beyoğlunun En Delikanlı Abisi",478,"Ahmet Ümit",2015));

        Map<String,String> bookMap = new HashMap<>();
        books.stream().forEach(i -> bookMap.put(i.getBookName(),i.getWriter()));

        for(String i : bookMap.keySet()){
            System.out.println(i + " - " + bookMap.get(i));
        }

        System.out.println("---------------------------------------------");

        List<Book> bookFilter = books.stream().filter(i -> i.getPageNumber() > 100).collect(Collectors.toList());


        System.out.println("100 sayfa sayısından fazla olan kitaplar : ");
        bookFilter.forEach(i -> System.out.println(i.getBookName()));







    }
}