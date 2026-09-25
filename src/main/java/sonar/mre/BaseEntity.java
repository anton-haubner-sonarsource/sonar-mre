package sonar.mre;

interface BaseEntity<I> {
  void setIdWithoutAnnotationOnBaseInterface(I id);
}
