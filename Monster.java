// voir diapo dans drive poeiBordeaux/s8/java3 programmation orientée objet
public class Monster {
    private String name;
    private int damage;
    private int life;

    //constructor
    public Monster(String cName, int cDamage, int cLife){
        this.name = cName;
        this.damage = cDamage;
        this.life = cLife;
    }

    //methode
    public void attack(Monster enemy){
        //je veux acceder à la vie de l'ennemy et modifier sa vie
        enemy.setLife(enemy.getLife() - this.getDamage());

        // si l'enemy à + de 0 de vie, affiche moi le nom de l'ennemy + le reste de sa vie
        if(enemy.getLife()>0){
            System.out.println(enemy.getName() + "has" + enemy.getLife()+" points remaining");
        }
        // sinon affiche moi le message 
        else {
            System.out.println(enemy.getName()+ " is KO !");
        }
    }
    //guetteur-setteur
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