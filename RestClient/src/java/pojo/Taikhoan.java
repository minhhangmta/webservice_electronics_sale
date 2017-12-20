package pojo;
// Generated Dec 2, 2017 3:44:02 AM by Hibernate Tools 4.3.1



/**
 * Taikhoan generated by hbm2java
 */
public class Taikhoan  implements java.io.Serializable {


     private Integer maTk;
     private Quyen quyen;
     private String username;
     private String password;
     private String hoten;
     private String email;
     private String sodienthoai;
     private String diachi;
     private Integer maTt;

    public Taikhoan() {
    }

	
    public Taikhoan(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public Taikhoan( String username, String password, String hoten, String email, String sodienthoai, String diachi) {
       this.username = username;
       this.password = password;
       this.hoten = hoten;
       this.email = email;
       this.sodienthoai = sodienthoai;
       this.diachi = diachi;
    }
    public Taikhoan(Quyen quyen, String username, String password, String hoten, String email, String sodienthoai, String diachi, Integer maTt) {
       this.quyen = quyen;
       this.username = username;
       this.password = password;
       this.hoten = hoten;
       this.email = email;
       this.sodienthoai = sodienthoai;
       this.diachi = diachi;
       this.maTt = maTt;
    }
   
    public Integer getMaTk() {
        return this.maTk;
    }
    
    public void setMaTk(Integer maTk) {
        this.maTk = maTk;
    }
    public Quyen getQuyen() {
        return this.quyen;
    }
    
    public void setQuyen(Quyen quyen) {
        this.quyen = quyen;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getHoten() {
        return this.hoten;
    }
    
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSodienthoai() {
        return this.sodienthoai;
    }
    
    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }
    public String getDiachi() {
        return this.diachi;
    }
    
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public Integer getMaTt() {
        return this.maTt;
    }
    
    public void setMaTt(Integer maTt) {
        this.maTt = maTt;
    }




}


