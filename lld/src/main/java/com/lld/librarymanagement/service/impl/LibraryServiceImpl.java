package com.lld.librarymanagement.service.impl;

import com.lld.librarymanagement.entity.Book;
import com.lld.librarymanagement.entity.CheckOut;
import com.lld.librarymanagement.entity.Patron;
import com.lld.librarymanagement.entity.UserBookMappingIds;
import com.lld.librarymanagement.repository.LibraryRepository;
import com.lld.librarymanagement.repository.UserBookMapping;
import com.lld.librarymanagement.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    private LibraryRepository repository;

    @Autowired
    private UserBookMapping updateInUserBookMappingRepo;


    @Override
    public boolean addBook(List<Book> books) {
        try {
            repository.saveAll(books);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

@Override
    public Boolean checkout(CheckOut checkOut) {

        try {
            Optional<Book> book = repository.findById(checkOut.getBookId());


                if (book.get().getIsAvailability()) {
                    book.get().setIsAvailability(false);
                    repository.save(book.get());

                    //lets assume user will return it after seven days
                   checkOut.setIssueDate(new java.sql.Timestamp(System.currentTimeMillis()));

                    SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");

                    //create instance of the Calendar class and set the date to the given date
                    Calendar cal = Calendar.getInstance();

                   // use add() method to add the days to the given date
                    cal.add(Calendar.DAY_OF_MONTH, checkOut.getBookedDays());
                    String dateAfter = sdf.format(cal.getTime());
                    Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(dateAfter);
                    checkOut.setReturnDays(date1);
                    //update in user_book_mapping table
                    updateInUserBookMappingRepo.save(checkOut);
                }
        } catch (Exception e) {
            return false;
        }

      return true;
    }



//    private Integer returnBooks(List<Book> books,Patron user){
//
//        for (Book book:books) {
//
//            Optional<CheckOut> checkOut=updateInUserBookMappingRepo.findById(new UserBookMappingIds(book.getBookId(), user.getUserId()));
//            if(book.getBookId().equalsIgnoreCase(checkOut.get().getBookId())){
//                book.setIsAvailability(true);
//
//            }
//        }
//    }
}
