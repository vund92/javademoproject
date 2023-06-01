package vujavaprojectdemo.io;

import vujavaprojectdemo.model.Book;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {

    public  static boolean saveBookList(List<Book> books, String path){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            for(Book book : books){
                String dataLine = book.getTitle() + ";" + book.getISBN() + ";" + book.getAuthorName() + ";" + book.getYear();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();

            return true;
        } catch (Exception exception){
            exception.printStackTrace();
        }

        return false;
    }

    public static List<Book> readBookList(String path){
        List<Book> books = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String dataLine = bufferedReader.readLine();
            while (dataLine !=null){
                String [] bookData = dataLine.split(";");
                String title = bookData[0];
                int ISBN = Integer.parseInt(bookData[1]);
                String authorName = bookData[2];
                int year = Integer.parseInt(bookData[3]);
                books.add(new Book(title, ISBN, authorName, year));
                dataLine = bufferedReader.readLine();
            }

            fileInputStream.close();
            inputStreamReader.close();
            bufferedReader.close();

        } catch (Exception exception){
            exception.printStackTrace();
        }

        return books;
    }
}
