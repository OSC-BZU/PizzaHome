import Services.DataDB;
import Services.DataFile;
import Services.DataImporter;

public class Main {

    public static void main(String[] args) {

        DataImporter dataSource = new DataFile();
        dataSource.importPizza().forEach(System.out::println);

        dataSource = new DataDB();
        dataSource.importPizza().forEach(System.out::println);
    }
}
