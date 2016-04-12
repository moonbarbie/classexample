package classexample;


public class books {
    public String author = " Raymond A. Barnett ";
    public int year = 2015;
    private int yearpublish;
    private int pages;
    private String topic = " Finite Mathematic ";
    
    public books(){
    }
    

    public void setYearpublish(int y) {
        yearpublish = y;
    }

    public int getYearpublish() {
        return yearpublish;
    }
    
    public void setPages(int p) {
        pages = p;
    }
    
    public books (String topic){
        topic = topic;
    }
    
    public String setString(){
        return topic;
    }
    
    @Override
    public String toString(){
        String String1;
        
        String1 = "The Author of this book is: "+ author + " in "+ year +"\n";
        String1 += "It was published in: "+ year +"\n";
        String1 += "It contains " + pages + "Pages.\n";
        String1 += "The Topic of this title is called:  " + topic + "\n";
        
        
        
        return String1;
    }



    
    
    
}
