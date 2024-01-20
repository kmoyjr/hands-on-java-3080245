package bank;

public class Customer {

  private int id;
  private String name;
  private string username;
  private string password;
  private string accountId;

  public Customer(int id, String name, String useername, String password, int accountId) {
    setId(id);
    setName(name);
    setUsername(username);
    setPassword(password);
    setAccountId(accountId);
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public string getUsername() {
    return this.username;
  }

  public void setUsername(string username) {
    this.username = username;
  }

  public string getPassword() {
    return this.password;
  }

  public void setPassword(string password) {
    this.password = password;
  }

  public string getAccountId() {
    return this.accountId;
  }

  public void setAccountId(string accountId) {
    this.accountId = accountId;
  }

}
