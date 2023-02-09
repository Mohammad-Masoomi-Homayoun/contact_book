import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
       ContactService contactService = new ContactServiceImpl();
       contactService.start();
    }



}
