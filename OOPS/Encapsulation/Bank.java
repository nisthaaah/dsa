package oops.Encapsulation;

class Account {
    public String name;
    protected String email;
    private String password;
    
    //setters and getters method to access private 
    public String getPw(){
        return this.password;
    }

    public void setPw(String pass){
        this.password = pass;
    }
}