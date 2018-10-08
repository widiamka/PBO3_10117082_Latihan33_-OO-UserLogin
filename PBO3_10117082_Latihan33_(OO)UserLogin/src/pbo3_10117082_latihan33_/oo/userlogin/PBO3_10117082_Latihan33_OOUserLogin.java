/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan33_.oo.userlogin;
import java.util.Scanner;
/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan form login
* dengan username dan password di inputkan oleh user
 */
public class PBO3_10117082_Latihan33_OOUserLogin {

    private static String userName;
    private static String pw;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Username = ");
        userName = scn.next();

        System.out.print("Masukkan Password = ");
        pw = scn.next();

        User cek = new User();
        cek.pengecekkanLogin(userName,pw);

    }

}
