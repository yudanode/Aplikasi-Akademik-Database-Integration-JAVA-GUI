/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplikasi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FLEX-5
 */
public class Koneksi {
     // Membuat variabel koneksi
    private static Connection koneksi;

    // Method untuk koneksi ke database
    public static Connection getKoneksi() {

        // Jika koneksi belum ada
        if (koneksi == null) {

            try {

                // Driver MySQL
                DriverManager.registerDriver(
                    new com.mysql.jdbc.Driver()
                );

                // URL Database
                String url = "jdbc:mysql://localhost:3306/db_akademik";

                // Username database
                String user = "root";

                // Password database
                String password = "";

                // Membuat koneksi
                koneksi = DriverManager.getConnection(
                    url,
                    user,
                    password
                );

                // Pesan berhasil
                System.out.println("Koneksi Berhasil");

            } catch (SQLException e) {

                // Pesan gagal
                System.out.println("Koneksi Gagal");
                System.out.println(e);

            }

        }

        return koneksi;
    }
}
