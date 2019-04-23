package holomathics.hyperstructures.categories

trait NaturalTransformation[O, O1, A, A1] {

  def dom(): Functor[O, A]

  def codom(): Functor[O1, A1]

  def getMaps(): Map[O, O1]

  def getComponent(obj: O): A1

  object NaturalTransformationChecker {

    def check(eta: NaturalTransformation): Boolean = {

      true
    }
  }

}
