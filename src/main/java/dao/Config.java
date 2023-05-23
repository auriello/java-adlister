package dao;

class Config {

    public Config() {
        // you need an empty constructor to make a new instance of the config object in MySqlAdsDao;
    }

    public String getUrl() {
        return "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false";
    }

    public String getUsername() {
        return "arlo";
    }

    public String getPassword() {
        return "arlo";
    }
}
