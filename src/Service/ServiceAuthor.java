package Service;

import Model.Author;
import Repository.AuthorCrudOperation;

import java.util.ArrayList;
import java.util.List;

public class ServiceAuthor {
    public static  void TestAuthor(){

        AuthorCrudOperation authors = new AuthorCrudOperation();

        // Save author :
        Author author = new Author(4,"RAKOTONIRINA","Tsiaroniaina",'M');
        authors.save(author);

        // Save list of Authors :
        List<Author> authorList = new ArrayList<>();
        authorList.add(new Author(5,"RAMBELOSON","Fifaliana",'M'));
        authorList.add(new Author(6,"RANDRIAMANAREFO","Maharavo",'M'));
        authors.saveAll(authorList);

        // Delete Author :
        authors.delete(author);

        //List of Authors :
        authors.findAll();

    }
}
