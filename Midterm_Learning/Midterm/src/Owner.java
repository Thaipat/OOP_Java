public class Owner {
    protected final String name;
    protected Animal animal;
    public Owner(){
        this.animal = null;
        this.name = "";
    }
    public Owner(String name){
        this.name = name;
        this.animal = null;
    }
    public Owner(Animal animal){
        this.animal = animal;
        this.name = "";
    }
    public Owner(String name, Animal animal){
        this.name = name;
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public void feedFood(Food f){
        this.animal.eat(f);
    }
    public String toString(){
        return "Owner : name = "+name+", Animal : name = "+animal.getName()+", power = "+animal.getPower()+", age = "+animal.getAge();
    }
    public void protectOwnerFrom(Animal a){
        if(this.animal instanceof Dog){
            ((Dog)animal).kick(a);
        }
        else if(this.animal instanceof Pigeous){
            ((Pigeous)animal).wingAttack(a);
        }
    }
}
