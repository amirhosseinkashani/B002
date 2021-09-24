public class human {
    private int ghad;
    private int vazn;
    String name;

    //public human(int vazn, int ghad) {


    public void setGhad(int ghad) {
        this.ghad = ghad;
    }

    public void setVazn(int vazn) {
        this.vazn = vazn;
    }

    public void setName(String name1) {
        this.name = name1;
    }

    public String getName() {
        return name;
    }

    public int getGhad() {
        return ghad;
    }

    public int getVazn() {
        return vazn;
    }

    public double mbi(){
        double ghad1 = Math.pow(getGhad(),2);
        return getVazn()/ghad1;
    }
    public void show_mbi_info(){
        System.out.format("hey dear :\t%s\nyour mbi number is:%s",getName(),mbi()*10000);
    }
    public void showinfo(){
        System.out.format("YOUR GHAD IS:\t%S\nYOUR VAZN IS:\t%s\nYOUR BMI IS:\t%s\n",getGhad(),getVazn(),mbi()*10000);

    }
    public human copy (human A) {
        return new human();
    }

}
 //- OLAMPIAD-DIPLOM BARABAR ALMANI - B2 - ILTS