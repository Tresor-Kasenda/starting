package Model;

public interface UserModel {
    public String getName();

    public UserModel setName(String name);

    public String getEmail();

    public UserModel setEmail(String email);

    public String getPassword();

    public UserModel setPassword(String password);

    public boolean isStatus();

    public UserModel setStatus(boolean status);
}
