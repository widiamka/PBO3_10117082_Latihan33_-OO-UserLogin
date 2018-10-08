/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan33_.oo.userlogin;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan form login
* dengan username dan password di inputkan oleh user
 */
public class User {
     private  String userName;
     private  String password;
    public Boolean statusAkun;
     private boolean cekAkun (String parUsername,String parPassword){
         userName = "Widiamka";
        password = "terbaikselalu";
        statusAkun = parPassword.equals(password) && parUsername.equals(userName);
         return statusAkun;
         
         
     }
     private void hasilLogin (Boolean parStatusAkun,String parUsername ){
      if (parStatusAkun==true) {
            System.out.println("\n******HALLO "+parUsername.toUpperCase()
                    +"******");
            System.out.println("Selamat Datang di Aplikasi ini");
        }else {
            System.out.println("\nOoops, Username atau Password Anda Salah");
        }   
     }
      public void pengecekkanLogin (String parUsername,String parPassword){
         cekAkun(parUsername,parPassword);
        hasilLogin(statusAkun,parUsername);
     }
}
