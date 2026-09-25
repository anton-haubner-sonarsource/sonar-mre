package sonar.mre;

public final class Bar {
  // This is the original method as it was defined in your repository.
  // The abstract class and interface definitons are also the same.
  //
  // It does not raise S4449 in my testing. Can you double check against your original code if this reproducer is truly accurate?
  public void foo(AbstractBaseEntity<Long> entity) {
    entity.setId(null); // S4449 raised here
  }

  // Added this method to demonstrate a case where S4449 does raise.
  // Here, this is intended, since entity is typed as BaseEntity which does not have the nullability annotations.
  // (I also added an @NullMarked annotation on the package in package-info.java, otherwise no nullability issues will be raised in any case.)
  public void foo2(BaseEntity<Long> entity) {
    entity.setIdWithoutAnnotationOnBaseInterface(null);
  }
}
