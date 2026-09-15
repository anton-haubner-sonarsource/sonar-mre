package sonar.mre;

public final class Bar {
  public void foo(AbstractBaseEntity<Long> entity) {
    entity.setId(null); // S4449 raised here
  }
}
