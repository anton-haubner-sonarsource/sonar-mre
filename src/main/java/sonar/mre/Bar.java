package sonar.mre;

public final class Bar {
  public void foo(BaseEntity<Long> entity) {
    entity.setId(null); // S4449 raised here
  }
}
