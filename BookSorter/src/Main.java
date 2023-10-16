import java.util.Comparator;
import java.util.TreeSet;

public class Main
{
    public static void main(String[] args)
    {

        int a=0;
        TreeSet<Book> books1 = new TreeSet<>();
        books1.add(new Book("VV","yazar2",222,2333));
        books1.add(new Book("CC","yazar1",111,1222));
        books1.add(new Book("GG","yazar3",333,3444));
        books1.add(new Book("AA","yazar4",444,4555));
        books1.add(new Book("NN","yazar5",555,5666));

        System.out.println("Kitap ismine göre;");
        for(Book b : books1)
        {
            a++;
            System.out.println(a +"-"+ b.getName() );
        }

        System.out.println("Sayfa sayısına göre;");

        TreeSet<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getNumberOfPage()- o2.getNumberOfPage();
            }
        });

        books2.addAll(books1);

        for (Book b2: books2)
        {
            System.out.println("Kitap ismi: " + b2.getName() + " - " + " Sayfa sayisi : " + b2.getNumberOfPage());
        }

    }
}