public class Fighter extends Adventurer {
  public Fighter() { this("", 0, new String[0]); }
  public Fighter(String name, int hp) { super(name, hp); }
  public Fighter(String name, int hp, String[] inventory) { super(name, hp, inventory); }

  public String attack(Adventurer other){
    int damage = (int)(Math.random()*6)+1;
    other.applyDamage(damage);
    restoreSpecial(2);
    return this + " attacked "+ other + " and dealt "+ damage +
    " points of damage. They then take a sip of their coffee.";
  }
}
