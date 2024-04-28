package RPGGAME;


public abstract class Character{
    protected String name;
    protected int health;
    protected int attackPower;

    public  Character(String name, int health, int attackPower){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack(Character other){
        other.takeDamage(attackPower);
    }

    public void takeDamage(int damage){
        health-=damage;
        System.out.println(name + "受到" + damage + "點傷害，剩餘血量" + health + "點");
    }
    
    public abstract void display();

}