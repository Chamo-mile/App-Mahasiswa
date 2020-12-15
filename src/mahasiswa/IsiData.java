/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

import java.io.*;
        

public class IsiData {
    String nim, nama,jurusan;
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
}
