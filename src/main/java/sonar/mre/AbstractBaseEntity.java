package sonar.mre;

abstract class AbstractBaseEntity<I> implements BaseEntity<I> {
  @org.jspecify.annotations.Nullable
  @jakarta.annotation.Nullable
  private I id;
  
  public void setId(@jakarta.annotation.Nullable @org.jspecify.annotations.Nullable final I id) {
    this.id = id;
  }

  public void setIdWithoutAnnotationOnBaseInterface(@jakarta.annotation.Nullable @org.jspecify.annotations.Nullable I id) {
    this.id = id;
  }
}
