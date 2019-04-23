package holomathics.hyperstructures.categories

trait Functor[O, A, O1, A1]{

    //a functor is essentially a pair of two maps: one for the objects, the
    //other for the arrows. It maps objects to objects and arrows to arrows,
    // in a compatible way

    def dom() : Category[O, A]
    def codom() : Category[O1, A1]


    def getObjectMap(): Map[O, O1]

    def getArrowctMap(): Map[A, A1]

    object functorChecker{

        def check(f: Functor): Boolean ={

          true
        }
    }


}
