package holomathics.hyperstructures.categories

import scalax.collection.Graph
import scalax.collection.GraphEdge.DiEdge


/*
Category is a type class,.
The idea is that it should be used to turn known types into actual categories
* For instance, take Int: the objects are integers, and the category is given by the induced order
* */

 trait Category[OB, AR]  {


  def getObjects(): Set[OB]
  def getArrows():  Set[AR]

  def id(obj: OB): AR


  def dom(arr: AR) :  OB
  def codom(arr: AR) :  OB
  def comp( f: AR, g: AR): Option[AR]
  def isEqual(f:AR, g:AR) : Boolean

  object CateogryChecker{

    def check( cat: Category[OB, AR]): Boolean ={

      true
    }
  }


   object CategoryBuilder {


     def buildFreeCatFromGraph(graph: Graph[Int, DiEdge] ):
     Category[Int, DiEdge] = ???


     /*
   * Delta is the so-called simplicial category, one of the basic geometrical shape categories
   *
   * */


     //object Delta extends Category[Int, Tuple[Int, Int]]

     //object Omega

     /**
       * this method builds a quotient category from a functor
       */


     /***
       *  this method builds a product category from two cats
       */

   }

}

