class Cat {
  /*constructor: */
  String species;  /*defined species variable, which will be passed down */
  public Cat(){
    this.species = "Cat";  /*This variable is assigned, I will not change this */
  }
  protected void print_cat_species(){
    System.out.printf("The species of this animal is %s \n",species);
  }
 /*THESE FUNCTIONS HAVE VARIATIONS IN THE DIFFERENT CAT TYPES */
  protected void print_cat_Sound() {
    System.out.println("The cat says nothing.");
  }
  protected void print_cat_Color() {
    System.out.println("The cat has no fur color, it barely has a physical form.");
  }
  protected void print_cat_Characteristic(){
    System.out.println("The cat has no characteristics.");
  }
  /*THIS FUNCTION IS THE SAME FOR EVERY CAT */
  protected void print_cat_pet(){
    System.out.println("The cat purrs when pet.");
  }

}

class Orange_Cat extends Cat { /*Orange cat inherits ALL variables (species), and functions. */
  public Orange_Cat(){ /*Default Constructor */
  }
  /*protected void print_cat_species(){
    System.out.println("The species of this animal is 'Cat'");
  }*/
  protected void print_cat_Sound() {
    System.out.println("The Orange Cat says: 'mrowww...'");
  }
  protected void print_cat_Color() {
    System.out.println("The Orange Cat's fur color is orange.");
  }
  protected void print_cat_Characteristic(){
    System.out.println("The Orange Cat tends to act silly and is motivated by food.");
  }
}

class Tabby_Cat extends Cat {
  public Tabby_Cat(){
    super(); /*stand-in for the constructor of Cat to set species variable to 'cat' */
  }
  @Override /*tells compiler information */
  protected void print_cat_Sound() {
    System.out.println("The Tabby Cat says: 'HISSSSSS' ");
  }
  @Override
  protected void print_cat_Color() {
    System.out.println("The Tabby Cat's fur has stripes on top of its grey coat.");
  }
  @Override
  protected void print_cat_Characteristic(){
    System.out.println("The Tabby Cat can be possessive and act bossy.");
  }
}

class Main {
  public static void main(String[] args) {
    Cat defaultCat = new Cat();
    Orange_Cat Orange = new Orange_Cat();
    Tabby_Cat Tabby = new Tabby_Cat();
        
    System.out.println("\n\n--Profile of the default cat template-- \n");
    defaultCat.print_cat_species();
    defaultCat.print_cat_Sound();
    defaultCat.print_cat_Color();
    defaultCat.print_cat_Characteristic();
    defaultCat.print_cat_pet();
    System.out.println();

    System.out.println("--Profile of the Orange Cat variation-- \n");
    Orange.print_cat_species(); /*this variable does not change */
    Orange.print_cat_Sound();/*these functions change, tailored to the Orange Cat. */
    Orange.print_cat_Color();
    Orange.print_cat_Characteristic();
    Orange.print_cat_pet();/*this function does not change */
    System.out.println();
        
    System.out.println("--Profile of the Tabby Cat variation-- \n");
    Tabby.print_cat_species(); /*this variable does not change */
    Tabby.print_cat_Sound();
    Tabby.print_cat_Color();
    Tabby.print_cat_Characteristic();
    Tabby.print_cat_pet();/*this function does not change */
    System.out.println();
  }
}