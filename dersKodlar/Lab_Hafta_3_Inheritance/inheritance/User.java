package Lab_Hafta_3_Inheritance.inheritance;

public class User {
    protected String _mail;

    public String get_mail() {
        return _mail;
    }

    public boolean set_mail(String _mail) {
        this._mail = _mail;
        return true;
    }

    public void login() {
        System.out.println("Giris Yapildi");
    }

}
