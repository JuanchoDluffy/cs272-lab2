public class Employee implements Cloneable {
  private String name;
  private int id;
  private int age;
  private String state;
  private int zipCode;
  private String advisor;

  // constructor that sets all values to null and zero
  public Employee() {
    name = null;
    id = 0;
    age = 0;
    state = null;
    zipCode = 0;
    advisor = null;
  }// end of defaul constructor

  public Employee(Object obj) {
    if (obj != null && (obj instanceof Employee)) {
      Employee emp = (Employee) obj;
      this.name = emp.getName();
      this.id = emp.getID();
      this.age = emp.getAge();
      this.state = emp.getState();
      this.zipCode = emp.getZipCode();
      this.advisor = emp.getAdvisor();

    }
  }

  public void setName(String inName) {
    name = inName;
  }

  public String getName() {
    return name;
  }

  public void setID(int inID) {
    id = inID;
  }

  public int getID() {
    return id;
  }

  public void setAge(int inAge) {
    age = inAge;
  }

  public int getAge() {
    return age;
  }

  public void setState(String inState) {
    state = inState;
  }

  public String getState() {
    return state;
  }

  public void setZipCode(int inZip) {
    zipCode = inZip;
  }

  public int getZipCode() {
    return zipCode;
  }

  public void setAdvisor(String inAdv) {
    advisor = inAdv;
  }

  public String getAdvisor() {
    return advisor;
  }

  public String toString() {
    String s = name + " " + id + " " + age + " " + state + " " + zipCode + " " + advisor;
    return s;
  }

  @Override
  public Employee clone() throws CloneNotSupportedException {
    Employee cEmployee = null;
    cEmployee = (Employee) super.clone();
    cEmployee.setName(this.name);
    cEmployee.setID(this.id);
    cEmployee.setAge(this.age);
    cEmployee.setState(this.state);
    cEmployee.setZipCode(this.zipCode);
    cEmployee.setAdvisor(this.advisor);
    return cEmployee;
  }

  public boolean equals(Object obj) {
    if (obj != null && (obj instanceof Employee)) {
      Employee identify = (Employee) obj;
      return (this.id == identify.getID());
    } else {
      return false;
    }
  }

  public static void main(String[] args) throws CloneNotSupportedException {
    Employee firstguy = new Employee();
    firstguy.setAge(12);
    firstguy.setName("jeff");
    firstguy.setAdvisor("steve");
    firstguy.setID(123143212);
    firstguy.setState("NM");
    firstguy.setZipCode(88234);

    System.out.println(firstguy.toString());
    Employee copy = new Employee(firstguy);
    copy.setAdvisor("stevenson");
    System.out.println(copy.toString());
    System.out.println(firstguy.toString());
    Employee cloned = firstguy.clone();
    cloned.setAdvisor("Doom guy");
    System.out.println(cloned.toString());
    System.out.println(firstguy.toString());

    System.out.println(copy.equals(cloned));
    cloned.setID(24);
    System.out.println(copy.equals(cloned));

  }
}// end of class