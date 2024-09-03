public class Test_Database{
  public static void main(String[] args){
    
    CD c1 = new CD("Pagol Bondhu", "Mumtaj", 7, 30);
    CD c2 = new CD("Roshik Bondhu", "Durjoy", 5, 60);
    Video v1 = new Video("Kaka Keno Neka", "Razeeb", 180);
    Video v2 = new Video("Shami Keno Ashami", "Alice", 150);
    
     Database d = new Database();
     d.addCD(c1);
     d.addVideo(v1);
     d.addVideo(v2);
     d.addCD(c2);
     
     d.list();
    
  }

}