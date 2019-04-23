package holomathics.hyperstructures.categories

/*
* A directed category is a category where each object has a degree.
* Every known shape category is a directed category
*
* TODO: later one should replace it with the notion of Reedy category which is even more general
**/


trait DirectedCat[OB, AR] extends Category {

  def getDegree(obj: OB): Int  //each object has a degree (for instance in Delta is its height)

}
