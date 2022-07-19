public class Monster {
    private String name;
    private int damage;
    private int life;

    public Monster(String cName, int cDamage, int cLife){
        this.name = cName;
        this.damage = cDamage;
        this.life = cLife;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return this.damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLife() {
        return this.life;
    }
    public void setLife(int life) {
        this.life= life;
    }

    @Override
    public String toString(){
        return "Monter [damage=" + damage + ", life=" + life + ", name=" + name +"]";
    }

}