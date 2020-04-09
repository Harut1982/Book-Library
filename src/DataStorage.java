public class DataStorage {
    private Book[] books;
    private int size;
    public DataStorage(int capacity){
        books=new Book[capacity];
    }
    public DataStorage(){
        books=new Book[16];
    }
    public void add(Book book){
        if (size==books.length){
            extend();
        }
        books[size++]=book;
    }

    private void extend() {
        Book[] tmp=new Book[books.length+10];
        System.arraycopy(books,0,tmp,0,books.length);
        books=tmp;
    }
    public  void print(){
        for (int i = 0; i <size ; i++) {
            System.out.println(books[i]);

        }
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)){
                System.out.println(books[i]);
            }

        }

    }
    private void deleteByIndex(int index){
        for (int i = index+1; i <size ; i++) {
            books[i-1]=books[i];
        }
        size--;
    }
    public void deleteByBookId(String bookId){
        for (int i = 0; i <size ; i++) {
            if (books[i].getBookId().equals(bookId)){
                deleteByIndex(i);
            }

        }

    }
}
