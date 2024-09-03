class Emp{
    int eno;
    String name;
    public Emp(int eno, String name){
        this.eno = eno;
        this.name=name;
    }
    public Emp(String name){
        this.eno = -1;
        this.name=name;
    }
     public Emp(int eno){
        this.eno = eno;
        this.name="";
    }
    public void setName(String name){
      this.name = name;
    }
    public void setEno(int eno){
      this.eno = eno;
    }
    //@Override
    public boolean equals(Object obj) {
      Emp e = (Emp) obj;
      return (this.eno==e.eno || this.name.equals(e.name));
    }
    
    public String toString(){
      return "\nEmployee No: "+eno+"\tName: "+name;
    }
}