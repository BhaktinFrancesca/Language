public class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionSpoken;
  protected String wordOrder;

  public void setter(String _name, int _numSpeakers, String _regionSpoken, String _wordOrder){
    this.name = _name;
    this.numSpeakers = _numSpeakers;
    this.regionSpoken = _regionSpoken;
    this.wordOrder = _wordOrder;
  }
  
  public Language(String _name, int _numSpeakers, String _regionSpoken, String _wordOrder){
    setter(_name, _numSpeakers, _regionSpoken, _wordOrder);
  }
  
  public Language(){
      
  }

  public void getInfo(){
    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionSpoken + ".\n" + "The language follows the word order: " + wordOrder  + ".");
  }
  
  

  public static void main(String[] args) {
     Language klingon = new Language("Klingon", 25, "Qo'noS, praQsis, kor ty'gokor, stovo'kor and sometimes Terok Nor", "object–verb–subject");
     klingon.getInfo();
     Language mayan = new Language("Tektitek", 4900, "Huehuetenango, Guatemala", "flexible");
     mayan.getInfo();
     Language chinese = new Language("Chinese", 1300000000, "China, Tibet, Taiwan", "subject–verb–object");
     chinese.getInfo();
  }
}
