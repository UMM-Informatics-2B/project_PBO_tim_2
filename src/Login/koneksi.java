package Login;

import java.sql.DriverManager;

public class koneksi{
    private static java.sql.Connection koneksi;

    public static java.sql.Connection getKoneksi(){
        if(koneksi == null){
            try{
                String url = "jdbc:mysql://localhost:3360/login";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("koneksi berhasil");
            }catch(Exception e){
                System.out.println("koneksi gagal");
            }
        }
        return koneksi;
    }
    public static void main(String[] args) {
        getKoneksi();
    }
}