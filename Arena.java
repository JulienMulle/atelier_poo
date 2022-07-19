//ma clase arena va lancer le combat entre les monstres
public class Arena {
    public static void main(String[] args) {
        //on instancie nos objets:
        Monster thanos = new Monster( "Thanos", 14, 100);
        Monster hulk = new Monster("Hulk", 10, 80);

        //le combat commence
        //j'utilise la boucle while parce que cette boucle continue TANT QUE la vie d'un des monster est à 0
        /*while(hulk.getLife() > 0 && thanos.getLife() > 0){
             hulk.attack(thanos);
            if(thanos.getLife() > 0) {
                thanos.attack(hulk);
            }
        };*/

        //boucle do while
        do{
            thanos.attack(hulk);
            if(hulk.getLife() >0 ){
                hulk.attack(thanos);
            }
        } while(thanos.getLife() > 0  && hulk.getLife() > 0);
    }
}
