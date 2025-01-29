package com.fss;

public class Book {
String title;
String author;
Double price;

public Book(String title, String author, Double price) { ///constructor
    this.title = title;
    this.author = author;
    this.price = price;
}

public Book(){
}

public String getTitle() {//getter
    return title;
}

public String getAuthor() {
    return author;
}

public Double getPrice() {
    return price;
}

public void setTitle(String title) { //setter
    this.title = title;
}

public void setAuthor(String author) {
    this.author = author;
}

public void setPrice(Double price) {
    this.price = price;
}





//new Book("abc","bala","500")




}
