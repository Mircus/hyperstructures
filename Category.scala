package holomathics.hyperstructures.categories

import scalax.collection.Graph
import scalax.collection.GraphEdge.DiEdge

/**
 * Category is a type class.
 * It is used to convert known types into actual categories.
 * For instance, we can use `Int` as the objects, where the category is defined by the induced order.
 */
trait Category[OB, AR] {
  def getObjects: Set[OB]
  def getArrows: Set[AR]
  def id(obj: OB): AR
  def dom(arr: AR): OB
  def codom(arr: AR): OB
  
  /**
   * Compose two arrows. Returns `None` if the composition is not defined.
   */
  def compose(f: AR, g: AR): Option[AR]
  def isEqualTo(f: AR, g: AR): Boolean

  object CategoryChecker {
    def check(cat: Category[OB, AR]): Boolean = true
  }

  type DiEdgeType = DiEdge
  type TupleType = Tuple[Int, Int]
  
  object CategoryBuilder {
    def buildFreeCatFromGraph(graph: Graph[Int, DiEdgeType]): Category[Int, DiEdgeType] = {
      // TODO: Implement this method
      throw new NotImplementedError
    }

    // Delta is the so-called simplicial category, one of the basic geometrical shape categories.
    // object Delta extends Category[Int, TupleType]

    // object Omega

    /**
     * This method builds a quotient category from a functor.
     */

    /**
     * This method builds a product category from two cats.
     */
  }
}
