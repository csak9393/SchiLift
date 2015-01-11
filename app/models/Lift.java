package models;

import java.util.HashSet;
import java.util.Set;

public class Lift{
  public Integer id;
  public String name;
  public String descr;

  private static Set<Lift> lifts;

  //static initializer
  static {
    lifts = new HashSet<Lift>();
    lifts.add(new Lift(0,
    "Schischullift II", "description 1"));
    lifts.add(new Lift(1,
    "Sprungschanze Absam", "description 2"));
    lifts.add(new Lift(2,
    "Christlum II aufg.", "description 3"));
    lifts.add(new Lift(3,
    "Brandtallift", "description 4"));
    lifts.add(new Lift(4,
    "Nordhanglift", "description 5"));
  }

  public Lift(){}

  public Lift(Integer id, String name, String description){
    this.id = id;
    this.name = name;
    this.descr = description;
  }

  public String toString(){
    return String.format(id + " - " + name);
  }

  public static Set<Lift> findAll(){
    return new HashSet<Lift>(lifts);
  }

  public static Lift findByEan(Integer id){
    for(Lift x:lifts){
      if(x.id.equals(id)){
        return x;
      }
    }
    return null;
  }
  public static Set<Lift> findByName(String term) {
    final Set<Lift> results = new HashSet<Lift>();
    for (Lift candidate : lifts) {
      if(candidate.name.toLowerCase().contains(term.toLowerCase())){
        results.add(candidate);
      }
    }
    return results;
  }
  public static boolean remove(Lift Lft) {
    return lifts.remove(Lft);
  }
  public static void add(Lift Lft) {
    lifts.add(Lft);
  }
}
