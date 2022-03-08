 class SinoTibetan extends Language {
  SinoTibetan(String regionSpoken, String wordOrder){
    super(name, numSpeakers, "Asia", "subject-object-verb");
  }
  if (this.name.equals("Chinese")){
    wordOrder = "subject-verb-object";
  }
}
