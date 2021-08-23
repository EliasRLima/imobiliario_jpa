package services;

public enum Templates {
  
  BASE("view/tela_base.fxml");
  
  private String url;
  private Templates(String url){
    this.url = url;
  }
  public String getUrl() {
    return this.url;
  }
  
}
